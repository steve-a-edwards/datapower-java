
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmAAAPAuthenticate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmAAAPAuthenticate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AUMethod" type="{http://www.datapower.com/schemas/management}dmAAAPAuthenticateType"/>
 *         &lt;element name="AUCustomURL" type="{http://www.datapower.com/schemas/management}dmURL"/>
 *         &lt;element name="AUMapURL" type="{http://www.datapower.com/schemas/management}dmURL"/>
 *         &lt;element name="AUHost" type="{http://www.datapower.com/schemas/management}dmHostname"/>
 *         &lt;element name="AUPort" type="{http://www.datapower.com/schemas/management}dmIPPort"/>
 *         &lt;element name="AUSSLValcred" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="AUCacheAllow" type="{http://www.datapower.com/schemas/management}dmAAACacheType"/>
 *         &lt;element name="AUCacheTTL" type="{http://www.datapower.com/schemas/management}dmUInt32"/>
 *         &lt;element name="AUKerberosPrincipal" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="AUKerberosPassword" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="AUClearTrustServerURL" type="{http://www.datapower.com/schemas/management}dmURL"/>
 *         &lt;element name="AUClearTrustApplication" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="AUSAMLArtifactResponder" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="AUKerberosVerifySignature" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="AUNetegrityBaseURI" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="AUSAMLAuthQueryServer" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="AUSAMLVersion" type="{http://www.datapower.com/schemas/management}dmSAMLVersion"/>
 *         &lt;element name="AULDAPPrefix" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="AULDAPSuffix" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="AULDAPLoadBalanceGroup" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="AUKerberosKeytab" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="AUWSTrustURL" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="AUSAML2Issuer" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="AUSignerValcred" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="AUSignedXPath" type="{http://www.datapower.com/schemas/management}dmXPathExpr"/>
 *         &lt;element name="AUSSLProxyProfile" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="AUNetegrityConfig" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="AULDAPBindDN" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="AULDAPBindPassword" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="AULDAPSearchAttribute" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="AULTPATokenVersionsBitmap" type="{http://www.datapower.com/schemas/management}dmLTPATokenVersion"/>
 *         &lt;element name="AULTPAKeyFile" type="{http://www.datapower.com/schemas/management}dmFSFile"/>
 *         &lt;element name="AULTPAKeyFilePassword" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="AULTPAStashFile" type="{http://www.datapower.com/schemas/management}dmFSFile"/>
 *         &lt;element name="AUBinaryTokenX509Valcred" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="AUTAMServer" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="AUAllowRemoteTokenReference" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="AURemoteTokenProcessService" type="{http://www.datapower.com/schemas/management}dmURL"/>
 *         &lt;element name="AUWSTrustVersion" type="{http://www.datapower.com/schemas/management}dmCryptoWSSXVersion"/>
 *         &lt;element name="AULDAPSearchForDN" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="AULDAPSearchParameters" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="AUWSTrustRequireClientEntropy" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="AUWSTrustClientEntropySize" type="{http://www.datapower.com/schemas/management}dmUInt32"/>
 *         &lt;element name="AUWSTrustRequireServerEntropy" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="AUWSTrustServerEntropySize" type="{http://www.datapower.com/schemas/management}dmUInt32"/>
 *         &lt;element name="AUWSTrustRequireRSTC" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="AUWSTrustRequireAppliesToHeader" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="AUWSTrustAppliesToHeader" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="AUWSTrustEncryptionCertificate" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="AUZOSNSSConfig" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="AULDAPAttributes" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="AUSkewTime" type="{http://www.datapower.com/schemas/management}dmUInt32"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmAAAPAuthenticate", propOrder = {
    "auMethod",
    "auCustomURL",
    "auMapURL",
    "auHost",
    "auPort",
    "ausslValcred",
    "auCacheAllow",
    "auCacheTTL",
    "auKerberosPrincipal",
    "auKerberosPassword",
    "auClearTrustServerURL",
    "auClearTrustApplication",
    "ausamlArtifactResponder",
    "auKerberosVerifySignature",
    "auNetegrityBaseURI",
    "ausamlAuthQueryServer",
    "ausamlVersion",
    "auldapPrefix",
    "auldapSuffix",
    "auldapLoadBalanceGroup",
    "auKerberosKeytab",
    "auwsTrustURL",
    "ausaml2Issuer",
    "auSignerValcred",
    "auSignedXPath",
    "ausslProxyProfile",
    "auNetegrityConfig",
    "auldapBindDN",
    "auldapBindPassword",
    "auldapSearchAttribute",
    "aultpaTokenVersionsBitmap",
    "aultpaKeyFile",
    "aultpaKeyFilePassword",
    "aultpaStashFile",
    "auBinaryTokenX509Valcred",
    "autamServer",
    "auAllowRemoteTokenReference",
    "auRemoteTokenProcessService",
    "auwsTrustVersion",
    "auldapSearchForDN",
    "auldapSearchParameters",
    "auwsTrustRequireClientEntropy",
    "auwsTrustClientEntropySize",
    "auwsTrustRequireServerEntropy",
    "auwsTrustServerEntropySize",
    "auwsTrustRequireRSTC",
    "auwsTrustRequireAppliesToHeader",
    "auwsTrustAppliesToHeader",
    "auwsTrustEncryptionCertificate",
    "auzosnssConfig",
    "auldapAttributes",
    "auSkewTime"
})
public class DmAAAPAuthenticate {

