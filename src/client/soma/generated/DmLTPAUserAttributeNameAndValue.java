
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmLTPAUserAttributeNameAndValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmLTPAUserAttributeNameAndValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LTPAUserAttributeName" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="LTPAUserAttributeType" type="{http://www.datapower.com/schemas/management}dmLTPAUserAttributeType"/>
 *         &lt;element name="LTPAUserAttributeStaticValue" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="LTPAUserAttributeXPathValue" type="{http://www.datapower.com/schemas/management}dmXPathExpr"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmLTPAUserAttributeNameAndValue", propOrder = {
    "ltpaUserAttributeName",
    "ltpaUserAttributeType",
    "ltpaUserAttributeStaticValue",
    "ltpaUserAttributeXPathValue"
})
public class DmLTPAUserAttributeNameAndValue {

    @XmlElement(name = "LTPAUserAttributeName", required = true)
    protected String ltpaUserAttributeName;
    @XmlElement(name = "LTPAUserAttributeType", required = true, nillable = true)
    protected DmLTPAUserAttributeType ltpaUserAttributeType;
    @XmlElement(name = "LTPAUserAttributeStaticValue", required = true, nillable = true)
    protected String ltpaUserAttributeStaticValue;
    @XmlElement(name = "LTPAUserAttributeXPathValue", required = true, nillable = true)
    protected String ltpaUserAttributeXPathValue;

    /**
     * Gets the value of the ltpaUserAttributeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLTPAUserAttributeName() {
        return ltpaUserAttributeName;
    }

    /**
     * Sets the value of the ltpaUserAttributeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLTPAUserAttributeName(String value) {
        this.ltpaUserAttributeName = value;
    }

    /**
     * Gets the value of the ltpaUserAttributeType property.
     * 
     * @return
     *     possible object is
     *     {@link DmLTPAUserAttributeType }
     *     
     */
    public DmLTPAUserAttributeType getLTPAUserAttributeType() {
        return ltpaUserAttributeType;
    }

    /**
     * Sets the value of the ltpaUserAttributeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmLTPAUserAttributeType }
     *     
     */
    public void setLTPAUserAttributeType(DmLTPAUserAttributeType value) {
        this.ltpaUserAttributeType = value;
    }

    /**
     * Gets the value of the ltpaUserAttributeStaticValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLTPAUserAttributeStaticValue() {
        return ltpaUserAttributeStaticValue;
    }

    /**
     * Sets the value of the ltpaUserAttributeStaticValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLTPAUserAttributeStaticValue(String value) {
        this.ltpaUserAttributeStaticValue = value;
    }

    /**
     * Gets the value of the ltpaUserAttributeXPathValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLTPAUserAttributeXPathValue() {
        return ltpaUserAttributeXPathValue;
    }

    /**
     * Sets the value of the ltpaUserAttributeXPathValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLTPAUserAttributeXPathValue(String value) {
        this.ltpaUserAttributeXPathValue = value;
    }

}
