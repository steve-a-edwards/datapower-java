
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
 * <p>Java class for ModifyDNSNameService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyDNSNameService">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ModifyNetworkConfiguration">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="UserSummary" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="SearchDomains" type="{http://www.datapower.com/schemas/management}dmSearchDomain" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NameServers" type="{http://www.datapower.com/schemas/management}dmNameServer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StaticHosts" type="{http://www.datapower.com/schemas/management}dmStaticHost" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IPPreference" type="{http://www.datapower.com/schemas/management}dmDnsHostIPVersion" minOccurs="0"/>
 *         &lt;element name="LoadBalanceAlgorithm" type="{http://www.datapower.com/schemas/management}dmDNSLoadBalanceAlgorithm" minOccurs="0"/>
 *         &lt;element name="MaxRetries" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="Timeout" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
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
@XmlType(name = "ModifyDNSNameService", propOrder = {
    "userSummaryOrSearchDomainsOrNameServers"
})
public class ModifyDNSNameService
    extends ModifyNetworkConfiguration
{

    @XmlElementRefs({
        @XmlElementRef(name = "MaxRetries", type = JAXBElement.class),
        @XmlElementRef(name = "IPPreference", type = JAXBElement.class),
        @XmlElementRef(name = "UserSummary", type = JAXBElement.class),
        @XmlElementRef(name = "SearchDomains", type = JAXBElement.class),
        @XmlElementRef(name = "LoadBalanceAlgorithm", type = JAXBElement.class),
        @XmlElementRef(name = "Timeout", type = JAXBElement.class),
        @XmlElementRef(name = "StaticHosts", type = JAXBElement.class),
        @XmlElementRef(name = "NameServers", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> userSummaryOrSearchDomainsOrNameServers;
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
     * Gets the value of the userSummaryOrSearchDomainsOrNameServers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userSummaryOrSearchDomainsOrNameServers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserSummaryOrSearchDomainsOrNameServers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmSearchDomain }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDNSLoadBalanceAlgorithm }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmNameServer }{@code >}
     * {@link JAXBElement }{@code <}{@link DmStaticHost }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getUserSummaryOrSearchDomainsOrNameServers() {
        if (userSummaryOrSearchDomainsOrNameServers == null) {
            userSummaryOrSearchDomainsOrNameServers = new ArrayList<JAXBElement<?>>();
        }
        return this.userSummaryOrSearchDomainsOrNameServers;
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
