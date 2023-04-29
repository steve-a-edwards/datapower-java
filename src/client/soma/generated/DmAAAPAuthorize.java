
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmAAAPAuthorize complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmAAAPAuthorize">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AZMethod" type="{http://www.datapower.com/schemas/management}dmAAAPAuthorizeType"/>
 *         &lt;element name="AZCustomURL" type="{http://www.datapower.com/schemas/management}dmURL"/>
 *         &lt;element name="AZMapURL" type="{http://www.datapower.com/schemas/management}dmURL"/>
 *         &lt;element name="AZHost" type="{http://www.datapower.com/schemas/management}dmHostname"/>
 *         &lt;element name="AZPort" type="{http://www.datapower.com/schemas/management}dmIPPort"/>
 *         &lt;element name="AZLDAPGroup" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="AZValcred" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="AZSAMLURL" type="{http://www.datapower.com/schemas/management}dmURL"/>
 *         &lt;element name="AZSAMLType" type="{http://www.datapower.com/schemas/management}dmSAMLMatch"/>
 *         &lt;element name="AZSAMLXPath" type="{http://www.datapower.com/schemas/management}dmXPathExpr"/>
 *         &lt;element name="AZSAMLNameQualifier" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="AZCacheAllow" type="{http://www.datapower.com/schemas/management}dmAAACacheType"/>
 *         &lt;element name="AZCacheTTL" type="{http://www.datapower.com/schemas/management}dmUInt32"/>
 *         &lt;element name="AZNetegrityBaseURI" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="AZNetegrityOpNameExtension" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="AZClearTrustServerURL" type="{http://www.datapower.com/schemas/management}dmURL"/>
 *         &lt;element name="AZSAMLVersion" type="{http://www.datapower.com/schemas/management}dmSAMLVersion"/>
 *         &lt;element name="AZLDAPLoadBalanceGroup" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="AZLDAPBindDN" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="AZLDAPBindPassword" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="AZLDAPGroupAttribute" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="AZSSLProxyProfile" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="AZNetegrityConfig" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="AZLDAPSearchScope" type="{http://www.datapower.com/schemas/management}dmLDAPSearchScope"/>
 *         &lt;element name="AZLDAPSearchFilter" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="AZXACMLVersion" type="{http://www.datapower.com/schemas/management}dmXACMLVersion"/>
 *         &lt;element name="AZXACMLPEPType" type="{http://www.datapower.com/schemas/management}dmXACMLPEPType"/>
 *         &lt;element name="AZXACMLUseOnBoxPDP" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="AZXACMLPDP" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="AZXACMLExternalPDPUrl" type="{http://www.datapower.com/schemas/management}dmURL"/>
 *         &lt;element name="AZXACMLBindingMethod" type="{http://www.datapower.com/schemas/management}dmAAAXACMLBindingMethod"/>
 *         &lt;element name="AZXACMLBindingObject" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="AZXACMLBindingXSL" type="{http://www.datapower.com/schemas/management}dmURL"/>
 *         &lt;element name="AZXACMLCustomObligation" type="{http://www.datapower.com/schemas/management}dmURL"/>
 *         &lt;element name="AZXACMLUseSAML2" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="AZTAMServer" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="AZTAMDefaultAction" type="{http://www.datapower.com/schemas/management}dmTAMActionType"/>
 *         &lt;element name="AZTAMActionResourceMap" type="{http://www.datapower.com/schemas/management}dmURL"/>
 *         &lt;element name="AZXACMLUseSOAP" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="AZZOSNSSConfig" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="AZSAFDefaultAction" type="{http://www.datapower.com/schemas/management}dmSAFActionType"/>
 *         &lt;element name="AZLDAPAttributes" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="AZSkewTime" type="{http://www.datapower.com/schemas/management}dmUInt32"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmAAAPAuthorize", propOrder = {
    "azMethod",
    "azCustomURL",
    "azMapURL",
    "azHost",
    "azPort",
    "azldapGroup",
    "azValcred",
    "azsamlurl",
    "azsamlType",
    "azsamlxPath",
    "azsamlNameQualifier",
    "azCacheAllow",
    "azCacheTTL",
    "azNetegrityBaseURI",
    "azNetegrityOpNameExtension",
    "azClearTrustServerURL",
    "azsamlVersion",
    "azldapLoadBalanceGroup",
    "azldapBindDN",
    "azldapBindPassword",
    "azldapGroupAttribute",
    "azsslProxyProfile",
    "azNetegrityConfig",
    "azldapSearchScope",
    "azldapSearchFilter",
    "azxacmlVersion",
    "azxacmlpepType",
    "azxacmlUseOnBoxPDP",
    "azxacmlpdp",
    "azxacmlExternalPDPUrl",
    "azxacmlBindingMethod",
    "azxacmlBindingObject",
    "azxacmlBindingXSL",
    "azxacmlCustomObligation",
    "azxacmlUseSAML2",
    "aztamServer",
    "aztamDefaultAction",
    "aztamActionResourceMap",
    "azxacmlUseSOAP",
    "azzosnssConfig",
    "azsafDefaultAction",
    "azldapAttributes",
    "azSkewTime"
})
public class DmAAAPAuthorize {

