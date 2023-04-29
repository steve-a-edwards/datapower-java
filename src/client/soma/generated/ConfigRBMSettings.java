
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
 * <p>Java class for ConfigRBMSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigRBMSettings">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ConfigAccessControl">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="UserSummary" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="AUMethod" type="{http://www.datapower.com/schemas/management}dmRBMAuthenticateType"/>
 *         &lt;element name="AUZOSNSSConfig" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="AUKerberosKeytab" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="AUCustomURL" type="{http://www.datapower.com/schemas/management}dmURL" minOccurs="0"/>
 *         &lt;element name="AUInfoURL" type="{http://www.datapower.com/schemas/management}dmURL" minOccurs="0"/>
 *         &lt;element name="AUSSLValcred" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="AUHost" type="{http://www.datapower.com/schemas/management}dmHostname" minOccurs="0"/>
 *         &lt;element name="AUPort" type="{http://www.datapower.com/schemas/management}dmIPPort" minOccurs="0"/>
 *         &lt;element name="AULDAPSearchForDN" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="AULDAPBindDN" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="AULDAPBindPassword" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="AULDAPSearchParameters" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="AULDAPPrefix" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="LDAPsuffix" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="LDAPSSLProxyProfile" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="AULDAPLoadBalanceGroup" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="AUCacheAllow" type="{http://www.datapower.com/schemas/management}dmAAACacheType"/>
 *         &lt;element name="AUCacheTTL" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="MCMethod" type="{http://www.datapower.com/schemas/management}dmRBMMapType"/>
 *         &lt;element name="MCCustomURL" type="{http://www.datapower.com/schemas/management}dmURL" minOccurs="0"/>
 *         &lt;element name="MCLDAPSearchForGroup" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="MCHost" type="{http://www.datapower.com/schemas/management}dmHostname" minOccurs="0"/>
 *         &lt;element name="MCPort" type="{http://www.datapower.com/schemas/management}dmIPPort" minOccurs="0"/>
 *         &lt;element name="MCLDAPSSLProxyProfile" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="MCLDAPLoadBalanceGroup" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="MCLDAPBindDN" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="MCLDAPBindPassword" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="MCLDAPSearchParameters" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="MCInfoURL" type="{http://www.datapower.com/schemas/management}dmURL" minOccurs="0"/>
 *         &lt;element name="LDAPVersion" type="{http://www.datapower.com/schemas/management}dmLDAPVersion" minOccurs="0"/>
 *         &lt;element name="FallbackLogin" type="{http://www.datapower.com/schemas/management}dmRBMFallbackLoginType" minOccurs="0"/>
 *         &lt;element name="FallbackUser" type="{http://www.datapower.com/schemas/management}dmReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ApplyToCLI" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="RestrictAdminToSerialPort" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="MinPasswordLength" type="{http://www.datapower.com/schemas/management}dmUInt16"/>
 *         &lt;element name="RequireMixedCase" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="RequireDigit" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="RequireNonAlphaNumeric" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="DisallowUsernameSubstring" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="DoPasswordAging" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="MaxPasswordAge" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="DoPasswordHistory" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="NumOldPasswords" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="CliTimeout" type="{http://www.datapower.com/schemas/management}dmTimeInterval"/>
 *         &lt;element name="MaxFailedLogin" type="{http://www.datapower.com/schemas/management}dmUInt16"/>
 *         &lt;element name="LockoutPeriod" type="{http://www.datapower.com/schemas/management}dmTimeInterval" minOccurs="0"/>
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
@XmlType(name = "ConfigRBMSettings", propOrder = {
    "userSummaryOrAUMethodOrAUZOSNSSConfig"
})
public class ConfigRBMSettings
    extends ConfigAccessControl
{

    @XmlElementRefs({
        @XmlElementRef(name = "AUCacheTTL", type = JAXBElement.class),
        @XmlElementRef(name = "LDAPSSLProxyProfile", type = JAXBElement.class),
        @XmlElementRef(name = "MCLDAPBindDN", type = JAXBElement.class),
        @XmlElementRef(name = "AULDAPBindDN", type = JAXBElement.class),
        @XmlElementRef(name = "ApplyToCLI", type = JAXBElement.class),
        @XmlElementRef(name = "NumOldPasswords", type = JAXBElement.class),
        @XmlElementRef(name = "AUKerberosKeytab", type = JAXBElement.class),
        @XmlElementRef(name = "AUCustomURL", type = JAXBElement.class),
        @XmlElementRef(name = "AUCacheAllow", type = JAXBElement.class),
        @XmlElementRef(name = "LockoutPeriod", type = JAXBElement.class),
        @XmlElementRef(name = "DisallowUsernameSubstring", type = JAXBElement.class),
        @XmlElementRef(name = "FallbackLogin", type = JAXBElement.class),
        @XmlElementRef(name = "MaxFailedLogin", type = JAXBElement.class),
        @XmlElementRef(name = "MCLDAPSSLProxyProfile", type = JAXBElement.class),
        @XmlElementRef(name = "MinPasswordLength", type = JAXBElement.class),
        @XmlElementRef(name = "MCLDAPSearchParameters", type = JAXBElement.class),
        @XmlElementRef(name = "DoPasswordHistory", type = JAXBElement.class),
        @XmlElementRef(name = "AULDAPLoadBalanceGroup", type = JAXBElement.class),
        @XmlElementRef(name = "AUZOSNSSConfig", type = JAXBElement.class),
        @XmlElementRef(name = "AULDAPBindPassword", type = JAXBElement.class),
        @XmlElementRef(name = "UserSummary", type = JAXBElement.class),
        @XmlElementRef(name = "RestrictAdminToSerialPort", type = JAXBElement.class),
        @XmlElementRef(name = "DoPasswordAging", type = JAXBElement.class),
        @XmlElementRef(name = "AULDAPPrefix", type = JAXBElement.class),
        @XmlElementRef(name = "MaxPasswordAge", type = JAXBElement.class),
        @XmlElementRef(name = "RequireNonAlphaNumeric", type = JAXBElement.class),
        @XmlElementRef(name = "MCLDAPSearchForGroup", type = JAXBElement.class),
        @XmlElementRef(name = "AUInfoURL", type = JAXBElement.class),
        @XmlElementRef(name = "AULDAPSearchForDN", type = JAXBElement.class),
        @XmlElementRef(name = "RequireMixedCase", type = JAXBElement.class),
        @XmlElementRef(name = "AULDAPSearchParameters", type = JAXBElement.class),
        @XmlElementRef(name = "MCPort", type = JAXBElement.class),
        @XmlElementRef(name = "LDAPsuffix", type = JAXBElement.class),
        @XmlElementRef(name = "MCMethod", type = JAXBElement.class),
        @XmlElementRef(name = "MCInfoURL", type = JAXBElement.class),
        @XmlElementRef(name = "LDAPVersion", type = JAXBElement.class),
        @XmlElementRef(name = "MCCustomURL", type = JAXBElement.class),
        @XmlElementRef(name = "MCHost", type = JAXBElement.class),
        @XmlElementRef(name = "AUPort", type = JAXBElement.class),
        @XmlElementRef(name = "MCLDAPLoadBalanceGroup", type = JAXBElement.class),
        @XmlElementRef(name = "FallbackUser", type = JAXBElement.class),
        @XmlElementRef(name = "AUHost", type = JAXBElement.class),
        @XmlElementRef(name = "RequireDigit", type = JAXBElement.class),
        @XmlElementRef(name = "AUSSLValcred", type = JAXBElement.class),
        @XmlElementRef(name = "AUMethod", type = JAXBElement.class),
        @XmlElementRef(name = "CliTimeout", type = JAXBElement.class),
        @XmlElementRef(name = "MCLDAPBindPassword", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> userSummaryOrAUMethodOrAUZOSNSSConfig;
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
     * Gets the value of the userSummaryOrAUMethodOrAUZOSNSSConfig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userSummaryOrAUMethodOrAUZOSNSSConfig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserSummaryOrAUMethodOrAUZOSNSSConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmAAACacheType }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmRBMFallbackLoginType }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmRBMMapType }{@code >}
     * {@link JAXBElement }{@code <}{@link DmLDAPVersion }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmRBMAuthenticateType }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getUserSummaryOrAUMethodOrAUZOSNSSConfig() {
        if (userSummaryOrAUMethodOrAUZOSNSSConfig == null) {
            userSummaryOrAUMethodOrAUZOSNSSConfig = new ArrayList<JAXBElement<?>>();
        }
        return this.userSummaryOrAUMethodOrAUZOSNSSConfig;
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
