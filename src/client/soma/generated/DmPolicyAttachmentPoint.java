
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmPolicyAttachmentPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmPolicyAttachmentPoint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PolicyAttachWSDLComponentType" type="{http://www.datapower.com/schemas/management}dmWSDLComponentTypeRestricted"/>
 *         &lt;element name="PolicyAttachWSDLComponentValue" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="PolicyAttachFragmentID" type="{http://www.datapower.com/schemas/management}dmFragmentID"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmPolicyAttachmentPoint", propOrder = {
    "policyAttachWSDLComponentType",
    "policyAttachWSDLComponentValue",
    "policyAttachFragmentID"
})
public class DmPolicyAttachmentPoint {

    @XmlElement(name = "PolicyAttachWSDLComponentType", required = true, nillable = true)
    protected DmWSDLComponentTypeRestricted policyAttachWSDLComponentType;
    @XmlElement(name = "PolicyAttachWSDLComponentValue", required = true, nillable = true)
    protected String policyAttachWSDLComponentValue;
    @XmlElement(name = "PolicyAttachFragmentID", required = true, nillable = true)
    protected String policyAttachFragmentID;

    /**
     * Gets the value of the policyAttachWSDLComponentType property.
     * 
     * @return
     *     possible object is
     *     {@link DmWSDLComponentTypeRestricted }
     *     
     */
    public DmWSDLComponentTypeRestricted getPolicyAttachWSDLComponentType() {
        return policyAttachWSDLComponentType;
    }

    /**
     * Sets the value of the policyAttachWSDLComponentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmWSDLComponentTypeRestricted }
     *     
     */
    public void setPolicyAttachWSDLComponentType(DmWSDLComponentTypeRestricted value) {
        this.policyAttachWSDLComponentType = value;
    }

    /**
     * Gets the value of the policyAttachWSDLComponentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyAttachWSDLComponentValue() {
        return policyAttachWSDLComponentValue;
    }

    /**
     * Sets the value of the policyAttachWSDLComponentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyAttachWSDLComponentValue(String value) {
        this.policyAttachWSDLComponentValue = value;
    }

    /**
     * Gets the value of the policyAttachFragmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyAttachFragmentID() {
        return policyAttachFragmentID;
    }

    /**
     * Sets the value of the policyAttachFragmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyAttachFragmentID(String value) {
        this.policyAttachFragmentID = value;
    }

}
