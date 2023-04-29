
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusFilePollerStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusFilePollerStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.datapower.com/schemas/management}dmFilePollerType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Target" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="PollCount" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="TransactionsPerPoll" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="SeizedFiles" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="PollsWithOutTransactions" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusFilePollerStatus", propOrder = {
    "type",
    "name",
    "target",
    "pollCount",
    "transactionsPerPoll",
    "seizedFiles",
    "pollsWithOutTransactions"
})
public class StatusFilePollerStatus {

    @XmlElement(name = "Type")
    protected DmFilePollerType type;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Target")
    protected String target;
    @XmlElement(name = "PollCount")
    protected Long pollCount;
    @XmlElement(name = "TransactionsPerPoll")
    protected Long transactionsPerPoll;
    @XmlElement(name = "SeizedFiles")
    protected Long seizedFiles;
    @XmlElement(name = "PollsWithOutTransactions")
    protected Long pollsWithOutTransactions;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link DmFilePollerType }
     *     
     */
    public DmFilePollerType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmFilePollerType }
     *     
     */
    public void setType(DmFilePollerType value) {
        this.type = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
    }

    /**
     * Gets the value of the pollCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPollCount() {
        return pollCount;
    }

    /**
     * Sets the value of the pollCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPollCount(Long value) {
        this.pollCount = value;
    }

    /**
     * Gets the value of the transactionsPerPoll property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransactionsPerPoll() {
        return transactionsPerPoll;
    }

    /**
     * Sets the value of the transactionsPerPoll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransactionsPerPoll(Long value) {
        this.transactionsPerPoll = value;
    }

    /**
     * Gets the value of the seizedFiles property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSeizedFiles() {
        return seizedFiles;
    }

    /**
     * Sets the value of the seizedFiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSeizedFiles(Long value) {
        this.seizedFiles = value;
    }

    /**
     * Gets the value of the pollsWithOutTransactions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPollsWithOutTransactions() {
        return pollsWithOutTransactions;
    }

    /**
     * Sets the value of the pollsWithOutTransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPollsWithOutTransactions(Long value) {
        this.pollsWithOutTransactions = value;
    }

}
