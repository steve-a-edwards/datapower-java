package client.soma.coded.main;

import java.util.List;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import client.soma.coded.utility.SOMAPortProvider;
import client.soma.generated.FilestoreLocation;
import client.soma.generated.Request;
import client.soma.generated.Response;
import client.soma.generated.XmlMgmt;
import client.soma.generated.Request.GetFilestore;
import client.soma.generated.Response.Filestore;

public class GetFileStore_Client {
	
	// SSL: If using cacerts in Java JRE need to provide the following VM argument similar to:
	// 	-Djavax.net.ssl.trustStore="C:\Program Files\Java\jdk1.6.0_27\jre\lib\security\cacerts"
	static String domain = "SE_TEST";

	public static void main(String[] args) {

		System.out.println("Domain: " + domain);
		
		// The following two lines takes care of XMI username, password, endpoint, certs
		SOMAPortProvider portProvider = new SOMAPortProvider();
		XmlMgmt port = portProvider.getPort();
		
		// Build up request:
		Request request = new Request();
		request.setDomain(domain);
		GetFilestore getFilestore = new GetFilestore();
		// Sets the DataPower folder to 'temporary:"
		getFilestore.setLocation(FilestoreLocation.LOCAL);
		request.setGetFilestore(getFilestore);

		Response response = port.operation(request);
		Filestore fileStore = response.getFilestore();
		List<Element> list_Element = fileStore.getAny();
		
		for (Element element: list_Element) {
			
			// Getting the folder name from the response:
			String folder = element.getAttribute("name");
			System.out.println("Folder: " + folder);
			NodeList nodeList = element.getElementsByTagName("file");
			int numberOfFiles = nodeList.getLength();
			
			for (int i = 0; i < numberOfFiles; i++) {
				Node fileNode = nodeList.item(i);
				String filename = fileNode.getAttributes().getNamedItem("name").getNodeValue();
				String fullFilename = folder + "///" + filename;
				System.out.println("File: " + fullFilename);
			}
			System.out.println("Displayed " + numberOfFiles + " files.");
		}
	}
}
/*
<env:Envelope xmlns:env="http://schemas.xmlsoap.org/soap/envelope/">
<env:Body>
	<dp:response xmlns:dp="http://www.datapower.com/schemas/management">
		<dp:timestamp>2012-01-27T11:34:35Z</dp:timestamp>
		<dp:filestore>
			<location name="local:" read="true" write="true" show="true"
				exec="true" del="true" dir="true" list="true"
				xmlns:env="http://www.w3.org/2003/05/soap-envelope">
				<Access xmlns:func="http://exslt.org/functions">
					<r>on</r>
					<w>on</w>
					<a>on</a>
					<d>on</d>
					<x>on</x>
				</Access>
				<file name="including-another-transform.xslt">
					<size>437</size>
					<modified>2011-12-29 13:21:14</modified>
					<Access xmlns:func="http://exslt.org/functions">
						<r>on</r>
						<w>on</w>
						<a>on</a>
						<d>on</d>
						<x>on</x>
					</Access>
				</file>
				<file name="encrypt-data-aescbc.xslt">
					<size>1288</size>
					<modified>2011-12-29 13:21:14</modified>
					<Access xmlns:func="http://exslt.org/functions">
						<r>on</r>
						<w>on</w>
						<a>on</a>
						<d>on</d>
						<x>on</x>
					</Access>
				</file>
*/