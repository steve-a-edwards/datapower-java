
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSOperationPolicySubjectOptOut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmWSOperationPolicySubjectOptOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IgnoredSubjects" type="{http://www.datapower.com/schemas/management}dmPolicySubjectBitmap"/>
 *         &lt;element name="PolicySubjectOptOutWSDLComponentType" type="{http://www.datapower.com/schemas/management}dmWSDLComponentType"/>
 *         &lt;element name="PolicySubjectOptOutWSDLComponentValue" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="PolicySubjectOptOutSubscription" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="PolicySubjectOptOutFragmentID" type="{http://www.datapower.com/schemas/management}dmFragmentID"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmWSOperationPolicySubjectOptOut", propOrder = {
    "ignoredSubjects",
    "policySubjectOptOutWSDLComponentType",
    "policySubjectOptOutWSDLComponentValue",
    "policySubjectOptOutSubscription",
    "policySubjectOptOutFragmentID"
})
public class DmWSOperationPolicySubjectOptOut {

    @XmlElement(name = "IgnoredSubjects", required = true, nillable = true)
    protected DmPolicySubjectBitmap ignoredSubjects;
    @XmlElement(name = "PolicySubjectOptOutWSDLComponentType", required = true)
    protected DmWSDLComponentType policySubjectOptOutWSDLComponentType;
    @XmlElement(name = "PolicySubjectOptOutWSDLComponentValue", required = true, nillable = true)
    protected String policySubjectOptOutWSDLComponentValue;
    @XmlElement(name = "PolicySubjectOptOutSubscription", required = true, nillable = true)
    protected DmReference policySubjectOptOutSubscription;
    @XmlElement(name = "PolicySubjectOptOutFragmentID", required = true, nillable = true)
    protected String policySubjectOptOutFragmentID;

    /**
     * Gets the value of the ignoredSubjects property.
     * 
     * @return
     *     possible object is
     *     {@link DmPolicySubjectBitmap }
     *     
     */
    public DmPolicySubjectBitmap getIgnoredSubjects() {
        return ignoredSubjects;
    }

    /**
     * Sets the value of the ignoredSubjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmPolicySubjectBitmap }
     *     
     */
    public void setIgnoredSubjects(DmPolicySubjectBitmap value) {
        this.ignoredSubjects = value;
    }

    /**
     * Gets the value of the policySubjectOptOutWSDLComponentType property.
     * 
     * @return
     *     possible object is
     *     {@link DmWSDLComponentType }
     *     
     */
    public DmWSDLComponentType getPolicySubjectOptOutWSDLComponentType() {
        return policySubjectOptOutWSDLComponentType;
    }

    /**
     * Sets the value of the policySubjectOptOutWSDLComponentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmWSDLComponentType }
     *     
     */
    public void setPolicySubjectOptOutWSDLComponentType(DmWSDLComponentType value) {
        this.policySubjectOptOutWSDLComponentType = value;
    }

    /**
     * Gets the value of the policySubjectOptOutWSDLComponentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicySubjectOptOutWSDLComponentValue() {
        return policySubjectOptOutWSDLComponentValue;
    }

    /**
     * Sets the value of the policySubjectOptOutWSDLComponentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicySubjectOptOutWSDLComponentValue(String value) {
        this.policySubjectOptOutWSDLComponentValue = value;
    }

    /**
     * Gets the value of the policySubjectOptOutSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getPolicySubjectOptOutSubscription() {
        return policySubjectOptOutSubscription;
    }

    /**
     * Sets the value of the policySubjectOptOutSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setPolicySubjectOptOutSubscription(DmReference value) {
        this.policySubjectOptOutSubscription = value;
    }

    /**
     * Gets the value of the policySubjectOptOutFragmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicySubjectOptOutFragmentID() {
        return policySubjectOptOutFragmentID;
    }

    /**
     * Sets the value of the policySubjectOptOutFragmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicySubjectOptOutFragmentID(String value) {
        this.policySubjectOptOutFragmentID = value;
    }

}
