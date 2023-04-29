
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmUDDIWSDLSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmUDDIWSDLSource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UDDISubscription" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="UDDIAttachment" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmUDDIWSDLSource", propOrder = {
    "uddiSubscription",
    "uddiAttachment"
})
public class DmUDDIWSDLSource {

    @XmlElement(name = "UDDISubscription", required = true, nillable = true)
    protected DmReference uddiSubscription;
    @XmlElement(name = "UDDIAttachment", required = true, nillable = true)
    protected DmReference uddiAttachment;

    /**
     * Gets the value of the uddiSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getUDDISubscription() {
        return uddiSubscription;
    }

    /**
     * Sets the value of the uddiSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setUDDISubscription(DmReference value) {
        this.uddiSubscription = value;
    }

    /**
     * Gets the value of the uddiAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getUDDIAttachment() {
        return uddiAttachment;
    }

    /**
     * Sets the value of the uddiAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setUDDIAttachment(DmReference value) {
        this.uddiAttachment = value;
    }

}
