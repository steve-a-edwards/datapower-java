
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
 * <p>Java class for ModifySSLProxyProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifySSLProxyProfile">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ModifyCrypto">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="Direction" type="{http://www.datapower.com/schemas/management}dmSSLProxyDirection" minOccurs="0"/>
 *         &lt;element name="ForwardCryptoProfile" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="ReverseCryptoProfile" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="ServerCaching" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="SessionTimeout" type="{http://www.datapower.com/schemas/management}dmTimeInterval" minOccurs="0"/>
 *         &lt;element name="CacheSize" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="ClientCache" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="ClientAuthOptional" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="ClientAuthAlwaysRequest" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="PermitInsecureServers" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
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
@XmlType(name = "ModifySSLProxyProfile", propOrder = {
    "directionOrForwardCryptoProfileOrReverseCryptoProfile"
})
public class ModifySSLProxyProfile
    extends ModifyCrypto
{

    @XmlElementRefs({
        @XmlElementRef(name = "PermitInsecureServers", type = JAXBElement.class),
        @XmlElementRef(name = "ClientAuthOptional", type = JAXBElement.class),
        @XmlElementRef(name = "CacheSize", type = JAXBElement.class),
        @XmlElementRef(name = "ServerCaching", type = JAXBElement.class),
        @XmlElementRef(name = "ClientAuthAlwaysRequest", type = JAXBElement.class),
        @XmlElementRef(name = "SessionTimeout", type = JAXBElement.class),
        @XmlElementRef(name = "ClientCache", type = JAXBElement.class),
        @XmlElementRef(name = "ForwardCryptoProfile", type = JAXBElement.class),
        @XmlElementRef(name = "Direction", type = JAXBElement.class),
        @XmlElementRef(name = "ReverseCryptoProfile", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> directionOrForwardCryptoProfileOrReverseCryptoProfile;
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
     * Gets the value of the directionOrForwardCryptoProfileOrReverseCryptoProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directionOrForwardCryptoProfileOrReverseCryptoProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectionOrForwardCryptoProfileOrReverseCryptoProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmSSLProxyDirection }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getDirectionOrForwardCryptoProfileOrReverseCryptoProfile() {
        if (directionOrForwardCryptoProfileOrReverseCryptoProfile == null) {
            directionOrForwardCryptoProfileOrReverseCryptoProfile = new ArrayList<JAXBElement<?>>();
        }
        return this.directionOrForwardCryptoProfileOrReverseCryptoProfile;
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
