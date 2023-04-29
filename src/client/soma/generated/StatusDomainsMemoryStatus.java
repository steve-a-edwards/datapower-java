
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusDomainsMemoryStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusDomainsMemoryStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Domain" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="ServicesCurrent" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="ServicesOneMinute" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="ServicesFiveMinutes" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="ServicesTenMinutes" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="ServicesOneHour" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="ServicesTwelveHours" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="ServicesOneDay" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="ServicesLifetime" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="DocumentCaches" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="StylesheetCaches" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusDomainsMemoryStatus", propOrder = {
    "domain",
    "servicesCurrent",
    "servicesOneMinute",
    "servicesFiveMinutes",
    "servicesTenMinutes",
    "servicesOneHour",
    "servicesTwelveHours",
    "servicesOneDay",
    "servicesLifetime",
    "documentCaches",
    "stylesheetCaches"
})
public class StatusDomainsMemoryStatus {

    @XmlElement(name = "Domain")
    protected String domain;
    @XmlElement(name = "ServicesCurrent")
    protected Long servicesCurrent;
    @XmlElement(name = "ServicesOneMinute")
    protected Long servicesOneMinute;
    @XmlElement(name = "ServicesFiveMinutes")
    protected Long servicesFiveMinutes;
    @XmlElement(name = "ServicesTenMinutes")
    protected Long servicesTenMinutes;
    @XmlElement(name = "ServicesOneHour")
    protected Long servicesOneHour;
    @XmlElement(name = "ServicesTwelveHours")
    protected Long servicesTwelveHours;
    @XmlElement(name = "ServicesOneDay")
    protected Long servicesOneDay;
    @XmlElement(name = "ServicesLifetime")
    protected Long servicesLifetime;
    @XmlElement(name = "DocumentCaches")
    protected Long documentCaches;
    @XmlElement(name = "StylesheetCaches")
    protected Long stylesheetCaches;

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomain(String value) {
        this.domain = value;
    }

    /**
     * Gets the value of the servicesCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServicesCurrent() {
        return servicesCurrent;
    }

    /**
     * Sets the value of the servicesCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServicesCurrent(Long value) {
        this.servicesCurrent = value;
    }

    /**
     * Gets the value of the servicesOneMinute property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServicesOneMinute() {
        return servicesOneMinute;
    }

    /**
     * Sets the value of the servicesOneMinute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServicesOneMinute(Long value) {
        this.servicesOneMinute = value;
    }

    /**
     * Gets the value of the servicesFiveMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServicesFiveMinutes() {
        return servicesFiveMinutes;
    }

    /**
     * Sets the value of the servicesFiveMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServicesFiveMinutes(Long value) {
        this.servicesFiveMinutes = value;
    }

    /**
     * Gets the value of the servicesTenMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServicesTenMinutes() {
        return servicesTenMinutes;
    }

    /**
     * Sets the value of the servicesTenMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServicesTenMinutes(Long value) {
        this.servicesTenMinutes = value;
    }

    /**
     * Gets the value of the servicesOneHour property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServicesOneHour() {
        return servicesOneHour;
    }

    /**
     * Sets the value of the servicesOneHour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServicesOneHour(Long value) {
        this.servicesOneHour = value;
    }

    /**
     * Gets the value of the servicesTwelveHours property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServicesTwelveHours() {
        return servicesTwelveHours;
    }

    /**
     * Sets the value of the servicesTwelveHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServicesTwelveHours(Long value) {
        this.servicesTwelveHours = value;
    }

    /**
     * Gets the value of the servicesOneDay property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServicesOneDay() {
        return servicesOneDay;
    }

    /**
     * Sets the value of the servicesOneDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServicesOneDay(Long value) {
        this.servicesOneDay = value;
    }

    /**
     * Gets the value of the servicesLifetime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServicesLifetime() {
        return servicesLifetime;
    }

    /**
     * Sets the value of the servicesLifetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServicesLifetime(Long value) {
        this.servicesLifetime = value;
    }

    /**
     * Gets the value of the documentCaches property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDocumentCaches() {
        return documentCaches;
    }

    /**
     * Sets the value of the documentCaches property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDocumentCaches(Long value) {
        this.documentCaches = value;
    }

    /**
     * Gets the value of the stylesheetCaches property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStylesheetCaches() {
        return stylesheetCaches;
    }

    /**
     * Sets the value of the stylesheetCaches property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStylesheetCaches(Long value) {
        this.stylesheetCaches = value;
    }

}
