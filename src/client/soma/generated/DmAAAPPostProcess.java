
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmAAAPPostProcess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmAAAPPostProcess">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PPEnabled" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="PPCustomURL" type="{http://www.datapower.com/schemas/management}dmURL"/>
 *         &lt;element name="PPSAMLAuthAssertion" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="PPSAMLServerName" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="PPSAMLNameQualifier" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="PPKerberosTicket" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="PPKerberosClient" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="PPKerberosClientPassword" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="PPKerberosServer" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="PPWSTrust" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="PPTimestamp" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="PPTimestampExpiry" type="{http://www.datapower.com/schemas/management}dmTimeInterval"/>
 *         &lt;element name="PPAllowRenewal" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="PPSAMLVersion" type="{http://www.datapower.com/schemas/management}dmSAMLVersion"/>
 *         &lt;element name="PPSAMLSendSLO" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="PPSAMLSLOEndpoint" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="PPSSLProxyProfile" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="PPWSUsernameToken" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="PPWSUsernameTokenPasswordType" type="{http://www.datapower.com/schemas/management}dmWSUsernameTokenPasswordType"/>
 *         &lt;element name="PPSAMLValidity" type="{http://www.datapower.com/schemas/management}dmUInt32"/>
 *         &lt;element name="PPSAMLSkew" type="{http://www.datapower.com/schemas/management}dmUInt32"/>
 *         &lt;element name="PPWSUsernameTokenIncludePwd" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="PPLTPA" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="PPLTPAVersion" type="{http://www.datapower.com/schemas/management}dmLTPATokenVersionNonBitmap"/>
 *         &lt;element name="PPLTPAExpiry" type="{http://www.datapower.com/schemas/management}dmTimeInterval"/>
 *         &lt;element name="PPLTPAKeyFile" type="{http://www.datapower.com/schemas/management}dmFSFile"/>
 *         &lt;element name="PPLTPAKeyFilePassword" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="PPLTPAStashFile" type="{http://www.datapower.com/schemas/management}dmFSFile"/>
 *         &lt;element name="PPKerberosSPNEGOToken" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="PPKerberosBstValueType" type="{http://www.datapower.com/schemas/management}dmCryptoKerberosBstValueType"/>
 *         &lt;element name="PPSAMLUseWSSec" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="PPKerberosClientKeytab" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="PPUseWSSec" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="PPActorRoleID" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="PPTFIMTokenMapping" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="PPTFIMEndpoint" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="PPWSDerivedKeyUsernameToken" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="PPWSDerivedKeyUsernameTokenIterations" type="{http://www.datapower.com/schemas/management}dmUInt32"/>
 *         &lt;element name="PPWSUsernameTokenAllowReplacement" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="PPTFIMReplaceMethod" type="{http://www.datapower.com/schemas/management}dmTFIMTokenReplaceMode"/>
 *         &lt;element name="PPTFIMRetrieveMode" type="{http://www.datapower.com/schemas/management}dmTFIMRetrieveMode"/>
 *         &lt;element name="PPHMACSigningAlg" type="{http://www.datapower.com/schemas/management}dmCryptoHMACSigningAlgorithm"/>
 *         &lt;element name="PPSigningHashAlg" type="{http://www.datapower.com/schemas/management}dmCryptoHashAlgorithm"/>
 *         &lt;element name="PPWSTrustHeader" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="PPWSSCKeySource" type="{http://www.datapower.com/schemas/management}dmWSSCKeySourceType"/>
 *         &lt;element name="PPSharedSecretKey" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="PPWSTrustRenewalWait" type="{http://www.datapower.com/schemas/management}dmUInt32"/>
 *         &lt;element name="PPWSTrustNewInstance" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="PPWSTrustNewKey" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="PPWSTrustNeverExpire" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="PPICRXToken" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="PPICRXUserRealm" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="PPSAMLIdentityProvider" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="PPSAMLProtocol" type="{http://www.datapower.com/schemas/management}dmSAMLProtocol"/>
 *         &lt;element name="PPSAMLResponseDestination" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="PPResultWrapup" type="{http://www.datapower.com/schemas/management}dmResultWrapup"/>
 *         &lt;element name="PPSAMLAssertionType" type="{http://www.datapower.com/schemas/management}dmSAMLStatementType"/>
 *         &lt;element name="PPSAMLSubjectConfirm" type="{http://www.datapower.com/schemas/management}dmSAMLSubjectConfirmationType"/>
 *         &lt;element name="PPSAMLNameID" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="PPSAMLNameIDFormat" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="PPSAMLRecipient" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="PPSAMLAudience" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="PPSAMLOmitNotBefore" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="PPOneTimeUse" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="PPSAMLProxy" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="PPSAMLProxyAudience" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="PPSAMLProxyCount" type="{http://www.datapower.com/schemas/management}dmUInt32"/>
 *         &lt;element name="PPSAMLAuthzAction" type="{http://www.datapower.com/schemas/management}dmSAMLAction"/>
 *         &lt;element name="PPSAMLAttributes" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmAAAPPostProcess", propOrder = {
    "ppEnabled",
    "ppCustomURL",
    "ppsamlAuthAssertion",
    "ppsamlServerName",
    "ppsamlNameQualifier",
    "ppKerberosTicket",
    "ppKerberosClient",
    "ppKerberosClientPassword",
    "ppKerberosServer",
    "ppwsTrust",
    "ppTimestamp",
    "ppTimestampExpiry",
    "ppAllowRenewal",
    "ppsamlVersion",
    "ppsamlSendSLO",
    "ppsamlsloEndpoint",
    "ppsslProxyProfile",
    "ppwsUsernameToken",
    "ppwsUsernameTokenPasswordType",
    "ppsamlValidity",
    "ppsamlSkew",
    "ppwsUsernameTokenIncludePwd",
    "ppltpa",
    "ppltpaVersion",
    "ppltpaExpiry",
    "ppltpaKeyFile",
    "ppltpaKeyFilePassword",
    "ppltpaStashFile",
    "ppKerberosSPNEGOToken",
    "ppKerberosBstValueType",
    "ppsamlUseWSSec",
    "ppKerberosClientKeytab",
    "ppUseWSSec",
    "ppActorRoleID",
    "pptfimTokenMapping",
    "pptfimEndpoint",
    "ppwsDerivedKeyUsernameToken",
    "ppwsDerivedKeyUsernameTokenIterations",
    "ppwsUsernameTokenAllowReplacement",
    "pptfimReplaceMethod",
    "pptfimRetrieveMode",
    "pphmacSigningAlg",
    "ppSigningHashAlg",
    "ppwsTrustHeader",
    "ppwsscKeySource",
    "ppSharedSecretKey",
    "ppwsTrustRenewalWait",
    "ppwsTrustNewInstance",
    "ppwsTrustNewKey",
    "ppwsTrustNeverExpire",
    "ppicrxToken",
    "ppicrxUserRealm",
    "ppsamlIdentityProvider",
    "ppsamlProtocol",
    "ppsamlResponseDestination",
    "ppResultWrapup",
    "ppsamlAssertionType",
    "ppsamlSubjectConfirm",
    "ppsamlNameID",
    "ppsamlNameIDFormat",
    "ppsamlRecipient",
    "ppsamlAudience",
    "ppsamlOmitNotBefore",
    "ppOneTimeUse",
    "ppsamlProxy",
    "ppsamlProxyAudience",
    "ppsamlProxyCount",
    "ppsamlAuthzAction",
    "ppsamlAttributes"
})
public class DmAAAPPostProcess {

