package client.soma.coded.main;

import client.soma.coded.utility.AccessControlEntryProvider;
import client.soma.coded.utility.SOMAPortProvider;
import client.soma.generated.AnyConfigElement;
import client.soma.generated.ConfigAccessControlList;
import client.soma.generated.DmAdminState;
import client.soma.generated.Request;
import client.soma.generated.Response;
import client.soma.generated.XmlMgmt;
import client.soma.generated.Response.Result;

public class MPG_FSH_ACL_List_SetConfig_XMI {

	public static void main(String[] args) {
		// args contains space separated list of IPaddress that are going to be denied from
		// a service, if there are no arguments a test method in AccessControlEntryProvider
		// provides multiple test ips
		//	java MPG_FSH_ACL_List_Change "10.162.209.164 10.162.209.94"
		
		// The following two lines takes care of XMI username, password, endpoint, certs
		SOMAPortProvider portProvider = new SOMAPortProvider();
		XmlMgmt port = portProvider.getPort();
		
		String domain = "SE_TEST";
		String accessControlListName = "SE-ACL-Change-Test-ACL";
		String spaceSeparatedIPAddressesString = null;
		
		System.out.println("Domain: " + domain);
		
		if (args.length != 0) {
			spaceSeparatedIPAddressesString = args[0]; // "10.162.209.164 10.162.209.94"
			System.out.println("args[0]: " + spaceSeparatedIPAddressesString);
		}

		// Build up request:
		Request request = new Request();
		request.setDomain(domain);
		
		// Create new control list configuration:
		ConfigAccessControlList accessControlList = new ConfigAccessControlList();
		accessControlList.setName(accessControlListName);
		accessControlList.setMAdminState(DmAdminState.ENABLED);

// Use just one of the below ===============================================================================
		
		
// A - single ip from singleAddressToDeny
		// Leave all the below out to remove all denied IP from the ACL object ...
/*
		AccessControlEntryProvider.addSingleIPEntryToConfigAccessControlList(
				singleAddressToDeny, accessControlList);
*/

// B - Take list of ip address in command line args
		if (spaceSeparatedIPAddressesString != null) {
			AccessControlEntryProvider.addMultipleIPEntriesTo(
				spaceSeparatedIPAddressesString,
				accessControlList);
		} else {

		
// C - get  a test set from AccessControlEntryProvider

			AccessControlEntryProvider.testAddGivenCountIPEntriesTo(2000, accessControlList);
			/* 12000 OK but a delay (
			 * 14000 caused problems:
				Exception in thread "main" javax.xml.ws.WebServiceException: java.net.ConnectException: Connection timed out: connect
				DataPower on firmware 4 does a reload of system:
				DP: Status/Main/Date and Time/ ~ Uptime: reload	0 days 00:02:40 
		*/
		}

// Use just one of the above ===============================================================================
		
		// Entries for Deny (or Allow) now added, finish off config composition:
		AnyConfigElement anyConfigElement = new AnyConfigElement();
		anyConfigElement.getAAAPolicyOrDomainOrLDAPSearchParameters().add(accessControlList);
		request.setSetConfig(anyConfigElement);

		// Call the XMI service and get the response:
		Response response = port.operation(request);
		
		// Output response results:
		System.out.println("Timestamp: "+ response.getTimestamp());
		Result result = response.getResult();
		System.out.println("Result content: " + result.getContent());
	}
}
