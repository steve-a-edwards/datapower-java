
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmAAAPEIBitmap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmAAAPEIBitmap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="http-basic-auth" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="wssec-username" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="wssec-derived-key" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="wssec-binary-token" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="ws-secure-conversation" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="ws-trust" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="kerberos" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="kerberos-spnego" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="client-ssl" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="saml-attr-name" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="saml-authen-name" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="saml-artifact" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="client-ip-address" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="signer-dn" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="token" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="cookie-token" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="ltpa" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="metadata" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="custom" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="html-forms-auth" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmAAAPEIBitmap", propOrder = {

})
public class DmAAAPEIBitmap {

    @XmlElement(name = "http-basic-auth")
    protected DmToggle httpBasicAuth;
    @XmlElement(name = "wssec-username")
    protected DmToggle wssecUsername;
    @XmlElement(name = "wssec-derived-key")
    protected DmToggle wssecDerivedKey;
    @XmlElement(name = "wssec-binary-token")
    protected DmToggle wssecBinaryToken;
    @XmlElement(name = "ws-secure-conversation")
    protected DmToggle wsSecureConversation;
    @XmlElement(name = "ws-trust")
    protected DmToggle wsTrust;
    protected DmToggle kerberos;
    @XmlElement(name = "kerberos-spnego")
    protected DmToggle kerberosSpnego;
    @XmlElement(name = "client-ssl")
    protected DmToggle clientSsl;
    @XmlElement(name = "saml-attr-name")
    protected DmToggle samlAttrName;
    @XmlElement(name = "saml-authen-name")
    protected DmToggle samlAuthenName;
    @XmlElement(name = "saml-artifact")
    protected DmToggle samlArtifact;
    @XmlElement(name = "client-ip-address")
    protected DmToggle clientIpAddress;
    @XmlElement(name = "signer-dn")
    protected DmToggle signerDn;
    protected DmToggle token;
    @XmlElement(name = "cookie-token")
    protected DmToggle cookieToken;
    protected DmToggle ltpa;
    protected DmToggle metadata;
    protected DmToggle custom;
    @XmlElement(name = "html-forms-auth")
    protected DmToggle htmlFormsAuth;

    /**
     * Gets the value of the httpBasicAuth property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getHttpBasicAuth() {
        return httpBasicAuth;
    }

    /**
     * Sets the value of the httpBasicAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setHttpBasicAuth(DmToggle value) {
        this.httpBasicAuth = value;
    }

    /**
     * Gets the value of the wssecUsername property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getWssecUsername() {
        return wssecUsername;
    }

    /**
     * Sets the value of the wssecUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setWssecUsername(DmToggle value) {
        this.wssecUsername = value;
    }

    /**
     * Gets the value of the wssecDerivedKey property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getWssecDerivedKey() {
        return wssecDerivedKey;
    }

    /**
     * Sets the value of the wssecDerivedKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setWssecDerivedKey(DmToggle value) {
        this.wssecDerivedKey = value;
    }

    /**
     * Gets the value of the wssecBinaryToken property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getWssecBinaryToken() {
        return wssecBinaryToken;
    }

    /**
     * Sets the value of the wssecBinaryToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setWssecBinaryToken(DmToggle value) {
        this.wssecBinaryToken = value;
    }

    /**
     * Gets the value of the wsSecureConversation property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getWsSecureConversation() {
        return wsSecureConversation;
    }

    /**
     * Sets the value of the wsSecureConversation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setWsSecureConversation(DmToggle value) {
        this.wsSecureConversation = value;
    }

    /**
     * Gets the value of the wsTrust property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getWsTrust() {
        return wsTrust;
    }

    /**
     * Sets the value of the wsTrust property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setWsTrust(DmToggle value) {
        this.wsTrust = value;
    }

    /**
     * Gets the value of the kerberos property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getKerberos() {
        return kerberos;
    }

    /**
     * Sets the value of the kerberos property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setKerberos(DmToggle value) {
        this.kerberos = value;
    }

    /**
     * Gets the value of the kerberosSpnego property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getKerberosSpnego() {
        return kerberosSpnego;
    }

    /**
     * Sets the value of the kerberosSpnego property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setKerberosSpnego(DmToggle value) {
        this.kerberosSpnego = value;
    }

    /**
     * Gets the value of the clientSsl property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getClientSsl() {
        return clientSsl;
    }

    /**
     * Sets the value of the clientSsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setClientSsl(DmToggle value) {
        this.clientSsl = value;
    }

    /**
     * Gets the value of the samlAttrName property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getSamlAttrName() {
        return samlAttrName;
    }

    /**
     * Sets the value of the samlAttrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setSamlAttrName(DmToggle value) {
        this.samlAttrName = value;
    }

    /**
     * Gets the value of the samlAuthenName property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getSamlAuthenName() {
        return samlAuthenName;
    }

    /**
     * Sets the value of the samlAuthenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setSamlAuthenName(DmToggle value) {
        this.samlAuthenName = value;
    }

    /**
     * Gets the value of the samlArtifact property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getSamlArtifact() {
        return samlArtifact;
    }

    /**
     * Sets the value of the samlArtifact property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setSamlArtifact(DmToggle value) {
        this.samlArtifact = value;
    }

    /**
     * Gets the value of the clientIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getClientIpAddress() {
        return clientIpAddress;
    }

    /**
     * Sets the value of the clientIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setClientIpAddress(DmToggle value) {
        this.clientIpAddress = value;
    }

    /**
     * Gets the value of the signerDn property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getSignerDn() {
        return signerDn;
    }

    /**
     * Sets the value of the signerDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setSignerDn(DmToggle value) {
        this.signerDn = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setToken(DmToggle value) {
        this.token = value;
    }

    /**
     * Gets the value of the cookieToken property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getCookieToken() {
        return cookieToken;
    }

    /**
     * Sets the value of the cookieToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setCookieToken(DmToggle value) {
        this.cookieToken = value;
    }

    /**
     * Gets the value of the ltpa property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getLtpa() {
        return ltpa;
    }

    /**
     * Sets the value of the ltpa property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setLtpa(DmToggle value) {
        this.ltpa = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setMetadata(DmToggle value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setCustom(DmToggle value) {
        this.custom = value;
    }

    /**
     * Gets the value of the htmlFormsAuth property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getHtmlFormsAuth() {
        return htmlFormsAuth;
    }

    /**
     * Sets the value of the htmlFormsAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setHtmlFormsAuth(DmToggle value) {
        this.htmlFormsAuth = value;
    }

}