    @XmlElement(name = "AUMethod", required = true)
    protected DmAAAPAuthenticateType auMethod;
    @XmlElement(name = "AUCustomURL", required = true, nillable = true)
    protected String auCustomURL;
    @XmlElement(name = "AUMapURL", required = true, nillable = true)
    protected String auMapURL;
    @XmlElement(name = "AUHost", required = true, nillable = true)
    protected String auHost;
    @XmlElement(name = "AUPort", required = true, type = Integer.class, nillable = true)
    protected Integer auPort;
    @XmlElement(name = "AUSSLValcred", required = true, nillable = true)
    protected DmReference ausslValcred;
    @XmlElement(name = "AUCacheAllow", required = true)
    protected DmAAACacheType auCacheAllow;
    @XmlElement(name = "AUCacheTTL", required = true, type = Long.class, nillable = true)
    protected Long auCacheTTL;
    @XmlElement(name = "AUKerberosPrincipal", required = true, nillable = true)
    protected String auKerberosPrincipal;
    @XmlElement(name = "AUKerberosPassword", required = true, nillable = true)
    protected String auKerberosPassword;
    @XmlElement(name = "AUClearTrustServerURL", required = true, nillable = true)
    protected String auClearTrustServerURL;
    @XmlElement(name = "AUClearTrustApplication", required = true, nillable = true)
    protected String auClearTrustApplication;
    @XmlElement(name = "AUSAMLArtifactResponder", required = true, nillable = true)
    protected String ausamlArtifactResponder;
    @XmlElement(name = "AUKerberosVerifySignature", required = true, nillable = true)
    protected DmToggle auKerberosVerifySignature;
    @XmlElement(name = "AUNetegrityBaseURI", required = true, nillable = true)
    protected String auNetegrityBaseURI;
    @XmlElement(name = "AUSAMLAuthQueryServer", required = true, nillable = true)
    protected String ausamlAuthQueryServer;
    @XmlElement(name = "AUSAMLVersion", required = true, nillable = true)
    protected String ausamlVersion;
    @XmlElement(name = "AULDAPPrefix", required = true, nillable = true)
    protected String auldapPrefix;
    @XmlElement(name = "AULDAPSuffix", required = true, nillable = true)
    protected String auldapSuffix;
    @XmlElement(name = "AULDAPLoadBalanceGroup", required = true, nillable = true)
    protected DmReference auldapLoadBalanceGroup;
    @XmlElement(name = "AUKerberosKeytab", required = true, nillable = true)
    protected DmReference auKerberosKeytab;
    @XmlElement(name = "AUWSTrustURL", required = true, nillable = true)
    protected String auwsTrustURL;
    @XmlElement(name = "AUSAML2Issuer", required = true, nillable = true)
    protected String ausaml2Issuer;
    @XmlElement(name = "AUSignerValcred", required = true, nillable = true)
    protected DmReference auSignerValcred;
    @XmlElement(name = "AUSignedXPath", required = true, nillable = true)
    protected String auSignedXPath;
    @XmlElement(name = "AUSSLProxyProfile", required = true, nillable = true)
    protected DmReference ausslProxyProfile;
    @XmlElement(name = "AUNetegrityConfig", required = true, nillable = true)
    protected DmReference auNetegrityConfig;
    @XmlElement(name = "AULDAPBindDN", required = true, nillable = true)
    protected String auldapBindDN;
    @XmlElement(name = "AULDAPBindPassword", required = true, nillable = true)
    protected String auldapBindPassword;
    @XmlElement(name = "AULDAPSearchAttribute", required = true, nillable = true)
    protected String auldapSearchAttribute;
    @XmlElement(name = "AULTPATokenVersionsBitmap", required = true, nillable = true)
    protected DmLTPATokenVersion aultpaTokenVersionsBitmap;
    @XmlElement(name = "AULTPAKeyFile", required = true, nillable = true)
    protected String aultpaKeyFile;
    @XmlElement(name = "AULTPAKeyFilePassword", required = true, nillable = true)
    protected String aultpaKeyFilePassword;
    @XmlElement(name = "AULTPAStashFile", required = true, nillable = true)
    protected String aultpaStashFile;
    @XmlElement(name = "AUBinaryTokenX509Valcred", required = true, nillable = true)
    protected DmReference auBinaryTokenX509Valcred;
    @XmlElement(name = "AUTAMServer", required = true, nillable = true)
    protected DmReference autamServer;
    @XmlElement(name = "AUAllowRemoteTokenReference", required = true, nillable = true)
    protected DmToggle auAllowRemoteTokenReference;
    @XmlElement(name = "AURemoteTokenProcessService", required = true, nillable = true)
    protected String auRemoteTokenProcessService;
    @XmlElement(name = "AUWSTrustVersion", required = true, nillable = true)
    protected String auwsTrustVersion;
    @XmlElement(name = "AULDAPSearchForDN", required = true, nillable = true)
    protected DmToggle auldapSearchForDN;
    @XmlElement(name = "AULDAPSearchParameters", required = true, nillable = true)
    protected DmReference auldapSearchParameters;
    @XmlElement(name = "AUWSTrustRequireClientEntropy", required = true, nillable = true)
    protected DmToggle auwsTrustRequireClientEntropy;
    @XmlElement(name = "AUWSTrustClientEntropySize", required = true, type = Long.class, nillable = true)
    protected Long auwsTrustClientEntropySize;
    @XmlElement(name = "AUWSTrustRequireServerEntropy", required = true, nillable = true)
    protected DmToggle auwsTrustRequireServerEntropy;
    @XmlElement(name = "AUWSTrustServerEntropySize", required = true, type = Long.class, nillable = true)
    protected Long auwsTrustServerEntropySize;
    @XmlElement(name = "AUWSTrustRequireRSTC", required = true, nillable = true)
    protected DmToggle auwsTrustRequireRSTC;
    @XmlElement(name = "AUWSTrustRequireAppliesToHeader", required = true, nillable = true)
    protected DmToggle auwsTrustRequireAppliesToHeader;
    @XmlElement(name = "AUWSTrustAppliesToHeader", required = true, nillable = true)
    protected String auwsTrustAppliesToHeader;
    @XmlElement(name = "AUWSTrustEncryptionCertificate", required = true, nillable = true)
    protected DmReference auwsTrustEncryptionCertificate;
    @XmlElement(name = "AUZOSNSSConfig", required = true, nillable = true)
    protected DmReference auzosnssConfig;
    @XmlElement(name = "AULDAPAttributes", required = true, nillable = true)
    protected String auldapAttributes;
    @XmlElement(name = "AUSkewTime", required = true, type = Long.class, nillable = true)
    protected Long auSkewTime;

