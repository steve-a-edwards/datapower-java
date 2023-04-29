
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionSetSystemVar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionSetSystemVar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Var" type="{http://www.datapower.com/schemas/management}dmSystemVar"/>
 *         &lt;element name="Value" type="{http://www.datapower.com/schemas/management}dmUInt32"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionSetSystemVar", propOrder = {
    "var",
    "value"
})
public class ActionSetSystemVar {

    @XmlElement(name = "Var", required = true)
    protected DmSystemVar var;
    @XmlElement(name = "Value")
    protected long value;

    /**
     * Gets the value of the var property.
     * 
     * @return
     *     possible object is
     *     {@link DmSystemVar }
     *     
     */
    public DmSystemVar getVar() {
        return var;
    }

    /**
     * Sets the value of the var property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmSystemVar }
     *     
     */
    public void setVar(DmSystemVar value) {
        this.var = value;
    }

    /**
     * Gets the value of the value property.
     * 
     */
    public long getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(long value) {
        this.value = value;
    }

}
