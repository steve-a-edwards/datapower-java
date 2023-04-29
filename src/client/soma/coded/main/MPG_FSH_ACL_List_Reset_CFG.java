package client.soma.coded.main;

import client.soma.coded.utility.SOMAPortProvider;
import client.soma.generated.ActionExecConfig;
import client.soma.generated.AnyActionElement;
import client.soma.generated.Request;
import client.soma.generated.Response;
import client.soma.generated.XmlMgmt;
import client.soma.generated.Response.Result;

public class MPG_FSH_ACL_List_Reset_CFG {

	public static void main(String[] args) {
		
		// The following two lines takes care of XMI username, password, endpoint, certs
		SOMAPortProvider portProvider = new SOMAPortProvider();
		XmlMgmt port = portProvider.getPort();

		String domain = "SE_TEST";
		
		System.out.println("Domain: " + domain);
		
		// Build up request:
		Request request = new Request();
		request.setDomain(domain);
		
		ActionExecConfig actionExecConfig = new ActionExecConfig();
		//actionExecConfig.setURL("local:///acl-config.cfg");
		actionExecConfig.setURL("local:///acl-reset.cfg");
		
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