    /**
     * Gets the value of the auMethod property.
     * 
     * @return
     *     possible object is
     *     {@link DmAAAPAuthenticateType }
     *     
     */
    public DmAAAPAuthenticateType getAUMethod() {
        return auMethod;
    }

    /**
     * Sets the value of the auMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmAAAPAuthenticateType }
     *     
     */
    public void setAUMethod(DmAAAPAuthenticateType value) {
        this.auMethod = value;
    }

    /**
     * Gets the value of the auCustomURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUCustomURL() {
        return auCustomURL;
    }

    /**
     * Sets the value of the auCustomURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUCustomURL(String value) {
        this.auCustomURL = value;
    }

    /**
     * Gets the value of the auMapURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUMapURL() {
        return auMapURL;
    }

    /**
     * Sets the value of the auMapURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUMapURL(String value) {
        this.auMapURL = value;
    }

    /**
     * Gets the value of the auHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUHost() {
        return auHost;
    }

    /**
     * Sets the value of the auHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUHost(String value) {
        this.auHost = value;
    }

    /**
     * Gets the value of the auPort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAUPort() {
        return auPort;
    }

    /**
     * Sets the value of the auPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAUPort(Integer value) {
        this.auPort = value;
    }

    /**
     * Gets the value of the ausslValcred property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getAUSSLValcred() {
        return ausslValcred;
    }

    /**
     * Sets the value of the ausslValcred property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setAUSSLValcred(DmReference value) {
        this.ausslValcred = value;
    }

    /**
     * Gets the value of the auCacheAllow property.
     * 
     * @return
     *     possible object is
     *     {@link DmAAACacheType }
     *     
     */
    public DmAAACacheType getAUCacheAllow() {
        return auCacheAllow;
    }

