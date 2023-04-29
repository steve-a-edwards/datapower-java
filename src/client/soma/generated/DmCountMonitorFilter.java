
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmCountMonitorFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmCountMonitorFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="Interval" type="{http://www.datapower.com/schemas/management}dmTimeInterval"/>
 *         &lt;element name="RateLimit" type="{http://www.datapower.com/schemas/management}dmUInt32"/>
 *         &lt;element name="BurstLimit" type="{http://www.datapower.com/schemas/management}dmUInt32"/>
 *         &lt;element name="Action" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmCountMonitorFilter", propOrder = {
    "name",
    "interval",
    "rateLimit",
    "burstLimit",
    "action"
})
public class DmCountMonitorFilter {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Interval")
    protected long interval;
    @XmlElement(name = "RateLimit")
    protected long rateLimit;
    @XmlElement(name = "BurstLimit")
    protected long burstLimit;
    @XmlElement(name = "Action", required = true)
    protected DmReference action;

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
     * Gets the value of the interval property.
     * 
     */
    public long getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     * 
     */
    public void setInterval(long value) {
        this.interval = value;
    }

    /**
     * Gets the value of the rateLimit property.
     * 
     */
    public long getRateLimit() {
        return rateLimit;
    }

    /**
     * Sets the value of the rateLimit property.
     * 
     */
    public void setRateLimit(long value) {
        this.rateLimit = value;
    }

    /**
     * Gets the value of the burstLimit property.
     * 
     */
    public long getBurstLimit() {
        return burstLimit;
    }

    /**
     * Sets the value of the burstLimit property.
     * 
     */
    public void setBurstLimit(long value) {
        this.burstLimit = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setAction(DmReference value) {
        this.action = value;
    }

}
