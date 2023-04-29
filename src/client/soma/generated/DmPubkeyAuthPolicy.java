
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmPubkeyAuthPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmPubkeyAuthPolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegExp" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="CryptoKey" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmPubkeyAuthPolicy", propOrder = {
    "regExp",
    "cryptoKey"
})
public class DmPubkeyAuthPolicy {

    @XmlElement(name = "RegExp", required = true)
    protected String regExp;
    @XmlElement(name = "CryptoKey", required = true)
    protected DmReference cryptoKey;

    /**
     * Gets the value of the regExp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegExp() {
        return regExp;
    }

    /**
     * Sets the value of the regExp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegExp(String value) {
        this.regExp = value;
    }

    /**
     * Gets the value of the cryptoKey property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getCryptoKey() {
        return cryptoKey;
    }

    /**
     * Sets the value of the cryptoKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setCryptoKey(DmReference value) {
        this.cryptoKey = value;
    }

}