    @XmlElement(name = "PPEnabled", required = true)
    protected DmToggle ppEnabled;
    @XmlElement(name = "PPCustomURL", required = true, nillable = true)
    protected String ppCustomURL;
    @XmlElement(name = "PPSAMLAuthAssertion", required = true, nillable = true)
    protected DmToggle ppsamlAuthAssertion;
    @XmlElement(name = "PPSAMLServerName", required = true, nillable = true)
    protected String ppsamlServerName;
    @XmlElement(name = "PPSAMLNameQualifier", required = true, nillable = true)
    protected String ppsamlNameQualifier;
    @XmlElement(name = "PPKerberosTicket", required = true, nillable = true)
    protected DmToggle ppKerberosTicket;
    @XmlElement(name = "PPKerberosClient", required = true, nillable = true)
    protected String ppKerberosClient;
    @XmlElement(name = "PPKerberosClientPassword", required = true, nillable = true)
    protected String ppKerberosClientPassword;
    @XmlElement(name = "PPKerberosServer", required = true, nillable = true)
    protected String ppKerberosServer;
    @XmlElement(name = "PPWSTrust", required = true, nillable = true)
    protected DmToggle ppwsTrust;
    @XmlElement(name = "PPTimestamp", required = true, nillable = true)
    protected DmToggle ppTimestamp;
    @XmlElement(name = "PPTimestampExpiry", required = true, type = Long.class, nillable = true)
    protected Long ppTimestampExpiry;
    @XmlElement(name = "PPAllowRenewal", required = true, nillable = true)
    protected DmToggle ppAllowRenewal;
    @XmlElement(name = "PPSAMLVersion", required = true, nillable = true)
    protected String ppsamlVersion;
    @XmlElement(name = "PPSAMLSendSLO", required = true, nillable = true)
    protected DmToggle ppsamlSendSLO;
    @XmlElement(name = "PPSAMLSLOEndpoint", required = true, nillable = true)
    protected String ppsamlsloEndpoint;
    @XmlElement(name = "PPSSLProxyProfile", required = true, nillable = true)
    protected DmReference ppsslProxyProfile;
    @XmlElement(name = "PPWSUsernameToken", required = true, nillable = true)
    protected DmToggle ppwsUsernameToken;
    @XmlElement(name = "PPWSUsernameTokenPasswordType", required = true, nillable = true)
    protected DmWSUsernameTokenPasswordType ppwsUsernameTokenPasswordType;
    @XmlElement(name = "PPSAMLValidity", required = true, type = Long.class, nillable = true)
    protected Long ppsamlValidity;
    @XmlElement(name = "PPSAMLSkew", required = true, type = Long.class, nillable = true)
    protected Long ppsamlSkew;
    @XmlElement(name = "PPWSUsernameTokenIncludePwd", required = true, nillable = true)
    protected DmToggle ppwsUsernameTokenIncludePwd;
    @XmlElement(name = "PPLTPA", required = true, nillable = true)
    protected DmToggle ppltpa;
    @XmlElement(name = "PPLTPAVersion", required = true, nillable = true)
    protected DmLTPATokenVersionNonBitmap ppltpaVersion;
    @XmlElement(name = "PPLTPAExpiry", required = true, type = Long.class, nillable = true)
    protected Long ppltpaExpiry;
    @XmlElement(name = "PPLTPAKeyFile", required = true, nillable = true)
    protected String ppltpaKeyFile;
    @XmlElement(name = "PPLTPAKeyFilePassword", required = true, nillable = true)
    protected String ppltpaKeyFilePassword;
    @XmlElement(name = "PPLTPAStashFile", required = true, nillable = true)
    protected String ppltpaStashFile;
    @XmlElement(name = "PPKerberosSPNEGOToken", required = true, nillable = true)
    protected DmToggle ppKerberosSPNEGOToken;
    @XmlElement(name = "PPKerberosBstValueType", required = true, nillable = true)
    protected DmCryptoKerberosBstValueType ppKerberosBstValueType;
    @XmlElement(name = "PPSAMLUseWSSec", required = true, nillable = true)
    protected DmToggle ppsamlUseWSSec;
    @XmlElement(name = "PPKerberosClientKeytab", required = true, nillable = true)
    protected DmReference ppKerberosClientKeytab;
    @XmlElement(name = "PPUseWSSec", required = true, nillable = true)
    protected DmToggle ppUseWSSec;
    @XmlElement(name = "PPActorRoleID", required = true, nillable = true)
    protected String ppActorRoleID;
    @XmlElement(name = "PPTFIMTokenMapping", required = true, nillable = true)
    protected DmToggle pptfimTokenMapping;
    @XmlElement(name = "PPTFIMEndpoint", required = true, nillable = true)
    protected DmReference pptfimEndpoint;
    @XmlElement(name = "PPWSDerivedKeyUsernameToken", required = true, nillable = true)
    protected DmToggle ppwsDerivedKeyUsernameToken;
    @XmlElement(name = "PPWSDerivedKeyUsernameTokenIterations", required = true, type = Long.class, nillable = true)
    protected Long ppwsDerivedKeyUsernameTokenIterations;
    @XmlElement(name = "PPWSUsernameTokenAllowReplacement", required = true, nillable = true)
    protected DmToggle ppwsUsernameTokenAllowReplacement;
    @XmlElement(name = "PPTFIMReplaceMethod", required = true, nillable = true)
    protected DmTFIMTokenReplaceMode pptfimReplaceMethod;
    @XmlElement(name = "PPTFIMRetrieveMode", required = true, nillable = true)
    protected DmTFIMRetrieveMode pptfimRetrieveMode;
    @XmlElement(name = "PPHMACSigningAlg", required = true, nillable = true)
    protected DmCryptoHMACSigningAlgorithm pphmacSigningAlg;
    @XmlElement(name = "PPSigningHashAlg", required = true, nillable = true)
    protected DmCryptoHashAlgorithm ppSigningHashAlg;
    @XmlElement(name = "PPWSTrustHeader", required = true, nillable = true)
    protected DmToggle ppwsTrustHeader;
    @XmlElement(name = "PPWSSCKeySource", required = true, nillable = true)
    protected DmWSSCKeySourceType ppwsscKeySource;
    @XmlElement(name = "PPSharedSecretKey", required = true, nillable = true)
    protected DmReference ppSharedSecretKey;
    @XmlElement(name = "PPWSTrustRenewalWait", required = true, type = Long.class, nillable = true)
    protected Long ppwsTrustRenewalWait;
    @XmlElement(name = "PPWSTrustNewInstance", required = true, nillable = true)
    protected DmToggle ppwsTrustNewInstance;
    @XmlElement(name = "PPWSTrustNewKey", required = true, nillable = true)
    protected DmToggle ppwsTrustNewKey;
    @XmlElement(name = "PPWSTrustNeverExpire", required = true, nillable = true)
    protected DmToggle ppwsTrustNeverExpire;
    @XmlElement(name = "PPICRXToken", required = true, nillable = true)
    protected DmToggle ppicrxToken;
    @XmlElement(name = "PPICRXUserRealm", required = true, nillable = true)
    protected String ppicrxUserRealm;
    @XmlElement(name = "PPSAMLIdentityProvider", required = true, nillable = true)
    protected DmToggle ppsamlIdentityProvider;
    @XmlElement(name = "PPSAMLProtocol", required = true, nillable = true)
    protected DmSAMLProtocol ppsamlProtocol;
    @XmlElement(name = "PPSAMLResponseDestination", required = true, nillable = true)
    protected String ppsamlResponseDestination;
    @XmlElement(name = "PPResultWrapup", required = true, nillable = true)
    protected DmResultWrapup ppResultWrapup;
    @XmlElement(name = "PPSAMLAssertionType", required = true, nillable = true)
    protected DmSAMLStatementType ppsamlAssertionType;
    @XmlElement(name = "PPSAMLSubjectConfirm", required = true, nillable = true)
    protected DmSAMLSubjectConfirmationType ppsamlSubjectConfirm;
    @XmlElement(name = "PPSAMLNameID", required = true, nillable = true)
    protected DmToggle ppsamlNameID;
    @XmlElement(name = "PPSAMLNameIDFormat", required = true, nillable = true)
    protected String ppsamlNameIDFormat;
    @XmlElement(name = "PPSAMLRecipient", required = true, nillable = true)
    protected String ppsamlRecipient;
    @XmlElement(name = "PPSAMLAudience", required = true, nillable = true)
    protected String ppsamlAudience;
    @XmlElement(name = "PPSAMLOmitNotBefore", required = true, nillable = true)
    protected DmToggle ppsamlOmitNotBefore;
    @XmlElement(name = "PPOneTimeUse", required = true, nillable = true)
    protected DmToggle ppOneTimeUse;
    @XmlElement(name = "PPSAMLProxy", required = true, nillable = true)
    protected DmToggle ppsamlProxy;
    @XmlElement(name = "PPSAMLProxyAudience", required = true, nillable = true)
    protected String ppsamlProxyAudience;
    @XmlElement(name = "PPSAMLProxyCount", required = true, type = Long.class, nillable = true)
    protected Long ppsamlProxyCount;
    @XmlElement(name = "PPSAMLAuthzAction", required = true, nillable = true)
    protected DmSAMLAction ppsamlAuthzAction;
    @XmlElement(name = "PPSAMLAttributes", required = true, nillable = true)
    protected DmReference ppsamlAttributes;

