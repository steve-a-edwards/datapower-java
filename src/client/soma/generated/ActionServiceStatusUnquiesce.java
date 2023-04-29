
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionServiceStatusUnquiesce complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionServiceStatusUnquiesce">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.datapower.com/schemas/management}dmObjectClass"/>
 *         &lt;element name="name" type="{http://www.datapower.com/schemas/management}dmObjectName"/>
 *         &lt;element name="fehtype" type="{http://www.datapower.com/schemas/management}dmObjectClass"/>
 *         &lt;element name="fehname" type="{http://www.datapower.com/schemas/management}dmObjectName"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionServiceStatusUnquiesce", propOrder = {
    "type",
    "name",
    "fehtype",
    "fehname"
})
public class ActionServiceStatusUnquiesce {

    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String fehtype;
    @XmlElement(required = true)
    protected String fehname;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

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
     * Gets the value of the fehtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFehtype() {
        return fehtype;
    }

    /**
     * Sets the value of the fehtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFehtype(String value) {
        this.fehtype = value;
    }

    /**
     * Gets the value of the fehname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFehname() {
        return fehname;
    }

    /**
     * Sets the value of the fehname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFehname(String value) {
        this.fehname = value;
    }

}
