
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusTCPTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusTCPTable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="localIP" type="{http://www.datapower.com/schemas/management}dmLocalIPHostAddress" minOccurs="0"/>
 *         &lt;element name="localPort" type="{http://www.datapower.com/schemas/management}dmIPPort" minOccurs="0"/>
 *         &lt;element name="remoteIP" type="{http://www.datapower.com/schemas/management}dmIPHostAddress" minOccurs="0"/>
 *         &lt;element name="remotePort" type="{http://www.datapower.com/schemas/management}dmIPPort" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.datapower.com/schemas/management}dmTCPState" minOccurs="0"/>
 *         &lt;element name="serviceDomain" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="serviceClass" type="{http://www.datapower.com/schemas/management}dmObjectClass" minOccurs="0"/>
 *         &lt;element name="serviceName" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusTCPTable", propOrder = {
    "localIP",
    "localPort",
    "remoteIP",
    "remotePort",
    "state",
    "serviceDomain",
    "serviceClass",
    "serviceName"
})
public class StatusTCPTable {

    protected String localIP;
    protected Integer localPort;
    protected String remoteIP;
    protected Integer remotePort;
    protected DmTCPState state;
    protected String serviceDomain;
    protected String serviceClass;
    protected String serviceName;

    /**
     * Gets the value of the localIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalIP() {
        return localIP;
    }

    /**
     * Sets the value of the localIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalIP(String value) {
        this.localIP = value;
    }

    /**
     * Gets the value of the localPort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLocalPort() {
        return localPort;
    }

    /**
     * Sets the value of the localPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocalPort(Integer value) {
        this.localPort = value;
    }

    /**
     * Gets the value of the remoteIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteIP() {
        return remoteIP;
    }

    /**
     * Sets the value of the remoteIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteIP(String value) {
        this.remoteIP = value;
    }

    /**
     * Gets the value of the remotePort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRemotePort() {
        return remotePort;
    }

    /**
     * Sets the value of the remotePort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemotePort(Integer value) {
        this.remotePort = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link DmTCPState }
     *     
     */
    public DmTCPState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmTCPState }
     *     
     */
    public void setState(DmTCPState value) {
        this.state = value;
    }

    /**
     * Gets the value of the serviceDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDomain() {
        return serviceDomain;
    }

    /**
     * Sets the value of the serviceDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDomain(String value) {
        this.serviceDomain = value;
    }

    /**
     * Gets the value of the serviceClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceClass() {
        return serviceClass;
    }

    /**
     * Sets the value of the serviceClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceClass(String value) {
        this.serviceClass = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

}