    /**
     * Gets the value of the ppEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getPPEnabled() {
        return ppEnabled;
    }

    /**
     * Sets the value of the ppEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setPPEnabled(DmToggle value) {
        this.ppEnabled = value;
    }

    /**
     * Gets the value of the ppCustomURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPCustomURL() {
        return ppCustomURL;
    }

    /**
     * Sets the value of the ppCustomURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPCustomURL(String value) {
        this.ppCustomURL = value;
    }

    /**
     * Gets the value of the ppsamlAuthAssertion property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getPPSAMLAuthAssertion() {
        return ppsamlAuthAssertion;
    }

    /**
     * Sets the value of the ppsamlAuthAssertion property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setPPSAMLAuthAssertion(DmToggle value) {
        this.ppsamlAuthAssertion = value;
    }

    /**
     * Gets the value of the ppsamlServerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPSAMLServerName() {
        return ppsamlServerName;
    }

    /**
     * Sets the value of the ppsamlServerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPSAMLServerName(String value) {
        this.ppsamlServerName = value;
    }

    /**
     * Gets the value of the ppsamlNameQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPSAMLNameQualifier() {
        return ppsamlNameQualifier;
    }

    /**
     * Sets the value of the ppsamlNameQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPSAMLNameQualifier(String value) {
        this.ppsamlNameQualifier = value;
    }

    /**
     * Gets the value of the ppKerberosTicket property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getPPKerberosTicket() {
        return ppKerberosTicket;
    }

    /**
     * Sets the value of the ppKerberosTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setPPKerberosTicket(DmToggle value) {
        this.ppKerberosTicket = value;
    }

    /**
     * Gets the value of the ppKerberosClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPKerberosClient() {
        return ppKerberosClient;
    }

    /**
     * Sets the value of the ppKerberosClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPKerberosClient(String value) {
        this.ppKerberosClient = value;
    }

    /**
     * Gets the value of the ppKerberosClientPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPKerberosClientPassword() {
        return ppKerberosClientPassword;
    }

    /**
     * Sets the value of the ppKerberosClientPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPKerberosClientPassword(String value) {
        this.ppKerberosClientPassword = value;
    }

    /**
     * Gets the value of the ppKerberosServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPKerberosServer() {
        return ppKerberosServer;
    }

    /**
     * Sets the value of the ppKerberosServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPKerberosServer(String value) {
        this.ppKerberosServer = value;
    }

    /**
     * Gets the value of the ppwsTrust property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getPPWSTrust() {
        return ppwsTrust;
    }

    /**
     * Sets the value of the ppwsTrust property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setPPWSTrust(DmToggle value) {
        this.ppwsTrust = value;
    }

    /**
     * Gets the value of the ppTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getPPTimestamp() {
        return ppTimestamp;
    }

    /**
     * Sets the value of the ppTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setPPTimestamp(DmToggle value) {
        this.ppTimestamp = value;
    }

    /**
     * Gets the value of the ppTimestampExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPPTimestampExpiry() {
        return ppTimestampExpiry;
    }

    /**
     * Sets the value of the ppTimestampExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPPTimestampExpiry(Long value) {
        this.ppTimestampExpiry = value;
    }

    /**
     * Gets the value of the ppAllowRenewal property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getPPAllowRenewal() {
        return ppAllowRenewal;
    }

    /**
     * Sets the value of the ppAllowRenewal property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setPPAllowRenewal(DmToggle value) {
        this.ppAllowRenewal = value;
    }

    /**
     * Gets the value of the ppsamlVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPSAMLVersion() {
        return ppsamlVersion;
    }

    /**
     * Sets the value of the ppsamlVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPSAMLVersion(String value) {
        this.ppsamlVersion = value;
    }

    /**
     * Gets the value of the ppsamlSendSLO property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getPPSAMLSendSLO() {
        return ppsamlSendSLO;
    }

    /**
     * Sets the value of the ppsamlSendSLO property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setPPSAMLSendSLO(DmToggle value) {
        this.ppsamlSendSLO = value;
    }

    /**
     * Gets the value of the ppsamlsloEndpoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPSAMLSLOEndpoint() {
        return ppsamlsloEndpoint;
    }

    /**
     * Sets the value of the ppsamlsloEndpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPSAMLSLOEndpoint(String value) {
        this.ppsamlsloEndpoint = value;
    }

    /**
     * Gets the value of the ppsslProxyProfile property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getPPSSLProxyProfile() {
        return ppsslProxyProfile;
    }

    /**
     * Sets the value of the ppsslProxyProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setPPSSLProxyProfile(DmReference value) {
        this.ppsslProxyProfile = value;
    }

    /**
     * Gets the value of the ppwsUsernameToken property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getPPWSUsernameToken() {
        return ppwsUsernameToken;
    }

    /**
     * Sets the value of the ppwsUsernameToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setPPWSUsernameToken(DmToggle value) {
        this.ppwsUsernameToken = value;
    }

    /**
     * Gets the value of the ppwsUsernameTokenPasswordType property.
     * 
     * @return
     *     possible object is
     *     {@link DmWSUsernameTokenPasswordType }
     *     
     */
    public DmWSUsernameTokenPasswordType getPPWSUsernameTokenPasswordType() {
        return ppwsUsernameTokenPasswordType;
    }

