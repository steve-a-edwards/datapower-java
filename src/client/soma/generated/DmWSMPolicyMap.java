
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSMPolicyMap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmWSMPolicyMap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WSDLComponentType" type="{http://www.datapower.com/schemas/management}dmWSDLComponentType"/>
 *         &lt;element name="WSDLComponentValue" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="Match" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="Rule" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="Subscription" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="WSDLFragmentID" type="{http://www.datapower.com/schemas/management}dmFragmentID"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmWSMPolicyMap", propOrder = {
    "wsdlComponentType",
    "wsdlComponentValue",
    "match",
    "rule",
    "subscription",
    "wsdlFragmentID"
})
public class DmWSMPolicyMap {

    @XmlElement(name = "WSDLComponentType", required = true)
    protected DmWSDLComponentType wsdlComponentType;
    @XmlElement(name = "WSDLComponentValue", required = true, nillable = true)
    protected String wsdlComponentValue;
    @XmlElement(name = "Match", required = true)
    protected DmReference match;
    @XmlElement(name = "Rule", required = true)
    protected DmReference rule;
    @XmlElement(name = "Subscription", required = true, nillable = true)
    protected DmReference subscription;
    @XmlElement(name = "WSDLFragmentID", required = true, nillable = true)
    protected String wsdlFragmentID;

    /**
     * Gets the value of the wsdlComponentType property.
     * 
     * @return
     *     possible object is
     *     {@link DmWSDLComponentType }
     *     
     */
    public DmWSDLComponentType getWSDLComponentType() {
        return wsdlComponentType;
    }

    /**
     * Sets the value of the wsdlComponentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmWSDLComponentType }
     *     
     */
    public void setWSDLComponentType(DmWSDLComponentType value) {
        this.wsdlComponentType = value;
    }

    /**
     * Gets the value of the wsdlComponentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWSDLComponentValue() {
        return wsdlComponentValue;
    }

    /**
     * Sets the value of the wsdlComponentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWSDLComponentValue(String value) {
        this.wsdlComponentValue = value;
    }

    /**
     * Gets the value of the match property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getMatch() {
        return match;
    }

    /**
     * Sets the value of the match property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setMatch(DmReference value) {
        this.match = value;
    }

    /**
     * Gets the value of the rule property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getRule() {
        return rule;
    }

    /**
     * Sets the value of the rule property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setRule(DmReference value) {
        this.rule = value;
    }

    /**
     * Gets the value of the subscription property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getSubscription() {
        return subscription;
    }

    /**
     * Sets the value of the subscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setSubscription(DmReference value) {
        this.subscription = value;
    }

    /**
     * Gets the value of the wsdlFragmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWSDLFragmentID() {
        return wsdlFragmentID;
    }

    /**
     * Sets the value of the wsdlFragmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWSDLFragmentID(String value) {
        this.wsdlFragmentID = value;
    }

}
