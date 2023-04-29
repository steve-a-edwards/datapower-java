
package client.soma.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigIPInterface complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigIPInterface">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ConfigConfigBase">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="IPAddress" type="{http://www.datapower.com/schemas/management}dmIPNetAddress" minOccurs="0"/>
 *         &lt;element name="UseDHCP" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="DefaultGateway" type="{http://www.datapower.com/schemas/management}dmIPHostAddress" minOccurs="0"/>
 *         &lt;element name="DefaultIPv6Gateway" type="{http://www.datapower.com/schemas/management}dmIPHostAddress" minOccurs="0"/>
 *         &lt;element name="SecondaryAddress" type="{http://www.datapower.com/schemas/management}dmIPNetAddress" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UseARP" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="StaticRoutes" type="{http://www.datapower.com/schemas/management}dmStaticRoute" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UseIPv6" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="UseSLAAC" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="DADTransmits" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="DADRetransmitTimer" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigIPInterface", propOrder = {
    "ipAddressOrUseDHCPOrDefaultGateway"
})
@XmlSeeAlso({
    ConfigEthernetInterface.class,
    ConfigVLANInterface.class
})
public class ConfigIPInterface
    extends ConfigConfigBase
{

    @XmlElementRefs({
        @XmlElementRef(name = "UseDHCP", type = JAXBElement.class),
        @XmlElementRef(name = "UseIPv6", type = JAXBElement.class),
        @XmlElementRef(name = "DADRetransmitTimer", type = JAXBElement.class),
        @XmlElementRef(name = "UseARP", type = JAXBElement.class),
        @XmlElementRef(name = "DefaultIPv6Gateway", type = JAXBElement.class),
        @XmlElementRef(name = "DefaultGateway", type = JAXBElement.class),
        @XmlElementRef(name = "StaticRoutes", type = JAXBElement.class),
        @XmlElementRef(name = "IPAddress", type = JAXBElement.class),
        @XmlElementRef(name = "DADTransmits", type = JAXBElement.class),
        @XmlElementRef(name = "UseSLAAC", type = JAXBElement.class),
        @XmlElementRef(name = "SecondaryAddress", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> ipAddressOrUseDHCPOrDefaultGateway;

    /**
     * Gets the value of the ipAddressOrUseDHCPOrDefaultGateway property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipAddressOrUseDHCPOrDefaultGateway property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIPAddressOrUseDHCPOrDefaultGateway().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmStaticRoute }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getIPAddressOrUseDHCPOrDefaultGateway() {
        if (ipAddressOrUseDHCPOrDefaultGateway == null) {
            ipAddressOrUseDHCPOrDefaultGateway = new ArrayList<JAXBElement<?>>();
        }
        return this.ipAddressOrUseDHCPOrDefaultGateway;
    }

}
