
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusUDDISubscriptionStatusSimpleIndex complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusUDDISubscriptionStatusSimpleIndex">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Subscription" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="ServicesStatus" type="{http://www.datapower.com/schemas/management}dmUDDISubServiceStatus" minOccurs="0"/>
 *         &lt;element name="SubscriptionStatus" type="{http://www.datapower.com/schemas/management}dmUDDISubSubscriptionStatus" minOccurs="0"/>
 *         &lt;element name="Services" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="ServicesAdded" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="ServicesDeleted" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="ServicesModified" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusUDDISubscriptionStatusSimpleIndex", propOrder = {
    "subscription",
    "servicesStatus",
    "subscriptionStatus",
    "services",
    "servicesAdded",
    "servicesDeleted",
    "servicesModified"
})
public class StatusUDDISubscriptionStatusSimpleIndex {

    @XmlElement(name = "Subscription")
    protected DmReference subscription;
    @XmlElement(name = "ServicesStatus")
    protected DmUDDISubServiceStatus servicesStatus;
    @XmlElement(name = "SubscriptionStatus")
    protected DmUDDISubSubscriptionStatus subscriptionStatus;
    @XmlElement(name = "Services")
    protected Long services;
    @XmlElement(name = "ServicesAdded")
    protected Long servicesAdded;
    @XmlElement(name = "ServicesDeleted")
    protected Long servicesDeleted;
    @XmlElement(name = "ServicesModified")
    protected Long servicesModified;

    /**
     * Gets the value of the subscription property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getSubscription() {
        return subscription;
    }

    /**
     * Sets the value of the subscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setSubscription(DmReference value) {
        this.subscription = value;
    }

    /**
     * Gets the value of the servicesStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DmUDDISubServiceStatus }
     *     
     */
    public DmUDDISubServiceStatus getServicesStatus() {
        return servicesStatus;
    }

    /**
     * Sets the value of the servicesStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmUDDISubServiceStatus }
     *     
     */
    public void setServicesStatus(DmUDDISubServiceStatus value) {
        this.servicesStatus = value;
    }

    /**
     * Gets the value of the subscriptionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DmUDDISubSubscriptionStatus }
     *     
     */
    public DmUDDISubSubscriptionStatus getSubscriptionStatus() {
        return subscriptionStatus;
    }

    /**
     * Sets the value of the subscriptionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmUDDISubSubscriptionStatus }
     *     
     */
    public void setSubscriptionStatus(DmUDDISubSubscriptionStatus value) {
        this.subscriptionStatus = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServices(Long value) {
        this.services = value;
    }

    /**
     * Gets the value of the servicesAdded property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServicesAdded() {
        return servicesAdded;
    }

    /**
     * Sets the value of the servicesAdded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServicesAdded(Long value) {
        this.servicesAdded = value;
    }

    /**
     * Gets the value of the servicesDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServicesDeleted() {
        return servicesDeleted;
    }

    /**
     * Sets the value of the servicesDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServicesDeleted(Long value) {
        this.servicesDeleted = value;
    }

    /**
     * Gets the value of the servicesModified property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServicesModified() {
        return servicesModified;
    }

    /**
     * Sets the value of the servicesModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServicesModified(Long value) {
        this.servicesModified = value;
    }

}
