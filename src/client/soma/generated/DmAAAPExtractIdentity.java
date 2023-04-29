
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmAAAPExtractIdentity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmAAAPExtractIdentity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EIBitmap" type="{http://www.datapower.com/schemas/management}dmAAAPEIBitmap"/>
 *         &lt;element name="EICustomURL" type="{http://www.datapower.com/schemas/management}dmURL"/>
 *         &lt;element name="EIXPath" type="{http://www.datapower.com/schemas/management}dmXPathExpr"/>
 *         &lt;element name="EISignerDNValcred" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="EICookieName" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="EIBasicAuthRealm" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="EIUseWSSec" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="EIMetadata" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="EIAllowRemoteTokenReference" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="EIRemoteTokenProcessService" type="{http://www.datapower.com/schemas/management}dmURL"/>
 *         &lt;element name="EIPasswordRetrievalMechanism" type="{http://www.datapower.com/schemas/management}dmPasswordRetrievalMechanism"/>
 *         &lt;element name="EIPasswordRetrievalCustomURL" type="{http://www.datapower.com/schemas/management}dmURL"/>
 *         &lt;element name="EIPasswordRetrievalAAAInfoURL" type="{http://www.datapower.com/schemas/management}dmURL"/>
 *         &lt;element name="EISSLProxyProfile" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="EIFormsLoginPolicy" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmAAAPExtractIdentity", propOrder = {
    "eiBitmap",
    "eiCustomURL",
    "eixPath",
    "eiSignerDNValcred",
    "eiCookieName",
    "eiBasicAuthRealm",
    "eiUseWSSec",
    "eiMetadata",
    "eiAllowRemoteTokenReference",
    "eiRemoteTokenProcessService",
    "eiPasswordRetrievalMechanism",
    "eiPasswordRetrievalCustomURL",
    "eiPasswordRetrievalAAAInfoURL",
    "eisslProxyProfile",
    "eiFormsLoginPolicy"
})
public class DmAAAPExtractIdentity {

    @XmlElement(name = "EIBitmap", required = true)
    protected DmAAAPEIBitmap eiBitmap;
    @XmlElement(name = "EICustomURL", required = true, nillable = true)
    protected String eiCustomURL;
    @XmlElement(name = "EIXPath", required = true, nillable = true)
    protected String eixPath;
    @XmlElement(name = "EISignerDNValcred", required = true, nillable = true)
    protected DmReference eiSignerDNValcred;
    @XmlElement(name = "EICookieName", required = true, nillable = true)
    protected String eiCookieName;
    @XmlElement(name = "EIBasicAuthRealm", required = true, nillable = true)
    protected String eiBasicAuthRealm;
    @XmlElement(name = "EIUseWSSec", required = true, nillable = true)
    protected DmToggle eiUseWSSec;
    @XmlElement(name = "EIMetadata", required = true, nillable = true)
    protected DmReference eiMetadata;
    @XmlElement(name = "EIAllowRemoteTokenReference", required = true, nillable = true)
    protected DmToggle eiAllowRemoteTokenReference;
    @XmlElement(name = "EIRemoteTokenProcessService", required = true, nillable = true)
    protected String eiRemoteTokenProcessService;
    @XmlElement(name = "EIPasswordRetrievalMechanism", required = true, nillable = true)
    protected DmPasswordRetrievalMechanism eiPasswordRetrievalMechanism;
    @XmlElement(name = "EIPasswordRetrievalCustomURL", required = true, nillable = true)
    protected String eiPasswordRetrievalCustomURL;
    @XmlElement(name = "EIPasswordRetrievalAAAInfoURL", required = true, nillable = true)
    protected String eiPasswordRetrievalAAAInfoURL;
    @XmlElement(name = "EISSLProxyProfile", required = true, nillable = true)
    protected DmReference eisslProxyProfile;
    @XmlElement(name = "EIFormsLoginPolicy", required = true, nillable = true)
    protected DmReference eiFormsLoginPolicy;

    /**
     * Gets the value of the eiBitmap property.
     * 
     * @return
     *     possible object is
     *     {@link DmAAAPEIBitmap }
     *     
     */
    public DmAAAPEIBitmap getEIBitmap() {
        return eiBitmap;
    }

    /**
     * Sets the value of the eiBitmap property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmAAAPEIBitmap }
     *     
     */
    public void setEIBitmap(DmAAAPEIBitmap value) {
        this.eiBitmap = value;
    }

