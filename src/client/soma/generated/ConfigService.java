
package client.soma.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigService">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ConfigConfigBase">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="LocalAddress" type="{http://www.datapower.com/schemas/management}dmLocalIPHostAddress"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigService", propOrder = {
    "localAddress"
})
@XmlSeeAlso({
    ConfigTCPProxyService.class,
    ConfigSSLProxyService.class,
    ConfigHTTPService.class,
    ConfigDeviceManagementService.class,
    ConfigHTTPProxyService.class,
    ConfigXSLCoprocService.class
})
public class ConfigService
    extends ConfigConfigBase
{

    @XmlElement(name = "LocalAddress")
    protected List<String> localAddress;

    /**
     * Gets the value of the localAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLocalAddress() {
        if (localAddress == null) {
            localAddress = new ArrayList<String>();
        }
        return this.localAddress;
    }

}
