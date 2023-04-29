
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSEndpointPublishRewriteRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmWSEndpointPublishRewriteRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServicePortMatchRegexp" type="{http://www.datapower.com/schemas/management}dmPCRE"/>
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
@XmlType(name = "dmWSEndpointPublishRewriteRule", propOrder = {
    "servicePortMatchRegexp",
    "publishedEndpointProtocol",
    "publishedEndpointHostname",
    "publishedEndpointPort",
    "publishedEndpointURI"
})
public class DmWSEndpointPublishRewriteRule {

    @XmlElement(name = "ServicePortMatchRegexp", required = true, nillable = true)
    protected String servicePortMatchRegexp;
    @XmlElement(name = "PublishedEndpointProtocol", required = true, nillable = true)
    protected DmWSProtocolType publishedEndpointProtocol;
    @XmlElement(name = "PublishedEndpointHostname", required = true, nillable = true)
    protected String publishedEndpointHostname;
    @XmlElement(name = "PublishedEndpointPort", required = true, type = Integer.class, nillable = true)
    protected Integer publishedEndpointPort;
    @XmlElement(name = "PublishedEndpointURI", required = true, nillable = true)
    protected String publishedEndpointURI;

    /**
     * Gets the value of the servicePortMatchRegexp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicePortMatchRegexp() {
        return servicePortMatchRegexp;
    }

    /**
     * Sets the value of the servicePortMatchRegexp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicePortMatchRegexp(String value) {
        this.servicePortMatchRegexp = value;
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