    /**
     * Gets the value of the eiCustomURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEICustomURL() {
        return eiCustomURL;
    }

    /**
     * Sets the value of the eiCustomURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEICustomURL(String value) {
        this.eiCustomURL = value;
    }

    /**
     * Gets the value of the eixPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIXPath() {
        return eixPath;
    }

    /**
     * Sets the value of the eixPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIXPath(String value) {
        this.eixPath = value;
    }

    /**
     * Gets the value of the eiSignerDNValcred property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getEISignerDNValcred() {
        return eiSignerDNValcred;
    }

    /**
     * Sets the value of the eiSignerDNValcred property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setEISignerDNValcred(DmReference value) {
        this.eiSignerDNValcred = value;
    }

    /**
     * Gets the value of the eiCookieName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEICookieName() {
        return eiCookieName;
    }

    /**
     * Sets the value of the eiCookieName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEICookieName(String value) {
        this.eiCookieName = value;
    }

    /**
     * Gets the value of the eiBasicAuthRealm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIBasicAuthRealm() {
        return eiBasicAuthRealm;
    }

    /**
     * Sets the value of the eiBasicAuthRealm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIBasicAuthRealm(String value) {
        this.eiBasicAuthRealm = value;
    }

    /**
     * Gets the value of the eiUseWSSec property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getEIUseWSSec() {
        return eiUseWSSec;
    }

    /**
     * Sets the value of the eiUseWSSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setEIUseWSSec(DmToggle value) {
        this.eiUseWSSec = value;
    }

    /**
     * Gets the value of the eiMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getEIMetadata() {
        return eiMetadata;
    }

    /**
     * Sets the value of the eiMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setEIMetadata(DmReference value) {
        this.eiMetadata = value;
    }

    /**
     * Gets the value of the eiAllowRemoteTokenReference property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getEIAllowRemoteTokenReference() {
        return eiAllowRemoteTokenReference;
    }

    /**
     * Sets the value of the eiAllowRemoteTokenReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setEIAllowRemoteTokenReference(DmToggle value) {
        this.eiAllowRemoteTokenReference = value;
    }

    /**
     * Gets the value of the eiRemoteTokenProcessService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIRemoteTokenProcessService() {
        return eiRemoteTokenProcessService;
    }

    /**
     * Sets the value of the eiRemoteTokenProcessService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIRemoteTokenProcessService(String value) {
        this.eiRemoteTokenProcessService = value;
    }

    /**
     * Gets the value of the eiPasswordRetrievalMechanism property.
     * 
     * @return
     *     possible object is
     *     {@link DmPasswordRetrievalMechanism }
     *     
     */
    public DmPasswordRetrievalMechanism getEIPasswordRetrievalMechanism() {
        return eiPasswordRetrievalMechanism;
    }

    /**
     * Sets the value of the eiPasswordRetrievalMechanism property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmPasswordRetrievalMechanism }
     *     
     */
    public void setEIPasswordRetrievalMechanism(DmPasswordRetrievalMechanism value) {
        this.eiPasswordRetrievalMechanism = value;
    }

    /**
     * Gets the value of the eiPasswordRetrievalCustomURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIPasswordRetrievalCustomURL() {
        return eiPasswordRetrievalCustomURL;
    }

    /**
     * Sets the value of the eiPasswordRetrievalCustomURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIPasswordRetrievalCustomURL(String value) {
        this.eiPasswordRetrievalCustomURL = value;
    }

    /**
     * Gets the value of the eiPasswordRetrievalAAAInfoURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIPasswordRetrievalAAAInfoURL() {
        return eiPasswordRetrievalAAAInfoURL;
    }

    /**
     * Sets the value of the eiPasswordRetrievalAAAInfoURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIPasswordRetrievalAAAInfoURL(String value) {
        this.eiPasswordRetrievalAAAInfoURL = value;
    }

    /**
     * Gets the value of the eisslProxyProfile property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getEISSLProxyProfile() {
        return eisslProxyProfile;
    }

    /**
     * Sets the value of the eisslProxyProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setEISSLProxyProfile(DmReference value) {
        this.eisslProxyProfile = value;
    }

    /**
     * Gets the value of the eiFormsLoginPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getEIFormsLoginPolicy() {
        return eiFormsLoginPolicy;
    }

    /**
     * Sets the value of the eiFormsLoginPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setEIFormsLoginPolicy(DmReference value) {
        this.eiFormsLoginPolicy = value;
    }

}
