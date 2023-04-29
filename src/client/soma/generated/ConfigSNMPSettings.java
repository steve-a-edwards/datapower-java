
package client.soma.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigSNMPSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigSNMPSettings">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ConfigConfigBase">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="UserSummary" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="LocalAddress" type="{http://www.datapower.com/schemas/management}dmLocalIPHostAddress" minOccurs="0"/>
 *         &lt;element name="LocalPort" type="{http://www.datapower.com/schemas/management}dmIPPort"/>
 *         &lt;element name="Policies" type="{http://www.datapower.com/schemas/management}dmSnmpPolicy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Targets" type="{http://www.datapower.com/schemas/management}dmSnmpTarget" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Users" type="{http://www.datapower.com/schemas/management}dmReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Contexts" type="{http://www.datapower.com/schemas/management}dmSnmpContext" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SecurityLevel" type="{http://www.datapower.com/schemas/management}dmSnmpSecurityLevel"/>
 *         &lt;element name="AccessLevel" type="{http://www.datapower.com/schemas/management}dmSnmpAccessMode"/>
 *         &lt;element name="EnableDefaultTrapSubscriptions" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="TrapPriority" type="{http://www.datapower.com/schemas/management}dmLogLevel" minOccurs="0"/>
 *         &lt;element name="TrapEventCode" type="{http://www.datapower.com/schemas/management}dmEventCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ConfigMib" type="{http://www.datapower.com/schemas/management}dmFSFile" minOccurs="0"/>
 *         &lt;element name="StatusMib" type="{http://www.datapower.com/schemas/management}dmFSFile" minOccurs="0"/>
 *         &lt;element name="NotifMib" type="{http://www.datapower.com/schemas/management}dmFSFile" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.datapower.com/schemas/management}ConfigAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigSNMPSettings", propOrder = {
    "userSummaryOrLocalAddressOrLocalPort"
})
public class ConfigSNMPSettings
    extends ConfigConfigBase
{

    @XmlElementRefs({
        @XmlElementRef(name = "TrapEventCode", type = JAXBElement.class),
        @XmlElementRef(name = "NotifMib", type = JAXBElement.class),
        @XmlElementRef(name = "Users", type = JAXBElement.class),
        @XmlElementRef(name = "Contexts", type = JAXBElement.class),
        @XmlElementRef(name = "Targets", type = JAXBElement.class),
        @XmlElementRef(name = "ConfigMib", type = JAXBElement.class),
        @XmlElementRef(name = "EnableDefaultTrapSubscriptions", type = JAXBElement.class),
        @XmlElementRef(name = "LocalAddress", type = JAXBElement.class),
        @XmlElementRef(name = "StatusMib", type = JAXBElement.class),
        @XmlElementRef(name = "TrapPriority", type = JAXBElement.class),
        @XmlElementRef(name = "UserSummary", type = JAXBElement.class),
        @XmlElementRef(name = "SecurityLevel", type = JAXBElement.class),
        @XmlElementRef(name = "Policies", type = JAXBElement.class),
        @XmlElementRef(name = "AccessLevel", type = JAXBElement.class),
        @XmlElementRef(name = "LocalPort", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> userSummaryOrLocalAddressOrLocalPort;
    @XmlAttribute
    protected String name;
    @XmlAttribute
    protected Boolean local;
    @XmlAttribute
    protected Boolean intrinsic;
    @XmlAttribute(name = "read-only")
    protected Boolean readOnly;
    @XmlAttribute
    protected Boolean external;

    /**
     * Gets the value of the userSummaryOrLocalAddressOrLocalPort property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userSummaryOrLocalAddressOrLocalPort property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserSummaryOrLocalAddressOrLocalPort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmSnmpContext }{@code >}
     * {@link JAXBElement }{@code <}{@link DmSnmpTarget }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmLogLevel }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmSnmpSecurityLevel }{@code >}
     * {@link JAXBElement }{@code <}{@link DmSnmpPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link DmSnmpAccessMode }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getUserSummaryOrLocalAddressOrLocalPort() {
        if (userSummaryOrLocalAddressOrLocalPort == null) {
            userSummaryOrLocalAddressOrLocalPort = new ArrayList<JAXBElement<?>>();
        }
        return this.userSummaryOrLocalAddressOrLocalPort;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the local property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocal() {
        return local;
    }

    /**
     * Sets the value of the local property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocal(Boolean value) {
        this.local = value;
    }

    /**
     * Gets the value of the intrinsic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntrinsic() {
        return intrinsic;
    }

    /**
     * Sets the value of the intrinsic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntrinsic(Boolean value) {
        this.intrinsic = value;
    }

    /**
     * Gets the value of the readOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReadOnly() {
        return readOnly;
    }

    /**
     * Sets the value of the readOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReadOnly(Boolean value) {
        this.readOnly = value;
    }

    /**
     * Gets the value of the external property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExternal() {
        return external;
    }

    /**
     * Sets the value of the external property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExternal(Boolean value) {
        this.external = value;
    }

}
