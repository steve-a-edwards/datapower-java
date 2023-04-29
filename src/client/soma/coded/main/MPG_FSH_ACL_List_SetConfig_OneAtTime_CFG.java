package client.soma.coded.main;

import client.soma.coded.utility.SOMAPortProvider;
import client.soma.generated.ActionExecConfig;
import client.soma.generated.AnyActionElement;
import client.soma.generated.Request;
import client.soma.generated.Response;
import client.soma.generated.XmlMgmt;
import client.soma.generated.Request.SetFile;
import client.soma.generated.Response.Result;
import client.xmi.coded.utility.IPSequenceProvider;

public class MPG_FSH_ACL_List_SetConfig_OneAtTime_CFG {

	public static void main(String[] args) {
		// args contains space separated list of IPaddress that are going to be denied from
		// a service, if there are no arguments a test method in AccessControlEntryProvider
		// provides multiple test ips
		//	java MPG_FSH_ACL_List_Change "10.162.209.164 10.162.209.94"
		
		// The following two lines takes care of XMI username, password, endpoint, certs
		SOMAPortProvider portProvider = new SOMAPortProvider();
		XmlMgmt port = portProvider.getPort();
		
		String singleAddressToDeny = null;
		if (args.length != 0) {
			singleAddressToDeny = args[0]; // "format: 10.162.209.164"
			System.out.println("args[0]: " + singleAddressToDeny);
		}
		
		String domain = "SE_TEST";
		String accessControlListName = "SE-ACL-Change-Test-ACL";
		String configFilename = "local:///acl-deny-config.cfg";
		
		System.out.println("Domain: " + domain);
		
		if (singleAddressToDeny != null) {
			sendXMIACLDenyIPAddress(port, domain, configFilename, accessControlListName, singleAddressToDeny);
		} else {
			int numberToProvide = 20;
			String ipAddressToDeny;
			IPSequenceProvider ipSequenceProvider = new IPSequenceProvider(numberToProvide);
			int numberSoFar = 0;
			while ((ipAddressToDeny = ipSequenceProvider.nextIP()) != null) {
				if (ipAddressToDeny != null) {
					//System.out.println("sendXMIACLDenyIPAddress =============================================");
					sendXMIACLDenyIPAddress(port, domain, configFilename, accessControlListName, ipAddressToDeny);
					numberSoFar++;
					System.out.println("Number so far: " + numberSoFar + " ipAddressToDeny: " + ipAddressToDeny);
					//System.out.println("sendXMIExecConfig       =============================================");
					sendXMIExecConfig(port, domain, configFilename);
				}
			}
		}
	}

	protected static void sendXMIACLDenyIPAddress(XmlMgmt port,
												  String domain,
												  String configFilename,
												  String accessControlListName,
												  String ipAddressToDeny) {
		// Build up request:
		Request request = new Request();
		request.setDomain(domain);
		
		SetFile setFile = new SetFile();
		String configFileContent = "acl " + accessControlListName + "\n" +
								   "  deny " + ipAddressToDeny + "/32\n" +
								   "exit\n";
		
		//System.out.println("Config file content: \n");
		//System.out.println(configFileContent);
		
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
		//System.out.println("Timestamp: "+ response.getTimestamp());
		Result result = response.getResult();
		//System.out.println("Result content: " + result.getContent());

	}

}
