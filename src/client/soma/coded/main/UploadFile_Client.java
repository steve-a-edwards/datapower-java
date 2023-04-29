package client.soma.coded.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import client.soma.coded.utility.SOMAPortProvider;
import client.soma.generated.Request;
import client.soma.generated.Request.SetFile;
import client.soma.generated.Response;
import client.soma.generated.Response.Result;
import client.soma.generated.XmlMgmt;

public class UploadFile_Client {
	
	// SSL: If using cacerts in Java JRE need to provide the following VM argument similar to:
	// 	-Djavax.net.ssl.trustStore="C:\Program Files\Java\jdk1.6.0_27\jre\lib\security\cacerts"
	static String domain = "SE_EXPLORE";
	static String filename = "upload-test.cfg";

	public static void main(String[] args) throws IOException {

		System.out.println("Domain: " + domain);
		
		// The following two lines takes care of XMI username, password, endpoint, certs
		SOMAPortProvider portProvider = new SOMAPortProvider();
		XmlMgmt port = portProvider.getPort();
		
		// Build up request:
		Request request = new Request();
		request.setDomain(domain);
		
		SetFile setFile = new SetFile();
		setFile.setName("local:///" + filename);
		
		File file = new File(filename);
		byte[] bfile = new byte[(int) file.length()];
		FileInputStream fileInputStream  = new FileInputStream (file);
		fileInputStream.read(bfile);
		setFile.setValue(bfile);
		request.setSetFile(setFile);
		
		// Call the XMI service and get the response:
		Response response = port.operation(request);
		
		// Output response results:
		System.out.println("Timestamp: "+ response.getTimestamp());
		Result result = response.getResult();
		System.out.println("Result content: " + result.getContent());

	}
}
