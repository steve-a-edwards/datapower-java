
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmValidationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmValidationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.datapower.com/schemas/management}dmPCRE"/>
 *         &lt;element name="Value" type="{http://www.datapower.com/schemas/management}dmPCRE"/>
 *         &lt;element name="Fixup" type="{http://www.datapower.com/schemas/management}dmValidationFixupType"/>
 *         &lt;element name="MapValue" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="XSS" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="XSSPatternsFile" type="{http://www.datapower.com/schemas/management}dmFSFile"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmValidationType", propOrder = {
    "name",
    "value",
    "fixup",
    "mapValue",
    "xss",
    "xssPatternsFile"
})
public class DmValidationType {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Value", required = true)
    protected String value;
    @XmlElement(name = "Fixup", required = true)
    protected DmValidationFixupType fixup;
    @XmlElement(name = "MapValue", required = true, nillable = true)
    protected String mapValue;
    @XmlElement(name = "XSS", required = true, nillable = true)
    protected DmToggle xss;
    @XmlElement(name = "XSSPatternsFile", required = true, nillable = true)
    protected String xssPatternsFile;

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
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the fixup property.
     * 
     * @return
     *     possible object is
     *     {@link DmValidationFixupType }
     *     
     */
    public DmValidationFixupType getFixup() {
        return fixup;
    }

    /**
     * Sets the value of the fixup property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmValidationFixupType }
     *     
     */
    public void setFixup(DmValidationFixupType value) {
        this.fixup = value;
    }

    /**
     * Gets the value of the mapValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapValue() {
        return mapValue;
    }

    /**
     * Sets the value of the mapValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapValue(String value) {
        this.mapValue = value;
    }

    /**
     * Gets the value of the xss property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getXSS() {
        return xss;
    }

    /**
     * Sets the value of the xss property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setXSS(DmToggle value) {
        this.xss = value;
    }

    /**
     * Gets the value of the xssPatternsFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXSSPatternsFile() {
        return xssPatternsFile;
    }

    /**
     * Sets the value of the xssPatternsFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXSSPatternsFile(String value) {
        this.xssPatternsFile = value;
    }

}
