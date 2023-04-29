
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmTraceEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmTraceEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Class" type="{http://www.datapower.com/schemas/management}dmTraceClass"/>
 *         &lt;element name="Priority" type="{http://www.datapower.com/schemas/management}dmTraceLevel"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmTraceEvent", propOrder = {
    "clazz",
    "priority"
})
public class DmTraceEvent {

    @XmlElement(name = "Class", required = true, nillable = true)
    protected DmTraceClass clazz;
    @XmlElement(name = "Priority", required = true, nillable = true)
    protected DmTraceLevel priority;

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link DmTraceClass }
     *     
     */
    public DmTraceClass getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmTraceClass }
     *     
     */
    public void setClazz(DmTraceClass value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link DmTraceLevel }
     *     
     */
    public DmTraceLevel getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmTraceLevel }
     *     
     */
    public void setPriority(DmTraceLevel value) {
        this.priority = value;
    }

}