    /**
     * Sets the value of the auCacheAllow property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmAAACacheType }
     *     
     */
    public void setAUCacheAllow(DmAAACacheType value) {
        this.auCacheAllow = value;
    }

    /**
     * Gets the value of the auCacheTTL property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAUCacheTTL() {
        return auCacheTTL;
    }

    /**
     * Sets the value of the auCacheTTL property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAUCacheTTL(Long value) {
        this.auCacheTTL = value;
    }

    /**
     * Gets the value of the auKerberosPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUKerberosPrincipal() {
        return auKerberosPrincipal;
    }

    /**
     * Sets the value of the auKerberosPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUKerberosPrincipal(String value) {
        this.auKerberosPrincipal = value;
    }

    /**
     * Gets the value of the auKerberosPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUKerberosPassword() {
        return auKerberosPassword;
    }

    /**
     * Sets the value of the auKerberosPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUKerberosPassword(String value) {
        this.auKerberosPassword = value;
    }

    /**
     * Gets the value of the auClearTrustServerURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUClearTrustServerURL() {
        return auClearTrustServerURL;
    }

    /**
     * Sets the value of the auClearTrustServerURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUClearTrustServerURL(String value) {
        this.auClearTrustServerURL = value;
    }

    /**
     * Gets the value of the auClearTrustApplication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUClearTrustApplication() {
        return auClearTrustApplication;
    }

    /**
     * Sets the value of the auClearTrustApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUClearTrustApplication(String value) {
        this.auClearTrustApplication = value;
    }

    /**
     * Gets the value of the ausamlArtifactResponder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUSAMLArtifactResponder() {
        return ausamlArtifactResponder;
    }

    /**
     * Sets the value of the ausamlArtifactResponder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUSAMLArtifactResponder(String value) {
        this.ausamlArtifactResponder = value;
    }

    /**
     * Gets the value of the auKerberosVerifySignature property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getAUKerberosVerifySignature() {
        return auKerberosVerifySignature;
    }

    /**
     * Sets the value of the auKerberosVerifySignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setAUKerberosVerifySignature(DmToggle value) {
        this.auKerberosVerifySignature = value;
    }

    /**
     * Gets the value of the auNetegrityBaseURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUNetegrityBaseURI() {
        return auNetegrityBaseURI;
    }

    /**
     * Sets the value of the auNetegrityBaseURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUNetegrityBaseURI(String value) {
        this.auNetegrityBaseURI = value;
    }

    /**
     * Gets the value of the ausamlAuthQueryServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUSAMLAuthQueryServer() {
        return ausamlAuthQueryServer;
    }

    /**
     * Sets the value of the ausamlAuthQueryServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUSAMLAuthQueryServer(String value) {
        this.ausamlAuthQueryServer = value;
    }

    /**
     * Gets the value of the ausamlVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUSAMLVersion() {
        return ausamlVersion;
    }

    /**
     * Sets the value of the ausamlVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUSAMLVersion(String value) {
        this.ausamlVersion = value;
    }

    /**
     * Gets the value of the auldapPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAULDAPPrefix() {
        return auldapPrefix;
    }

    /**
     * Sets the value of the auldapPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAULDAPPrefix(String value) {
        this.auldapPrefix = value;
    }

    /**
     * Gets the value of the auldapSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAULDAPSuffix() {
        return auldapSuffix;
    }

    /**
     * Sets the value of the auldapSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAULDAPSuffix(String value) {
        this.auldapSuffix = value;
    }

    /**
     * Gets the value of the auldapLoadBalanceGroup property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getAULDAPLoadBalanceGroup() {
        return auldapLoadBalanceGroup;
    }

    /**
     * Sets the value of the auldapLoadBalanceGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setAULDAPLoadBalanceGroup(DmReference value) {
        this.auldapLoadBalanceGroup = value;
    }

    /**
     * Gets the value of the auKerberosKeytab property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getAUKerberosKeytab() {
        return auKerberosKeytab;
    }

    /**
     * Sets the value of the auKerberosKeytab property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setAUKerberosKeytab(DmReference value) {
        this.auKerberosKeytab = value;
    }

    /**
     * Gets the value of the auwsTrustURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUWSTrustURL() {
        return auwsTrustURL;
    }

    /**
     * Sets the value of the auwsTrustURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUWSTrustURL(String value) {
        this.auwsTrustURL = value;
    }

    /**
     * Gets the value of the ausaml2Issuer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUSAML2Issuer() {
        return ausaml2Issuer;
    }

    /**
     * Sets the value of the ausaml2Issuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUSAML2Issuer(String value) {
        this.ausaml2Issuer = value;
    }

    /**
     * Gets the value of the auSignerValcred property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getAUSignerValcred() {
        return auSignerValcred;
    }

    /**
     * Sets the value of the auSignerValcred property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setAUSignerValcred(DmReference value) {
        this.auSignerValcred = value;
    }

    /**
     * Gets the value of the auSignedXPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUSignedXPath() {
        return auSignedXPath;
    }

    /**
     * Sets the value of the auSignedXPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUSignedXPath(String value) {
        this.auSignedXPath = value;
    }

    /**
     * Gets the value of the ausslProxyProfile property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getAUSSLProxyProfile() {
        return ausslProxyProfile;
    }

    /**
     * Sets the value of the ausslProxyProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setAUSSLProxyProfile(DmReference value) {
        this.ausslProxyProfile = value;
    }

    /**
     * Gets the value of the auNetegrityConfig property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getAUNetegrityConfig() {
        return auNetegrityConfig;
    }

    /**
     * Sets the value of the auNetegrityConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setAUNetegrityConfig(DmReference value) {
        this.auNetegrityConfig = value;
    }

    /**
     * Gets the value of the auldapBindDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAULDAPBindDN() {
        return auldapBindDN;
    }

    /**
     * Sets the value of the auldapBindDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAULDAPBindDN(String value) {
        this.auldapBindDN = value;
    }

    /**
     * Gets the value of the auldapBindPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAULDAPBindPassword() {
        return auldapBindPassword;
    }

    /**
     * Sets the value of the auldapBindPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAULDAPBindPassword(String value) {
        this.auldapBindPassword = value;
    }

    /**
     * Gets the value of the auldapSearchAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAULDAPSearchAttribute() {
        return auldapSearchAttribute;
    }

    /**
     * Sets the value of the auldapSearchAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAULDAPSearchAttribute(String value) {
        this.auldapSearchAttribute = value;
    }

    /**
     * Gets the value of the aultpaTokenVersionsBitmap property.
     * 
     * @return
     *     possible object is
     *     {@link DmLTPATokenVersion }
     *     
     */
    public DmLTPATokenVersion getAULTPATokenVersionsBitmap() {
        return aultpaTokenVersionsBitmap;
    }

