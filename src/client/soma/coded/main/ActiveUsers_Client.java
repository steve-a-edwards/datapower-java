package client.soma.coded.main;

import java.util.List;

import client.soma.coded.utility.SOMAPortProvider;
import client.soma.generated.Request;
import client.soma.generated.Response;
import client.soma.generated.StatusActiveUsers;
import client.soma.generated.StatusEnum;
import client.soma.generated.XmlMgmt;
import client.soma.generated.Request.GetStatus;
import client.soma.generated.Response.Result;

public class ActiveUsers_Client {
	
	// SSL: If using cacerts in Java JRE need to provide the following VM argument similar to:
	// 	-Djavax.net.ssl.trustStore="C:\Program Files\Java\jdk1.6.0_27\jre\lib\security\cacerts"
	static String domain = "default";

	public static void main(String[] args) {

		// The following two lines takes care of XMI username, password, endpoint, certs
		SOMAPortProvider portProvider = new SOMAPortProvider();
		XmlMgmt port = portProvider.getPort();
		
		// Build up request:
		Request request = new Request();
		request.setDomain(domain);
		
		GetStatus getStatus = new GetStatus();
		getStatus.setClazz(StatusEnum.ACTIVE_USERS);
		request.setGetStatus(getStatus);
		
		Response response = port.operation(request);
		List<Object> statusList = response.getStatus().getActiveUsersOrARPStatusOrAS1PollerSourceProtocolHandlerSummary();
		for (Object status: statusList) {
			StatusActiveUsers statusActiveUsers = (StatusActiveUsers)status;
			String address = statusActiveUsers.getAddress();
			String domain = statusActiveUsers.getDomain();
			Long logIn = statusActiveUsers.getLogin();
			String name = statusActiveUsers.getName();
			Long session = statusActiveUsers.getSession();
			System.out.println("Active user - address: " + address + " domain: " + domain + " logIn: " + logIn + " name: " + name + " session: " + session);
		}

		System.out.println("Timestamp: "+ response.getTimestamp());
		
		// Output response results:
		Result result = response.getResult();
		if (result == null) {
			System.out.println("Result is null");
		} else {
			System.out.println("Result content: " + result.getContent());
		}

	}
}
