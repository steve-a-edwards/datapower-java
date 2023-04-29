
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmTAMRASTrace complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmTAMRASTrace">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TAMTraceEnable" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="TAMTraceFile" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="TAMTraceSize" type="{http://www.datapower.com/schemas/management}dmUInt32"/>
 *         &lt;element name="TAMTraceType" type="{http://www.datapower.com/schemas/management}dmTraceFileType"/>
 *         &lt;element name="TAMTraceComponents" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="LDAPTraceEnable" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="LDAPTraceFile" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="LDAPTraceSize" type="{http://www.datapower.com/schemas/management}dmUInt32"/>
 *         &lt;element name="LDAPTraceLevel" type="{http://www.datapower.com/schemas/management}dmUInt32"/>
 *         &lt;element name="GSKitTraceEnable" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="GSKitTraceFile" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="GSKitTraceFlush" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmTAMRASTrace", propOrder = {
    "tamTraceEnable",
    "tamTraceFile",
    "tamTraceSize",
    "tamTraceType",
    "tamTraceComponents",
    "ldapTraceEnable",
    "ldapTraceFile",
    "ldapTraceSize",
    "ldapTraceLevel",
    "gsKitTraceEnable",
    "gsKitTraceFile",
    "gsKitTraceFlush"
})
public class DmTAMRASTrace {

    @XmlElement(name = "TAMTraceEnable", required = true)
    protected DmToggle tamTraceEnable;
    @XmlElement(name = "TAMTraceFile", required = true, nillable = true)
    protected String tamTraceFile;
    @XmlElement(name = "TAMTraceSize", required = true, type = Long.class, nillable = true)
    protected Long tamTraceSize;
    @XmlElement(name = "TAMTraceType", required = true, nillable = true)
    protected DmTraceFileType tamTraceType;
    @XmlElement(name = "TAMTraceComponents", required = true, nillable = true)
    protected String tamTraceComponents;
    @XmlElement(name = "LDAPTraceEnable", required = true)
    protected DmToggle ldapTraceEnable;
    @XmlElement(name = "LDAPTraceFile", required = true, nillable = true)
    protected String ldapTraceFile;
    @XmlElement(name = "LDAPTraceSize", required = true, type = Long.class, nillable = true)
    protected Long ldapTraceSize;
    @XmlElement(name = "LDAPTraceLevel", required = true, type = Long.class, nillable = true)
    protected Long ldapTraceLevel;
    @XmlElement(name = "GSKitTraceEnable", required = true)
    protected DmToggle gsKitTraceEnable;
    @XmlElement(name = "GSKitTraceFile", required = true, nillable = true)
    protected String gsKitTraceFile;
    @XmlElement(name = "GSKitTraceFlush", required = true, nillable = true)
    protected DmToggle gsKitTraceFlush;

    /**
     * Gets the value of the tamTraceEnable property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getTAMTraceEnable() {
        return tamTraceEnable;
    }

    /**
     * Sets the value of the tamTraceEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setTAMTraceEnable(DmToggle value) {
        this.tamTraceEnable = value;
    }

    /**
     * Gets the value of the tamTraceFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAMTraceFile() {
        return tamTraceFile;
    }

    /**
     * Sets the value of the tamTraceFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAMTraceFile(String value) {
        this.tamTraceFile = value;
    }

    /**
     * Gets the value of the tamTraceSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTAMTraceSize() {
        return tamTraceSize;
    }

    /**
     * Sets the value of the tamTraceSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTAMTraceSize(Long value) {
        this.tamTraceSize = value;
    }

    /**
     * Gets the value of the tamTraceType property.
     * 
     * @return
     *     possible object is
     *     {@link DmTraceFileType }
     *     
     */
    public DmTraceFileType getTAMTraceType() {
        return tamTraceType;
    }

    /**
     * Sets the value of the tamTraceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmTraceFileType }
     *     
     */
    public void setTAMTraceType(DmTraceFileType value) {
        this.tamTraceType = value;
    }

    /**
     * Gets the value of the tamTraceComponents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAMTraceComponents() {
        return tamTraceComponents;
    }

    /**
     * Sets the value of the tamTraceComponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAMTraceComponents(String value) {
        this.tamTraceComponents = value;
    }

    /**
     * Gets the value of the ldapTraceEnable property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getLDAPTraceEnable() {
        return ldapTraceEnable;
    }

    /**
     * Sets the value of the ldapTraceEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setLDAPTraceEnable(DmToggle value) {
        this.ldapTraceEnable = value;
    }

    /**
     * Gets the value of the ldapTraceFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLDAPTraceFile() {
        return ldapTraceFile;
    }

    /**
     * Sets the value of the ldapTraceFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLDAPTraceFile(String value) {
        this.ldapTraceFile = value;
    }

    /**
     * Gets the value of the ldapTraceSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLDAPTraceSize() {
        return ldapTraceSize;
    }

    /**
     * Sets the value of the ldapTraceSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLDAPTraceSize(Long value) {
        this.ldapTraceSize = value;
    }

    /**
     * Gets the value of the ldapTraceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLDAPTraceLevel() {
        return ldapTraceLevel;
    }

    /**
     * Sets the value of the ldapTraceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLDAPTraceLevel(Long value) {
        this.ldapTraceLevel = value;
    }

    /**
     * Gets the value of the gsKitTraceEnable property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getGSKitTraceEnable() {
        return gsKitTraceEnable;
    }

    /**
     * Sets the value of the gsKitTraceEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setGSKitTraceEnable(DmToggle value) {
        this.gsKitTraceEnable = value;
    }

    /**
     * Gets the value of the gsKitTraceFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGSKitTraceFile() {
        return gsKitTraceFile;
    }

    /**
     * Sets the value of the gsKitTraceFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGSKitTraceFile(String value) {
        this.gsKitTraceFile = value;
    }

    /**
     * Gets the value of the gsKitTraceFlush property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getGSKitTraceFlush() {
        return gsKitTraceFlush;
    }

    /**
     * Sets the value of the gsKitTraceFlush property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setGSKitTraceFlush(DmToggle value) {
        this.gsKitTraceFlush = value;
    }

}