    /**
     * Sets the value of the aultpaTokenVersionsBitmap property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmLTPATokenVersion }
     *     
     */
    public void setAULTPATokenVersionsBitmap(DmLTPATokenVersion value) {
        this.aultpaTokenVersionsBitmap = value;
    }

    /**
     * Gets the value of the aultpaKeyFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAULTPAKeyFile() {
        return aultpaKeyFile;
    }

    /**
     * Sets the value of the aultpaKeyFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAULTPAKeyFile(String value) {
        this.aultpaKeyFile = value;
    }

    /**
     * Gets the value of the aultpaKeyFilePassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAULTPAKeyFilePassword() {
        return aultpaKeyFilePassword;
    }

    /**
     * Sets the value of the aultpaKeyFilePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAULTPAKeyFilePassword(String value) {
        this.aultpaKeyFilePassword = value;
    }

    /**
     * Gets the value of the aultpaStashFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAULTPAStashFile() {
        return aultpaStashFile;
    }

    /**
     * Sets the value of the aultpaStashFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAULTPAStashFile(String value) {
        this.aultpaStashFile = value;
    }

    /**
     * Gets the value of the auBinaryTokenX509Valcred property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getAUBinaryTokenX509Valcred() {
        return auBinaryTokenX509Valcred;
    }

    /**
     * Sets the value of the auBinaryTokenX509Valcred property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setAUBinaryTokenX509Valcred(DmReference value) {
        this.auBinaryTokenX509Valcred = value;
    }

    /**
     * Gets the value of the autamServer property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getAUTAMServer() {
        return autamServer;
    }

    /**
     * Sets the value of the autamServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setAUTAMServer(DmReference value) {
        this.autamServer = value;
    }

    /**
     * Gets the value of the auAllowRemoteTokenReference property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getAUAllowRemoteTokenReference() {
        return auAllowRemoteTokenReference;
    }

    /**
     * Sets the value of the auAllowRemoteTokenReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setAUAllowRemoteTokenReference(DmToggle value) {
        this.auAllowRemoteTokenReference = value;
    }

    /**
     * Gets the value of the auRemoteTokenProcessService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAURemoteTokenProcessService() {
        return auRemoteTokenProcessService;
    }

    /**
     * Sets the value of the auRemoteTokenProcessService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAURemoteTokenProcessService(String value) {
        this.auRemoteTokenProcessService = value;
    }

    /**
     * Gets the value of the auwsTrustVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUWSTrustVersion() {
        return auwsTrustVersion;
    }

    /**
     * Sets the value of the auwsTrustVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUWSTrustVersion(String value) {
        this.auwsTrustVersion = value;
    }

    /**
     * Gets the value of the auldapSearchForDN property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getAULDAPSearchForDN() {
        return auldapSearchForDN;
    }

    /**
     * Sets the value of the auldapSearchForDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setAULDAPSearchForDN(DmToggle value) {
        this.auldapSearchForDN = value;
    }

    /**
     * Gets the value of the auldapSearchParameters property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getAULDAPSearchParameters() {
        return auldapSearchParameters;
    }

    /**
     * Sets the value of the auldapSearchParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setAULDAPSearchParameters(DmReference value) {
        this.auldapSearchParameters = value;
    }

    /**
     * Gets the value of the auwsTrustRequireClientEntropy property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getAUWSTrustRequireClientEntropy() {
        return auwsTrustRequireClientEntropy;
    }

    /**
     * Sets the value of the auwsTrustRequireClientEntropy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setAUWSTrustRequireClientEntropy(DmToggle value) {
        this.auwsTrustRequireClientEntropy = value;
    }

    /**
     * Gets the value of the auwsTrustClientEntropySize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAUWSTrustClientEntropySize() {
        return auwsTrustClientEntropySize;
    }

    /**
     * Sets the value of the auwsTrustClientEntropySize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAUWSTrustClientEntropySize(Long value) {
        this.auwsTrustClientEntropySize = value;
    }

    /**
     * Gets the value of the auwsTrustRequireServerEntropy property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getAUWSTrustRequireServerEntropy() {
        return auwsTrustRequireServerEntropy;
    }

    /**
     * Sets the value of the auwsTrustRequireServerEntropy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setAUWSTrustRequireServerEntropy(DmToggle value) {
        this.auwsTrustRequireServerEntropy = value;
    }

    /**
     * Gets the value of the auwsTrustServerEntropySize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAUWSTrustServerEntropySize() {
        return auwsTrustServerEntropySize;
    }

    /**
     * Sets the value of the auwsTrustServerEntropySize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAUWSTrustServerEntropySize(Long value) {
        this.auwsTrustServerEntropySize = value;
    }

    /**
     * Gets the value of the auwsTrustRequireRSTC property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getAUWSTrustRequireRSTC() {
        return auwsTrustRequireRSTC;
    }

    /**
     * Sets the value of the auwsTrustRequireRSTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setAUWSTrustRequireRSTC(DmToggle value) {
        this.auwsTrustRequireRSTC = value;
    }

    /**
     * Gets the value of the auwsTrustRequireAppliesToHeader property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getAUWSTrustRequireAppliesToHeader() {
        return auwsTrustRequireAppliesToHeader;
    }

    /**
     * Sets the value of the auwsTrustRequireAppliesToHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setAUWSTrustRequireAppliesToHeader(DmToggle value) {
        this.auwsTrustRequireAppliesToHeader = value;
    }

    /**
     * Gets the value of the auwsTrustAppliesToHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUWSTrustAppliesToHeader() {
        return auwsTrustAppliesToHeader;
    }

    /**
     * Sets the value of the auwsTrustAppliesToHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUWSTrustAppliesToHeader(String value) {
        this.auwsTrustAppliesToHeader = value;
    }

    /**
     * Gets the value of the auwsTrustEncryptionCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getAUWSTrustEncryptionCertificate() {
        return auwsTrustEncryptionCertificate;
    }

    /**
     * Sets the value of the auwsTrustEncryptionCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setAUWSTrustEncryptionCertificate(DmReference value) {
        this.auwsTrustEncryptionCertificate = value;
    }

    /**
     * Gets the value of the auzosnssConfig property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getAUZOSNSSConfig() {
        return auzosnssConfig;
    }

    /**
     * Sets the value of the auzosnssConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setAUZOSNSSConfig(DmReference value) {
        this.auzosnssConfig = value;
    }

    /**
     * Gets the value of the auldapAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAULDAPAttributes() {
        return auldapAttributes;
    }

    /**
     * Sets the value of the auldapAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAULDAPAttributes(String value) {
        this.auldapAttributes = value;
    }

    /**
     * Gets the value of the auSkewTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAUSkewTime() {
        return auSkewTime;
    }

    /**
     * Sets the value of the auSkewTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAUSkewTime(Long value) {
        this.auSkewTime = value;
    }

}
