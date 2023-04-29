
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusSLMSummaryStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusSLMSummaryStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SLMPolicy" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="SLMId" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="Messages" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="Errors" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="Throttled" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="Average" type="{http://www.datapower.com/schemas/management}dmTimeIntervalMillis" minOccurs="0"/>
 *         &lt;element name="Minimum" type="{http://www.datapower.com/schemas/management}dmTimeIntervalMillis" minOccurs="0"/>
 *         &lt;element name="Maximum" type="{http://www.datapower.com/schemas/management}dmTimeIntervalMillis" minOccurs="0"/>
 *         &lt;element name="TotalMessages" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="TotalErrors" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="TotalThrottled" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="TotalAverage" type="{http://www.datapower.com/schemas/management}dmTimeIntervalMillis" minOccurs="0"/>
 *         &lt;element name="TotalMinimum" type="{http://www.datapower.com/schemas/management}dmTimeIntervalMillis" minOccurs="0"/>
 *         &lt;element name="TotalMaximum" type="{http://www.datapower.com/schemas/management}dmTimeIntervalMillis" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusSLMSummaryStatus", propOrder = {
    "slmPolicy",
    "slmId",
    "messages",
    "errors",
    "throttled",
    "average",
    "minimum",
    "maximum",
    "totalMessages",
    "totalErrors",
    "totalThrottled",
    "totalAverage",
    "totalMinimum",
    "totalMaximum"
})
public class StatusSLMSummaryStatus {

    @XmlElement(name = "SLMPolicy")
    protected DmReference slmPolicy;
    @XmlElement(name = "SLMId")
    protected Long slmId;
    @XmlElement(name = "Messages")
    protected Long messages;
    @XmlElement(name = "Errors")
    protected Long errors;
    @XmlElement(name = "Throttled")
    protected Long throttled;
    @XmlElement(name = "Average")
    protected Long average;
    @XmlElement(name = "Minimum")
    protected Long minimum;
    @XmlElement(name = "Maximum")
    protected Long maximum;
    @XmlElement(name = "TotalMessages")
    protected Long totalMessages;
    @XmlElement(name = "TotalErrors")
    protected Long totalErrors;
    @XmlElement(name = "TotalThrottled")
    protected Long totalThrottled;
    @XmlElement(name = "TotalAverage")
    protected Long totalAverage;
    @XmlElement(name = "TotalMinimum")
    protected Long totalMinimum;
    @XmlElement(name = "TotalMaximum")
    protected Long totalMaximum;

    /**
     * Gets the value of the slmPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getSLMPolicy() {
        return slmPolicy;
    }

    /**
     * Sets the value of the slmPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setSLMPolicy(DmReference value) {
        this.slmPolicy = value;
    }

    /**
     * Gets the value of the slmId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSLMId() {
        return slmId;
    }

    /**
     * Sets the value of the slmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSLMId(Long value) {
        this.slmId = value;
    }

    /**
     * Gets the value of the messages property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMessages() {
        return messages;
    }

    /**
     * Sets the value of the messages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMessages(Long value) {
        this.messages = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setErrors(Long value) {
        this.errors = value;
    }

    /**
     * Gets the value of the throttled property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getThrottled() {
        return throttled;
    }

    /**
     * Sets the value of the throttled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setThrottled(Long value) {
        this.throttled = value;
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
     * Gets the value of the totalMessages property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalMessages() {
        return totalMessages;
    }

    /**
     * Sets the value of the totalMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalMessages(Long value) {
        this.totalMessages = value;
    }

    /**
     * Gets the value of the totalErrors property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalErrors() {
        return totalErrors;
    }

    /**
     * Sets the value of the totalErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalErrors(Long value) {
        this.totalErrors = value;
    }

    /**
     * Gets the value of the totalThrottled property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalThrottled() {
        return totalThrottled;
    }

    /**
     * Sets the value of the totalThrottled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalThrottled(Long value) {
        this.totalThrottled = value;
    }

    /**
     * Gets the value of the totalAverage property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalAverage() {
        return totalAverage;
    }

    /**
     * Sets the value of the totalAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalAverage(Long value) {
        this.totalAverage = value;
    }

    /**
     * Gets the value of the totalMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalMinimum() {
        return totalMinimum;
    }

    /**
     * Sets the value of the totalMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalMinimum(Long value) {
        this.totalMinimum = value;
    }

    /**
     * Gets the value of the totalMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalMaximum() {
        return totalMaximum;
    }

    /**
     * Sets the value of the totalMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalMaximum(Long value) {
        this.totalMaximum = value;
    }

}
