
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusHSMKeyStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusHSMKeyStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyHandle" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="KeyType" type="{http://www.datapower.com/schemas/management}dmCryptoHSMKeyType" minOccurs="0"/>
 *         &lt;element name="KeyLabel" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="BitLength" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="Exportable" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusHSMKeyStatus", propOrder = {
    "keyHandle",
    "keyType",
    "keyLabel",
    "bitLength",
    "exportable"
})
public class StatusHSMKeyStatus {

    @XmlElement(name = "KeyHandle")
    protected String keyHandle;
    @XmlElement(name = "KeyType")
    protected DmCryptoHSMKeyType keyType;
    @XmlElement(name = "KeyLabel")
    protected String keyLabel;
    @XmlElement(name = "BitLength")
    protected Long bitLength;
    @XmlElement(name = "Exportable")
    protected DmToggle exportable;

    /**
     * Gets the value of the keyHandle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyHandle() {
        return keyHandle;
    }

    /**
     * Sets the value of the keyHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyHandle(String value) {
        this.keyHandle = value;
    }

    /**
     * Gets the value of the keyType property.
     * 
     * @return
     *     possible object is
     *     {@link DmCryptoHSMKeyType }
     *     
     */
    public DmCryptoHSMKeyType getKeyType() {
        return keyType;
    }

    /**
     * Sets the value of the keyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmCryptoHSMKeyType }
     *     
     */
    public void setKeyType(DmCryptoHSMKeyType value) {
        this.keyType = value;
    }

    /**
     * Gets the value of the keyLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyLabel() {
        return keyLabel;
    }

    /**
     * Sets the value of the keyLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyLabel(String value) {
        this.keyLabel = value;
    }

    /**
     * Gets the value of the bitLength property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBitLength() {
        return bitLength;
    }

    /**
     * Sets the value of the bitLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBitLength(Long value) {
        this.bitLength = value;
    }

    /**
     * Gets the value of the exportable property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getExportable() {
        return exportable;
    }

    /**
     * Sets the value of the exportable property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setExportable(DmToggle value) {
        this.exportable = value;
    }

}
