
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionCreateTAMFiles complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionCreateTAMFiles">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreateCopy" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="OutputConfigFile" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="Administrator" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="Password" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="TAMDomain" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="Application" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="Host" type="{http://www.datapower.com/schemas/management}dmHostname"/>
 *         &lt;element name="Port" type="{http://www.datapower.com/schemas/management}dmIPPort"/>
 *         &lt;element name="SSLKeyFileLifetime" type="{http://www.datapower.com/schemas/management}dmUInt16"/>
 *         &lt;element name="SSLTimeout" type="{http://www.datapower.com/schemas/management}dmTimeInterval"/>
 *         &lt;element name="LocalMode" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="ListenMode" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="LocalHost" type="{http://www.datapower.com/schemas/management}dmHostname" minOccurs="0"/>
 *         &lt;element name="LocalPort" type="{http://www.datapower.com/schemas/management}dmIPPort" minOccurs="0"/>
 *         &lt;element name="UseADRegistry" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="ADPrimaryDomain" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="ADPrimaryHost" type="{http://www.datapower.com/schemas/management}dmHostname" minOccurs="0"/>
 *         &lt;element name="ADPrimaryReplicas" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="LDAPServer" type="{http://www.datapower.com/schemas/management}dmHostname" minOccurs="0"/>
 *         &lt;element name="LDAPPort" type="{http://www.datapower.com/schemas/management}dmIPPort" minOccurs="0"/>
 *         &lt;element name="LDAPBindPassword" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="LDAPAuthenticateTimeout" type="{http://www.datapower.com/schemas/management}dmTimeInterval" minOccurs="0"/>
 *         &lt;element name="LDAPSearchTimeout" type="{http://www.datapower.com/schemas/management}dmTimeInterval" minOccurs="0"/>
 *         &lt;element name="ADClientTimeout" type="{http://www.datapower.com/schemas/management}dmTimeInterval" minOccurs="0"/>
 *         &lt;element name="EnableRegistryCache" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="LDAPUserCacheSize" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="LDAPPolicyCacheSize" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="ADLdapCacheSize" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="ADLdapCacheLife" type="{http://www.datapower.com/schemas/management}dmTimeInterval" minOccurs="0"/>
 *         &lt;element name="ADDnforpd" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="ADUseMultiDomain" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="ADDomaindomain" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="ADDomainHost" type="{http://www.datapower.com/schemas/management}dmHostname" minOccurs="0"/>
 *         &lt;element name="ADDomainReplicas" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="ADUseEmailUid" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="ADGcHost" type="{http://www.datapower.com/schemas/management}dmHostname" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionCreateTAMFiles", propOrder = {
    "createCopy",
    "outputConfigFile",
    "administrator",
    "password",
    "tamDomain",
    "application",
    "host",
    "port",
    "sslKeyFileLifetime",
    "sslTimeout",
    "localMode",
    "listenMode",
    "localHost",
    "localPort",
    "useADRegistry",
    "adPrimaryDomain",
    "adPrimaryHost",
    "adPrimaryReplicas",
    "ldapServer",
    "ldapPort",
    "ldapBindPassword",
    "ldapAuthenticateTimeout",
    "ldapSearchTimeout",
    "adClientTimeout",
    "enableRegistryCache",
    "ldapUserCacheSize",
    "ldapPolicyCacheSize",
    "adLdapCacheSize",
    "adLdapCacheLife",
    "adDnforpd",
    "adUseMultiDomain",
    "adDomaindomain",
    "adDomainHost",
    "adDomainReplicas",
    "adUseEmailUid",
    "adGcHost"
})
public class ActionCreateTAMFiles {

