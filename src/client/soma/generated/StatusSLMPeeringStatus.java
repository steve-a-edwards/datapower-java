
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusSLMPeeringStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusSLMPeeringStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SLMPolicy" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="Peer" type="{http://www.datapower.com/schemas/management}dmIPHostAddress" minOccurs="0"/>
 *         &lt;element name="Started" type="{http://www.datapower.com/schemas/management}dmTimestamp" minOccurs="0"/>
 *         &lt;element name="Updated" type="{http://www.datapower.com/schemas/management}dmTimestamp" minOccurs="0"/>
 *         &lt;element name="Count" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusSLMPeeringStatus", propOrder = {
    "slmPolicy",
    "peer",
    "started",
    "updated",
    "count"
})
public class StatusSLMPeeringStatus {

    @XmlElement(name = "SLMPolicy")
    protected DmReference slmPolicy;
    @XmlElement(name = "Peer")
    protected String peer;
    @XmlElement(name = "Started")
    protected Long started;
    @XmlElement(name = "Updated")
    protected Long updated;
    @XmlElement(name = "Count")
    protected Long count;

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
     * Gets the value of the peer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeer() {
        return peer;
    }

    /**
     * Sets the value of the peer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeer(String value) {
        this.peer = value;
    }

    /**
     * Gets the value of the started property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStarted() {
        return started;
    }

    /**
     * Sets the value of the started property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStarted(Long value) {
        this.started = value;
    }

    /**
     * Gets the value of the updated property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUpdated(Long value) {
        this.updated = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCount(Long value) {
        this.count = value;
    }

}
