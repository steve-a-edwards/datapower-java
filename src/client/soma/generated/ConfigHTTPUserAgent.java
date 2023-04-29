
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
 * <p>Java class for ConfigHTTPUserAgent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigHTTPUserAgent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ConfigConfigBase">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="UserSummary" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Identifier" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="MaxRedirects" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="Timeout" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="ProxyPolicies" type="{http://www.datapower.com/schemas/management}dmProxyPolicy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SSLPolicies" type="{http://www.datapower.com/schemas/management}dmSSLPolicy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BasicAuthPolicies" type="{http://www.datapower.com/schemas/management}dmBasicAuthPolicy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SoapActionPolicies" type="{http://www.datapower.com/schemas/management}dmSoapActionPolicy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PubkeyAuthPolicies" type="{http://www.datapower.com/schemas/management}dmPubkeyAuthPolicy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AllowCompressionPolicies" type="{http://www.datapower.com/schemas/management}dmAllowCompressionPolicy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HeaderRetentionPolicies" type="{http://www.datapower.com/schemas/management}dmHeaderRetentionPolicy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Restrict10Policies" type="{http://www.datapower.com/schemas/management}dmRestrict10Policy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AddHeaderPolicies" type="{http://www.datapower.com/schemas/management}dmAddHeaderPolicy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UploadChunkedPolicies" type="{http://www.datapower.com/schemas/management}dmUploadChunkedPolicy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FTPPolicies" type="{http://www.datapower.com/schemas/management}dmFTPPolicy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SFTPPolicies" type="{http://www.datapower.com/schemas/management}dmSFTPPolicy" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ConfigHTTPUserAgent", propOrder = {
    "userSummaryOrIdentifierOrMaxRedirects"
})
public class ConfigHTTPUserAgent
    extends ConfigConfigBase
{

    @XmlElementRefs({
        @XmlElementRef(name = "SSLPolicies", type = JAXBElement.class),
        @XmlElementRef(name = "AllowCompressionPolicies", type = JAXBElement.class),
        @XmlElementRef(name = "SoapActionPolicies", type = JAXBElement.class),
        @XmlElementRef(name = "UserSummary", type = JAXBElement.class),
        @XmlElementRef(name = "ProxyPolicies", type = JAXBElement.class),
        @XmlElementRef(name = "Restrict10Policies", type = JAXBElement.class),
        @XmlElementRef(name = "UploadChunkedPolicies", type = JAXBElement.class),
        @XmlElementRef(name = "HeaderRetentionPolicies", type = JAXBElement.class),
        @XmlElementRef(name = "MaxRedirects", type = JAXBElement.class),
        @XmlElementRef(name = "PubkeyAuthPolicies", type = JAXBElement.class),
        @XmlElementRef(name = "FTPPolicies", type = JAXBElement.class),
        @XmlElementRef(name = "SFTPPolicies", type = JAXBElement.class),
        @XmlElementRef(name = "Identifier", type = JAXBElement.class),
        @XmlElementRef(name = "BasicAuthPolicies", type = JAXBElement.class),
        @XmlElementRef(name = "Timeout", type = JAXBElement.class),
        @XmlElementRef(name = "AddHeaderPolicies", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> userSummaryOrIdentifierOrMaxRedirects;
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
     * Gets the value of the userSummaryOrIdentifierOrMaxRedirects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userSummaryOrIdentifierOrMaxRedirects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserSummaryOrIdentifierOrMaxRedirects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DmSSLPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link DmAllowCompressionPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link DmSoapActionPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmProxyPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link DmRestrict10Policy }{@code >}
     * {@link JAXBElement }{@code <}{@link DmUploadChunkedPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link DmHeaderRetentionPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmPubkeyAuthPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link DmFTPPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link DmSFTPPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link DmBasicAuthPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmAddHeaderPolicy }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getUserSummaryOrIdentifierOrMaxRedirects() {
        if (userSummaryOrIdentifierOrMaxRedirects == null) {
            userSummaryOrIdentifierOrMaxRedirects = new ArrayList<JAXBElement<?>>();
        }
        return this.userSummaryOrIdentifierOrMaxRedirects;
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
