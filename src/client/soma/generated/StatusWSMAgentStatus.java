
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusWSMAgentStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusWSMAgentStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SpoolerCount" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="PolledSpoolers" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="RecordsSeen" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="RecordsLost" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="PendingRecords" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="CompleteRecords" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="MemoryUsedKB" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusWSMAgentStatus", propOrder = {
    "spoolerCount",
    "polledSpoolers",
    "recordsSeen",
    "recordsLost",
    "pendingRecords",
    "completeRecords",
    "memoryUsedKB"
})
public class StatusWSMAgentStatus {

    @XmlElement(name = "SpoolerCount")
    protected Long spoolerCount;
    @XmlElement(name = "PolledSpoolers")
    protected Long polledSpoolers;
    @XmlElement(name = "RecordsSeen")
    protected Long recordsSeen;
    @XmlElement(name = "RecordsLost")
    protected Long recordsLost;
    @XmlElement(name = "PendingRecords")
    protected Long pendingRecords;
    @XmlElement(name = "CompleteRecords")
    protected Long completeRecords;
    @XmlElement(name = "MemoryUsedKB")
    protected Long memoryUsedKB;

    /**
     * Gets the value of the spoolerCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSpoolerCount() {
        return spoolerCount;
    }

    /**
     * Sets the value of the spoolerCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSpoolerCount(Long value) {
        this.spoolerCount = value;
    }

    /**
     * Gets the value of the polledSpoolers property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPolledSpoolers() {
        return polledSpoolers;
    }

    /**
     * Sets the value of the polledSpoolers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPolledSpoolers(Long value) {
        this.polledSpoolers = value;
    }

    /**
     * Gets the value of the recordsSeen property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecordsSeen() {
        return recordsSeen;
    }

    /**
     * Sets the value of the recordsSeen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecordsSeen(Long value) {
        this.recordsSeen = value;
    }

    /**
     * Gets the value of the recordsLost property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecordsLost() {
        return recordsLost;
    }

    /**
     * Sets the value of the recordsLost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecordsLost(Long value) {
        this.recordsLost = value;
    }

    /**
     * Gets the value of the pendingRecords property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPendingRecords() {
        return pendingRecords;
    }

    /**
     * Sets the value of the pendingRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPendingRecords(Long value) {
        this.pendingRecords = value;
    }

    /**
     * Gets the value of the completeRecords property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCompleteRecords() {
        return completeRecords;
    }

    /**
     * Sets the value of the completeRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCompleteRecords(Long value) {
        this.completeRecords = value;
    }

    /**
     * Gets the value of the memoryUsedKB property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMemoryUsedKB() {
        return memoryUsedKB;
    }

    /**
     * Sets the value of the memoryUsedKB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMemoryUsedKB(Long value) {
        this.memoryUsedKB = value;
    }

}
