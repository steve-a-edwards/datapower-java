
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSOperationReliableMessaging complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmWSOperationReliableMessaging">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Options" type="{http://www.datapower.com/schemas/management}dmWSRMPolicyBitmap"/>
 *         &lt;element name="DeliveryAssuranceType" type="{http://www.datapower.com/schemas/management}dmWSRMPolicyDeliveryAssurance"/>
 *         &lt;element name="ReliableMessagingWSDLComponentType" type="{http://www.datapower.com/schemas/management}dmWSDLComponentType"/>
 *         &lt;element name="ReliableMessagingWSDLComponentValue" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="ReliableMessagingSubscription" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="ReliableMessagingFragmentID" type="{http://www.datapower.com/schemas/management}dmFragmentID"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmWSOperationReliableMessaging", propOrder = {
    "options",
    "deliveryAssuranceType",
    "reliableMessagingWSDLComponentType",
    "reliableMessagingWSDLComponentValue",
    "reliableMessagingSubscription",
    "reliableMessagingFragmentID"
})
public class DmWSOperationReliableMessaging {

    @XmlElement(name = "Options", required = true, nillable = true)
    protected DmWSRMPolicyBitmap options;
    @XmlElement(name = "DeliveryAssuranceType", required = true, nillable = true)
    protected DmWSRMPolicyDeliveryAssurance deliveryAssuranceType;
    @XmlElement(name = "ReliableMessagingWSDLComponentType", required = true)
    protected DmWSDLComponentType reliableMessagingWSDLComponentType;
    @XmlElement(name = "ReliableMessagingWSDLComponentValue", required = true, nillable = true)
    protected String reliableMessagingWSDLComponentValue;
    @XmlElement(name = "ReliableMessagingSubscription", required = true, nillable = true)
    protected DmReference reliableMessagingSubscription;
    @XmlElement(name = "ReliableMessagingFragmentID", required = true, nillable = true)
    protected String reliableMessagingFragmentID;

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link DmWSRMPolicyBitmap }
     *     
     */
    public DmWSRMPolicyBitmap getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmWSRMPolicyBitmap }
     *     
     */
    public void setOptions(DmWSRMPolicyBitmap value) {
        this.options = value;
    }

    /**
     * Gets the value of the deliveryAssuranceType property.
     * 
     * @return
     *     possible object is
     *     {@link DmWSRMPolicyDeliveryAssurance }
     *     
     */
    public DmWSRMPolicyDeliveryAssurance getDeliveryAssuranceType() {
        return deliveryAssuranceType;
    }

    /**
     * Sets the value of the deliveryAssuranceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmWSRMPolicyDeliveryAssurance }
     *     
     */
    public void setDeliveryAssuranceType(DmWSRMPolicyDeliveryAssurance value) {
        this.deliveryAssuranceType = value;
    }

    /**
     * Gets the value of the reliableMessagingWSDLComponentType property.
     * 
     * @return
     *     possible object is
     *     {@link DmWSDLComponentType }
     *     
     */
    public DmWSDLComponentType getReliableMessagingWSDLComponentType() {
        return reliableMessagingWSDLComponentType;
    }

    /**
     * Sets the value of the reliableMessagingWSDLComponentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmWSDLComponentType }
     *     
     */
    public void setReliableMessagingWSDLComponentType(DmWSDLComponentType value) {
        this.reliableMessagingWSDLComponentType = value;
    }

    /**
     * Gets the value of the reliableMessagingWSDLComponentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReliableMessagingWSDLComponentValue() {
        return reliableMessagingWSDLComponentValue;
    }

    /**
     * Sets the value of the reliableMessagingWSDLComponentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReliableMessagingWSDLComponentValue(String value) {
        this.reliableMessagingWSDLComponentValue = value;
    }

    /**
     * Gets the value of the reliableMessagingSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getReliableMessagingSubscription() {
        return reliableMessagingSubscription;
    }

    /**
     * Sets the value of the reliableMessagingSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setReliableMessagingSubscription(DmReference value) {
        this.reliableMessagingSubscription = value;
    }

    /**
     * Gets the value of the reliableMessagingFragmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReliableMessagingFragmentID() {
        return reliableMessagingFragmentID;
    }

    /**
     * Sets the value of the reliableMessagingFragmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReliableMessagingFragmentID(String value) {
        this.reliableMessagingFragmentID = value;
    }

}
