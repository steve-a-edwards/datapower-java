
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSBaseWSDL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmWSBaseWSDL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WSDLSourceLocation" type="{http://www.datapower.com/schemas/management}dmURL"/>
 *         &lt;element name="WSDLName" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="PolicyAttachments" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmWSBaseWSDL", propOrder = {
    "wsdlSourceLocation",
    "wsdlName",
    "policyAttachments"
})
public class DmWSBaseWSDL {

    @XmlElement(name = "WSDLSourceLocation", required = true)
    protected String wsdlSourceLocation;
    @XmlElement(name = "WSDLName", required = true)
    protected String wsdlName;
    @XmlElement(name = "PolicyAttachments", required = true, nillable = true)
    protected DmReference policyAttachments;

    /**
     * Gets the value of the wsdlSourceLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWSDLSourceLocation() {
        return wsdlSourceLocation;
    }

    /**
     * Sets the value of the wsdlSourceLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWSDLSourceLocation(String value) {
        this.wsdlSourceLocation = value;
    }

    /**
     * Gets the value of the wsdlName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWSDLName() {
        return wsdlName;
    }

    /**
     * Sets the value of the wsdlName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWSDLName(String value) {
        this.wsdlName = value;
    }

    /**
     * Gets the value of the policyAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getPolicyAttachments() {
        return policyAttachments;
    }

    /**
     * Sets the value of the policyAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setPolicyAttachments(DmReference value) {
        this.policyAttachments = value;
    }

}
