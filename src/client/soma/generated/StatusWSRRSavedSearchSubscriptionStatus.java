
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusWSRRSavedSearchSubscriptionStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusWSRRSavedSearchSubscriptionStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Subscription" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.datapower.com/schemas/management}dmWsrrSubscriptionStatus" minOccurs="0"/>
 *         &lt;element name="LastRefresh" type="{http://www.datapower.com/schemas/management}dmTimestamp" minOccurs="0"/>
 *         &lt;element name="Method" type="{http://www.datapower.com/schemas/management}dmWsrrSynchronization" minOccurs="0"/>
 *         &lt;element name="RefreshInterval" type="{http://www.datapower.com/schemas/management}dmTimeInterval" minOccurs="0"/>
 *         &lt;element name="Count" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusWSRRSavedSearchSubscriptionStatus", propOrder = {
    "subscription",
    "status",
    "lastRefresh",
    "method",
    "refreshInterval",
    "count"
})
public class StatusWSRRSavedSearchSubscriptionStatus {

    @XmlElement(name = "Subscription")
    protected DmReference subscription;
    @XmlElement(name = "Status")
    protected DmWsrrSubscriptionStatus status;
    @XmlElement(name = "LastRefresh")
    protected Long lastRefresh;
    @XmlElement(name = "Method")
    protected DmWsrrSynchronization method;
    @XmlElement(name = "RefreshInterval")
    protected Long refreshInterval;
    @XmlElement(name = "Count")
    protected Long count;

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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link DmWsrrSubscriptionStatus }
     *     
     */
    public DmWsrrSubscriptionStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmWsrrSubscriptionStatus }
     *     
     */
    public void setStatus(DmWsrrSubscriptionStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the lastRefresh property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLastRefresh() {
        return lastRefresh;
    }

    /**
     * Sets the value of the lastRefresh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLastRefresh(Long value) {
        this.lastRefresh = value;
    }

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link DmWsrrSynchronization }
     *     
     */
    public DmWsrrSynchronization getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmWsrrSynchronization }
     *     
     */
    public void setMethod(DmWsrrSynchronization value) {
        this.method = value;
    }

    /**
     * Gets the value of the refreshInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRefreshInterval() {
        return refreshInterval;
    }

    /**
     * Sets the value of the refreshInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRefreshInterval(Long value) {
        this.refreshInterval = value;
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

}
