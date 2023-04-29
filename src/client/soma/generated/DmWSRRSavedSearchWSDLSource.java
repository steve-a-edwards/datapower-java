
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSRRSavedSearchWSDLSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmWSRRSavedSearchWSDLSource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WSRRSavedSearchSubscription" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="WSRRAttachment" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmWSRRSavedSearchWSDLSource", propOrder = {
    "wsrrSavedSearchSubscription",
    "wsrrAttachment"
})
public class DmWSRRSavedSearchWSDLSource {

    @XmlElement(name = "WSRRSavedSearchSubscription", required = true, nillable = true)
    protected DmReference wsrrSavedSearchSubscription;
    @XmlElement(name = "WSRRAttachment", required = true, nillable = true)
    protected DmReference wsrrAttachment;

    /**
     * Gets the value of the wsrrSavedSearchSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getWSRRSavedSearchSubscription() {
        return wsrrSavedSearchSubscription;
    }

    /**
     * Sets the value of the wsrrSavedSearchSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setWSRRSavedSearchSubscription(DmReference value) {
        this.wsrrSavedSearchSubscription = value;
    }

    /**
     * Gets the value of the wsrrAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getWSRRAttachment() {
        return wsrrAttachment;
    }

    /**
     * Sets the value of the wsrrAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setWSRRAttachment(DmReference value) {
        this.wsrrAttachment = value;
    }

}
