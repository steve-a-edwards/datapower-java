
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmCRLFetchConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmCRLFetchConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="FetchType" type="{http://www.datapower.com/schemas/management}dmCRLFetchType"/>
 *         &lt;element name="IssuerValcred" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="RefreshInterval" type="{http://www.datapower.com/schemas/management}dmTimeInterval"/>
 *         &lt;element name="CryptographicProfile" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="URL" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="RemoteAddress" type="{http://www.datapower.com/schemas/management}dmHostname"/>
 *         &lt;element name="RemotePort" type="{http://www.datapower.com/schemas/management}dmIPPort"/>
 *         &lt;element name="DN" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="BindDN" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="BindPass" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="LDAPVersion" type="{http://www.datapower.com/schemas/management}dmLDAPVersion"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmCRLFetchConfig", propOrder = {
    "name",
    "fetchType",
    "issuerValcred",
    "refreshInterval",
    "cryptographicProfile",
    "url",
    "remoteAddress",
    "remotePort",
    "dn",
    "bindDN",
    "bindPass",
    "ldapVersion"
})
public class DmCRLFetchConfig {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "FetchType", required = true)
    protected DmCRLFetchType fetchType;
    @XmlElement(name = "IssuerValcred", required = true)
    protected DmReference issuerValcred;
    @XmlElement(name = "RefreshInterval")
    protected long refreshInterval;
    @XmlElement(name = "CryptographicProfile", required = true, nillable = true)
    protected String cryptographicProfile;
    @XmlElement(name = "URL", required = true, nillable = true)
    protected String url;
    @XmlElement(name = "RemoteAddress", required = true, nillable = true)
    protected String remoteAddress;
    @XmlElement(name = "RemotePort", required = true, type = Integer.class, nillable = true)
    protected Integer remotePort;
    @XmlElement(name = "DN", required = true, nillable = true)
    protected String dn;
    @XmlElement(name = "BindDN", required = true, nillable = true)
    protected String bindDN;
    @XmlElement(name = "BindPass", required = true, nillable = true)
    protected String bindPass;
    @XmlElement(name = "LDAPVersion", required = true, nillable = true)
    protected DmLDAPVersion ldapVersion;

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
     * Gets the value of the fetchType property.
     * 
     * @return
     *     possible object is
     *     {@link DmCRLFetchType }
     *     
     */
    public DmCRLFetchType getFetchType() {
        return fetchType;
    }

    /**
     * Sets the value of the fetchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmCRLFetchType }
     *     
     */
    public void setFetchType(DmCRLFetchType value) {
        this.fetchType = value;
    }

    /**
     * Gets the value of the issuerValcred property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getIssuerValcred() {
        return issuerValcred;
    }

    /**
     * Sets the value of the issuerValcred property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setIssuerValcred(DmReference value) {
        this.issuerValcred = value;
    }

    /**
     * Gets the value of the refreshInterval property.
     * 
     */
    public long getRefreshInterval() {
        return refreshInterval;
    }

    /**
     * Sets the value of the refreshInterval property.
     * 
     */
    public void setRefreshInterval(long value) {
        this.refreshInterval = value;
    }

    /**
     * Gets the value of the cryptographicProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCryptographicProfile() {
        return cryptographicProfile;
    }

    /**
     * Sets the value of the cryptographicProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCryptographicProfile(String value) {
        this.cryptographicProfile = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the remoteAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteAddress() {
        return remoteAddress;
    }

    /**
     * Sets the value of the remoteAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteAddress(String value) {
        this.remoteAddress = value;
    }

    /**
     * Gets the value of the remotePort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRemotePort() {
        return remotePort;
    }

    /**
     * Sets the value of the remotePort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemotePort(Integer value) {
        this.remotePort = value;
    }

    /**
     * Gets the value of the dn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDN() {
        return dn;
    }

    /**
     * Sets the value of the dn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDN(String value) {
        this.dn = value;
    }

    /**
     * Gets the value of the bindDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindDN() {
        return bindDN;
    }

    /**
     * Sets the value of the bindDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindDN(String value) {
        this.bindDN = value;
    }

    /**
     * Gets the value of the bindPass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindPass() {
        return bindPass;
    }

    /**
     * Sets the value of the bindPass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindPass(String value) {
        this.bindPass = value;
    }

    /**
     * Gets the value of the ldapVersion property.
     * 
     * @return
     *     possible object is
     *     {@link DmLDAPVersion }
     *     
     */
    public DmLDAPVersion getLDAPVersion() {
        return ldapVersion;
    }

    /**
     * Sets the value of the ldapVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmLDAPVersion }
     *     
     */
    public void setLDAPVersion(DmLDAPVersion value) {
        this.ldapVersion = value;
    }

}
