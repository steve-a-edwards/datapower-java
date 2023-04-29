
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusMessageDurations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusMessageDurations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Monitor" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="Measure" type="{http://www.datapower.com/schemas/management}dmDurationMonitorType" minOccurs="0"/>
 *         &lt;element name="Count" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="Minimum" type="{http://www.datapower.com/schemas/management}dmTimeIntervalMillis" minOccurs="0"/>
 *         &lt;element name="Maximum" type="{http://www.datapower.com/schemas/management}dmTimeIntervalMillis" minOccurs="0"/>
 *         &lt;element name="Average" type="{http://www.datapower.com/schemas/management}dmTimeIntervalMillis" minOccurs="0"/>
 *         &lt;element name="tenSeconds" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="oneMinute" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="tenMinutes" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="oneHour" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="oneDay" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusMessageDurations", propOrder = {
    "monitor",
    "type",
    "measure",
    "count",
    "minimum",
    "maximum",
    "average",
    "tenSeconds",
    "oneMinute",
    "tenMinutes",
    "oneHour",
    "oneDay"
})
public class StatusMessageDurations {

    @XmlElement(name = "Monitor")
    protected DmReference monitor;
    @XmlElement(name = "Type")
    protected DmReference type;
    @XmlElement(name = "Measure")
    protected DmDurationMonitorType measure;
    @XmlElement(name = "Count")
    protected Long count;
    @XmlElement(name = "Minimum")
    protected Long minimum;
    @XmlElement(name = "Maximum")
    protected Long maximum;
    @XmlElement(name = "Average")
    protected Long average;
    protected Long tenSeconds;
    protected Long oneMinute;
    protected Long tenMinutes;
    protected Long oneHour;
    protected Long oneDay;

    /**
     * Gets the value of the monitor property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getMonitor() {
        return monitor;
    }

    /**
     * Sets the value of the monitor property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setMonitor(DmReference value) {
        this.monitor = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setType(DmReference value) {
        this.type = value;
    }

    /**
     * Gets the value of the measure property.
     * 
     * @return
     *     possible object is
     *     {@link DmDurationMonitorType }
     *     
     */
    public DmDurationMonitorType getMeasure() {
        return measure;
    }

    /**
     * Sets the value of the measure property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmDurationMonitorType }
     *     
     */
    public void setMeasure(DmDurationMonitorType value) {
        this.measure = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCount(Long value) {
        this.count = value;
    }

    /**
     * Gets the value of the minimum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMinimum() {
        return minimum;
    }

    /**
     * Sets the value of the minimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMinimum(Long value) {
        this.minimum = value;
    }

    /**
     * Gets the value of the maximum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaximum() {
        return maximum;
    }

    /**
     * Sets the value of the maximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaximum(Long value) {
        this.maximum = value;
    }

    /**
     * Gets the value of the average property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAverage() {
        return average;
    }

    /**
     * Sets the value of the average property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAverage(Long value) {
        this.average = value;
    }

    /**
     * Gets the value of the tenSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTenSeconds() {
        return tenSeconds;
    }

    /**
     * Sets the value of the tenSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTenSeconds(Long value) {
        this.tenSeconds = value;
    }

    /**
     * Gets the value of the oneMinute property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOneMinute() {
        return oneMinute;
    }

    /**
     * Sets the value of the oneMinute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOneMinute(Long value) {
        this.oneMinute = value;
    }

    /**
     * Gets the value of the tenMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTenMinutes() {
        return tenMinutes;
    }

    /**
     * Sets the value of the tenMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTenMinutes(Long value) {
        this.tenMinutes = value;
    }

    /**
     * Gets the value of the oneHour property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOneHour() {
        return oneHour;
    }

    /**
     * Sets the value of the oneHour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOneHour(Long value) {
        this.oneHour = value;
    }

    /**
     * Gets the value of the oneDay property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOneDay() {
        return oneDay;
    }

    /**
     * Sets the value of the oneDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOneDay(Long value) {
        this.oneDay = value;
    }

}
