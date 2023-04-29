
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSEndpointSubscriptionPublishRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmWSEndpointSubscriptionPublishRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Subscription" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="PublishedEndpointProtocol" type="{http://www.datapower.com/schemas/management}dmWSProtocolType"/>
 *         &lt;element name="PublishedEndpointHostname" type="{http://www.datapower.com/schemas/management}dmHostname"/>
 *         &lt;element name="PublishedEndpointPort" type="{http://www.datapower.com/schemas/management}dmIPPort"/>
 *         &lt;element name="PublishedEndpointURI" type="{http://www.datapower.com/schemas/management}dmString"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmWSEndpointSubscriptionPublishRule", propOrder = {
    "subscription",
    "publishedEndpointProtocol",
    "publishedEndpointHostname",
    "publishedEndpointPort",
    "publishedEndpointURI"
})
public class DmWSEndpointSubscriptionPublishRule {

    @XmlElement(name = "Subscription", required = true, nillable = true)
    protected DmReference subscription;
    @XmlElement(name = "PublishedEndpointProtocol", required = true, nillable = true)
    protected DmWSProtocolType publishedEndpointProtocol;
    @XmlElement(name = "PublishedEndpointHostname", required = true, nillable = true)
    protected String publishedEndpointHostname;
    @XmlElement(name = "PublishedEndpointPort", required = true, type = Integer.class, nillable = true)
    protected Integer publishedEndpointPort;
    @XmlElement(name = "PublishedEndpointURI", required = true, nillable = true)
    protected String publishedEndpointURI;

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
     * Gets the value of the publishedEndpointProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link DmWSProtocolType }
     *     
     */
    public DmWSProtocolType getPublishedEndpointProtocol() {
        return publishedEndpointProtocol;
    }

    /**
     * Sets the value of the publishedEndpointProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmWSProtocolType }
     *     
     */
    public void setPublishedEndpointProtocol(DmWSProtocolType value) {
        this.publishedEndpointProtocol = value;
    }

    /**
     * Gets the value of the publishedEndpointHostname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublishedEndpointHostname() {
        return publishedEndpointHostname;
    }

    /**
     * Sets the value of the publishedEndpointHostname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublishedEndpointHostname(String value) {
        this.publishedEndpointHostname = value;
    }

    /**
     * Gets the value of the publishedEndpointPort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPublishedEndpointPort() {
        return publishedEndpointPort;
    }

    /**
     * Sets the value of the publishedEndpointPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPublishedEndpointPort(Integer value) {
        this.publishedEndpointPort = value;
    }

    /**
     * Gets the value of the publishedEndpointURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublishedEndpointURI() {
        return publishedEndpointURI;
    }

    /**
     * Sets the value of the publishedEndpointURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublishedEndpointURI(String value) {
        this.publishedEndpointURI = value;
    }

}
