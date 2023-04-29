
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmLBGroupCheck complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmLBGroupCheck">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Active" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="URI" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="Port" type="{http://www.datapower.com/schemas/management}dmIPPort"/>
 *         &lt;element name="SSL" type="{http://www.datapower.com/schemas/management}dmLBHealthCheckType"/>
 *         &lt;element name="Post" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="Input" type="{http://www.datapower.com/schemas/management}dmURL"/>
 *         &lt;element name="Timeout" type="{http://www.datapower.com/schemas/management}dmUInt32"/>
 *         &lt;element name="Frequency" type="{http://www.datapower.com/schemas/management}dmUInt32"/>
 *         &lt;element name="XPath" type="{http://www.datapower.com/schemas/management}dmXPathExpr"/>
 *         &lt;element name="Filter" type="{http://www.datapower.com/schemas/management}dmURL"/>
 *         &lt;element name="SSLProxyProfile" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmLBGroupCheck", propOrder = {
    "active",
    "uri",
    "port",
    "ssl",
    "post",
    "input",
    "timeout",
    "frequency",
    "xPath",
    "filter",
    "sslProxyProfile"
})
public class DmLBGroupCheck {

    @XmlElement(name = "Active", required = true)
    protected DmToggle active;
    @XmlElement(name = "URI", required = true, nillable = true)
    protected String uri;
    @XmlElement(name = "Port")
    protected int port;
    @XmlElement(name = "SSL", required = true)
    protected DmLBHealthCheckType ssl;
    @XmlElement(name = "Post", required = true, nillable = true)
    protected DmToggle post;
    @XmlElement(name = "Input", required = true, nillable = true)
    protected String input;
    @XmlElement(name = "Timeout")
    protected long timeout;
    @XmlElement(name = "Frequency")
    protected long frequency;
    @XmlElement(name = "XPath", required = true, nillable = true)
    protected String xPath;
    @XmlElement(name = "Filter", required = true, nillable = true)
    protected String filter;
    @XmlElement(name = "SSLProxyProfile", required = true, nillable = true)
    protected DmReference sslProxyProfile;

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setActive(DmToggle value) {
        this.active = value;
    }

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURI() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURI(String value) {
        this.uri = value;
    }

    /**
     * Gets the value of the port property.
     * 
     */
    public int getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     */
    public void setPort(int value) {
        this.port = value;
    }

    /**
     * Gets the value of the ssl property.
     * 
     * @return
     *     possible object is
     *     {@link DmLBHealthCheckType }
     *     
     */
    public DmLBHealthCheckType getSSL() {
        return ssl;
    }

    /**
     * Sets the value of the ssl property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmLBHealthCheckType }
     *     
     */
    public void setSSL(DmLBHealthCheckType value) {
        this.ssl = value;
    }

    /**
     * Gets the value of the post property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getPost() {
        return post;
    }

    /**
     * Sets the value of the post property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setPost(DmToggle value) {
        this.post = value;
    }

    /**
     * Gets the value of the input property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInput() {
        return input;
    }

    /**
     * Sets the value of the input property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInput(String value) {
        this.input = value;
    }

    /**
     * Gets the value of the timeout property.
     * 
     */
    public long getTimeout() {
        return timeout;
    }

    /**
     * Sets the value of the timeout property.
     * 
     */
    public void setTimeout(long value) {
        this.timeout = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     */
    public long getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     */
    public void setFrequency(long value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the xPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXPath() {
        return xPath;
    }

    /**
     * Sets the value of the xPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXPath(String value) {
        this.xPath = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilter(String value) {
        this.filter = value;
    }

    /**
     * Gets the value of the sslProxyProfile property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getSSLProxyProfile() {
        return sslProxyProfile;
    }

    /**
     * Sets the value of the sslProxyProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setSSLProxyProfile(DmReference value) {
        this.sslProxyProfile = value;
    }

}
