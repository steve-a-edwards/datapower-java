
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSEndpointRemoteRewriteRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmWSEndpointRemoteRewriteRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServicePortMatchRegexp" type="{http://www.datapower.com/schemas/management}dmPCRE"/>
 *         &lt;element name="RemoteEndpointProtocol" type="{http://www.datapower.com/schemas/management}dmWSRemoteProtocolType"/>
 *         &lt;element name="RemoteEndpointHostname" type="{http://www.datapower.com/schemas/management}dmHostname"/>
 *         &lt;element name="RemoteEndpointPort" type="{http://www.datapower.com/schemas/management}dmIPPort"/>
 *         &lt;element name="RemoteEndpointURI" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="RemoteMQQM" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="RemoteTibcoEMS" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="RemoteWebSphereJMS" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmWSEndpointRemoteRewriteRule", propOrder = {
    "servicePortMatchRegexp",
    "remoteEndpointProtocol",
    "remoteEndpointHostname",
    "remoteEndpointPort",
    "remoteEndpointURI",
    "remoteMQQM",
    "remoteTibcoEMS",
    "remoteWebSphereJMS"
})
public class DmWSEndpointRemoteRewriteRule {

    @XmlElement(name = "ServicePortMatchRegexp", required = true, nillable = true)
    protected String servicePortMatchRegexp;
    @XmlElement(name = "RemoteEndpointProtocol", required = true, nillable = true)
    protected DmWSRemoteProtocolType remoteEndpointProtocol;
    @XmlElement(name = "RemoteEndpointHostname", required = true, nillable = true)
    protected String remoteEndpointHostname;
    @XmlElement(name = "RemoteEndpointPort", required = true, type = Integer.class, nillable = true)
    protected Integer remoteEndpointPort;
    @XmlElement(name = "RemoteEndpointURI", required = true, nillable = true)
    protected String remoteEndpointURI;
    @XmlElement(name = "RemoteMQQM", required = true, nillable = true)
    protected DmReference remoteMQQM;
    @XmlElement(name = "RemoteTibcoEMS", required = true, nillable = true)
    protected DmReference remoteTibcoEMS;
    @XmlElement(name = "RemoteWebSphereJMS", required = true, nillable = true)
    protected DmReference remoteWebSphereJMS;

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
     * Gets the value of the remoteEndpointProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link DmWSRemoteProtocolType }
     *     
     */
    public DmWSRemoteProtocolType getRemoteEndpointProtocol() {
        return remoteEndpointProtocol;
    }

    /**
     * Sets the value of the remoteEndpointProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmWSRemoteProtocolType }
     *     
     */
    public void setRemoteEndpointProtocol(DmWSRemoteProtocolType value) {
        this.remoteEndpointProtocol = value;
    }

    /**
     * Gets the value of the remoteEndpointHostname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteEndpointHostname() {
        return remoteEndpointHostname;
    }

    /**
     * Sets the value of the remoteEndpointHostname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteEndpointHostname(String value) {
        this.remoteEndpointHostname = value;
    }

    /**
     * Gets the value of the remoteEndpointPort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRemoteEndpointPort() {
        return remoteEndpointPort;
    }

    /**
     * Sets the value of the remoteEndpointPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemoteEndpointPort(Integer value) {
        this.remoteEndpointPort = value;
    }

    /**
     * Gets the value of the remoteEndpointURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteEndpointURI() {
        return remoteEndpointURI;
    }

    /**
     * Sets the value of the remoteEndpointURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteEndpointURI(String value) {
        this.remoteEndpointURI = value;
    }

    /**
     * Gets the value of the remoteMQQM property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getRemoteMQQM() {
        return remoteMQQM;
    }

    /**
     * Sets the value of the remoteMQQM property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setRemoteMQQM(DmReference value) {
        this.remoteMQQM = value;
    }

    /**
     * Gets the value of the remoteTibcoEMS property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getRemoteTibcoEMS() {
        return remoteTibcoEMS;
    }

    /**
     * Sets the value of the remoteTibcoEMS property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setRemoteTibcoEMS(DmReference value) {
        this.remoteTibcoEMS = value;
    }

    /**
     * Gets the value of the remoteWebSphereJMS property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getRemoteWebSphereJMS() {
        return remoteWebSphereJMS;
    }

    /**
     * Sets the value of the remoteWebSphereJMS property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setRemoteWebSphereJMS(DmReference value) {
        this.remoteWebSphereJMS = value;
    }

}