    /**
     * Sets the value of the ppwsUsernameTokenPasswordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmWSUsernameTokenPasswordType }
     *     
     */
    public void setPPWSUsernameTokenPasswordType(DmWSUsernameTokenPasswordType value) {
        this.ppwsUsernameTokenPasswordType = value;
    }

    /**
     * Gets the value of the ppsamlValidity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPPSAMLValidity() {
        return ppsamlValidity;
    }

    /**
     * Sets the value of the ppsamlValidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPPSAMLValidity(Long value) {
        this.ppsamlValidity = value;
    }

    /**
     * Gets the value of the ppsamlSkew property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPPSAMLSkew() {
        return ppsamlSkew;
    }

    /**
     * Sets the value of the ppsamlSkew property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPPSAMLSkew(Long value) {
        this.ppsamlSkew = value;
    }

    /**
     * Gets the value of the ppwsUsernameTokenIncludePwd property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getPPWSUsernameTokenIncludePwd() {
        return ppwsUsernameTokenIncludePwd;
    }

    /**
     * Sets the value of the ppwsUsernameTokenIncludePwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setPPWSUsernameTokenIncludePwd(DmToggle value) {
        this.ppwsUsernameTokenIncludePwd = value;
    }

    /**
     * Gets the value of the ppltpa property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getPPLTPA() {
        return ppltpa;
    }

    /**
     * Sets the value of the ppltpa property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setPPLTPA(DmToggle value) {
        this.ppltpa = value;
    }

    /**
     * Gets the value of the ppltpaVersion property.
     * 
     * @return
     *     possible object is
     *     {@link DmLTPATokenVersionNonBitmap }
     *     
     */
    public DmLTPATokenVersionNonBitmap getPPLTPAVersion() {
        return ppltpaVersion;
    }

