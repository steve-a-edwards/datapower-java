
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusDateTimeStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusDateTimeStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="time" type="{http://www.datapower.com/schemas/management}dmTimestamp" minOccurs="0"/>
 *         &lt;element name="uptime" type="{http://www.datapower.com/schemas/management}dmTimeIntervalHundredths" minOccurs="0"/>
 *         &lt;element name="timezone" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="tzspec" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="bootuptime" type="{http://www.datapower.com/schemas/management}dmTimeIntervalHundredths" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusDateTimeStatus", propOrder = {
    "time",
    "uptime",
    "timezone",
    "tzspec",
    "bootuptime"
})
public class StatusDateTimeStatus {

    protected Long time;
    protected Long uptime;
    protected String timezone;
    protected String tzspec;
    protected Long bootuptime;

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTime(Long value) {
        this.time = value;
    }

    /**
     * Gets the value of the uptime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUptime() {
        return uptime;
    }

    /**
     * Sets the value of the uptime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUptime(Long value) {
        this.uptime = value;
    }

    /**
     * Gets the value of the timezone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * Sets the value of the timezone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimezone(String value) {
        this.timezone = value;
    }

    /**
     * Gets the value of the tzspec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTzspec() {
        return tzspec;
    }

    /**
     * Sets the value of the tzspec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTzspec(String value) {
        this.tzspec = value;
    }

    /**
     * Gets the value of the bootuptime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBootuptime() {
        return bootuptime;
    }

    /**
     * Sets the value of the bootuptime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBootuptime(Long value) {
        this.bootuptime = value;
    }

}
