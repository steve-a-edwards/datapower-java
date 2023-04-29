
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmMSDebugTriggerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmMSDebugTriggerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClientIP" type="{http://www.datapower.com/schemas/management}dmPCRE"/>
 *         &lt;element name="InURLMatch" type="{http://www.datapower.com/schemas/management}dmPCRE"/>
 *         &lt;element name="OutURLMatch" type="{http://www.datapower.com/schemas/management}dmPCRE"/>
 *         &lt;element name="RuleType" type="{http://www.datapower.com/schemas/management}dmProcessingType"/>
 *         &lt;element name="RuleMatch" type="{http://www.datapower.com/schemas/management}dmPCRE"/>
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
@XmlType(name = "dmMSDebugTriggerType", propOrder = {
    "clientIP",
    "inURLMatch",
    "outURLMatch",
    "ruleType",
    "ruleMatch",
    "xPath"
})
public class DmMSDebugTriggerType {

    @XmlElement(name = "ClientIP", required = true, nillable = true)
    protected String clientIP;
    @XmlElement(name = "InURLMatch", required = true, nillable = true)
    protected String inURLMatch;
    @XmlElement(name = "OutURLMatch", required = true, nillable = true)
    protected String outURLMatch;
    @XmlElement(name = "RuleType", required = true, nillable = true)
    protected DmProcessingType ruleType;
    @XmlElement(name = "RuleMatch", required = true, nillable = true)
    protected String ruleMatch;
    @XmlElement(name = "XPath", required = true, nillable = true)
    protected String xPath;

    /**
     * Gets the value of the clientIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientIP() {
        return clientIP;
    }

    /**
     * Sets the value of the clientIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientIP(String value) {
        this.clientIP = value;
    }

    /**
     * Gets the value of the inURLMatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInURLMatch() {
        return inURLMatch;
    }

    /**
     * Sets the value of the inURLMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInURLMatch(String value) {
        this.inURLMatch = value;
    }

    /**
     * Gets the value of the outURLMatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutURLMatch() {
        return outURLMatch;
    }

    /**
     * Sets the value of the outURLMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutURLMatch(String value) {
        this.outURLMatch = value;
    }

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
     * Gets the value of the ruleMatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleMatch() {
        return ruleMatch;
    }

    /**
     * Sets the value of the ruleMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleMatch(String value) {
        this.ruleMatch = value;
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
