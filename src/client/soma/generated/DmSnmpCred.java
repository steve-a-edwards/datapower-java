
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSnmpCred complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmSnmpCred">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EngineID" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="AuthProtocol" type="{http://www.datapower.com/schemas/management}dmSnmpAuthProtocol"/>
 *         &lt;element name="AuthSecretType" type="{http://www.datapower.com/schemas/management}dmSnmpSecretType"/>
 *         &lt;element name="AuthSecret" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="PrivProtocol" type="{http://www.datapower.com/schemas/management}dmSnmpPrivProtocol"/>
 *         &lt;element name="PrivSecretType" type="{http://www.datapower.com/schemas/management}dmSnmpSecretType"/>
 *         &lt;element name="PrivSecret" type="{http://www.datapower.com/schemas/management}dmString"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmSnmpCred", propOrder = {
    "engineID",
    "authProtocol",
    "authSecretType",
    "authSecret",
    "privProtocol",
    "privSecretType",
    "privSecret"
})
public class DmSnmpCred {

    @XmlElement(name = "EngineID", required = true)
    protected String engineID;
    @XmlElement(name = "AuthProtocol", required = true)
    protected DmSnmpAuthProtocol authProtocol;
    @XmlElement(name = "AuthSecretType", required = true, nillable = true)
    protected DmSnmpSecretType authSecretType;
    @XmlElement(name = "AuthSecret", required = true, nillable = true)
    protected String authSecret;
    @XmlElement(name = "PrivProtocol", required = true)
    protected DmSnmpPrivProtocol privProtocol;
    @XmlElement(name = "PrivSecretType", required = true, nillable = true)
    protected DmSnmpSecretType privSecretType;
    @XmlElement(name = "PrivSecret", required = true, nillable = true)
    protected String privSecret;

    /**
     * Gets the value of the engineID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineID() {
        return engineID;
    }

    /**
     * Sets the value of the engineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineID(String value) {
        this.engineID = value;
    }

    /**
     * Gets the value of the authProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link DmSnmpAuthProtocol }
     *     
     */
    public DmSnmpAuthProtocol getAuthProtocol() {
        return authProtocol;
    }

    /**
     * Sets the value of the authProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmSnmpAuthProtocol }
     *     
     */
    public void setAuthProtocol(DmSnmpAuthProtocol value) {
        this.authProtocol = value;
    }

    /**
     * Gets the value of the authSecretType property.
     * 
     * @return
     *     possible object is
     *     {@link DmSnmpSecretType }
     *     
     */
    public DmSnmpSecretType getAuthSecretType() {
        return authSecretType;
    }

    /**
     * Sets the value of the authSecretType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmSnmpSecretType }
     *     
     */
    public void setAuthSecretType(DmSnmpSecretType value) {
        this.authSecretType = value;
    }

    /**
     * Gets the value of the authSecret property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthSecret() {
        return authSecret;
    }

    /**
     * Sets the value of the authSecret property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthSecret(String value) {
        this.authSecret = value;
    }

    /**
     * Gets the value of the privProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link DmSnmpPrivProtocol }
     *     
     */
    public DmSnmpPrivProtocol getPrivProtocol() {
        return privProtocol;
    }

    /**
     * Sets the value of the privProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmSnmpPrivProtocol }
     *     
     */
    public void setPrivProtocol(DmSnmpPrivProtocol value) {
        this.privProtocol = value;
    }

    /**
     * Gets the value of the privSecretType property.
     * 
     * @return
     *     possible object is
     *     {@link DmSnmpSecretType }
     *     
     */
    public DmSnmpSecretType getPrivSecretType() {
        return privSecretType;
    }

    /**
     * Sets the value of the privSecretType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmSnmpSecretType }
     *     
     */
    public void setPrivSecretType(DmSnmpSecretType value) {
        this.privSecretType = value;
    }

    /**
     * Gets the value of the privSecret property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivSecret() {
        return privSecret;
    }

    /**
     * Sets the value of the privSecret property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivSecret(String value) {
        this.privSecret = value;
    }

}
