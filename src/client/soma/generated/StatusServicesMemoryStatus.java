
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusServicesMemoryStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusServicesMemoryStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceClass" type="{http://www.datapower.com/schemas/management}dmHTTPProxyClass" minOccurs="0"/>
 *         &lt;element name="serviceName" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="current" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="oneMinute" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="fiveMinutes" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="tenMinutes" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="oneHour" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="twelveHours" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="oneDay" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="lifetime" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusServicesMemoryStatus", propOrder = {
    "serviceClass",
    "serviceName",
    "current",
    "oneMinute",
    "fiveMinutes",
    "tenMinutes",
    "oneHour",
    "twelveHours",
    "oneDay",
    "lifetime"
})
public class StatusServicesMemoryStatus {

    protected DmHTTPProxyClass serviceClass;
    protected String serviceName;
    protected Long current;
    protected Long oneMinute;
    protected Long fiveMinutes;
    protected Long tenMinutes;
    protected Long oneHour;
    protected Long twelveHours;
    protected Long oneDay;
    protected Long lifetime;

    /**
     * Gets the value of the serviceClass property.
     * 
     * @return
     *     possible object is
     *     {@link DmHTTPProxyClass }
     *     
     */
    public DmHTTPProxyClass getServiceClass() {
        return serviceClass;
    }

    /**
     * Sets the value of the serviceClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmHTTPProxyClass }
     *     
     */
    public void setServiceClass(DmHTTPProxyClass value) {
        this.serviceClass = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the current property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrent() {
        return current;
    }

    /**
     * Sets the value of the current property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrent(Long value) {
        this.current = value;
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
     * Gets the value of the fiveMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFiveMinutes() {
        return fiveMinutes;
    }

    /**
     * Sets the value of the fiveMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFiveMinutes(Long value) {
        this.fiveMinutes = value;
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
     * Gets the value of the twelveHours property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTwelveHours() {
        return twelveHours;
    }

    /**
     * Sets the value of the twelveHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTwelveHours(Long value) {
        this.twelveHours = value;
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

    /**
     * Gets the value of the lifetime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLifetime() {
        return lifetime;
    }

    /**
     * Sets the value of the lifetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLifetime(Long value) {
        this.lifetime = value;
    }

}
