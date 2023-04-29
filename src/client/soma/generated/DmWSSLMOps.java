
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSSLMOps complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmWSSLMOps">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Operation" type="{http://www.datapower.com/schemas/management}dmOperation"/>
 *         &lt;element name="Target" type="{http://www.datapower.com/schemas/management}dmSLMTarget"/>
 *         &lt;element name="Severity" type="{http://www.datapower.com/schemas/management}dmSLMLevel"/>
 *         &lt;element name="Threshold" type="{http://www.datapower.com/schemas/management}dmUInt32"/>
 *         &lt;element name="Action" type="{http://www.datapower.com/schemas/management}dmSLMAction"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmWSSLMOps", propOrder = {
    "operation",
    "target",
    "severity",
    "threshold",
    "action"
})
public class DmWSSLMOps {

    @XmlElement(name = "Operation", required = true)
    protected DmOperation operation;
    @XmlElement(name = "Target", required = true)
    protected DmSLMTarget target;
    @XmlElement(name = "Severity", required = true)
    protected DmSLMLevel severity;
    @XmlElement(name = "Threshold", required = true, type = Long.class, nillable = true)
    protected Long threshold;
    @XmlElement(name = "Action", required = true, nillable = true)
    protected DmSLMAction action;

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link DmOperation }
     *     
     */
    public DmOperation getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmOperation }
     *     
     */
    public void setOperation(DmOperation value) {
        this.operation = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link DmSLMTarget }
     *     
     */
    public DmSLMTarget getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmSLMTarget }
     *     
     */
    public void setTarget(DmSLMTarget value) {
        this.target = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link DmSLMLevel }
     *     
     */
    public DmSLMLevel getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmSLMLevel }
     *     
     */
    public void setSeverity(DmSLMLevel value) {
        this.severity = value;
    }

    /**
     * Gets the value of the threshold property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getThreshold() {
        return threshold;
    }

    /**
     * Sets the value of the threshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setThreshold(Long value) {
        this.threshold = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link DmSLMAction }
     *     
     */
    public DmSLMAction getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmSLMAction }
     *     
     */
    public void setAction(DmSLMAction value) {
        this.action = value;
    }

}
