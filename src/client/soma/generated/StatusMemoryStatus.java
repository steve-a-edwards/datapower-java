
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusMemoryStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusMemoryStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Usage" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="TotalMemory" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="UsedMemory" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="FreeMemory" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="ReqMemory" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="XG4Usage" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="HoldMemory" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusMemoryStatus", propOrder = {
    "usage",
    "totalMemory",
    "usedMemory",
    "freeMemory",
    "reqMemory",
    "xg4Usage",
    "holdMemory"
})
public class StatusMemoryStatus {

    @XmlElement(name = "Usage")
    protected Long usage;
    @XmlElement(name = "TotalMemory")
    protected Long totalMemory;
    @XmlElement(name = "UsedMemory")
    protected Long usedMemory;
    @XmlElement(name = "FreeMemory")
    protected Long freeMemory;
    @XmlElement(name = "ReqMemory")
    protected Long reqMemory;
    @XmlElement(name = "XG4Usage")
    protected Long xg4Usage;
    @XmlElement(name = "HoldMemory")
    protected Long holdMemory;

    /**
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUsage(Long value) {
        this.usage = value;
    }

    /**
     * Gets the value of the totalMemory property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalMemory() {
        return totalMemory;
    }

    /**
     * Sets the value of the totalMemory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalMemory(Long value) {
        this.totalMemory = value;
    }

    /**
     * Gets the value of the usedMemory property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUsedMemory() {
        return usedMemory;
    }

    /**
     * Sets the value of the usedMemory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUsedMemory(Long value) {
        this.usedMemory = value;
    }

    /**
     * Gets the value of the freeMemory property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFreeMemory() {
        return freeMemory;
    }

    /**
     * Sets the value of the freeMemory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFreeMemory(Long value) {
        this.freeMemory = value;
    }

    /**
     * Gets the value of the reqMemory property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReqMemory() {
        return reqMemory;
    }

    /**
     * Sets the value of the reqMemory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReqMemory(Long value) {
        this.reqMemory = value;
    }

    /**
     * Gets the value of the xg4Usage property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getXG4Usage() {
        return xg4Usage;
    }

    /**
     * Sets the value of the xg4Usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setXG4Usage(Long value) {
        this.xg4Usage = value;
    }

    /**
     * Gets the value of the holdMemory property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHoldMemory() {
        return holdMemory;
    }

    /**
     * Sets the value of the holdMemory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHoldMemory(Long value) {
        this.holdMemory = value;
    }

}
