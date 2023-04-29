
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSchemaExceptionRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmSchemaExceptionRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XPath" type="{http://www.datapower.com/schemas/management}dmXPathExpr"/>
 *         &lt;element name="ExceptionType" type="{http://www.datapower.com/schemas/management}dmSchemaExceptionType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmSchemaExceptionRule", propOrder = {
    "xPath",
    "exceptionType"
})
public class DmSchemaExceptionRule {

    @XmlElement(name = "XPath", required = true)
    protected String xPath;
    @XmlElement(name = "ExceptionType", required = true)
    protected DmSchemaExceptionType exceptionType;

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
     * Gets the value of the exceptionType property.
     * 
     * @return
     *     possible object is
     *     {@link DmSchemaExceptionType }
     *     
     */
    public DmSchemaExceptionType getExceptionType() {
        return exceptionType;
    }

    /**
     * Sets the value of the exceptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmSchemaExceptionType }
     *     
     */
    public void setExceptionType(DmSchemaExceptionType value) {
        this.exceptionType = value;
    }

}
