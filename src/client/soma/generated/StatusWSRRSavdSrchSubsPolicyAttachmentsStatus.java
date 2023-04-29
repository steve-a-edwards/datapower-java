
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusWSRRSavdSrchSubsPolicyAttachmentsStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusWSRRSavdSrchSubsPolicyAttachmentsStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Subscription" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="AttachmentPoint" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="AttachmentURLs" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusWSRRSavdSrchSubsPolicyAttachmentsStatus", propOrder = {
    "subscription",
    "attachmentPoint",
    "attachmentURLs"
})
public class StatusWSRRSavdSrchSubsPolicyAttachmentsStatus {

    @XmlElement(name = "Subscription")
    protected DmReference subscription;
    @XmlElement(name = "AttachmentPoint")
    protected String attachmentPoint;
    @XmlElement(name = "AttachmentURLs")
    protected String attachmentURLs;

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
     * Gets the value of the attachmentPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentPoint() {
        return attachmentPoint;
    }

    /**
     * Sets the value of the attachmentPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentPoint(String value) {
        this.attachmentPoint = value;
    }

    /**
     * Gets the value of the attachmentURLs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentURLs() {
        return attachmentURLs;
    }

    /**
     * Sets the value of the attachmentURLs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentURLs(String value) {
        this.attachmentURLs = value;
    }

}
