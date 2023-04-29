
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigSourceProtocolHandler complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigSourceProtocolHandler">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ConfigConfigBase">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigSourceProtocolHandler")
@XmlSeeAlso({
    ConfigHTTPSSourceProtocolHandler.class,
    ConfigMQFTESourceProtocolHandler.class,
    ConfigStatelessTCPSourceProtocolHandler.class,
    ConfigSSHServerSourceProtocolHandler.class,
    ConfigIMSConnectSourceProtocolHandler.class,
    ConfigMQSourceProtocolHandler.class,
    ConfigJMSSourceProtocolHandler.class,
    ConfigFTPDemonSourceProtocolHandler.class,
    ConfigFilePollerSourceProtocolHandler.class,
    ConfigHTTPSourceProtocolHandler.class,
    ConfigXTCProtocolHandler.class
})
public class ConfigSourceProtocolHandler
    extends ConfigConfigBase
{


}
