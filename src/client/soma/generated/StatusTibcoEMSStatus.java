
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusTibcoEMSStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusTibcoEMSStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Server" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="ReceivedMessages" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="SentMessages" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="ReceivedFaults" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="SentFaults" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusTibcoEMSStatus", propOrder = {
    "server",
    "receivedMessages",
    "sentMessages",
    "receivedFaults",
    "sentFaults"
})
public class StatusTibcoEMSStatus {

    @XmlElement(name = "Server")
    protected DmReference server;
    @XmlElement(name = "ReceivedMessages")
    protected Long receivedMessages;
    @XmlElement(name = "SentMessages")
    protected Long sentMessages;
    @XmlElement(name = "ReceivedFaults")
    protected Long receivedFaults;
    @XmlElement(name = "SentFaults")
    protected Long sentFaults;

    /**
     * Gets the value of the server property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getServer() {
        return server;
    }

    /**
     * Sets the value of the server property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setServer(DmReference value) {
        this.server = value;
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
     * Gets the value of the receivedFaults property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReceivedFaults() {
        return receivedFaults;
    }

    /**
     * Sets the value of the receivedFaults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReceivedFaults(Long value) {
        this.receivedFaults = value;
    }

    /**
     * Gets the value of the sentFaults property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSentFaults() {
        return sentFaults;
    }

    /**
     * Sets the value of the sentFaults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSentFaults(Long value) {
        this.sentFaults = value;
    }

}