    @XmlElement(name = "AZMethod", required = true)
    protected DmAAAPAuthorizeType azMethod;
    @XmlElement(name = "AZCustomURL", required = true, nillable = true)
    protected String azCustomURL;
    @XmlElement(name = "AZMapURL", required = true, nillable = true)
    protected String azMapURL;
    @XmlElement(name = "AZHost", required = true, nillable = true)
    protected String azHost;
    @XmlElement(name = "AZPort", required = true, type = Integer.class, nillable = true)
    protected Integer azPort;
    @XmlElement(name = "AZLDAPGroup", required = true, nillable = true)
    protected String azldapGroup;
    @XmlElement(name = "AZValcred", required = true, nillable = true)
    protected DmReference azValcred;
    @XmlElement(name = "AZSAMLURL", required = true, nillable = true)
    protected String azsamlurl;
    @XmlElement(name = "AZSAMLType", required = true, nillable = true)
    protected DmSAMLMatch azsamlType;
    @XmlElement(name = "AZSAMLXPath", required = true, nillable = true)
    protected String azsamlxPath;
    @XmlElement(name = "AZSAMLNameQualifier", required = true, nillable = true)
    protected String azsamlNameQualifier;
    @XmlElement(name = "AZCacheAllow", required = true)
    protected DmAAACacheType azCacheAllow;
    @XmlElement(name = "AZCacheTTL", required = true, type = Long.class, nillable = true)
    protected Long azCacheTTL;
    @XmlElement(name = "AZNetegrityBaseURI", required = true, nillable = true)
    protected String azNetegrityBaseURI;
    @XmlElement(name = "AZNetegrityOpNameExtension", required = true, nillable = true)
    protected String azNetegrityOpNameExtension;
    @XmlElement(name = "AZClearTrustServerURL", required = true, nillable = true)
    protected String azClearTrustServerURL;
    @XmlElement(name = "AZSAMLVersion", required = true, nillable = true)
    protected String azsamlVersion;
    @XmlElement(name = "AZLDAPLoadBalanceGroup", required = true, nillable = true)
    protected DmReference azldapLoadBalanceGroup;
    @XmlElement(name = "AZLDAPBindDN", required = true, nillable = true)
    protected String azldapBindDN;
    @XmlElement(name = "AZLDAPBindPassword", required = true, nillable = true)
    protected String azldapBindPassword;
    @XmlElement(name = "AZLDAPGroupAttribute", required = true, nillable = true)
    protected String azldapGroupAttribute;
    @XmlElement(name = "AZSSLProxyProfile", required = true, nillable = true)
    protected DmReference azsslProxyProfile;
    @XmlElement(name = "AZNetegrityConfig", required = true, nillable = true)
    protected DmReference azNetegrityConfig;
    @XmlElement(name = "AZLDAPSearchScope", required = true, nillable = true)
    protected DmLDAPSearchScope azldapSearchScope;
    @XmlElement(name = "AZLDAPSearchFilter", required = true, nillable = true)
    protected String azldapSearchFilter;
    @XmlElement(name = "AZXACMLVersion", required = true, nillable = true)
    protected String azxacmlVersion;
    @XmlElement(name = "AZXACMLPEPType", required = true, nillable = true)
    protected DmXACMLPEPType azxacmlpepType;
    @XmlElement(name = "AZXACMLUseOnBoxPDP", required = true, nillable = true)
    protected DmToggle azxacmlUseOnBoxPDP;
    @XmlElement(name = "AZXACMLPDP", required = true, nillable = true)
    protected DmReference azxacmlpdp;
    @XmlElement(name = "AZXACMLExternalPDPUrl", required = true, nillable = true)
    protected String azxacmlExternalPDPUrl;
    @XmlElement(name = "AZXACMLBindingMethod", required = true, nillable = true)
    protected DmAAAXACMLBindingMethod azxacmlBindingMethod;
    @XmlElement(name = "AZXACMLBindingObject", required = true, nillable = true)
    protected String azxacmlBindingObject;
    @XmlElement(name = "AZXACMLBindingXSL", required = true, nillable = true)
    protected String azxacmlBindingXSL;
    @XmlElement(name = "AZXACMLCustomObligation", required = true, nillable = true)
    protected String azxacmlCustomObligation;
    @XmlElement(name = "AZXACMLUseSAML2", required = true, nillable = true)
    protected DmToggle azxacmlUseSAML2;
    @XmlElement(name = "AZTAMServer", required = true, nillable = true)
    protected DmReference aztamServer;
    @XmlElement(name = "AZTAMDefaultAction", required = true, nillable = true)
    protected String aztamDefaultAction;
    @XmlElement(name = "AZTAMActionResourceMap", required = true, nillable = true)
    protected String aztamActionResourceMap;
    @XmlElement(name = "AZXACMLUseSOAP", required = true, nillable = true)
    protected DmToggle azxacmlUseSOAP;
    @XmlElement(name = "AZZOSNSSConfig", required = true, nillable = true)
    protected DmReference azzosnssConfig;
    @XmlElement(name = "AZSAFDefaultAction", required = true, nillable = true)
    protected DmSAFActionType azsafDefaultAction;
    @XmlElement(name = "AZLDAPAttributes", required = true, nillable = true)
    protected String azldapAttributes;
    @XmlElement(name = "AZSkewTime", required = true, type = Long.class, nillable = true)
    protected Long azSkewTime;

