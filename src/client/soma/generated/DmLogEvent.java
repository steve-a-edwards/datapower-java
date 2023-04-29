
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmLogEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmLogEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Class" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="Priority" type="{http://www.datapower.com/schemas/management}dmLogLevel"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmLogEvent", propOrder = {
    "clazz",
    "priority"
})
public class DmLogEvent {

    @XmlElement(name = "Class", required = true, nillable = true)
    protected DmReference clazz;
    @XmlElement(name = "Priority", required = true, nillable = true)
    protected DmLogLevel priority;

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setClazz(DmReference value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link DmLogLevel }
     *     
     */
    public DmLogLevel getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmLogLevel }
     *     
     */
    public void setPriority(DmLogLevel value) {
        this.priority = value;
    }

}
