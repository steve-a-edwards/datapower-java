
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmLogTrigger complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmLogTrigger">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="Expression" type="{http://www.datapower.com/schemas/management}dmPCRE"/>
 *         &lt;element name="OnlyOnce" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="StopProcessing" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="Command" type="{http://www.datapower.com/schemas/management}dmString"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmLogTrigger", propOrder = {
    "id",
    "expression",
    "onlyOnce",
    "stopProcessing",
    "command"
})
public class DmLogTrigger {

    @XmlElement(name = "ID", required = true, nillable = true)
    protected String id;
    @XmlElement(name = "Expression", required = true, nillable = true)
    protected String expression;
    @XmlElement(name = "OnlyOnce", required = true)
    protected DmToggle onlyOnce;
    @XmlElement(name = "StopProcessing", required = true)
    protected DmToggle stopProcessing;
    @XmlElement(name = "Command", required = true, nillable = true)
    protected String command;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the expression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpression() {
        return expression;
    }

    /**
     * Sets the value of the expression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpression(String value) {
        this.expression = value;
    }

    /**
     * Gets the value of the onlyOnce property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getOnlyOnce() {
        return onlyOnce;
    }

    /**
     * Sets the value of the onlyOnce property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setOnlyOnce(DmToggle value) {
        this.onlyOnce = value;
    }

    /**
     * Gets the value of the stopProcessing property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getStopProcessing() {
        return stopProcessing;
    }

    /**
     * Sets the value of the stopProcessing property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setStopProcessing(DmToggle value) {
        this.stopProcessing = value;
    }

    /**
     * Gets the value of the command property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommand() {
        return command;
    }

    /**
     * Sets the value of the command property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommand(String value) {
        this.command = value;
    }

}
