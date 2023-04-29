// Following creates folder
// if it already exists, then files within it remain  and result content is "OK"

package client.soma.coded.main;

import client.soma.coded.utility.SOMAPortProvider;
import client.soma.generated.ActionCreateDir;
import client.soma.generated.AnyActionElement;
import client.soma.generated.Request;
import client.soma.generated.Response;
import client.soma.generated.XmlMgmt;
import client.soma.generated.Response.Result;

public class Create_Directory_Client {
	
	// SSL: If using cacerts in Java JRE need to provide the following VM argument similar to:
	// 	-Djavax.net.ssl.trustStore="C:\Program Files\Java\jdk1.6.0_27\jre\lib\security\cacerts"
	static String domain = "SE_TEST";

	public static void main(String[] args) {
		
		System.out.println("Domain: " + domain);

		// The following two lines takes care of XMI username, password, endpoint, certs
		SOMAPortProvider portProvider = new SOMAPortProvider();
		XmlMgmt port = portProvider.getPort();
		
		//String folderToCreate = "local:///temp";
		String folderToCreate = "local:///hda/monitoring/store/cpu-memory-load/2012-02";
		
		// Build up request:
		Request request = new Request();
		request.setDomain(domain);

		ActionCreateDir createDir = new ActionCreateDir();
		createDir.setDir(folderToCreate);

		AnyActionElement anyActionElement = new AnyActionElement();
		anyActionElement.getAddKnownHostOrAddPasswordMapOrAddSelTestEntry().add(createDir);
		request.setDoAction(anyActionElement);

		Response response = port.operation(request);
		Result result = response.getResult();
		if(result != null) {
			System.out.println("Result content: " + result.getContent().get(0).toString());
		}
		
		System.out.println("Created folder " + folderToCreate);
	}
}
