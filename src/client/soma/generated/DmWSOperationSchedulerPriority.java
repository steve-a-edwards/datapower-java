
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSOperationSchedulerPriority complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmWSOperationSchedulerPriority">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SchedulerPriority" type="{http://www.datapower.com/schemas/management}dmSchedulerPriority"/>
 *         &lt;element name="SchedulerPriorityWSDLComponentType" type="{http://www.datapower.com/schemas/management}dmWSDLComponentType"/>
 *         &lt;element name="SchedulerPriorityWSDLComponentValue" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="SchedulerPrioritySubscription" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="SchedulerPriorityFragmentID" type="{http://www.datapower.com/schemas/management}dmFragmentID"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmWSOperationSchedulerPriority", propOrder = {
    "schedulerPriority",
    "schedulerPriorityWSDLComponentType",
    "schedulerPriorityWSDLComponentValue",
    "schedulerPrioritySubscription",
    "schedulerPriorityFragmentID"
})
public class DmWSOperationSchedulerPriority {

    @XmlElement(name = "SchedulerPriority", required = true, nillable = true)
    protected DmSchedulerPriority schedulerPriority;
    @XmlElement(name = "SchedulerPriorityWSDLComponentType", required = true)
    protected DmWSDLComponentType schedulerPriorityWSDLComponentType;
    @XmlElement(name = "SchedulerPriorityWSDLComponentValue", required = true, nillable = true)
    protected String schedulerPriorityWSDLComponentValue;
    @XmlElement(name = "SchedulerPrioritySubscription", required = true, nillable = true)
    protected DmReference schedulerPrioritySubscription;
    @XmlElement(name = "SchedulerPriorityFragmentID", required = true, nillable = true)
    protected String schedulerPriorityFragmentID;

    /**
     * Gets the value of the schedulerPriority property.
     * 
     * @return
     *     possible object is
     *     {@link DmSchedulerPriority }
     *     
     */
    public DmSchedulerPriority getSchedulerPriority() {
        return schedulerPriority;
    }

    /**
     * Sets the value of the schedulerPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmSchedulerPriority }
     *     
     */
    public void setSchedulerPriority(DmSchedulerPriority value) {
        this.schedulerPriority = value;
    }

    /**
     * Gets the value of the schedulerPriorityWSDLComponentType property.
     * 
     * @return
     *     possible object is
     *     {@link DmWSDLComponentType }
     *     
     */
    public DmWSDLComponentType getSchedulerPriorityWSDLComponentType() {
        return schedulerPriorityWSDLComponentType;
    }

    /**
     * Sets the value of the schedulerPriorityWSDLComponentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmWSDLComponentType }
     *     
     */
    public void setSchedulerPriorityWSDLComponentType(DmWSDLComponentType value) {
        this.schedulerPriorityWSDLComponentType = value;
    }

    /**
     * Gets the value of the schedulerPriorityWSDLComponentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchedulerPriorityWSDLComponentValue() {
        return schedulerPriorityWSDLComponentValue;
    }

    /**
     * Sets the value of the schedulerPriorityWSDLComponentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchedulerPriorityWSDLComponentValue(String value) {
        this.schedulerPriorityWSDLComponentValue = value;
    }

    /**
     * Gets the value of the schedulerPrioritySubscription property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getSchedulerPrioritySubscription() {
        return schedulerPrioritySubscription;
    }

    /**
     * Sets the value of the schedulerPrioritySubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setSchedulerPrioritySubscription(DmReference value) {
        this.schedulerPrioritySubscription = value;
    }

    /**
     * Gets the value of the schedulerPriorityFragmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchedulerPriorityFragmentID() {
        return schedulerPriorityFragmentID;
    }

    /**
     * Sets the value of the schedulerPriorityFragmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchedulerPriorityFragmentID(String value) {
        this.schedulerPriorityFragmentID = value;
    }

}
