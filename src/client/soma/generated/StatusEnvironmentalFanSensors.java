
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusEnvironmentalFanSensors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusEnvironmentalFanSensors">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FanID" type="{http://www.datapower.com/schemas/management}dmChassisFanId" minOccurs="0"/>
 *         &lt;element name="FanSpeed" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="LowerCriticalThreshold" type="{http://www.datapower.com/schemas/management}dmInt32" minOccurs="0"/>
 *         &lt;element name="ReadingStatus" type="{http://www.datapower.com/schemas/management}dmSensorReadingStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusEnvironmentalFanSensors", propOrder = {
    "fanID",
    "fanSpeed",
    "lowerCriticalThreshold",
    "readingStatus"
})
public class StatusEnvironmentalFanSensors {

    @XmlElement(name = "FanID")
    protected DmChassisFanId fanID;
    @XmlElement(name = "FanSpeed")
    protected Integer fanSpeed;
    @XmlElement(name = "LowerCriticalThreshold")
    protected Integer lowerCriticalThreshold;
    @XmlElement(name = "ReadingStatus")
    protected DmSensorReadingStatus readingStatus;

    /**
     * Gets the value of the fanID property.
     * 
     * @return
     *     possible object is
     *     {@link DmChassisFanId }
     *     
     */
    public DmChassisFanId getFanID() {
        return fanID;
    }

    /**
     * Sets the value of the fanID property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmChassisFanId }
     *     
     */
    public void setFanID(DmChassisFanId value) {
        this.fanID = value;
    }

    /**
     * Gets the value of the fanSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFanSpeed() {
        return fanSpeed;
    }

    /**
     * Sets the value of the fanSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFanSpeed(Integer value) {
        this.fanSpeed = value;
    }

    /**
     * Gets the value of the lowerCriticalThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLowerCriticalThreshold() {
        return lowerCriticalThreshold;
    }

    /**
     * Sets the value of the lowerCriticalThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLowerCriticalThreshold(Integer value) {
        this.lowerCriticalThreshold = value;
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

}
