
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusDynamicQueueManager complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusDynamicQueueManager">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QueueManager" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="Connections" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="ReceivedMessages" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="SentMessages" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="ReceiveFaults" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="SendFaults" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusDynamicQueueManager", propOrder = {
    "queueManager",
    "connections",
    "receivedMessages",
    "sentMessages",
    "receiveFaults",
    "sendFaults"
})
public class StatusDynamicQueueManager {

    @XmlElement(name = "QueueManager")
    protected DmReference queueManager;
    @XmlElement(name = "Connections")
    protected Long connections;
    @XmlElement(name = "ReceivedMessages")
    protected Long receivedMessages;
    @XmlElement(name = "SentMessages")
    protected Long sentMessages;
    @XmlElement(name = "ReceiveFaults")
    protected Long receiveFaults;
    @XmlElement(name = "SendFaults")
    protected Long sendFaults;

    /**
     * Gets the value of the queueManager property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getQueueManager() {
        return queueManager;
    }

    /**
     * Sets the value of the queueManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setQueueManager(DmReference value) {
        this.queueManager = value;
    }

    /**
     * Gets the value of the connections property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConnections() {
        return connections;
    }

    /**
     * Sets the value of the connections property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConnections(Long value) {
        this.connections = value;
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

}
