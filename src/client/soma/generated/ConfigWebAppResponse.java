
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
 * <p>Java class for ConfigWebAppResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigWebAppResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ConfigConfigBase">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="UserSummary" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="PolicyType" type="{http://www.datapower.com/schemas/management}dmSatisfactionPolicy"/>
 *         &lt;element name="OKCodes" type="{http://www.datapower.com/schemas/management}dmHTTPResponseCodes" minOccurs="0"/>
 *         &lt;element name="OKVersions" type="{http://www.datapower.com/schemas/management}dmHTTPVersionMask" minOccurs="0"/>
 *         &lt;element name="MinBodySize" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="MaxBodySize" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="HeaderGNVC" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="ContentTypes" type="{http://www.datapower.com/schemas/management}dmPCRE" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="XMLPolicy" type="{http://www.datapower.com/schemas/management}dmWebAppXMLPolicy" minOccurs="0"/>
 *         &lt;element name="XMLRule" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="NonXMLPolicy" type="{http://www.datapower.com/schemas/management}dmWebAppNonXMLPolicy" minOccurs="0"/>
 *         &lt;element name="NonXMLRule" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="ErrorPolicy" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
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
@XmlType(name = "ConfigWebAppResponse", propOrder = {
    "userSummaryOrPolicyTypeOrOKCodes"
})
public class ConfigWebAppResponse
    extends ConfigConfigBase
{

    @XmlElementRefs({
        @XmlElementRef(name = "XMLPolicy", type = JAXBElement.class),
        @XmlElementRef(name = "OKCodes", type = JAXBElement.class),
        @XmlElementRef(name = "ErrorPolicy", type = JAXBElement.class),
        @XmlElementRef(name = "MinBodySize", type = JAXBElement.class),
        @XmlElementRef(name = "NonXMLPolicy", type = JAXBElement.class),
        @XmlElementRef(name = "MaxBodySize", type = JAXBElement.class),
        @XmlElementRef(name = "PolicyType", type = JAXBElement.class),
        @XmlElementRef(name = "HeaderGNVC", type = JAXBElement.class),
        @XmlElementRef(name = "XMLRule", type = JAXBElement.class),
        @XmlElementRef(name = "OKVersions", type = JAXBElement.class),
        @XmlElementRef(name = "ContentTypes", type = JAXBElement.class),
        @XmlElementRef(name = "NonXMLRule", type = JAXBElement.class),
        @XmlElementRef(name = "UserSummary", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> userSummaryOrPolicyTypeOrOKCodes;
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
     * Gets the value of the userSummaryOrPolicyTypeOrOKCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userSummaryOrPolicyTypeOrOKCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserSummaryOrPolicyTypeOrOKCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DmWebAppXMLPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link DmHTTPResponseCodes }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmWebAppNonXMLPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmSatisfactionPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmHTTPVersionMask }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getUserSummaryOrPolicyTypeOrOKCodes() {
        if (userSummaryOrPolicyTypeOrOKCodes == null) {
            userSummaryOrPolicyTypeOrOKCodes = new ArrayList<JAXBElement<?>>();
        }
        return this.userSummaryOrPolicyTypeOrOKCodes;
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
