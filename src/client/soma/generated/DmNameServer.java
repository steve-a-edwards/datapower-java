
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmNameServer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmNameServer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IPAddress" type="{http://www.datapower.com/schemas/management}dmIPHostAddress"/>
 *         &lt;element name="UDPPort" type="{http://www.datapower.com/schemas/management}dmIPPort"/>
 *         &lt;element name="TCPPort" type="{http://www.datapower.com/schemas/management}dmIPPort"/>
 *         &lt;element name="MaxRetries" type="{http://www.datapower.com/schemas/management}dmUInt32"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmNameServer", propOrder = {
    "ipAddress",
    "udpPort",
    "tcpPort",
    "maxRetries"
})
public class DmNameServer {

    @XmlElement(name = "IPAddress", required = true)
    protected String ipAddress;
    @XmlElement(name = "UDPPort")
    protected int udpPort;
    @XmlElement(name = "TCPPort")
    protected int tcpPort;
    @XmlElement(name = "MaxRetries", required = true, type = Long.class, nillable = true)
    protected Long maxRetries;

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the udpPort property.
     * 
     */
    public int getUDPPort() {
        return udpPort;
    }

    /**
     * Sets the value of the udpPort property.
     * 
     */
    public void setUDPPort(int value) {
        this.udpPort = value;
    }

    /**
     * Gets the value of the tcpPort property.
     * 
     */
    public int getTCPPort() {
        return tcpPort;
    }

    /**
     * Sets the value of the tcpPort property.
     * 
     */
    public void setTCPPort(int value) {
        this.tcpPort = value;
    }

    /**
     * Gets the value of the maxRetries property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxRetries() {
        return maxRetries;
    }

    /**
     * Sets the value of the maxRetries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxRetries(Long value) {
        this.maxRetries = value;
    }

}