    @XmlElement(name = "CreateCopy")
    protected DmToggle createCopy;
    @XmlElement(name = "OutputConfigFile", required = true)
    protected String outputConfigFile;
    @XmlElement(name = "Administrator", required = true)
    protected String administrator;
    @XmlElement(name = "Password", required = true)
    protected String password;
    @XmlElement(name = "TAMDomain", required = true)
    protected String tamDomain;
    @XmlElement(name = "Application", required = true)
    protected String application;
    @XmlElement(name = "Host", required = true)
    protected String host;
    @XmlElement(name = "Port")
    protected int port;
    @XmlElement(name = "SSLKeyFileLifetime")
    protected int sslKeyFileLifetime;
    @XmlElement(name = "SSLTimeout")
    protected long sslTimeout;
    @XmlElement(name = "LocalMode", required = true)
    protected DmToggle localMode;
    @XmlElement(name = "ListenMode")
    protected DmToggle listenMode;
    @XmlElement(name = "LocalHost")
    protected String localHost;
    @XmlElement(name = "LocalPort")
    protected Integer localPort;
    @XmlElement(name = "UseADRegistry", required = true)
    protected DmToggle useADRegistry;
    @XmlElement(name = "ADPrimaryDomain")
    protected String adPrimaryDomain;
    @XmlElement(name = "ADPrimaryHost")
    protected String adPrimaryHost;
    @XmlElement(name = "ADPrimaryReplicas")
    protected String adPrimaryReplicas;
    @XmlElement(name = "LDAPServer")
    protected String ldapServer;
    @XmlElement(name = "LDAPPort")
    protected Integer ldapPort;
    @XmlElement(name = "LDAPBindPassword")
    protected String ldapBindPassword;
    @XmlElement(name = "LDAPAuthenticateTimeout")
    protected Long ldapAuthenticateTimeout;
    @XmlElement(name = "LDAPSearchTimeout")
    protected Long ldapSearchTimeout;
    @XmlElement(name = "ADClientTimeout")
    protected Long adClientTimeout;
    @XmlElement(name = "EnableRegistryCache")
    protected DmToggle enableRegistryCache;
    @XmlElement(name = "LDAPUserCacheSize")
    protected Integer ldapUserCacheSize;
    @XmlElement(name = "LDAPPolicyCacheSize")
    protected Integer ldapPolicyCacheSize;
    @XmlElement(name = "ADLdapCacheSize")
    protected String adLdapCacheSize;
    @XmlElement(name = "ADLdapCacheLife")
    protected Long adLdapCacheLife;
    @XmlElement(name = "ADDnforpd")
    protected String adDnforpd;
    @XmlElement(name = "ADUseMultiDomain")
    protected DmToggle adUseMultiDomain;
    @XmlElement(name = "ADDomaindomain")
    protected String adDomaindomain;
    @XmlElement(name = "ADDomainHost")
    protected String adDomainHost;
    @XmlElement(name = "ADDomainReplicas")
    protected String adDomainReplicas;
    @XmlElement(name = "ADUseEmailUid")
    protected DmToggle adUseEmailUid;
    @XmlElement(name = "ADGcHost")
    protected String adGcHost;

    /**
     * Gets the value of the createCopy property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getCreateCopy() {
        return createCopy;
    }

    /**
     * Sets the value of the createCopy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setCreateCopy(DmToggle value) {
        this.createCopy = value;
    }

    /**
     * Gets the value of the outputConfigFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputConfigFile() {
        return outputConfigFile;
    }

    /**
     * Sets the value of the outputConfigFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputConfigFile(String value) {
        this.outputConfigFile = value;
    }

    /**
     * Gets the value of the administrator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministrator() {
        return administrator;
    }

    /**
     * Sets the value of the administrator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministrator(String value) {
        this.administrator = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the tamDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAMDomain() {
        return tamDomain;
    }

    /**
     * Sets the value of the tamDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAMDomain(String value) {
        this.tamDomain = value;
    }

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplication(String value) {
        this.application = value;
    }

    /**
     * Gets the value of the host property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHost(String value) {
        this.host = value;
    }

    /**
     * Gets the value of the port property.
     * 
     */
    public int getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     */
    public void setPort(int value) {
        this.port = value;
    }

    /**
     * Gets the value of the sslKeyFileLifetime property.
     * 
     */
    public int getSSLKeyFileLifetime() {
        return sslKeyFileLifetime;
    }

    /**
     * Sets the value of the sslKeyFileLifetime property.
     * 
     */
    public void setSSLKeyFileLifetime(int value) {
        this.sslKeyFileLifetime = value;
    }

    /**
     * Gets the value of the sslTimeout property.
     * 
     */
    public long getSSLTimeout() {
        return sslTimeout;
    }

    /**
     * Sets the value of the sslTimeout property.
     * 
     */
    public void setSSLTimeout(long value) {
        this.sslTimeout = value;
    }

