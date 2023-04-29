
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusRaidBatteryBackUpStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusRaidBatteryBackUpStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ControllerID" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="BatteryType" type="{http://www.datapower.com/schemas/management}dmRaidBBUBatteryType" minOccurs="0"/>
 *         &lt;element name="Serial" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.datapower.com/schemas/management}dmRaidBBUStatus" minOccurs="0"/>
 *         &lt;element name="Voltage" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="Current" type="{http://www.datapower.com/schemas/management}dmInt32" minOccurs="0"/>
 *         &lt;element name="Temperature" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="DesignCapacity" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="DesignVoltage" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="RemainingCapacity" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="FullChargeCapacity" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="RunTimeToEmpty" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="AvgTimeToEmpty" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="AvgTimeToFull" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="CycleCount" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="RemainingCapacityAlarm" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="RemainingTimeAlarm" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusRaidBatteryBackUpStatus", propOrder = {
    "controllerID",
    "batteryType",
    "serial",
    "name",
    "status",
    "voltage",
    "current",
    "temperature",
    "designCapacity",
    "designVoltage",
    "remainingCapacity",
    "fullChargeCapacity",
    "runTimeToEmpty",
    "avgTimeToEmpty",
    "avgTimeToFull",
    "cycleCount",
    "remainingCapacityAlarm",
    "remainingTimeAlarm"
})
public class StatusRaidBatteryBackUpStatus {

    @XmlElement(name = "ControllerID")
    protected Long controllerID;
    @XmlElement(name = "BatteryType")
    protected DmRaidBBUBatteryType batteryType;
    @XmlElement(name = "Serial")
    protected Long serial;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Status")
    protected DmRaidBBUStatus status;
    @XmlElement(name = "Voltage")
    protected Long voltage;
    @XmlElement(name = "Current")
    protected Integer current;
    @XmlElement(name = "Temperature")
    protected Long temperature;
    @XmlElement(name = "DesignCapacity")
    protected Long designCapacity;
    @XmlElement(name = "DesignVoltage")
    protected Long designVoltage;
    @XmlElement(name = "RemainingCapacity")
    protected Long remainingCapacity;
    @XmlElement(name = "FullChargeCapacity")
    protected Long fullChargeCapacity;
    @XmlElement(name = "RunTimeToEmpty")
    protected Long runTimeToEmpty;
    @XmlElement(name = "AvgTimeToEmpty")
    protected Long avgTimeToEmpty;
    @XmlElement(name = "AvgTimeToFull")
    protected Long avgTimeToFull;
    @XmlElement(name = "CycleCount")
    protected Long cycleCount;
    @XmlElement(name = "RemainingCapacityAlarm")
    protected Long remainingCapacityAlarm;
    @XmlElement(name = "RemainingTimeAlarm")
    protected Long remainingTimeAlarm;

    /**
     * Gets the value of the controllerID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getControllerID() {
        return controllerID;
    }

    /**
     * Sets the value of the controllerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setControllerID(Long value) {
        this.controllerID = value;
    }

    /**
     * Gets the value of the batteryType property.
     * 
     * @return
     *     possible object is
     *     {@link DmRaidBBUBatteryType }
     *     
     */
    public DmRaidBBUBatteryType getBatteryType() {
        return batteryType;
    }

    /**
     * Sets the value of the batteryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmRaidBBUBatteryType }
     *     
     */
    public void setBatteryType(DmRaidBBUBatteryType value) {
        this.batteryType = value;
    }

    /**
     * Gets the value of the serial property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSerial() {
        return serial;
    }

    /**
     * Sets the value of the serial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSerial(Long value) {
        this.serial = value;
    }

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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link DmRaidBBUStatus }
     *     
     */
    public DmRaidBBUStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmRaidBBUStatus }
     *     
     */
    public void setStatus(DmRaidBBUStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the voltage property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVoltage() {
        return voltage;
    }

    /**
     * Sets the value of the voltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVoltage(Long value) {
        this.voltage = value;
    }

    /**
     * Gets the value of the current property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrent() {
        return current;
    }

    /**
     * Sets the value of the current property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrent(Integer value) {
        this.current = value;
    }

    /**
     * Gets the value of the temperature property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTemperature() {
        return temperature;
    }

    /**
     * Sets the value of the temperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTemperature(Long value) {
        this.temperature = value;
    }

    /**
     * Gets the value of the designCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDesignCapacity() {
        return designCapacity;
    }

    /**
     * Sets the value of the designCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDesignCapacity(Long value) {
        this.designCapacity = value;
    }

    /**
     * Gets the value of the designVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDesignVoltage() {
        return designVoltage;
    }

    /**
     * Sets the value of the designVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDesignVoltage(Long value) {
        this.designVoltage = value;
    }

    /**
     * Gets the value of the remainingCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRemainingCapacity() {
        return remainingCapacity;
    }

    /**
     * Sets the value of the remainingCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRemainingCapacity(Long value) {
        this.remainingCapacity = value;
    }

    /**
     * Gets the value of the fullChargeCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFullChargeCapacity() {
        return fullChargeCapacity;
    }

    /**
     * Sets the value of the fullChargeCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFullChargeCapacity(Long value) {
        this.fullChargeCapacity = value;
    }

    /**
     * Gets the value of the runTimeToEmpty property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRunTimeToEmpty() {
        return runTimeToEmpty;
    }

    /**
     * Sets the value of the runTimeToEmpty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRunTimeToEmpty(Long value) {
        this.runTimeToEmpty = value;
    }

    /**
     * Gets the value of the avgTimeToEmpty property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAvgTimeToEmpty() {
        return avgTimeToEmpty;
    }

    /**
     * Sets the value of the avgTimeToEmpty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAvgTimeToEmpty(Long value) {
        this.avgTimeToEmpty = value;
    }

    /**
     * Gets the value of the avgTimeToFull property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAvgTimeToFull() {
        return avgTimeToFull;
    }

    /**
     * Sets the value of the avgTimeToFull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAvgTimeToFull(Long value) {
        this.avgTimeToFull = value;
    }

    /**
     * Gets the value of the cycleCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCycleCount() {
        return cycleCount;
    }

    /**
     * Sets the value of the cycleCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCycleCount(Long value) {
        this.cycleCount = value;
    }

    /**
     * Gets the value of the remainingCapacityAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRemainingCapacityAlarm() {
        return remainingCapacityAlarm;
    }

    /**
     * Sets the value of the remainingCapacityAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRemainingCapacityAlarm(Long value) {
        this.remainingCapacityAlarm = value;
    }

    /**
     * Gets the value of the remainingTimeAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRemainingTimeAlarm() {
        return remainingTimeAlarm;
    }

    /**
     * Sets the value of the remainingTimeAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRemainingTimeAlarm(Long value) {
        this.remainingTimeAlarm = value;
    }

}
