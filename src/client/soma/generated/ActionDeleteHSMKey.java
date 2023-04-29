
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionDeleteHSMKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionDeleteHSMKey">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyHandle" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="KeyType" type="{http://www.datapower.com/schemas/management}dmCryptoHSMKeyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionDeleteHSMKey", propOrder = {
    "keyHandle",
    "keyType"
})
public class ActionDeleteHSMKey {

    @XmlElement(name = "KeyHandle", required = true)
    protected String keyHandle;
    @XmlElement(name = "KeyType", required = true)
    protected DmCryptoHSMKeyType keyType;

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

}
