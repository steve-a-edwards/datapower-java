
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusLogTargetStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusLogTargetStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LogTarget" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.datapower.com/schemas/management}dmLogStatus" minOccurs="0"/>
 *         &lt;element name="EventsProcessed" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="EventsDropped" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="EventsPending" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="ErrorInfo" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="RequestedMemory" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusLogTargetStatus", propOrder = {
    "logTarget",
    "status",
    "eventsProcessed",
    "eventsDropped",
    "eventsPending",
    "errorInfo",
    "requestedMemory"
})
public class StatusLogTargetStatus {

    @XmlElement(name = "LogTarget")
    protected DmReference logTarget;
    @XmlElement(name = "Status")
    protected DmLogStatus status;
    @XmlElement(name = "EventsProcessed")
    protected Long eventsProcessed;
    @XmlElement(name = "EventsDropped")
    protected Long eventsDropped;
    @XmlElement(name = "EventsPending")
    protected Long eventsPending;
    @XmlElement(name = "ErrorInfo")
    protected String errorInfo;
    @XmlElement(name = "RequestedMemory")
    protected Long requestedMemory;

    /**
     * Gets the value of the logTarget property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getLogTarget() {
        return logTarget;
    }

    /**
     * Sets the value of the logTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setLogTarget(DmReference value) {
        this.logTarget = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link DmLogStatus }
     *     
     */
    public DmLogStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmLogStatus }
     *     
     */
    public void setStatus(DmLogStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the eventsProcessed property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEventsProcessed() {
        return eventsProcessed;
    }

    /**
     * Sets the value of the eventsProcessed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEventsProcessed(Long value) {
        this.eventsProcessed = value;
    }

    /**
     * Gets the value of the eventsDropped property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEventsDropped() {
        return eventsDropped;
    }

    /**
     * Sets the value of the eventsDropped property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEventsDropped(Long value) {
        this.eventsDropped = value;
    }

    /**
     * Gets the value of the eventsPending property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEventsPending() {
        return eventsPending;
    }

    /**
     * Sets the value of the eventsPending property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEventsPending(Long value) {
        this.eventsPending = value;
    }

    /**
     * Gets the value of the errorInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorInfo() {
        return errorInfo;
    }

    /**
     * Sets the value of the errorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorInfo(String value) {
        this.errorInfo = value;
    }

    /**
     * Gets the value of the requestedMemory property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRequestedMemory() {
        return requestedMemory;
    }

    /**
     * Sets the value of the requestedMemory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRequestedMemory(Long value) {
        this.requestedMemory = value;
    }

}
