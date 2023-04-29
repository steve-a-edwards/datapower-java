package client.soma.coded.main;

import client.soma.coded.utility.SOMAPortProvider;
import client.soma.generated.ActionFlushDocumentCache;
import client.soma.generated.AnyActionElement;
import client.soma.generated.DmReference;
import client.soma.generated.Request;
import client.soma.generated.Response;
import client.soma.generated.XmlMgmt;
import client.soma.generated.Response.Result;

public class ClearDocumentCache_Client {
	
	// SSL: If using cacerts in Java JRE need to provide the following VM argument similar to:
	// 	-Djavax.net.ssl.trustStore="C:\Program Files\Java\jdk1.6.0_27\jre\lib\security\cacerts"
	static String domain = "default";
	static String xmlMgr = "default";

	public static void main(String[] args) {

		System.out.println("Domain: " + domain);
		System.out.println("XmlMgr: " + xmlMgr);
		
		// The following two lines takes care of XMI username, password, endpoint, certs
		SOMAPortProvider portProvider = new SOMAPortProvider();
		XmlMgmt port = portProvider.getPort();
		
		// Build up request:
		Request request = new Request();
		request.setDomain(domain);
		
		ActionFlushDocumentCache flushDocumentCache = new ActionFlushDocumentCache();
		DmReference dmr = new DmReference();
		dmr.setValue(xmlMgr);
		flushDocumentCache.setXMLManager(dmr);
		
		AnyActionElement anyActionElement = new AnyActionElement();
		anyActionElement.getAddKnownHostOrAddPasswordMapOrAddSelTestEntry().add(flushDocumentCache);
		request.setDoAction(anyActionElement);

		// Call the XMI service and get the response:
		Response response = port.operation(request);
		
		// Output response results:
		System.out.println("Timestamp: "+ response.getTimestamp());
		Result result = response.getResult();
		System.out.println("Result content: " + result.getContent());

	}
}
