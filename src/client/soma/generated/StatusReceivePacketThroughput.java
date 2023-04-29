
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusReceivePacketThroughput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusReceivePacketThroughput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Interface" type="{http://www.datapower.com/schemas/management}dmPortName" minOccurs="0"/>
 *         &lt;element name="tenSeconds" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="oneMinute" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="tenMinutes" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="oneHour" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="oneDay" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusReceivePacketThroughput", propOrder = {
    "_interface",
    "tenSeconds",
    "oneMinute",
    "tenMinutes",
    "oneHour",
    "oneDay"
})
public class StatusReceivePacketThroughput {

    @XmlElement(name = "Interface")
    protected DmPortName _interface;
    protected Long tenSeconds;
    protected Long oneMinute;
    protected Long tenMinutes;
    protected Long oneHour;
    protected Long oneDay;

    /**
     * Gets the value of the interface property.
     * 
     * @return
     *     possible object is
     *     {@link DmPortName }
     *     
     */
    public DmPortName getInterface() {
        return _interface;
    }

    /**
     * Sets the value of the interface property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmPortName }
     *     
     */
    public void setInterface(DmPortName value) {
        this._interface = value;
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