    /**
     * Sets the value of the ppltpaVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmLTPATokenVersionNonBitmap }
     *     
     */
    public void setPPLTPAVersion(DmLTPATokenVersionNonBitmap value) {
        this.ppltpaVersion = value;
    }

    /**
     * Gets the value of the ppltpaExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPPLTPAExpiry() {
        return ppltpaExpiry;
    }

    /**
     * Sets the value of the ppltpaExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPPLTPAExpiry(Long value) {
        this.ppltpaExpiry = value;
    }

    /**
     * Gets the value of the ppltpaKeyFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPLTPAKeyFile() {
        return ppltpaKeyFile;
    }

    /**
     * Sets the value of the ppltpaKeyFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPLTPAKeyFile(String value) {
        this.ppltpaKeyFile = value;
    }

    /**
     * Gets the value of the ppltpaKeyFilePassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPLTPAKeyFilePassword() {
        return ppltpaKeyFilePassword;
    }

    /**
     * Sets the value of the ppltpaKeyFilePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPLTPAKeyFilePassword(String value) {
        this.ppltpaKeyFilePassword = value;
    }

    /**
     * Gets the value of the ppltpaStashFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPLTPAStashFile() {
        return ppltpaStashFile;
    }

    /**
     * Sets the value of the ppltpaStashFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPLTPAStashFile(String value) {
        this.ppltpaStashFile = value;
    }

    /**
     * Gets the value of the ppKerberosSPNEGOToken property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getPPKerberosSPNEGOToken() {
        return ppKerberosSPNEGOToken;
    }

    /**
     * Sets the value of the ppKerberosSPNEGOToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setPPKerberosSPNEGOToken(DmToggle value) {
        this.ppKerberosSPNEGOToken = value;
    }

    /**
     * Gets the value of the ppKerberosBstValueType property.
     * 
     * @return
     *     possible object is
     *     {@link DmCryptoKerberosBstValueType }
     *     
     */
    public DmCryptoKerberosBstValueType getPPKerberosBstValueType() {
        return ppKerberosBstValueType;
    }

