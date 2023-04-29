package client.amp.coded.main;

import java.util.List;

import client.amp.coded.utility.AMPPortProvider;
import client.amp.generated.*;


public class GetDomainList_Client {
	
	// SSL: If using cacerts in Java JRE need to provide the following VM argument similar to:
	// 	-Djavax.net.ssl.trustStore="C:\Program Files\Java\jdk1.6.0_27\jre\lib\security\cacerts"

	public static void main(String[] args) {

		// The following two lines takes care of XMI username, password, endpoint, certs
		AMPPortProvider portProvider = new AMPPortProvider();
		AppMgmtProtocol port = portProvider.getPort();
		
		GetDomainListRequest request = new GetDomainListRequest();
		GetDomainListResponse response = null;
		
		try {
			response = port.getDomainList(request);
		} catch (Fault_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		List<String> domains = response.getDomain();
		
		for (String domain: domains) {
			System.out.println("Domain name: " + domain);
		}
	}
}
