
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
 * <p>Java class for ConfigMessageMatching complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigMessageMatching">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ConfigMessageFlowControl">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="UserSummary" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="IPAddress" type="{http://www.datapower.com/schemas/management}dmIPNetAddress" minOccurs="0"/>
 *         &lt;element name="IPExclude" type="{http://www.datapower.com/schemas/management}dmIPNetAddress" minOccurs="0"/>
 *         &lt;element name="HTTPMethod" type="{http://www.datapower.com/schemas/management}dmHTTPMethod" minOccurs="0"/>
 *         &lt;element name="HTTPHeader" type="{http://www.datapower.com/schemas/management}dmHTTPHeader" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HTTPHeaderExclude" type="{http://www.datapower.com/schemas/management}dmHTTPHeader" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RequestURL" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
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
@XmlType(name = "ConfigMessageMatching", propOrder = {
    "userSummaryOrIPAddressOrIPExclude"
})
public class ConfigMessageMatching
    extends ConfigMessageFlowControl
{

    @XmlElementRefs({
        @XmlElementRef(name = "IPExclude", type = JAXBElement.class),
        @XmlElementRef(name = "UserSummary", type = JAXBElement.class),
        @XmlElementRef(name = "RequestURL", type = JAXBElement.class),
        @XmlElementRef(name = "HTTPMethod", type = JAXBElement.class),
        @XmlElementRef(name = "IPAddress", type = JAXBElement.class),
        @XmlElementRef(name = "HTTPHeaderExclude", type = JAXBElement.class),
        @XmlElementRef(name = "HTTPHeader", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> userSummaryOrIPAddressOrIPExclude;
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
     * Gets the value of the userSummaryOrIPAddressOrIPExclude property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userSummaryOrIPAddressOrIPExclude property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserSummaryOrIPAddressOrIPExclude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmHTTPMethod }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmHTTPHeader }{@code >}
     * {@link JAXBElement }{@code <}{@link DmHTTPHeader }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getUserSummaryOrIPAddressOrIPExclude() {
        if (userSummaryOrIPAddressOrIPExclude == null) {
            userSummaryOrIPAddressOrIPExclude = new ArrayList<JAXBElement<?>>();
        }
        return this.userSummaryOrIPAddressOrIPExclude;
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