    /**
     * Gets the value of the azMethod property.
     * 
     * @return
     *     possible object is
     *     {@link DmAAAPAuthorizeType }
     *     
     */
    public DmAAAPAuthorizeType getAZMethod() {
        return azMethod;
    }

    /**
     * Sets the value of the azMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmAAAPAuthorizeType }
     *     
     */
    public void setAZMethod(DmAAAPAuthorizeType value) {
        this.azMethod = value;
    }

    /**
     * Gets the value of the azCustomURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAZCustomURL() {
        return azCustomURL;
    }

    /**
     * Sets the value of the azCustomURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAZCustomURL(String value) {
        this.azCustomURL = value;
    }

    /**
     * Gets the value of the azMapURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAZMapURL() {
        return azMapURL;
    }

    /**
     * Sets the value of the azMapURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAZMapURL(String value) {
        this.azMapURL = value;
    }

    /**
     * Gets the value of the azHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAZHost() {
        return azHost;
    }

    /**
     * Sets the value of the azHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAZHost(String value) {
        this.azHost = value;
    }

    /**
     * Gets the value of the azPort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAZPort() {
        return azPort;
    }

    /**
     * Sets the value of the azPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAZPort(Integer value) {
        this.azPort = value;
    }

    /**
     * Gets the value of the azldapGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAZLDAPGroup() {
        return azldapGroup;
    }

    /**
     * Sets the value of the azldapGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAZLDAPGroup(String value) {
        this.azldapGroup = value;
    }

    /**
     * Gets the value of the azValcred property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getAZValcred() {
        return azValcred;
    }

    /**
     * Sets the value of the azValcred property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setAZValcred(DmReference value) {
        this.azValcred = value;
    }

    /**
     * Gets the value of the azsamlurl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAZSAMLURL() {
        return azsamlurl;
    }

    /**
     * Sets the value of the azsamlurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAZSAMLURL(String value) {
        this.azsamlurl = value;
    }

    /**
     * Gets the value of the azsamlType property.
     * 
     * @return
     *     possible object is
     *     {@link DmSAMLMatch }
     *     
     */
    public DmSAMLMatch getAZSAMLType() {
        return azsamlType;
    }

