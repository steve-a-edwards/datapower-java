
package client.amp.generated;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "app-mgmt-protocol", targetNamespace = "http://www.datapower.com/schemas/appliance/management/2.0/wsdl", wsdlLocation = "file:/Users/steve/Applications/eclipse/workspace/JAX-WS-JAXB-DP-XMI-Client/wsdl-xsd-xmi/app-mgmt-protocol-v2.wsdl")
public class AppMgmtProtocol_Service
    extends Service
{

    private final static URL APPMGMTPROTOCOL_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(client.amp.generated.AppMgmtProtocol_Service.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = client.amp.generated.AppMgmtProtocol_Service.class.getResource(".");
            url = new URL(baseUrl, "file:/Users/steve/Applications/eclipse/workspace/JAX-WS-JAXB-DP-XMI-Client/wsdl-xsd-xmi/app-mgmt-protocol-v2.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/Users/steve/Applications/eclipse/workspace/JAX-WS-JAXB-DP-XMI-Client/wsdl-xsd-xmi/app-mgmt-protocol-v2.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        APPMGMTPROTOCOL_WSDL_LOCATION = url;
    }

    public AppMgmtProtocol_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AppMgmtProtocol_Service() {
        super(APPMGMTPROTOCOL_WSDL_LOCATION, new QName("http://www.datapower.com/schemas/appliance/management/2.0/wsdl", "app-mgmt-protocol"));
    }

    /**
     * 
     * @return
     *     returns AppMgmtProtocol
     */
    @WebEndpoint(name = "app-mgmt-protocol")
    public AppMgmtProtocol getAppMgmtProtocol() {
        return super.getPort(new QName("http://www.datapower.com/schemas/appliance/management/2.0/wsdl", "app-mgmt-protocol"), AppMgmtProtocol.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AppMgmtProtocol
     */
    @WebEndpoint(name = "app-mgmt-protocol")
    public AppMgmtProtocol getAppMgmtProtocol(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.datapower.com/schemas/appliance/management/2.0/wsdl", "app-mgmt-protocol"), AppMgmtProtocol.class, features);
    }

}