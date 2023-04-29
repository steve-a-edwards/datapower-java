
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModifySourceProtocolHandler complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifySourceProtocolHandler">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ModifyConfigBase">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifySourceProtocolHandler")
@XmlSeeAlso({
    ModifyFTPDemonSourceProtocolHandler.class,
    ModifyMQFTESourceProtocolHandler.class,
    ModifyFilePollerSourceProtocolHandler.class,
    ModifyStatelessTCPSourceProtocolHandler.class,
    ModifyHTTPSSourceProtocolHandler.class,
    ModifyJMSSourceProtocolHandler.class,
    ModifySSHServerSourceProtocolHandler.class,
    ModifyHTTPSourceProtocolHandler.class,
    ModifyIMSConnectSourceProtocolHandler.class,
    ModifyXTCProtocolHandler.class,
    ModifyMQSourceProtocolHandler.class
})
public class ModifySourceProtocolHandler
    extends ModifyConfigBase
{


}
