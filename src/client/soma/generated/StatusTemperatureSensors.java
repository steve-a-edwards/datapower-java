
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusTemperatureSensors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusTemperatureSensors">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.datapower.com/schemas/management}dmInt32" minOccurs="0"/>
 *         &lt;element name="UpperNonCriticalThreshold" type="{http://www.datapower.com/schemas/management}dmInt32" minOccurs="0"/>
 *         &lt;element name="UpperNonRecoverableThreshold" type="{http://www.datapower.com/schemas/management}dmInt32" minOccurs="0"/>
 *         &lt;element name="ReadingStatus" type="{http://www.datapower.com/schemas/management}dmSensorReadingStatus" minOccurs="0"/>
 *         &lt;element name="UpperCriticalThreshold" type="{http://www.datapower.com/schemas/management}dmInt32" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusTemperatureSensors", propOrder = {
    "name",
    "value",
    "upperNonCriticalThreshold",
    "upperNonRecoverableThreshold",
    "readingStatus",
    "upperCriticalThreshold"
})
public class StatusTemperatureSensors {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Value")
    protected Integer value;
    @XmlElement(name = "UpperNonCriticalThreshold")
    protected Integer upperNonCriticalThreshold;
    @XmlElement(name = "UpperNonRecoverableThreshold")
    protected Integer upperNonRecoverableThreshold;
    @XmlElement(name = "ReadingStatus")
    protected DmSensorReadingStatus readingStatus;
    @XmlElement(name = "UpperCriticalThreshold")
    protected Integer upperCriticalThreshold;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * Gets the value of the upperNonCriticalThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUpperNonCriticalThreshold() {
        return upperNonCriticalThreshold;
    }

    /**
     * Sets the value of the upperNonCriticalThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUpperNonCriticalThreshold(Integer value) {
        this.upperNonCriticalThreshold = value;
    }

    /**
     * Gets the value of the upperNonRecoverableThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUpperNonRecoverableThreshold() {
        return upperNonRecoverableThreshold;
    }

    /**
     * Sets the value of the upperNonRecoverableThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUpperNonRecoverableThreshold(Integer value) {
        this.upperNonRecoverableThreshold = value;
    }

    /**
     * Gets the value of the readingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DmSensorReadingStatus }
     *     
     */
    public DmSensorReadingStatus getReadingStatus() {
        return readingStatus;
    }

    /**
     * Sets the value of the readingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmSensorReadingStatus }
     *     
     */
    public void setReadingStatus(DmSensorReadingStatus value) {
        this.readingStatus = value;
    }

    /**
     * Gets the value of the upperCriticalThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUpperCriticalThreshold() {
        return upperCriticalThreshold;
    }

    /**
     * Sets the value of the upperCriticalThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUpperCriticalThreshold(Integer value) {
        this.upperCriticalThreshold = value;
    }

}
