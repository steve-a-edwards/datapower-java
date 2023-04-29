package client.soma.coded.main;

import client.soma.coded.utility.AccessControlEntryProvider;
import client.soma.coded.utility.SOMAPortProvider;
import client.soma.generated.AnyModifyElement;
import client.soma.generated.DmAdminState;
import client.soma.generated.ModifyAccessControlList;
import client.soma.generated.ModifyConfigBase;
import client.soma.generated.Request;
import client.soma.generated.Response;
import client.soma.generated.XmlMgmt;
import client.soma.generated.Response.Result;

public class MPG_FSH_ACL_List_ModifyConfig_XMI {
	
	static String domain = "SE_TEST";
	static String accessControlListName = "SE-ACL-Change-Test-ACL";
	static String singleAddressToDeny = "10.162.209.165";
	
	public static void main(String[] args) {
		// args contains space separated list of IPaddress that are going to be denied from
		// a service:
		//	java MPG_FSH_ACL_List_Change "10.162.209.164 10.162.209.94"
		
		System.out.println("Domain: " + domain);

		if (args.length != 0) {
			singleAddressToDeny = args[0]; // "format: 10.162.209.164"
			System.out.println("args[0]: " + singleAddressToDeny);
		}
		
		modifyConfigWithIP(singleAddressToDeny);
		
	}
	public static void modifyConfigWithIP(String ipAddress){
		
		// The following two lines takes care of XMI username, password, endpoint, certs
		SOMAPortProvider portProvider = new SOMAPortProvider();
		XmlMgmt port = portProvider.getPort();

		// Build up request:
		Request request = new Request();
		request.setDomain(domain);
		
		// Create new control list configuration:
		ModifyAccessControlList accessControlList = new ModifyAccessControlList();
		accessControlList.setName(accessControlListName);
		accessControlList.setMAdminState(DmAdminState.ENABLED);
		
		AccessControlEntryProvider.addSingleIPEntryToModifyAccessControlList(
				singleAddressToDeny, accessControlList);

		// Entries for Deny (or Allow) now added, finish off config composition:
		ModifyConfigBase modifyConfigBase = new ModifyConfigBase();
		modifyConfigBase.setMAdminState(DmAdminState.ENABLED);
		AnyModifyElement anyModifyElement = new AnyModifyElement();
		anyModifyElement.getAAAPolicyOrDomainOrLDAPSearchParameters().add(accessControlList);

		request.setModifyConfig(anyModifyElement);

		// Call the XMI service and get the response:
		Response response = port.operation(request);
		
		// Output response results:
		System.out.println("Timestamp: "+ response.getTimestamp());
		Result result = response.getResult();
		System.out.println("Result content: " + result.getContent());

	}
}
