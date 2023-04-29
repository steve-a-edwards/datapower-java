
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSPolicyParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmWSPolicyParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PolicyParamParameters" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="PolicyParamWSDLComponentType" type="{http://www.datapower.com/schemas/management}dmWSDLComponentType"/>
 *         &lt;element name="PolicyParamWSDLComponentValue" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="PolicyParamSubscription" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="PolicyParamFragmentID" type="{http://www.datapower.com/schemas/management}dmFragmentID"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmWSPolicyParameters", propOrder = {
    "policyParamParameters",
    "policyParamWSDLComponentType",
    "policyParamWSDLComponentValue",
    "policyParamSubscription",
    "policyParamFragmentID"
})
public class DmWSPolicyParameters {

    @XmlElement(name = "PolicyParamParameters", required = true)
    protected DmReference policyParamParameters;
    @XmlElement(name = "PolicyParamWSDLComponentType", required = true)
    protected DmWSDLComponentType policyParamWSDLComponentType;
    @XmlElement(name = "PolicyParamWSDLComponentValue", required = true, nillable = true)
    protected String policyParamWSDLComponentValue;
    @XmlElement(name = "PolicyParamSubscription", required = true, nillable = true)
    protected DmReference policyParamSubscription;
    @XmlElement(name = "PolicyParamFragmentID", required = true, nillable = true)
    protected String policyParamFragmentID;

    /**
     * Gets the value of the policyParamParameters property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getPolicyParamParameters() {
        return policyParamParameters;
    }

    /**
     * Sets the value of the policyParamParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setPolicyParamParameters(DmReference value) {
        this.policyParamParameters = value;
    }

    /**
     * Gets the value of the policyParamWSDLComponentType property.
     * 
     * @return
     *     possible object is
     *     {@link DmWSDLComponentType }
     *     
     */
    public DmWSDLComponentType getPolicyParamWSDLComponentType() {
        return policyParamWSDLComponentType;
    }

    /**
     * Sets the value of the policyParamWSDLComponentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmWSDLComponentType }
     *     
     */
    public void setPolicyParamWSDLComponentType(DmWSDLComponentType value) {
        this.policyParamWSDLComponentType = value;
    }

    /**
     * Gets the value of the policyParamWSDLComponentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyParamWSDLComponentValue() {
        return policyParamWSDLComponentValue;
    }

    /**
     * Sets the value of the policyParamWSDLComponentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyParamWSDLComponentValue(String value) {
        this.policyParamWSDLComponentValue = value;
    }

    /**
     * Gets the value of the policyParamSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getPolicyParamSubscription() {
        return policyParamSubscription;
    }

    /**
     * Sets the value of the policyParamSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setPolicyParamSubscription(DmReference value) {
        this.policyParamSubscription = value;
    }

    /**
     * Gets the value of the policyParamFragmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyParamFragmentID() {
        return policyParamFragmentID;
    }

    /**
     * Sets the value of the policyParamFragmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyParamFragmentID(String value) {
        this.policyParamFragmentID = value;
    }

}
