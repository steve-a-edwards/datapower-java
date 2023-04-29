package client.amp.coded.main;

import client.amp.coded.utility.AMPPortProvider;
import client.amp.generated.*;


public class GetDeviceSettings_Client {
	
	// SSL: If using cacerts in Java JRE need to provide the following VM argument similar to:
	// 	-Djavax.net.ssl.trustStore="C:\Program Files\Java\jdk1.6.0_27\jre\lib\security\cacerts"

	public static void main(String[] args) {

		// The following two lines takes care of XMI username, password, endpoint, certs
		AMPPortProvider portProvider = new AMPPortProvider();
		AppMgmtProtocol port = portProvider.getPort();
		
		GetDeviceSettingsRequest request = new GetDeviceSettingsRequest();
		GetDeviceSettingsResponse response = null;
		
		try {
			response = port.getDeviceSettings(request);
		} catch (Fault_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		Export export = response.getSettings();

		System.out.println("Export: " + new String(export.getValue()));
		
	}
}
