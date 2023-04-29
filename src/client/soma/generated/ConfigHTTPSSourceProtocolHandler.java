
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
 * <p>Java class for ConfigHTTPSSourceProtocolHandler complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigHTTPSSourceProtocolHandler">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ConfigSourceProtocolHandler">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="UserSummary" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="LocalAddress" type="{http://www.datapower.com/schemas/management}dmLocalIPHostAddress"/>
 *         &lt;element name="LocalPort" type="{http://www.datapower.com/schemas/management}dmIPPort"/>
 *         &lt;element name="HTTPVersion" type="{http://www.datapower.com/schemas/management}dmHTTPVersion" minOccurs="0"/>
 *         &lt;element name="AllowedFeatures" type="{http://www.datapower.com/schemas/management}dmSourceHTTPFeatureType" minOccurs="0"/>
 *         &lt;element name="PersistentConnections" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="AllowCompression" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="MaxURLLen" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="MaxTotalHdrLen" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="MaxHdrCount" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="MaxNameHdrLen" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="MaxValueHdrLen" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="MaxQueryStringLen" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="SSLProxy" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="ACL" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
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
@XmlType(name = "ConfigHTTPSSourceProtocolHandler", propOrder = {
    "userSummaryOrLocalAddressOrLocalPort"
})
public class ConfigHTTPSSourceProtocolHandler
    extends ConfigSourceProtocolHandler
{

    @XmlElementRefs({
        @XmlElementRef(name = "MaxHdrCount", type = JAXBElement.class),
        @XmlElementRef(name = "AllowedFeatures", type = JAXBElement.class),
        @XmlElementRef(name = "MaxTotalHdrLen", type = JAXBElement.class),
        @XmlElementRef(name = "ACL", type = JAXBElement.class),
        @XmlElementRef(name = "AllowCompression", type = JAXBElement.class),
        @XmlElementRef(name = "UserSummary", type = JAXBElement.class),
        @XmlElementRef(name = "LocalPort", type = JAXBElement.class),
        @XmlElementRef(name = "MaxQueryStringLen", type = JAXBElement.class),
        @XmlElementRef(name = "MaxURLLen", type = JAXBElement.class),
        @XmlElementRef(name = "MaxValueHdrLen", type = JAXBElement.class),
        @XmlElementRef(name = "SSLProxy", type = JAXBElement.class),
        @XmlElementRef(name = "PersistentConnections", type = JAXBElement.class),
        @XmlElementRef(name = "MaxNameHdrLen", type = JAXBElement.class),
        @XmlElementRef(name = "HTTPVersion", type = JAXBElement.class),
        @XmlElementRef(name = "LocalAddress", type = JAXBElement.class)
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
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link DmSourceHTTPFeatureType }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmHTTPVersion }{@code >}
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
