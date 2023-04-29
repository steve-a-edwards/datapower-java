
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusCryptoEngineStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusCryptoEngineStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EngineType" type="{http://www.datapower.com/schemas/management}dmCryptoEngineType" minOccurs="0"/>
 *         &lt;element name="EngineStatus" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="FIPSLevel" type="{http://www.datapower.com/schemas/management}dmCryptoEngineFIPSLevel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusCryptoEngineStatus", propOrder = {
    "engineType",
    "engineStatus",
    "fipsLevel"
})
public class StatusCryptoEngineStatus {

    @XmlElement(name = "EngineType")
    protected DmCryptoEngineType engineType;
    @XmlElement(name = "EngineStatus")
    protected String engineStatus;
    @XmlElement(name = "FIPSLevel")
    protected String fipsLevel;

    /**
     * Gets the value of the engineType property.
     * 
     * @return
     *     possible object is
     *     {@link DmCryptoEngineType }
     *     
     */
    public DmCryptoEngineType getEngineType() {
        return engineType;
    }

    /**
     * Sets the value of the engineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmCryptoEngineType }
     *     
     */
    public void setEngineType(DmCryptoEngineType value) {
        this.engineType = value;
    }

    /**
     * Gets the value of the engineStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineStatus() {
        return engineStatus;
    }

    /**
     * Sets the value of the engineStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineStatus(String value) {
        this.engineStatus = value;
    }

    /**
     * Gets the value of the fipsLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIPSLevel() {
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
    public void setFIPSLevel(String value) {
        this.fipsLevel = value;
    }

}
