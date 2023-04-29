
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSAMLAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmSAMLAttribute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SourceType" type="{http://www.datapower.com/schemas/management}dmSAMLAttributeSource"/>
 *         &lt;element name="Name" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="Format" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="XPath" type="{http://www.datapower.com/schemas/management}dmXPathExpr"/>
 *         &lt;element name="ValueData" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="SubValueData" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="FriendlyName" type="{http://www.datapower.com/schemas/management}dmString"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmSAMLAttribute", propOrder = {
    "sourceType",
    "name",
    "format",
    "xPath",
    "valueData",
    "subValueData",
    "friendlyName"
})
public class DmSAMLAttribute {

    @XmlElement(name = "SourceType", required = true)
    protected DmSAMLAttributeSource sourceType;
    @XmlElement(name = "Name", required = true, nillable = true)
    protected String name;
    @XmlElement(name = "Format", required = true, nillable = true)
    protected String format;
    @XmlElement(name = "XPath", required = true, nillable = true)
    protected String xPath;
    @XmlElement(name = "ValueData", required = true, nillable = true)
    protected String valueData;
    @XmlElement(name = "SubValueData", required = true, nillable = true)
    protected String subValueData;
    @XmlElement(name = "FriendlyName", required = true, nillable = true)
    protected String friendlyName;

    /**
     * Gets the value of the sourceType property.
     * 
     * @return
     *     possible object is
     *     {@link DmSAMLAttributeSource }
     *     
     */
    public DmSAMLAttributeSource getSourceType() {
        return sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmSAMLAttributeSource }
     *     
     */
    public void setSourceType(DmSAMLAttributeSource value) {
        this.sourceType = value;
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
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the value of the xPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXPath() {
        return xPath;
    }

    /**
     * Sets the value of the xPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXPath(String value) {
        this.xPath = value;
    }

    /**
     * Gets the value of the valueData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueData() {
        return valueData;
    }

    /**
     * Sets the value of the valueData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueData(String value) {
        this.valueData = value;
    }

    /**
     * Gets the value of the subValueData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubValueData() {
        return subValueData;
    }

    /**
     * Sets the value of the subValueData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubValueData(String value) {
        this.subValueData = value;
    }

    /**
     * Gets the value of the friendlyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFriendlyName() {
        return friendlyName;
    }

    /**
     * Sets the value of the friendlyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFriendlyName(String value) {
        this.friendlyName = value;
    }

}