    /**
     * Sets the value of the ppKerberosBstValueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmCryptoKerberosBstValueType }
     *     
     */
    public void setPPKerberosBstValueType(DmCryptoKerberosBstValueType value) {
        this.ppKerberosBstValueType = value;
    }

    /**
     * Gets the value of the ppsamlUseWSSec property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getPPSAMLUseWSSec() {
        return ppsamlUseWSSec;
    }

    /**
     * Sets the value of the ppsamlUseWSSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setPPSAMLUseWSSec(DmToggle value) {
        this.ppsamlUseWSSec = value;
    }

    /**
     * Gets the value of the ppKerberosClientKeytab property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getPPKerberosClientKeytab() {
        return ppKerberosClientKeytab;
    }

    /**
     * Sets the value of the ppKerberosClientKeytab property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setPPKerberosClientKeytab(DmReference value) {
        this.ppKerberosClientKeytab = value;
    }

    /**
     * Gets the value of the ppUseWSSec property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getPPUseWSSec() {
        return ppUseWSSec;
    }

    /**
     * Sets the value of the ppUseWSSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setPPUseWSSec(DmToggle value) {
        this.ppUseWSSec = value;
    }

    /**
     * Gets the value of the ppActorRoleID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPActorRoleID() {
        return ppActorRoleID;
    }

    /**
     * Sets the value of the ppActorRoleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPActorRoleID(String value) {
        this.ppActorRoleID = value;
    }

    /**
     * Gets the value of the pptfimTokenMapping property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getPPTFIMTokenMapping() {
        return pptfimTokenMapping;
    }

    /**
     * Sets the value of the pptfimTokenMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setPPTFIMTokenMapping(DmToggle value) {
        this.pptfimTokenMapping = value;
    }

    /**
     * Gets the value of the pptfimEndpoint property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getPPTFIMEndpoint() {
        return pptfimEndpoint;
    }

    /**
     * Sets the value of the pptfimEndpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setPPTFIMEndpoint(DmReference value) {
        this.pptfimEndpoint = value;
    }

    /**
     * Gets the value of the ppwsDerivedKeyUsernameToken property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getPPWSDerivedKeyUsernameToken() {
        return ppwsDerivedKeyUsernameToken;
    }

    /**
     * Sets the value of the ppwsDerivedKeyUsernameToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setPPWSDerivedKeyUsernameToken(DmToggle value) {
        this.ppwsDerivedKeyUsernameToken = value;
    }

    /**
     * Gets the value of the ppwsDerivedKeyUsernameTokenIterations property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPPWSDerivedKeyUsernameTokenIterations() {
        return ppwsDerivedKeyUsernameTokenIterations;
    }

    /**
     * Sets the value of the ppwsDerivedKeyUsernameTokenIterations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPPWSDerivedKeyUsernameTokenIterations(Long value) {
        this.ppwsDerivedKeyUsernameTokenIterations = value;
    }

    /**
     * Gets the value of the ppwsUsernameTokenAllowReplacement property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getPPWSUsernameTokenAllowReplacement() {
        return ppwsUsernameTokenAllowReplacement;
    }

    /**
     * Sets the value of the ppwsUsernameTokenAllowReplacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setPPWSUsernameTokenAllowReplacement(DmToggle value) {
        this.ppwsUsernameTokenAllowReplacement = value;
    }

    /**
     * Gets the value of the pptfimReplaceMethod property.
     * 
     * @return
     *     possible object is
     *     {@link DmTFIMTokenReplaceMode }
     *     
     */
    public DmTFIMTokenReplaceMode getPPTFIMReplaceMethod() {
        return pptfimReplaceMethod;
    }

    /**
     * Sets the value of the pptfimReplaceMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmTFIMTokenReplaceMode }
     *     
     */
    public void setPPTFIMReplaceMethod(DmTFIMTokenReplaceMode value) {
        this.pptfimReplaceMethod = value;
    }

    /**
     * Gets the value of the pptfimRetrieveMode property.
     * 
     * @return
     *     possible object is
     *     {@link DmTFIMRetrieveMode }
     *     
     */
    public DmTFIMRetrieveMode getPPTFIMRetrieveMode() {
        return pptfimRetrieveMode;
    }

    /**
     * Sets the value of the pptfimRetrieveMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmTFIMRetrieveMode }
     *     
     */
    public void setPPTFIMRetrieveMode(DmTFIMRetrieveMode value) {
        this.pptfimRetrieveMode = value;
    }

