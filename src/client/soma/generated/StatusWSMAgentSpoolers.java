
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusWSMAgentSpoolers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusWSMAgentSpoolers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Index" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="Context" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Protocol" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="SubProtocol" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="PollInterval" type="{http://www.datapower.com/schemas/management}dmTimeInterval" minOccurs="0"/>
 *         &lt;element name="Records" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="LastReadIndex" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="LastAckedIndex" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="LastReadTime" type="{http://www.datapower.com/schemas/management}dmTimestamp" minOccurs="0"/>
 *         &lt;element name="LastAckTime" type="{http://www.datapower.com/schemas/management}dmTimestamp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusWSMAgentSpoolers", propOrder = {
    "index",
    "context",
    "protocol",
    "subProtocol",
    "pollInterval",
    "records",
    "lastReadIndex",
    "lastAckedIndex",
    "lastReadTime",
    "lastAckTime"
})
public class StatusWSMAgentSpoolers {

    @XmlElement(name = "Index")
    protected Long index;
    @XmlElement(name = "Context")
    protected String context;
    @XmlElement(name = "Protocol")
    protected String protocol;
    @XmlElement(name = "SubProtocol")
    protected String subProtocol;
    @XmlElement(name = "PollInterval")
    protected Long pollInterval;
    @XmlElement(name = "Records")
    protected Long records;
    @XmlElement(name = "LastReadIndex")
    protected Long lastReadIndex;
    @XmlElement(name = "LastAckedIndex")
    protected Long lastAckedIndex;
    @XmlElement(name = "LastReadTime")
    protected Long lastReadTime;
    @XmlElement(name = "LastAckTime")
    protected Long lastAckTime;

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIndex(Long value) {
        this.index = value;
    }

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContext(String value) {
        this.context = value;
    }

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocol(String value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the subProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubProtocol() {
        return subProtocol;
    }

    /**
     * Sets the value of the subProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubProtocol(String value) {
        this.subProtocol = value;
    }

    /**
     * Gets the value of the pollInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPollInterval() {
        return pollInterval;
    }

    /**
     * Sets the value of the pollInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPollInterval(Long value) {
        this.pollInterval = value;
    }

    /**
     * Gets the value of the records property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecords() {
        return records;
    }

    /**
     * Sets the value of the records property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecords(Long value) {
        this.records = value;
    }

    /**
     * Gets the value of the lastReadIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLastReadIndex() {
        return lastReadIndex;
    }

    /**
     * Sets the value of the lastReadIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLastReadIndex(Long value) {
        this.lastReadIndex = value;
    }

    /**
     * Gets the value of the lastAckedIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLastAckedIndex() {
        return lastAckedIndex;
    }

    /**
     * Sets the value of the lastAckedIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLastAckedIndex(Long value) {
        this.lastAckedIndex = value;
    }

    /**
     * Gets the value of the lastReadTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLastReadTime() {
        return lastReadTime;
    }

    /**
     * Sets the value of the lastReadTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLastReadTime(Long value) {
        this.lastReadTime = value;
    }

    /**
     * Gets the value of the lastAckTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLastAckTime() {
        return lastAckTime;
    }

    /**
     * Sets the value of the lastAckTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLastAckTime(Long value) {
        this.lastAckTime = value;
    }

}