    /**
     * Sets the value of the azsamlType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmSAMLMatch }
     *     
     */
    public void setAZSAMLType(DmSAMLMatch value) {
        this.azsamlType = value;
    }

    /**
     * Gets the value of the azsamlxPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAZSAMLXPath() {
        return azsamlxPath;
    }

    /**
     * Sets the value of the azsamlxPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAZSAMLXPath(String value) {
        this.azsamlxPath = value;
    }

    /**
     * Gets the value of the azsamlNameQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAZSAMLNameQualifier() {
        return azsamlNameQualifier;
    }

    /**
     * Sets the value of the azsamlNameQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAZSAMLNameQualifier(String value) {
        this.azsamlNameQualifier = value;
    }

    /**
     * Gets the value of the azCacheAllow property.
     * 
     * @return
     *     possible object is
     *     {@link DmAAACacheType }
     *     
     */
    public DmAAACacheType getAZCacheAllow() {
        return azCacheAllow;
    }

    /**
     * Sets the value of the azCacheAllow property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmAAACacheType }
     *     
     */
    public void setAZCacheAllow(DmAAACacheType value) {
        this.azCacheAllow = value;
    }

    /**
     * Gets the value of the azCacheTTL property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAZCacheTTL() {
        return azCacheTTL;
    }

    /**
     * Sets the value of the azCacheTTL property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAZCacheTTL(Long value) {
        this.azCacheTTL = value;
    }

    /**
     * Gets the value of the azNetegrityBaseURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAZNetegrityBaseURI() {
        return azNetegrityBaseURI;
    }

    /**
     * Sets the value of the azNetegrityBaseURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAZNetegrityBaseURI(String value) {
        this.azNetegrityBaseURI = value;
    }

    /**
     * Gets the value of the azNetegrityOpNameExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAZNetegrityOpNameExtension() {
        return azNetegrityOpNameExtension;
    }

    /**
     * Sets the value of the azNetegrityOpNameExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAZNetegrityOpNameExtension(String value) {
        this.azNetegrityOpNameExtension = value;
    }

    /**
     * Gets the value of the azClearTrustServerURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAZClearTrustServerURL() {
        return azClearTrustServerURL;
    }

    /**
     * Sets the value of the azClearTrustServerURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAZClearTrustServerURL(String value) {
        this.azClearTrustServerURL = value;
    }

    /**
     * Gets the value of the azsamlVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAZSAMLVersion() {
        return azsamlVersion;
    }

    /**
     * Sets the value of the azsamlVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAZSAMLVersion(String value) {
        this.azsamlVersion = value;
    }

    /**
     * Gets the value of the azldapLoadBalanceGroup property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getAZLDAPLoadBalanceGroup() {
        return azldapLoadBalanceGroup;
    }

    /**
     * Sets the value of the azldapLoadBalanceGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setAZLDAPLoadBalanceGroup(DmReference value) {
        this.azldapLoadBalanceGroup = value;
    }

    /**
     * Gets the value of the azldapBindDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAZLDAPBindDN() {
        return azldapBindDN;
    }

    /**
     * Sets the value of the azldapBindDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAZLDAPBindDN(String value) {
        this.azldapBindDN = value;
    }

    /**
     * Gets the value of the azldapBindPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAZLDAPBindPassword() {
        return azldapBindPassword;
    }

    /**
     * Sets the value of the azldapBindPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAZLDAPBindPassword(String value) {
        this.azldapBindPassword = value;
    }

    /**
     * Gets the value of the azldapGroupAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAZLDAPGroupAttribute() {
        return azldapGroupAttribute;
    }

    /**
     * Sets the value of the azldapGroupAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAZLDAPGroupAttribute(String value) {
        this.azldapGroupAttribute = value;
    }

    /**
     * Gets the value of the azsslProxyProfile property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getAZSSLProxyProfile() {
        return azsslProxyProfile;
    }

    /**
     * Sets the value of the azsslProxyProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setAZSSLProxyProfile(DmReference value) {
        this.azsslProxyProfile = value;
    }

    /**
     * Gets the value of the azNetegrityConfig property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getAZNetegrityConfig() {
        return azNetegrityConfig;
    }

    /**
     * Sets the value of the azNetegrityConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setAZNetegrityConfig(DmReference value) {
        this.azNetegrityConfig = value;
    }

    /**
     * Gets the value of the azldapSearchScope property.
     * 
     * @return
     *     possible object is
     *     {@link DmLDAPSearchScope }
     *     
     */
    public DmLDAPSearchScope getAZLDAPSearchScope() {
        return azldapSearchScope;
    }

