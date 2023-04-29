
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusIPMISelEvents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusIPMISelEvents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Index" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="Timestamp" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="RecordType" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="SensorType" type="{http://www.datapower.com/schemas/management}dmIPMISensorTypeCode" minOccurs="0"/>
 *         &lt;element name="SensorNumber" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="SensorName" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="EventReadingTypeCode" type="{http://www.datapower.com/schemas/management}dmIPMISensorEventReadingTypeCode" minOccurs="0"/>
 *         &lt;element name="EventData2" type="{http://www.datapower.com/schemas/management}dmIPMISensorEventData2" minOccurs="0"/>
 *         &lt;element name="EventDirection" type="{http://www.datapower.com/schemas/management}dmIPMISensorEventDir" minOccurs="0"/>
 *         &lt;element name="Extra" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusIPMISelEvents", propOrder = {
    "index",
    "timestamp",
    "recordType",
    "sensorType",
    "sensorNumber",
    "sensorName",
    "eventReadingTypeCode",
    "eventData2",
    "eventDirection",
    "extra"
})
public class StatusIPMISelEvents {

    @XmlElement(name = "Index")
    protected Long index;
    @XmlElement(name = "Timestamp")
    protected String timestamp;
    @XmlElement(name = "RecordType")
    protected Integer recordType;
    @XmlElement(name = "SensorType")
    protected DmIPMISensorTypeCode sensorType;
    @XmlElement(name = "SensorNumber")
    protected Integer sensorNumber;
    @XmlElement(name = "SensorName")
    protected String sensorName;
    @XmlElement(name = "EventReadingTypeCode")
    protected DmIPMISensorEventReadingTypeCode eventReadingTypeCode;
    @XmlElement(name = "EventData2")
    protected DmIPMISensorEventData2 eventData2;
    @XmlElement(name = "EventDirection")
    protected DmIPMISensorEventDir eventDirection;
    @XmlElement(name = "Extra")
    protected String extra;

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIndex(Long value) {
        this.index = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestamp(String value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the recordType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecordType() {
        return recordType;
    }

    /**
     * Sets the value of the recordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecordType(Integer value) {
        this.recordType = value;
    }

    /**
     * Gets the value of the sensorType property.
     * 
     * @return
     *     possible object is
     *     {@link DmIPMISensorTypeCode }
     *     
     */
    public DmIPMISensorTypeCode getSensorType() {
        return sensorType;
    }

    /**
     * Sets the value of the sensorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmIPMISensorTypeCode }
     *     
     */
    public void setSensorType(DmIPMISensorTypeCode value) {
        this.sensorType = value;
    }

    /**
     * Gets the value of the sensorNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSensorNumber() {
        return sensorNumber;
    }

    /**
     * Sets the value of the sensorNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSensorNumber(Integer value) {
        this.sensorNumber = value;
    }

    /**
     * Gets the value of the sensorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSensorName() {
        return sensorName;
    }

    /**
     * Sets the value of the sensorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSensorName(String value) {
        this.sensorName = value;
    }

    /**
     * Gets the value of the eventReadingTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link DmIPMISensorEventReadingTypeCode }
     *     
     */
    public DmIPMISensorEventReadingTypeCode getEventReadingTypeCode() {
        return eventReadingTypeCode;
    }

    /**
     * Sets the value of the eventReadingTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmIPMISensorEventReadingTypeCode }
     *     
     */
    public void setEventReadingTypeCode(DmIPMISensorEventReadingTypeCode value) {
        this.eventReadingTypeCode = value;
    }

    /**
     * Gets the value of the eventData2 property.
     * 
     * @return
     *     possible object is
     *     {@link DmIPMISensorEventData2 }
     *     
     */
    public DmIPMISensorEventData2 getEventData2() {
        return eventData2;
    }

    /**
     * Sets the value of the eventData2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmIPMISensorEventData2 }
     *     
     */
    public void setEventData2(DmIPMISensorEventData2 value) {
        this.eventData2 = value;
    }

    /**
     * Gets the value of the eventDirection property.
     * 
     * @return
     *     possible object is
     *     {@link DmIPMISensorEventDir }
     *     
     */
    public DmIPMISensorEventDir getEventDirection() {
        return eventDirection;
    }

    /**
     * Sets the value of the eventDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmIPMISensorEventDir }
     *     
     */
    public void setEventDirection(DmIPMISensorEventDir value) {
        this.eventDirection = value;
    }

    /**
     * Gets the value of the extra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtra() {
        return extra;
    }

    /**
     * Sets the value of the extra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtra(String value) {
        this.extra = value;
    }

}
