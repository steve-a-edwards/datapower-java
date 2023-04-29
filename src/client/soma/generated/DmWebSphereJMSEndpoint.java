
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWebSphereJMSEndpoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmWebSphereJMSEndpoint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Host" type="{http://www.datapower.com/schemas/management}dmHostname"/>
 *         &lt;element name="Port" type="{http://www.datapower.com/schemas/management}dmIPPort"/>
 *         &lt;element name="Transport" type="{http://www.datapower.com/schemas/management}dmWebSphereJMSTransport"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmWebSphereJMSEndpoint", propOrder = {
    "host",
    "port",
    "transport"
})
public class DmWebSphereJMSEndpoint {

    @XmlElement(name = "Host", required = true)
    protected String host;
    @XmlElement(name = "Port")
    protected int port;
    @XmlElement(name = "Transport", required = true)
    protected DmWebSphereJMSTransport transport;

    /**
     * Gets the value of the host property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHost(String value) {
        this.host = value;
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
     * Gets the value of the transport property.
     * 
     * @return
     *     possible object is
     *     {@link DmWebSphereJMSTransport }
     *     
     */
    public DmWebSphereJMSTransport getTransport() {
        return transport;
    }

    /**
     * Sets the value of the transport property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmWebSphereJMSTransport }
     *     
     */
    public void setTransport(DmWebSphereJMSTransport value) {
        this.transport = value;
    }

}
