
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusMQStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusMQStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceType" type="{http://www.datapower.com/schemas/management}dmMQServiceType" minOccurs="0"/>
 *         &lt;element name="ServiceName" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="ReceivedMessages" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="SentMessages" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="ReceiveFaults" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="SendFaults" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="RequestLatency" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="ResponseLatency" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="RoundTripLatency" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusMQStatus", propOrder = {
    "serviceType",
    "serviceName",
    "receivedMessages",
    "sentMessages",
    "receiveFaults",
    "sendFaults",
    "requestLatency",
    "responseLatency",
    "roundTripLatency"
})
public class StatusMQStatus {

    @XmlElement(name = "ServiceType")
    protected DmMQServiceType serviceType;
    @XmlElement(name = "ServiceName")
    protected String serviceName;
    @XmlElement(name = "ReceivedMessages")
    protected Long receivedMessages;
    @XmlElement(name = "SentMessages")
    protected Long sentMessages;
    @XmlElement(name = "ReceiveFaults")
    protected Long receiveFaults;
    @XmlElement(name = "SendFaults")
    protected Long sendFaults;
    @XmlElement(name = "RequestLatency")
    protected Long requestLatency;
    @XmlElement(name = "ResponseLatency")
    protected Long responseLatency;
    @XmlElement(name = "RoundTripLatency")
    protected Long roundTripLatency;

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link DmMQServiceType }
     *     
     */
    public DmMQServiceType getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmMQServiceType }
     *     
     */
    public void setServiceType(DmMQServiceType value) {
        this.serviceType = value;
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
     * Gets the value of the receivedMessages property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReceivedMessages() {
        return receivedMessages;
    }

    /**
     * Sets the value of the receivedMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReceivedMessages(Long value) {
        this.receivedMessages = value;
    }

    /**
     * Gets the value of the sentMessages property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSentMessages() {
        return sentMessages;
    }

    /**
     * Sets the value of the sentMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSentMessages(Long value) {
        this.sentMessages = value;
    }

    /**
     * Gets the value of the receiveFaults property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReceiveFaults() {
        return receiveFaults;
    }

    /**
     * Sets the value of the receiveFaults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReceiveFaults(Long value) {
        this.receiveFaults = value;
    }

    /**
     * Gets the value of the sendFaults property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSendFaults() {
        return sendFaults;
    }

    /**
     * Sets the value of the sendFaults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSendFaults(Long value) {
        this.sendFaults = value;
    }

    /**
     * Gets the value of the requestLatency property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRequestLatency() {
        return requestLatency;
    }

    /**
     * Sets the value of the requestLatency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRequestLatency(Long value) {
        this.requestLatency = value;
    }

    /**
     * Gets the value of the responseLatency property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getResponseLatency() {
        return responseLatency;
    }

    /**
     * Sets the value of the responseLatency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setResponseLatency(Long value) {
        this.responseLatency = value;
    }

    /**
     * Gets the value of the roundTripLatency property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRoundTripLatency() {
        return roundTripLatency;
    }

    /**
     * Sets the value of the roundTripLatency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRoundTripLatency(Long value) {
        this.roundTripLatency = value;
    }

}
