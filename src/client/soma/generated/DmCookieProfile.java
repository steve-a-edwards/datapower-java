
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmCookieProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmCookieProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CookiePolicy" type="{http://www.datapower.com/schemas/management}dmARDType"/>
 *         &lt;element name="Type" type="{http://www.datapower.com/schemas/management}dmCookieProcessingType"/>
 *         &lt;element name="Key" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="IPinWatermark" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="CookieGNVC" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="UseSharedSecretObject" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmCookieProfile", propOrder = {
    "cookiePolicy",
    "type",
    "key",
    "iPinWatermark",
    "cookieGNVC",
    "useSharedSecretObject"
})
public class DmCookieProfile {

    @XmlElement(name = "CookiePolicy", required = true, nillable = true)
    protected DmARDType cookiePolicy;
    @XmlElement(name = "Type", required = true, nillable = true)
    protected DmCookieProcessingType type;
    @XmlElement(name = "Key", required = true, nillable = true)
    protected String key;
    @XmlElement(name = "IPinWatermark", required = true, nillable = true)
    protected DmToggle iPinWatermark;
    @XmlElement(name = "CookieGNVC", required = true, nillable = true)
    protected DmReference cookieGNVC;
    @XmlElement(name = "UseSharedSecretObject", required = true, nillable = true)
    protected DmToggle useSharedSecretObject;

    /**
     * Gets the value of the cookiePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link DmARDType }
     *     
     */
    public DmARDType getCookiePolicy() {
        return cookiePolicy;
    }

    /**
     * Sets the value of the cookiePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmARDType }
     *     
     */
    public void setCookiePolicy(DmARDType value) {
        this.cookiePolicy = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link DmCookieProcessingType }
     *     
     */
    public DmCookieProcessingType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmCookieProcessingType }
     *     
     */
    public void setType(DmCookieProcessingType value) {
        this.type = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the iPinWatermark property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getIPinWatermark() {
        return iPinWatermark;
    }

    /**
     * Sets the value of the iPinWatermark property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setIPinWatermark(DmToggle value) {
        this.iPinWatermark = value;
    }

    /**
     * Gets the value of the cookieGNVC property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getCookieGNVC() {
        return cookieGNVC;
    }

    /**
     * Sets the value of the cookieGNVC property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setCookieGNVC(DmReference value) {
        this.cookieGNVC = value;
    }

    /**
     * Gets the value of the useSharedSecretObject property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getUseSharedSecretObject() {
        return useSharedSecretObject;
    }

    /**
     * Sets the value of the useSharedSecretObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setUseSharedSecretObject(DmToggle value) {
        this.useSharedSecretObject = value;
    }

}
