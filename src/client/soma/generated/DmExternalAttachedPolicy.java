
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmExternalAttachedPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmExternalAttachedPolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExternalAttachWSDLComponentType" type="{http://www.datapower.com/schemas/management}dmWSDLComponentTypeRestricted"/>
 *         &lt;element name="ExternalAttachWSDLComponentValue" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="ExternalAttachPolicyURL" type="{http://www.datapower.com/schemas/management}dmURL"/>
 *         &lt;element name="ExternalAttachPolicyFragmentID" type="{http://www.datapower.com/schemas/management}dmFragmentID"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmExternalAttachedPolicy", propOrder = {
    "externalAttachWSDLComponentType",
    "externalAttachWSDLComponentValue",
    "externalAttachPolicyURL",
    "externalAttachPolicyFragmentID"
})
public class DmExternalAttachedPolicy {

    @XmlElement(name = "ExternalAttachWSDLComponentType", required = true, nillable = true)
    protected DmWSDLComponentTypeRestricted externalAttachWSDLComponentType;
    @XmlElement(name = "ExternalAttachWSDLComponentValue", required = true)
    protected String externalAttachWSDLComponentValue;
    @XmlElement(name = "ExternalAttachPolicyURL", required = true)
    protected String externalAttachPolicyURL;
    @XmlElement(name = "ExternalAttachPolicyFragmentID", required = true, nillable = true)
    protected String externalAttachPolicyFragmentID;

    /**
     * Gets the value of the externalAttachWSDLComponentType property.
     * 
     * @return
     *     possible object is
     *     {@link DmWSDLComponentTypeRestricted }
     *     
     */
    public DmWSDLComponentTypeRestricted getExternalAttachWSDLComponentType() {
        return externalAttachWSDLComponentType;
    }

    /**
     * Sets the value of the externalAttachWSDLComponentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmWSDLComponentTypeRestricted }
     *     
     */
    public void setExternalAttachWSDLComponentType(DmWSDLComponentTypeRestricted value) {
        this.externalAttachWSDLComponentType = value;
    }

    /**
     * Gets the value of the externalAttachWSDLComponentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalAttachWSDLComponentValue() {
        return externalAttachWSDLComponentValue;
    }

    /**
     * Sets the value of the externalAttachWSDLComponentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalAttachWSDLComponentValue(String value) {
        this.externalAttachWSDLComponentValue = value;
    }

    /**
     * Gets the value of the externalAttachPolicyURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalAttachPolicyURL() {
        return externalAttachPolicyURL;
    }

    /**
     * Sets the value of the externalAttachPolicyURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalAttachPolicyURL(String value) {
        this.externalAttachPolicyURL = value;
    }

    /**
     * Gets the value of the externalAttachPolicyFragmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalAttachPolicyFragmentID() {
        return externalAttachPolicyFragmentID;
    }

    /**
     * Sets the value of the externalAttachPolicyFragmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalAttachPolicyFragmentID(String value) {
        this.externalAttachPolicyFragmentID = value;
    }

}