    /**
     * Gets the value of the localMode property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getLocalMode() {
        return localMode;
    }

    /**
     * Sets the value of the localMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setLocalMode(DmToggle value) {
        this.localMode = value;
    }

    /**
     * Gets the value of the listenMode property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getListenMode() {
        return listenMode;
    }

    /**
     * Sets the value of the listenMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setListenMode(DmToggle value) {
        this.listenMode = value;
    }

    /**
     * Gets the value of the localHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalHost() {
        return localHost;
    }

    /**
     * Sets the value of the localHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalHost(String value) {
        this.localHost = value;
    }

    /**
     * Gets the value of the localPort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLocalPort() {
        return localPort;
    }

    /**
     * Sets the value of the localPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocalPort(Integer value) {
        this.localPort = value;
    }

    /**
     * Gets the value of the useADRegistry property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getUseADRegistry() {
        return useADRegistry;
    }

    /**
     * Sets the value of the useADRegistry property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setUseADRegistry(DmToggle value) {
        this.useADRegistry = value;
    }

    /**
     * Gets the value of the adPrimaryDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADPrimaryDomain() {
        return adPrimaryDomain;
    }

    /**
     * Sets the value of the adPrimaryDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADPrimaryDomain(String value) {
        this.adPrimaryDomain = value;
    }

    /**
     * Gets the value of the adPrimaryHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADPrimaryHost() {
        return adPrimaryHost;
    }

    /**
     * Sets the value of the adPrimaryHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADPrimaryHost(String value) {
        this.adPrimaryHost = value;
    }

    /**
     * Gets the value of the adPrimaryReplicas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADPrimaryReplicas() {
        return adPrimaryReplicas;
    }

    /**
     * Sets the value of the adPrimaryReplicas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADPrimaryReplicas(String value) {
        this.adPrimaryReplicas = value;
    }

    /**
     * Gets the value of the ldapServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLDAPServer() {
        return ldapServer;
    }

    /**
     * Sets the value of the ldapServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLDAPServer(String value) {
        this.ldapServer = value;
    }

    /**
     * Gets the value of the ldapPort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLDAPPort() {
        return ldapPort;
    }

    /**
     * Sets the value of the ldapPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLDAPPort(Integer value) {
        this.ldapPort = value;
    }

    /**
     * Gets the value of the ldapBindPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLDAPBindPassword() {
        return ldapBindPassword;
    }

    /**
     * Sets the value of the ldapBindPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLDAPBindPassword(String value) {
        this.ldapBindPassword = value;
    }

    /**
     * Gets the value of the ldapAuthenticateTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLDAPAuthenticateTimeout() {
        return ldapAuthenticateTimeout;
    }

    /**
     * Sets the value of the ldapAuthenticateTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLDAPAuthenticateTimeout(Long value) {
        this.ldapAuthenticateTimeout = value;
    }

    /**
     * Gets the value of the ldapSearchTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLDAPSearchTimeout() {
        return ldapSearchTimeout;
    }

    /**
     * Sets the value of the ldapSearchTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLDAPSearchTimeout(Long value) {
        this.ldapSearchTimeout = value;
    }

    /**
     * Gets the value of the adClientTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getADClientTimeout() {
        return adClientTimeout;
    }

    /**
     * Sets the value of the adClientTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setADClientTimeout(Long value) {
        this.adClientTimeout = value;
    }

    /**
     * Gets the value of the enableRegistryCache property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getEnableRegistryCache() {
        return enableRegistryCache;
    }

    /**
     * Sets the value of the enableRegistryCache property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setEnableRegistryCache(DmToggle value) {
        this.enableRegistryCache = value;
    }

    /**
     * Gets the value of the ldapUserCacheSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLDAPUserCacheSize() {
        return ldapUserCacheSize;
    }

    /**
     * Sets the value of the ldapUserCacheSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLDAPUserCacheSize(Integer value) {
        this.ldapUserCacheSize = value;
    }

    /**
     * Gets the value of the ldapPolicyCacheSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLDAPPolicyCacheSize() {
        return ldapPolicyCacheSize;
    }

    /**
     * Sets the value of the ldapPolicyCacheSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLDAPPolicyCacheSize(Integer value) {
        this.ldapPolicyCacheSize = value;
    }

    /**
     * Gets the value of the adLdapCacheSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADLdapCacheSize() {
        return adLdapCacheSize;
    }

    /**
     * Sets the value of the adLdapCacheSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADLdapCacheSize(String value) {
        this.adLdapCacheSize = value;
    }

    /**
     * Gets the value of the adLdapCacheLife property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getADLdapCacheLife() {
        return adLdapCacheLife;
    }

    /**
     * Sets the value of the adLdapCacheLife property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setADLdapCacheLife(Long value) {
        this.adLdapCacheLife = value;
    }

    /**
     * Gets the value of the adDnforpd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDnforpd() {
        return adDnforpd;
    }

    /**
     * Sets the value of the adDnforpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDnforpd(String value) {
        this.adDnforpd = value;
    }

    /**
     * Gets the value of the adUseMultiDomain property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getADUseMultiDomain() {
        return adUseMultiDomain;
    }

    /**
     * Sets the value of the adUseMultiDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setADUseMultiDomain(DmToggle value) {
        this.adUseMultiDomain = value;
    }

    /**
     * Gets the value of the adDomaindomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDomaindomain() {
        return adDomaindomain;
    }

    /**
     * Sets the value of the adDomaindomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDomaindomain(String value) {
        this.adDomaindomain = value;
    }

    /**
     * Gets the value of the adDomainHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDomainHost() {
        return adDomainHost;
    }

    /**
     * Sets the value of the adDomainHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDomainHost(String value) {
        this.adDomainHost = value;
    }

    /**
     * Gets the value of the adDomainReplicas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDomainReplicas() {
        return adDomainReplicas;
    }

    /**
     * Sets the value of the adDomainReplicas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDomainReplicas(String value) {
        this.adDomainReplicas = value;
    }

    /**
     * Gets the value of the adUseEmailUid property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getADUseEmailUid() {
        return adUseEmailUid;
    }

    /**
     * Sets the value of the adUseEmailUid property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setADUseEmailUid(DmToggle value) {
        this.adUseEmailUid = value;
    }

    /**
     * Gets the value of the adGcHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADGcHost() {
        return adGcHost;
    }

    /**
     * Sets the value of the adGcHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADGcHost(String value) {
        this.adGcHost = value;
    }

}
