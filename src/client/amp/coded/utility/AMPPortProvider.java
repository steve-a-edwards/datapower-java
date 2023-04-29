package client.amp.coded.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import javax.xml.ws.BindingProvider;

import client.amp.generated.AppMgmtProtocol_Service;
import client.amp.generated.AppMgmtProtocol;
import client.xmi.coded.utility.CertificateControl;

public class AMPPortProvider {

	// real AMP service
	// protected static String test_endpoint = "https://10.162.73.231:5550";
	 // test intermediate service
	// protected static String test_endpoint = "http://10.162.73.231:5551";
	
	protected AppMgmtProtocol port;
	protected String endpoint;
	protected String username;
	protected String password;
	
	public AMPPortProvider() {
		// Obtain port to send AMP message to:
		AppMgmtProtocol_Service service = new AppMgmtProtocol_Service();
		this.port = service.getAppMgmtProtocol();
		
		Properties props = new Properties();
		String propertiesFilename = "xmi.properties";
		 
    	try {
               //load a properties file
    		props.load(new FileInputStream(propertiesFilename));
 
               //get the property value and print it out
            this.endpoint = props.getProperty("amp.endpoint");
    		this.username = props.getProperty("xmi.username");
    		this.password = props.getProperty("xmi.password");
    	} catch (IOException ex) {
    		System.out.println("Problem reading properties file : " + propertiesFilename);
    	}
		
		// Set BasicAuth for XMI call and endpoint (this call uses defaults):
		// The following call set up default user, password, endpoint:
		// this.setTestUsernamePasswordEndpoint();
		// Alternative:
		this.setUsernamePassword(username, password);
		this.setAMPEndpoint(this.endpoint);
		CertificateControl.setup(this.endpoint); // sorts out certificate problem for SSL
	}
	
	protected String getEndpoint(){
		return this.endpoint;
	}
	
	// This method sets BasicAuth values for XMI use:
	public void setUsernamePassword(
			String username,
			String password) {
		Map<String, Object> requestContext = ((BindingProvider) this.port).getRequestContext();
		System.out.println("Username: " + username);
		System.out.print("Password: " + password.charAt(0));
		for (int i = 1; i < password.length(); i++) System.out.print ("*");
		System.out.println();
		requestContext.put(BindingProvider.USERNAME_PROPERTY, username);
		requestContext.put(BindingProvider.PASSWORD_PROPERTY, password);
	}
	
	// Set the XMI endpoint of the target DataPower device:
	public void setAMPEndpoint(String endpoint) {
		// instance variable, can be got by other objects
		this.endpoint = endpoint;
		System.out.println("XMI endpoint: " + endpoint);
		((BindingProvider) this.port).getRequestContext().put(
			BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpoint);
	}
	
	public AppMgmtProtocol getPort(){
		return this.port;
	}

}
