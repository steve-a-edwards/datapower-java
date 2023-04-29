
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmDPSpecificFeatures complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmDPSpecificFeatures">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="use-dynamic-enccert" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="verify-check-timestamp-off" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="decrypt-preserve-key-chain" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="disable-ssl-cipher-check" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="enable-verbose-error" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="disable-saml-validation" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmDPSpecificFeatures", propOrder = {

})
public class DmDPSpecificFeatures {

    @XmlElement(name = "use-dynamic-enccert")
    protected DmToggle useDynamicEnccert;
    @XmlElement(name = "verify-check-timestamp-off")
    protected DmToggle verifyCheckTimestampOff;
    @XmlElement(name = "decrypt-preserve-key-chain")
    protected DmToggle decryptPreserveKeyChain;
    @XmlElement(name = "disable-ssl-cipher-check")
    protected DmToggle disableSslCipherCheck;
    @XmlElement(name = "enable-verbose-error")
    protected DmToggle enableVerboseError;
    @XmlElement(name = "disable-saml-validation")
    protected DmToggle disableSamlValidation;

    /**
     * Gets the value of the useDynamicEnccert property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getUseDynamicEnccert() {
        return useDynamicEnccert;
    }

    /**
     * Sets the value of the useDynamicEnccert property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setUseDynamicEnccert(DmToggle value) {
        this.useDynamicEnccert = value;
    }

    /**
     * Gets the value of the verifyCheckTimestampOff property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getVerifyCheckTimestampOff() {
        return verifyCheckTimestampOff;
    }

    /**
     * Sets the value of the verifyCheckTimestampOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setVerifyCheckTimestampOff(DmToggle value) {
        this.verifyCheckTimestampOff = value;
    }

    /**
     * Gets the value of the decryptPreserveKeyChain property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getDecryptPreserveKeyChain() {
        return decryptPreserveKeyChain;
    }

    /**
     * Sets the value of the decryptPreserveKeyChain property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setDecryptPreserveKeyChain(DmToggle value) {
        this.decryptPreserveKeyChain = value;
    }

    /**
     * Gets the value of the disableSslCipherCheck property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getDisableSslCipherCheck() {
        return disableSslCipherCheck;
    }

    /**
     * Sets the value of the disableSslCipherCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setDisableSslCipherCheck(DmToggle value) {
        this.disableSslCipherCheck = value;
    }

    /**
     * Gets the value of the enableVerboseError property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getEnableVerboseError() {
        return enableVerboseError;
    }

    /**
     * Sets the value of the enableVerboseError property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setEnableVerboseError(DmToggle value) {
        this.enableVerboseError = value;
    }

    /**
     * Gets the value of the disableSamlValidation property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getDisableSamlValidation() {
        return disableSamlValidation;
    }

    /**
     * Sets the value of the disableSamlValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setDisableSamlValidation(DmToggle value) {
        this.disableSamlValidation = value;
    }

}