    /**
     * Sets the value of the azldapSearchScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmLDAPSearchScope }
     *     
     */
    public void setAZLDAPSearchScope(DmLDAPSearchScope value) {
        this.azldapSearchScope = value;
    }

    /**
     * Gets the value of the azldapSearchFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAZLDAPSearchFilter() {
        return azldapSearchFilter;
    }

    /**
     * Sets the value of the azldapSearchFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAZLDAPSearchFilter(String value) {
        this.azldapSearchFilter = value;
    }

    /**
     * Gets the value of the azxacmlVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAZXACMLVersion() {
        return azxacmlVersion;
    }

    /**
     * Sets the value of the azxacmlVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAZXACMLVersion(String value) {
        this.azxacmlVersion = value;
    }

    /**
     * Gets the value of the azxacmlpepType property.
     * 
     * @return
     *     possible object is
     *     {@link DmXACMLPEPType }
     *     
     */
    public DmXACMLPEPType getAZXACMLPEPType() {
        return azxacmlpepType;
    }

    /**
     * Sets the value of the azxacmlpepType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmXACMLPEPType }
     *     
     */
    public void setAZXACMLPEPType(DmXACMLPEPType value) {
        this.azxacmlpepType = value;
    }

    /**
     * Gets the value of the azxacmlUseOnBoxPDP property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getAZXACMLUseOnBoxPDP() {
        return azxacmlUseOnBoxPDP;
    }

    /**
     * Sets the value of the azxacmlUseOnBoxPDP property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setAZXACMLUseOnBoxPDP(DmToggle value) {
        this.azxacmlUseOnBoxPDP = value;
    }

    /**
     * Gets the value of the azxacmlpdp property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getAZXACMLPDP() {
        return azxacmlpdp;
    }

    /**
     * Sets the value of the azxacmlpdp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setAZXACMLPDP(DmReference value) {
        this.azxacmlpdp = value;
    }

    /**
     * Gets the value of the azxacmlExternalPDPUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAZXACMLExternalPDPUrl() {
        return azxacmlExternalPDPUrl;
    }

    /**
     * Sets the value of the azxacmlExternalPDPUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAZXACMLExternalPDPUrl(String value) {
        this.azxacmlExternalPDPUrl = value;
    }

    /**
     * Gets the value of the azxacmlBindingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link DmAAAXACMLBindingMethod }
     *     
     */
    public DmAAAXACMLBindingMethod getAZXACMLBindingMethod() {
        return azxacmlBindingMethod;
    }

