
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmMQMSDebugTriggerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmMQMSDebugTriggerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RuleType" type="{http://www.datapower.com/schemas/management}dmProcessingType"/>
 *         &lt;element name="XPath" type="{http://www.datapower.com/schemas/management}dmXPathExpr"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmMQMSDebugTriggerType", propOrder = {
    "ruleType",
    "xPath"
})
public class DmMQMSDebugTriggerType {

    @XmlElement(name = "RuleType", required = true, nillable = true)
    protected DmProcessingType ruleType;
    @XmlElement(name = "XPath", required = true, nillable = true)
    protected String xPath;

    /**
     * Gets the value of the ruleType property.
     * 
     * @return
     *     possible object is
     *     {@link DmProcessingType }
     *     
     */
    public DmProcessingType getRuleType() {
        return ruleType;
    }

    /**
     * Sets the value of the ruleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmProcessingType }
     *     
     */
    public void setRuleType(DmProcessingType value) {
        this.ruleType = value;
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

}