    /**
     * Gets the value of the pphmacSigningAlg property.
     * 
     * @return
     *     possible object is
     *     {@link DmCryptoHMACSigningAlgorithm }
     *     
     */
    public DmCryptoHMACSigningAlgorithm getPPHMACSigningAlg() {
        return pphmacSigningAlg;
    }

    /**
     * Sets the value of the pphmacSigningAlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmCryptoHMACSigningAlgorithm }
     *     
     */
    public void setPPHMACSigningAlg(DmCryptoHMACSigningAlgorithm value) {
        this.pphmacSigningAlg = value;
    }

    /**
     * Gets the value of the ppSigningHashAlg property.
     * 
     * @return
     *     possible object is
     *     {@link DmCryptoHashAlgorithm }
     *     
     */
    public DmCryptoHashAlgorithm getPPSigningHashAlg() {
        return ppSigningHashAlg;
    }

    /**
     * Sets the value of the ppSigningHashAlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmCryptoHashAlgorithm }
     *     
     */
    public void setPPSigningHashAlg(DmCryptoHashAlgorithm value) {
        this.ppSigningHashAlg = value;
    }

    /**
     * Gets the value of the ppwsTrustHeader property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getPPWSTrustHeader() {
        return ppwsTrustHeader;
    }

    /**
     * Sets the value of the ppwsTrustHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setPPWSTrustHeader(DmToggle value) {
        this.ppwsTrustHeader = value;
    }

    /**
     * Gets the value of the ppwsscKeySource property.
     * 
     * @return
     *     possible object is
     *     {@link DmWSSCKeySourceType }
     *     
     */
    public DmWSSCKeySourceType getPPWSSCKeySource() {
        return ppwsscKeySource;
    }

    /**
     * Sets the value of the ppwsscKeySource property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmWSSCKeySourceType }
     *     
     */
    public void setPPWSSCKeySource(DmWSSCKeySourceType value) {
        this.ppwsscKeySource = value;
    }

    /**
     * Gets the value of the ppSharedSecretKey property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getPPSharedSecretKey() {
        return ppSharedSecretKey;
    }

    /**
     * Sets the value of the ppSharedSecretKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setPPSharedSecretKey(DmReference value) {
        this.ppSharedSecretKey = value;
    }

    /**
     * Gets the value of the ppwsTrustRenewalWait property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPPWSTrustRenewalWait() {
        return ppwsTrustRenewalWait;
    }

    /**
     * Sets the value of the ppwsTrustRenewalWait property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPPWSTrustRenewalWait(Long value) {
        this.ppwsTrustRenewalWait = value;
    }

    /**
     * Gets the value of the ppwsTrustNewInstance property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getPPWSTrustNewInstance() {
        return ppwsTrustNewInstance;
    }

    /**
     * Sets the value of the ppwsTrustNewInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setPPWSTrustNewInstance(DmToggle value) {
        this.ppwsTrustNewInstance = value;
    }

    /**
     * Gets the value of the ppwsTrustNewKey property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getPPWSTrustNewKey() {
        return ppwsTrustNewKey;
    }

    /**
     * Sets the value of the ppwsTrustNewKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setPPWSTrustNewKey(DmToggle value) {
        this.ppwsTrustNewKey = value;
    }

    /**
     * Gets the value of the ppwsTrustNeverExpire property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getPPWSTrustNeverExpire() {
        return ppwsTrustNeverExpire;
    }

    /**
     * Sets the value of the ppwsTrustNeverExpire property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setPPWSTrustNeverExpire(DmToggle value) {
        this.ppwsTrustNeverExpire = value;
    }

    /**
     * Gets the value of the ppicrxToken property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getPPICRXToken() {
        return ppicrxToken;
    }

    /**
     * Sets the value of the ppicrxToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setPPICRXToken(DmToggle value) {
        this.ppicrxToken = value;
    }

    /**
     * Gets the value of the ppicrxUserRealm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPICRXUserRealm() {
        return ppicrxUserRealm;
    }

    /**
     * Sets the value of the ppicrxUserRealm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPICRXUserRealm(String value) {
        this.ppicrxUserRealm = value;
    }

    /**
     * Gets the value of the ppsamlIdentityProvider property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getPPSAMLIdentityProvider() {
        return ppsamlIdentityProvider;
    }

    /**
     * Sets the value of the ppsamlIdentityProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setPPSAMLIdentityProvider(DmToggle value) {
        this.ppsamlIdentityProvider = value;
    }

    /**
     * Gets the value of the ppsamlProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link DmSAMLProtocol }
     *     
     */
    public DmSAMLProtocol getPPSAMLProtocol() {
        return ppsamlProtocol;
    }

    /**
     * Sets the value of the ppsamlProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmSAMLProtocol }
     *     
     */
    public void setPPSAMLProtocol(DmSAMLProtocol value) {
        this.ppsamlProtocol = value;
    }

