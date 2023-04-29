
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusUDDISubscriptionKeyStatusSimpleIndex complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusUDDISubscriptionKeyStatusSimpleIndex">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Subscription" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="SubscriptionKey" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.datapower.com/schemas/management}dmUDDISubSubscriptionStatus" minOccurs="0"/>
 *         &lt;element name="LastCoverageStart" type="{http://www.datapower.com/schemas/management}dmTimestamp" minOccurs="0"/>
 *         &lt;element name="LastCoverageEnd" type="{http://www.datapower.com/schemas/management}dmTimestamp" minOccurs="0"/>
 *         &lt;element name="LastRequest" type="{http://www.datapower.com/schemas/management}dmTimestamp" minOccurs="0"/>
 *         &lt;element name="NotifyInterval" type="{http://www.datapower.com/schemas/management}dmTimeInterval" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusUDDISubscriptionKeyStatusSimpleIndex", propOrder = {
    "subscription",
    "subscriptionKey",
    "status",
    "lastCoverageStart",
    "lastCoverageEnd",
    "lastRequest",
    "notifyInterval"
})
public class StatusUDDISubscriptionKeyStatusSimpleIndex {

    @XmlElement(name = "Subscription")
    protected DmReference subscription;
    @XmlElement(name = "SubscriptionKey")
    protected String subscriptionKey;
    @XmlElement(name = "Status")
    protected DmUDDISubSubscriptionStatus status;
    @XmlElement(name = "LastCoverageStart")
    protected Long lastCoverageStart;
    @XmlElement(name = "LastCoverageEnd")
    protected Long lastCoverageEnd;
    @XmlElement(name = "LastRequest")
    protected Long lastRequest;
    @XmlElement(name = "NotifyInterval")
    protected Long notifyInterval;

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
     * Gets the value of the subscriptionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionKey() {
        return subscriptionKey;
    }

    /**
     * Sets the value of the subscriptionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionKey(String value) {
        this.subscriptionKey = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link DmUDDISubSubscriptionStatus }
     *     
     */
    public DmUDDISubSubscriptionStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmUDDISubSubscriptionStatus }
     *     
     */
    public void setStatus(DmUDDISubSubscriptionStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the lastCoverageStart property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLastCoverageStart() {
        return lastCoverageStart;
    }

    /**
     * Sets the value of the lastCoverageStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLastCoverageStart(Long value) {
        this.lastCoverageStart = value;
    }

    /**
     * Gets the value of the lastCoverageEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLastCoverageEnd() {
        return lastCoverageEnd;
    }

    /**
     * Sets the value of the lastCoverageEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLastCoverageEnd(Long value) {
        this.lastCoverageEnd = value;
    }

    /**
     * Gets the value of the lastRequest property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLastRequest() {
        return lastRequest;
    }

    /**
     * Sets the value of the lastRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLastRequest(Long value) {
        this.lastRequest = value;
    }

    /**
     * Gets the value of the notifyInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNotifyInterval() {
        return notifyInterval;
    }

    /**
     * Sets the value of the notifyInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNotifyInterval(Long value) {
        this.notifyInterval = value;
    }

}
