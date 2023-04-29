
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSOperationConformancePolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmWSOperationConformancePolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConformancePolicy" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="ConformancePolicyWSDLComponentType" type="{http://www.datapower.com/schemas/management}dmWSDLComponentType"/>
 *         &lt;element name="ConformancePolicyWSDLComponentValue" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="ConformancePolicySubscription" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="ConformancePolicyFragmentID" type="{http://www.datapower.com/schemas/management}dmFragmentID"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmWSOperationConformancePolicy", propOrder = {
    "conformancePolicy",
    "conformancePolicyWSDLComponentType",
    "conformancePolicyWSDLComponentValue",
    "conformancePolicySubscription",
    "conformancePolicyFragmentID"
})
public class DmWSOperationConformancePolicy {

    @XmlElement(name = "ConformancePolicy", required = true)
    protected DmReference conformancePolicy;
    @XmlElement(name = "ConformancePolicyWSDLComponentType", required = true)
    protected DmWSDLComponentType conformancePolicyWSDLComponentType;
    @XmlElement(name = "ConformancePolicyWSDLComponentValue", required = true, nillable = true)
    protected String conformancePolicyWSDLComponentValue;
    @XmlElement(name = "ConformancePolicySubscription", required = true, nillable = true)
    protected DmReference conformancePolicySubscription;
    @XmlElement(name = "ConformancePolicyFragmentID", required = true, nillable = true)
    protected String conformancePolicyFragmentID;

    /**
     * Gets the value of the conformancePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getConformancePolicy() {
        return conformancePolicy;
    }

    /**
     * Sets the value of the conformancePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setConformancePolicy(DmReference value) {
        this.conformancePolicy = value;
    }

    /**
     * Gets the value of the conformancePolicyWSDLComponentType property.
     * 
     * @return
     *     possible object is
     *     {@link DmWSDLComponentType }
     *     
     */
    public DmWSDLComponentType getConformancePolicyWSDLComponentType() {
        return conformancePolicyWSDLComponentType;
    }

    /**
     * Sets the value of the conformancePolicyWSDLComponentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmWSDLComponentType }
     *     
     */
    public void setConformancePolicyWSDLComponentType(DmWSDLComponentType value) {
        this.conformancePolicyWSDLComponentType = value;
    }

    /**
     * Gets the value of the conformancePolicyWSDLComponentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConformancePolicyWSDLComponentValue() {
        return conformancePolicyWSDLComponentValue;
    }

    /**
     * Sets the value of the conformancePolicyWSDLComponentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConformancePolicyWSDLComponentValue(String value) {
        this.conformancePolicyWSDLComponentValue = value;
    }

    /**
     * Gets the value of the conformancePolicySubscription property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getConformancePolicySubscription() {
        return conformancePolicySubscription;
    }

    /**
     * Sets the value of the conformancePolicySubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setConformancePolicySubscription(DmReference value) {
        this.conformancePolicySubscription = value;
    }

    /**
     * Gets the value of the conformancePolicyFragmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConformancePolicyFragmentID() {
        return conformancePolicyFragmentID;
    }

    /**
     * Sets the value of the conformancePolicyFragmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConformancePolicyFragmentID(String value) {
        this.conformancePolicyFragmentID = value;
    }

}
