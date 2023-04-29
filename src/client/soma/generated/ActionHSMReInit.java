
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionHSMReInit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionHSMReInit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fips-level" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="so-password" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="user-password" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="hsm-domain" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionHSMReInit", propOrder = {
    "fipsLevel",
    "soPassword",
    "userPassword",
    "hsmDomain"
})
public class ActionHSMReInit {

    @XmlElement(name = "fips-level")
    protected String fipsLevel;
    @XmlElement(name = "so-password")
    protected String soPassword;
    @XmlElement(name = "user-password")
    protected String userPassword;
    @XmlElement(name = "hsm-domain")
    protected String hsmDomain;

    /**
     * Gets the value of the fipsLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFipsLevel() {
        return fipsLevel;
    }

    /**
     * Sets the value of the fipsLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFipsLevel(String value) {
        this.fipsLevel = value;
    }

    /**
     * Gets the value of the soPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoPassword() {
        return soPassword;
    }

    /**
     * Sets the value of the soPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoPassword(String value) {
        this.soPassword = value;
    }

    /**
     * Gets the value of the userPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * Sets the value of the userPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPassword(String value) {
        this.userPassword = value;
    }

    /**
     * Gets the value of the hsmDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHsmDomain() {
        return hsmDomain;
    }

    /**
     * Sets the value of the hsmDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHsmDomain(String value) {
        this.hsmDomain = value;
    }

}