    /**
     * Gets the value of the ppsamlResponseDestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPSAMLResponseDestination() {
        return ppsamlResponseDestination;
    }

    /**
     * Sets the value of the ppsamlResponseDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPSAMLResponseDestination(String value) {
        this.ppsamlResponseDestination = value;
    }

    /**
     * Gets the value of the ppResultWrapup property.
     * 
     * @return
     *     possible object is
     *     {@link DmResultWrapup }
     *     
     */
    public DmResultWrapup getPPResultWrapup() {
        return ppResultWrapup;
    }

    /**
     * Sets the value of the ppResultWrapup property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmResultWrapup }
     *     
     */
    public void setPPResultWrapup(DmResultWrapup value) {
        this.ppResultWrapup = value;
    }

    /**
     * Gets the value of the ppsamlAssertionType property.
     * 
     * @return
     *     possible object is
     *     {@link DmSAMLStatementType }
     *     
     */
    public DmSAMLStatementType getPPSAMLAssertionType() {
        return ppsamlAssertionType;
    }

    /**
     * Sets the value of the ppsamlAssertionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmSAMLStatementType }
     *     
     */
    public void setPPSAMLAssertionType(DmSAMLStatementType value) {
        this.ppsamlAssertionType = value;
    }

    /**
     * Gets the value of the ppsamlSubjectConfirm property.
     * 
     * @return
     *     possible object is
     *     {@link DmSAMLSubjectConfirmationType }
     *     
     */
    public DmSAMLSubjectConfirmationType getPPSAMLSubjectConfirm() {
        return ppsamlSubjectConfirm;
    }

    /**
     * Sets the value of the ppsamlSubjectConfirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmSAMLSubjectConfirmationType }
     *     
     */
    public void setPPSAMLSubjectConfirm(DmSAMLSubjectConfirmationType value) {
        this.ppsamlSubjectConfirm = value;
    }

    /**
     * Gets the value of the ppsamlNameID property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getPPSAMLNameID() {
        return ppsamlNameID;
    }

    /**
     * Sets the value of the ppsamlNameID property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setPPSAMLNameID(DmToggle value) {
        this.ppsamlNameID = value;
    }

    /**
     * Gets the value of the ppsamlNameIDFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPSAMLNameIDFormat() {
        return ppsamlNameIDFormat;
    }

    /**
     * Sets the value of the ppsamlNameIDFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPSAMLNameIDFormat(String value) {
        this.ppsamlNameIDFormat = value;
    }

    /**
     * Gets the value of the ppsamlRecipient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPSAMLRecipient() {
        return ppsamlRecipient;
    }

    /**
     * Sets the value of the ppsamlRecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPSAMLRecipient(String value) {
        this.ppsamlRecipient = value;
    }

    /**
     * Gets the value of the ppsamlAudience property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPSAMLAudience() {
        return ppsamlAudience;
    }

    /**
     * Sets the value of the ppsamlAudience property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPSAMLAudience(String value) {
        this.ppsamlAudience = value;
    }

    /**
     * Gets the value of the ppsamlOmitNotBefore property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getPPSAMLOmitNotBefore() {
        return ppsamlOmitNotBefore;
    }

    /**
     * Sets the value of the ppsamlOmitNotBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setPPSAMLOmitNotBefore(DmToggle value) {
        this.ppsamlOmitNotBefore = value;
    }

    /**
     * Gets the value of the ppOneTimeUse property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getPPOneTimeUse() {
        return ppOneTimeUse;
    }

    /**
     * Sets the value of the ppOneTimeUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setPPOneTimeUse(DmToggle value) {
        this.ppOneTimeUse = value;
    }

    /**
     * Gets the value of the ppsamlProxy property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getPPSAMLProxy() {
        return ppsamlProxy;
    }

    /**
     * Sets the value of the ppsamlProxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setPPSAMLProxy(DmToggle value) {
        this.ppsamlProxy = value;
    }

    /**
     * Gets the value of the ppsamlProxyAudience property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPSAMLProxyAudience() {
        return ppsamlProxyAudience;
    }

    /**
     * Sets the value of the ppsamlProxyAudience property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPSAMLProxyAudience(String value) {
        this.ppsamlProxyAudience = value;
    }

    /**
     * Gets the value of the ppsamlProxyCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPPSAMLProxyCount() {
        return ppsamlProxyCount;
    }

    /**
     * Sets the value of the ppsamlProxyCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPPSAMLProxyCount(Long value) {
        this.ppsamlProxyCount = value;
    }

    /**
     * Gets the value of the ppsamlAuthzAction property.
     * 
     * @return
     *     possible object is
     *     {@link DmSAMLAction }
     *     
     */
    public DmSAMLAction getPPSAMLAuthzAction() {
        return ppsamlAuthzAction;
    }

    /**
     * Sets the value of the ppsamlAuthzAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmSAMLAction }
     *     
     */
    public void setPPSAMLAuthzAction(DmSAMLAction value) {
        this.ppsamlAuthzAction = value;
    }

    /**
     * Gets the value of the ppsamlAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getPPSAMLAttributes() {
        return ppsamlAttributes;
    }

    /**
     * Sets the value of the ppsamlAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setPPSAMLAttributes(DmReference value) {
        this.ppsamlAttributes = value;
    }

}
