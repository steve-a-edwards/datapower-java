
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusTCPSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusTCPSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="established" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="syn_sent" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="syn_received" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="fin_wait_1" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="fin_wait_2" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="time_wait" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="closed" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="close_wait" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="last_ack" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="listen" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="closing" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusTCPSummary", propOrder = {
    "established",
    "synSent",
    "synReceived",
    "finWait1",
    "finWait2",
    "timeWait",
    "closed",
    "closeWait",
    "lastAck",
    "listen",
    "closing"
})
public class StatusTCPSummary {

    protected Long established;
    @XmlElement(name = "syn_sent")
    protected Long synSent;
    @XmlElement(name = "syn_received")
    protected Long synReceived;
    @XmlElement(name = "fin_wait_1")
    protected Long finWait1;
    @XmlElement(name = "fin_wait_2")
    protected Long finWait2;
    @XmlElement(name = "time_wait")
    protected Long timeWait;
    protected Long closed;
    @XmlElement(name = "close_wait")
    protected Long closeWait;
    @XmlElement(name = "last_ack")
    protected Long lastAck;
    protected Long listen;
    protected Long closing;

    /**
     * Gets the value of the established property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEstablished() {
        return established;
    }

    /**
     * Sets the value of the established property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEstablished(Long value) {
        this.established = value;
    }

    /**
     * Gets the value of the synSent property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSynSent() {
        return synSent;
    }

    /**
     * Sets the value of the synSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSynSent(Long value) {
        this.synSent = value;
    }

    /**
     * Gets the value of the synReceived property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSynReceived() {
        return synReceived;
    }

    /**
     * Sets the value of the synReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSynReceived(Long value) {
        this.synReceived = value;
    }

    /**
     * Gets the value of the finWait1 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFinWait1() {
        return finWait1;
    }

    /**
     * Sets the value of the finWait1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFinWait1(Long value) {
        this.finWait1 = value;
    }

    /**
     * Gets the value of the finWait2 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFinWait2() {
        return finWait2;
    }

    /**
     * Sets the value of the finWait2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFinWait2(Long value) {
        this.finWait2 = value;
    }

    /**
     * Gets the value of the timeWait property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeWait() {
        return timeWait;
    }

    /**
     * Sets the value of the timeWait property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeWait(Long value) {
        this.timeWait = value;
    }

    /**
     * Gets the value of the closed property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClosed() {
        return closed;
    }

    /**
     * Sets the value of the closed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClosed(Long value) {
        this.closed = value;
    }

    /**
     * Gets the value of the closeWait property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCloseWait() {
        return closeWait;
    }

    /**
     * Sets the value of the closeWait property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCloseWait(Long value) {
        this.closeWait = value;
    }

    /**
     * Gets the value of the lastAck property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLastAck() {
        return lastAck;
    }

    /**
     * Sets the value of the lastAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLastAck(Long value) {
        this.lastAck = value;
    }

    /**
     * Gets the value of the listen property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getListen() {
        return listen;
    }

    /**
     * Sets the value of the listen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setListen(Long value) {
        this.listen = value;
    }

    /**
     * Gets the value of the closing property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClosing() {
        return closing;
    }

    /**
     * Sets the value of the closing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClosing(Long value) {
        this.closing = value;
    }

}
