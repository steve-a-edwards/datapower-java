package client.soma.coded.main;

import client.soma.coded.utility.SOMAPortProvider;
import client.soma.generated.File;
import client.soma.generated.Request;
import client.soma.generated.Response;
import client.soma.generated.XmlMgmt;
import client.soma.generated.Request.GetFile;

public class DownloadFileClient {
	
	static String domain = "default";

	public static void main(String[] args) {

		System.out.println("Domain: " + domain);
		
		// The following two lines takes care of XMI username, password, endpoint, certs
		SOMAPortProvider portProvider = new SOMAPortProvider();
		XmlMgmt port = portProvider.getPort();
		
		// Build up request:
		Request request = new Request();
		request.setDomain(domain);
		
		GetFile getFile = new GetFile();
		getFile.setName("config:///autoconfig.cfg");
		request.setGetFile(getFile);
		
		// Call the XMI service and get the response:
		Response response = port.operation(request);
		
		// Output response results:
		System.out.println("Timestamp: " + response.getTimestamp());
		File responseFile = response.getFile();
		System.out.println("FILE CONTENT");
		System.out.println(new String(responseFile.getValue()));

	}
}
