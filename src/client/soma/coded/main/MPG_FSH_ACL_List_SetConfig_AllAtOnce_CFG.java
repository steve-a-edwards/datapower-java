package client.soma.coded.main;

import java.util.ArrayList;

import client.soma.coded.utility.SOMAPortProvider;
import client.soma.generated.ActionExecConfig;
import client.soma.generated.AnyActionElement;
import client.soma.generated.Request;
import client.soma.generated.Response;
import client.soma.generated.XmlMgmt;
import client.soma.generated.Request.SetFile;
import client.soma.generated.Response.Result;
import client.xmi.coded.utility.IPSequenceProvider;

public class MPG_FSH_ACL_List_SetConfig_AllAtOnce_CFG {

	public static void main(String[] args) {
		// args contains space separated list of IPaddress that are going to be denied from
		// a service, if there are no arguments a test method in AccessControlEntryProvider
		// provides multiple test ips
		//	java MPG_FSH_ACL_List_SetConfig_AllAtOnce_CFG 2000 11 1 8 220
		//		where 2000 is number to provide, following digits space separated ip address
		
		// The following two lines takes care of XMI username, password, endpoint, certs
		SOMAPortProvider portProvider = new SOMAPortProvider();
		XmlMgmt port = portProvider.getPort();
		
		String domain = "SE_TEST";
		String accessControlListName = "SE-ACL-Change-Test-ACL";
		String configFilename = "local:///acl-deny-many-config.cfg";
		
		// Default numbers, overridden by any supplied args:
		int numberToProvide = 2000; 
		int firstIPdigits = 11;
		int secondIPdigits = 1;
		int thirdIPdigits= 8;
		int fourthIPdigits = 220; 
		// Don't use above if args provided
		
		System.out.println("Domain: " + domain);
		
		if (args.length >= 5) {
			System.out.println("Using args ...");
			numberToProvide = Integer.parseInt(args[0]);
			firstIPdigits = Integer.parseInt(args[1]);
			secondIPdigits = Integer.parseInt(args[2]);
			thirdIPdigits= Integer.parseInt(args[3]);
			fourthIPdigits = Integer.parseInt(args[4]); 
		}
		// Print out details to be used
		System.out.println("numberToProvide: " + numberToProvide);
		System.out.println("firstIPdigits: " + firstIPdigits);
		System.out.println("secondIPdigits: " + secondIPdigits);
		System.out.println("thirdIPdigits: " + thirdIPdigits);
		System.out.println("fourthIPdigits: " + fourthIPdigits);
		
		String ipAddressToDeny;
		//IPSequenceProvider ipSequenceProvider = new IPSequenceProvider(numberToProvide);
		IPSequenceProvider ipSequenceProvider = new IPSequenceProvider(
				numberToProvide,
				firstIPdigits, secondIPdigits, thirdIPdigits, fourthIPdigits);  // Starting IP
		ArrayList<String> ipAddressToDenyArray = new ArrayList<String>();
		while ((ipAddressToDeny = ipSequenceProvider.nextIP()) != null) {
				ipAddressToDenyArray.add(ipAddressToDeny);
		}	
				
		sendXMIACLDenyIPAddressArray(port, domain, configFilename, accessControlListName, ipAddressToDenyArray);
		//System.out.println("sendXMIExecConfig       =============================================");
		sendXMIExecConfig(port, domain, configFilename);

	}

	protected static void sendXMIACLDenyIPAddressArray(XmlMgmt port,
												  String domain,
												  String configFilename,
												  String accessControlListName,
												  ArrayList<String> ipAddressToDenyArray) {
		// Build up request:
		Request request = new Request();
		request.setDomain(domain);
		
		SetFile setFile = new SetFile();
		String configFileContent = "acl " + accessControlListName + "\n";
		
		for (String ipAddressToDeny: ipAddressToDenyArray) {
			configFileContent = configFileContent + "  deny " + ipAddressToDeny + "/32\n";
		}
		configFileContent = configFileContent + "exit\n";
		System.out.println("Config file content: \n");
		System.out.println(configFileContent);
		
		setFile.setName(configFilename);
		setFile.setValue(configFileContent.getBytes());
		request.setSetFile(setFile);

		// Call the XMI service and get the response:
		Response response = port.operation(request);
		
		// Output response results:
		//System.out.println("Timestamp: "+ response.getTimestamp());
		Result result = response.getResult();
		//System.out.println("Result content: " + result.getContent());
		
	}
	
	
	protected static void sendXMIExecConfig(XmlMgmt port,
											String domain,
											String configFilename) {
		Request request = new Request();
		request.setDomain(domain);
		
		ActionExecConfig actionExecConfig = new ActionExecConfig();
		actionExecConfig.setURL(configFilename);
		
		// Entries for Deny (or Allow) now added, finish off config composition:
		AnyActionElement anyActionElement = new AnyActionElement();
		anyActionElement.getAddKnownHostOrAddPasswordMapOrAddSelTestEntry().add(actionExecConfig);
		request.setDoAction(anyActionElement);

		// Call the XMI service and get the response:
		Response response = port.operation(request);
		
		// Output response results:
		System.out.println("Timestamp: "+ response.getTimestamp());
		Result result = response.getResult();
		System.out.println("Result content: " + result.getContent());

	}

}