    /**
     * Sets the value of the azxacmlBindingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmAAAXACMLBindingMethod }
     *     
     */
    public void setAZXACMLBindingMethod(DmAAAXACMLBindingMethod value) {
        this.azxacmlBindingMethod = value;
    }

    /**
     * Gets the value of the azxacmlBindingObject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAZXACMLBindingObject() {
        return azxacmlBindingObject;
    }

    /**
     * Sets the value of the azxacmlBindingObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAZXACMLBindingObject(String value) {
        this.azxacmlBindingObject = value;
    }

    /**
     * Gets the value of the azxacmlBindingXSL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAZXACMLBindingXSL() {
        return azxacmlBindingXSL;
    }

    /**
     * Sets the value of the azxacmlBindingXSL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAZXACMLBindingXSL(String value) {
        this.azxacmlBindingXSL = value;
    }

    /**
     * Gets the value of the azxacmlCustomObligation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAZXACMLCustomObligation() {
        return azxacmlCustomObligation;
    }

    /**
     * Sets the value of the azxacmlCustomObligation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAZXACMLCustomObligation(String value) {
        this.azxacmlCustomObligation = value;
    }

    /**
     * Gets the value of the azxacmlUseSAML2 property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getAZXACMLUseSAML2() {
        return azxacmlUseSAML2;
    }

    /**
     * Sets the value of the azxacmlUseSAML2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setAZXACMLUseSAML2(DmToggle value) {
        this.azxacmlUseSAML2 = value;
    }

    /**
     * Gets the value of the aztamServer property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getAZTAMServer() {
        return aztamServer;
    }

    /**
     * Sets the value of the aztamServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setAZTAMServer(DmReference value) {
        this.aztamServer = value;
    }

    /**
     * Gets the value of the aztamDefaultAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAZTAMDefaultAction() {
        return aztamDefaultAction;
    }

    /**
     * Sets the value of the aztamDefaultAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAZTAMDefaultAction(String value) {
        this.aztamDefaultAction = value;
    }

    /**
     * Gets the value of the aztamActionResourceMap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAZTAMActionResourceMap() {
        return aztamActionResourceMap;
    }

    /**
     * Sets the value of the aztamActionResourceMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAZTAMActionResourceMap(String value) {
        this.aztamActionResourceMap = value;
    }

    /**
     * Gets the value of the azxacmlUseSOAP property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getAZXACMLUseSOAP() {
        return azxacmlUseSOAP;
    }

    /**
     * Sets the value of the azxacmlUseSOAP property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setAZXACMLUseSOAP(DmToggle value) {
        this.azxacmlUseSOAP = value;
    }

    /**
     * Gets the value of the azzosnssConfig property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getAZZOSNSSConfig() {
        return azzosnssConfig;
    }

    /**
     * Sets the value of the azzosnssConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setAZZOSNSSConfig(DmReference value) {
        this.azzosnssConfig = value;
    }

    /**
     * Gets the value of the azsafDefaultAction property.
     * 
     * @return
     *     possible object is
     *     {@link DmSAFActionType }
     *     
     */
    public DmSAFActionType getAZSAFDefaultAction() {
        return azsafDefaultAction;
    }

    /**
     * Sets the value of the azsafDefaultAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmSAFActionType }
     *     
     */
    public void setAZSAFDefaultAction(DmSAFActionType value) {
        this.azsafDefaultAction = value;
    }

    /**
     * Gets the value of the azldapAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAZLDAPAttributes() {
        return azldapAttributes;
    }

    /**
     * Sets the value of the azldapAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAZLDAPAttributes(String value) {
        this.azldapAttributes = value;
    }

    /**
     * Gets the value of the azSkewTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAZSkewTime() {
        return azSkewTime;
    }

    /**
     * Sets the value of the azSkewTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAZSkewTime(Long value) {
        this.azSkewTime = value;
    }

}
