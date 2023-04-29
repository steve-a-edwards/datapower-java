
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionKeygen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionKeygen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LDAPOrder" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="C" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="ST" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="L" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="O" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="OU" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="OU1" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="OU2" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="OU3" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="CN" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="KeyLength" type="{http://www.datapower.com/schemas/management}dmKeygenLength" minOccurs="0"/>
 *         &lt;element name="FileName" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Days" type="{http://www.datapower.com/schemas/management}dmTimeInterval" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="PasswordAlias" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="KwkExportable" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="ExportKey" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="GenSSCert" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="ExportSSCert" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="GenObject" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="ObjectName" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="HSM" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="UsingKey" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionKeygen", propOrder = {
    "ldapOrder",
    "c",
    "st",
    "l",
    "o",
    "ou",
    "ou1",
    "ou2",
    "ou3",
    "cn",
    "keyLength",
    "fileName",
    "days",
    "password",
    "passwordAlias",
    "kwkExportable",
    "exportKey",
    "genSSCert",
    "exportSSCert",
    "genObject",
    "objectName",
    "hsm",
    "usingKey"
})
public class ActionKeygen {

    @XmlElement(name = "LDAPOrder")
    protected DmToggle ldapOrder;
    @XmlElement(name = "C")
    protected String c;
    @XmlElement(name = "ST")
    protected String st;
    @XmlElement(name = "L")
    protected String l;
    @XmlElement(name = "O")
    protected String o;
    @XmlElement(name = "OU")
    protected String ou;
    @XmlElement(name = "OU1")
    protected String ou1;
    @XmlElement(name = "OU2")
    protected String ou2;
    @XmlElement(name = "OU3")
    protected String ou3;
    @XmlElement(name = "CN", required = true)
    protected String cn;
    @XmlElement(name = "KeyLength")
    protected String keyLength;
    @XmlElement(name = "FileName")
    protected String fileName;
    @XmlElement(name = "Days")
    protected Long days;
    @XmlElement(name = "Password")
    protected String password;
    @XmlElement(name = "PasswordAlias")
    protected String passwordAlias;
    @XmlElement(name = "KwkExportable")
    protected DmToggle kwkExportable;
    @XmlElement(name = "ExportKey")
    protected DmToggle exportKey;
    @XmlElement(name = "GenSSCert")
    protected DmToggle genSSCert;
    @XmlElement(name = "ExportSSCert")
    protected DmToggle exportSSCert;
    @XmlElement(name = "GenObject")
    protected DmToggle genObject;
    @XmlElement(name = "ObjectName")
    protected String objectName;
    @XmlElement(name = "HSM")
    protected DmToggle hsm;
    @XmlElement(name = "UsingKey")
    protected String usingKey;

    /**
     * Gets the value of the ldapOrder property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getLDAPOrder() {
        return ldapOrder;
    }

    /**
     * Sets the value of the ldapOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setLDAPOrder(DmToggle value) {
        this.ldapOrder = value;
    }

    /**
     * Gets the value of the c property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getC() {
        return c;
    }

    /**
     * Sets the value of the c property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setC(String value) {
        this.c = value;
    }

    /**
     * Gets the value of the st property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getST() {
        return st;
    }

    /**
     * Sets the value of the st property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setST(String value) {
        this.st = value;
    }

    /**
     * Gets the value of the l property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getL() {
        return l;
    }

    /**
     * Sets the value of the l property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setL(String value) {
        this.l = value;
    }

    /**
     * Gets the value of the o property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getO() {
        return o;
    }

    /**
     * Sets the value of the o property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setO(String value) {
        this.o = value;
    }

    /**
     * Gets the value of the ou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOU() {
        return ou;
    }

    /**
     * Sets the value of the ou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOU(String value) {
        this.ou = value;
    }

    /**
     * Gets the value of the ou1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOU1() {
        return ou1;
    }

    /**
     * Sets the value of the ou1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOU1(String value) {
        this.ou1 = value;
    }

    /**
     * Gets the value of the ou2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOU2() {
        return ou2;
    }

    /**
     * Sets the value of the ou2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOU2(String value) {
        this.ou2 = value;
    }

    /**
     * Gets the value of the ou3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOU3() {
        return ou3;
    }

    /**
     * Sets the value of the ou3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOU3(String value) {
        this.ou3 = value;
    }

    /**
     * Gets the value of the cn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCN() {
        return cn;
    }

    /**
     * Sets the value of the cn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCN(String value) {
        this.cn = value;
    }

    /**
     * Gets the value of the keyLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyLength() {
        return keyLength;
    }

    /**
     * Sets the value of the keyLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyLength(String value) {
        this.keyLength = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the days property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDays() {
        return days;
    }

    /**
     * Sets the value of the days property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDays(Long value) {
        this.days = value;
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
     * Gets the value of the passwordAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordAlias() {
        return passwordAlias;
    }

    /**
     * Sets the value of the passwordAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordAlias(String value) {
        this.passwordAlias = value;
    }

    /**
     * Gets the value of the kwkExportable property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getKwkExportable() {
        return kwkExportable;
    }

    /**
     * Sets the value of the kwkExportable property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setKwkExportable(DmToggle value) {
        this.kwkExportable = value;
    }

    /**
     * Gets the value of the exportKey property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getExportKey() {
        return exportKey;
    }

    /**
     * Sets the value of the exportKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setExportKey(DmToggle value) {
        this.exportKey = value;
    }

    /**
     * Gets the value of the genSSCert property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getGenSSCert() {
        return genSSCert;
    }

    /**
     * Sets the value of the genSSCert property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setGenSSCert(DmToggle value) {
        this.genSSCert = value;
    }

    /**
     * Gets the value of the exportSSCert property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getExportSSCert() {
        return exportSSCert;
    }

    /**
     * Sets the value of the exportSSCert property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setExportSSCert(DmToggle value) {
        this.exportSSCert = value;
    }

    /**
     * Gets the value of the genObject property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getGenObject() {
        return genObject;
    }

    /**
     * Sets the value of the genObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setGenObject(DmToggle value) {
        this.genObject = value;
    }

    /**
     * Gets the value of the objectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * Sets the value of the objectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectName(String value) {
        this.objectName = value;
    }

    /**
     * Gets the value of the hsm property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getHSM() {
        return hsm;
    }

    /**
     * Sets the value of the hsm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setHSM(DmToggle value) {
        this.hsm = value;
    }

    /**
     * Gets the value of the usingKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsingKey() {
        return usingKey;
    }

    /**
     * Sets the value of the usingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsingKey(String value) {
        this.usingKey = value;
    }

}
