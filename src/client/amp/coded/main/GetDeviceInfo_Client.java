package client.amp.coded.main;

import java.util.List;

import client.amp.coded.utility.AMPPortProvider;
import client.amp.generated.*;

public class GetDeviceInfo_Client {
	
	// SSL: If using cacerts in Java JRE need to provide the following VM argument similar to:
	// 	-Djavax.net.ssl.trustStore="C:\Program Files\Java\jdk1.6.0_27\jre\lib\security\cacerts"

	public static void main(String[] args) {

		// The following two lines takes care of XMI username, password, endpoint, certs
		AMPPortProvider portProvider = new AMPPortProvider();
		AppMgmtProtocol port = portProvider.getPort();
		
		GetDeviceInfoRequest request = new GetDeviceInfoRequest();
		GetDeviceInfoResponse response = null;
		
		try {
			response = port.getDeviceInfo(request);
		} catch (Fault_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		String ampVersion = response.getCurrentAMPVersion();
		System.out.println("ampVersion: " + ampVersion);
		
		String deviceID = response.getDeviceID();
		System.out.println("deviceID: " + deviceID);
		
		String deviceName = response.getDeviceName();
		System.out.println("deviceName: " + deviceName);
		
		String deviceSerialNo = response.getDeviceSerialNo();
		System.out.println("deviceSerialNo: " + deviceSerialNo);
		
		String firmwareVersion = response.getFirmwareVersion();
		System.out.println("firmwareVersion: " + firmwareVersion);
		
		DeviceType deviceType = response.getDeviceType();
		System.out.println("deviceType: " + deviceType);
		
		System.out.println("Managment interfaces ==============");
		List<ManagementInterface> mgtInterfaces = response.getManagementInterface();
		for (ManagementInterface mgtInterface : mgtInterfaces )
		{
			System.out.println("mgtInterface: " + mgtInterface.getType());
			System.out.println("mgtInterface: " + mgtInterface.getValue());
		}
		
		System.out.println("Features ==============");
		List<DeviceFeature> deviceFeatures = response.getDeviceFeature();
		for (DeviceFeature deviceFeature: deviceFeatures) {
			if (deviceFeature != null)
				System.out.println("deviceFeature: " + deviceFeature.name() + ":" + deviceFeature.value());
		}
	}
	/* Sample output:
	 * ampVersion: 3.0
deviceID: 5725
deviceName: we421-temp
deviceSerialNo: 0000000
firmwareVersion: XI52.5.0.0.9
deviceType: XI_52
Managment interfaces ==============
mgtInterface: WEB_MGMT
mgtInterface: 9090
Features ==============
deviceFeature: MQ:MQ
deviceFeature: TAM:TAM
deviceFeature: DATA_GLUE:DataGlue
deviceFeature: JAXP_API:JAXP-API
deviceFeature: PKCS_7_SMIME:PKCS7-SMIME
deviceFeature: SQL_ODBC:SQL-ODBC
deviceFeature: WEB_SPHERE_JMS:WebSphere-JMS
	 */
}
