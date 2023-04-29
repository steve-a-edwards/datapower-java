
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmRuntimeProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmRuntimeProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="MaxMemory" type="{http://www.datapower.com/schemas/management}dmUInt16"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmRuntimeProfile", propOrder = {
    "name",
    "maxMemory"
})
public class DmRuntimeProfile {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "MaxMemory")
    protected int maxMemory;

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
     * Gets the value of the maxMemory property.
     * 
     */
    public int getMaxMemory() {
        return maxMemory;
    }

    /**
     * Sets the value of the maxMemory property.
     * 
     */
    public void setMaxMemory(int value) {
        this.maxMemory = value;
    }

}
