
package client.soma.generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusSecureCloudConnectorConnectionsStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusSecureCloudConnectorConnectionsStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Config" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="AdminState" type="{http://www.datapower.com/schemas/management}dmAdminState" minOccurs="0"/>
 *         &lt;element name="OpState" type="{http://www.datapower.com/schemas/management}dmOpState" minOccurs="0"/>
 *         &lt;element name="Interface" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="RemoteIP" type="{http://www.datapower.com/schemas/management}dmHostname" minOccurs="0"/>
 *         &lt;element name="RemotePort" type="{http://www.datapower.com/schemas/management}dmIPPort" minOccurs="0"/>
 *         &lt;element name="LocalTunnelIP" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="RemoteTunnelIP" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.datapower.com/schemas/management}dmTimestamp" minOccurs="0"/>
 *         &lt;element name="RxKbytes" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *         &lt;element name="RxPackets" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *         &lt;element name="RxErrors" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *         &lt;element name="RxDrops" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *         &lt;element name="TxKbytes" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *         &lt;element name="TxPackets" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *         &lt;element name="TxErrors" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *         &lt;element name="TxDrops" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusSecureCloudConnectorConnectionsStatus", propOrder = {
    "config",
    "adminState",
    "opState",
    "_interface",
    "remoteIP",
    "remotePort",
    "localTunnelIP",
    "remoteTunnelIP",
    "startTime",
    "rxKbytes",
    "rxPackets",
    "rxErrors",
    "rxDrops",
    "txKbytes",
    "txPackets",
    "txErrors",
    "txDrops"
})
public class StatusSecureCloudConnectorConnectionsStatus {

    @XmlElement(name = "Config")
    protected String config;
    @XmlElement(name = "AdminState")
    protected DmAdminState adminState;
    @XmlElement(name = "OpState")
    protected DmOpState opState;
    @XmlElement(name = "Interface")
    protected String _interface;
    @XmlElement(name = "RemoteIP")
    protected String remoteIP;
    @XmlElement(name = "RemotePort")
    protected Integer remotePort;
    @XmlElement(name = "LocalTunnelIP")
    protected String localTunnelIP;
    @XmlElement(name = "RemoteTunnelIP")
    protected String remoteTunnelIP;
    @XmlElement(name = "StartTime")
    protected Long startTime;
    @XmlElement(name = "RxKbytes")
    protected BigInteger rxKbytes;
    @XmlElement(name = "RxPackets")
    protected BigInteger rxPackets;
    @XmlElement(name = "RxErrors")
    protected BigInteger rxErrors;
    @XmlElement(name = "RxDrops")
    protected BigInteger rxDrops;
    @XmlElement(name = "TxKbytes")
    protected BigInteger txKbytes;
    @XmlElement(name = "TxPackets")
    protected BigInteger txPackets;
    @XmlElement(name = "TxErrors")
    protected BigInteger txErrors;
    @XmlElement(name = "TxDrops")
    protected BigInteger txDrops;

    /**
     * Gets the value of the config property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfig() {
        return config;
    }

    /**
     * Sets the value of the config property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfig(String value) {
        this.config = value;
    }

    /**
     * Gets the value of the adminState property.
     * 
     * @return
     *     possible object is
     *     {@link DmAdminState }
     *     
     */
    public DmAdminState getAdminState() {
        return adminState;
    }

    /**
     * Sets the value of the adminState property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmAdminState }
     *     
     */
    public void setAdminState(DmAdminState value) {
        this.adminState = value;
    }

    /**
     * Gets the value of the opState property.
     * 
     * @return
     *     possible object is
     *     {@link DmOpState }
     *     
     */
    public DmOpState getOpState() {
        return opState;
    }

    /**
     * Sets the value of the opState property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmOpState }
     *     
     */
    public void setOpState(DmOpState value) {
        this.opState = value;
    }

    /**
     * Gets the value of the interface property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterface() {
        return _interface;
    }

    /**
     * Sets the value of the interface property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterface(String value) {
        this._interface = value;
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
     * Gets the value of the localTunnelIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalTunnelIP() {
        return localTunnelIP;
    }

    /**
     * Sets the value of the localTunnelIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalTunnelIP(String value) {
        this.localTunnelIP = value;
    }

    /**
     * Gets the value of the remoteTunnelIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteTunnelIP() {
        return remoteTunnelIP;
    }

    /**
     * Sets the value of the remoteTunnelIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteTunnelIP(String value) {
        this.remoteTunnelIP = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStartTime(Long value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the rxKbytes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRxKbytes() {
        return rxKbytes;
    }

    /**
     * Sets the value of the rxKbytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRxKbytes(BigInteger value) {
        this.rxKbytes = value;
    }

    /**
     * Gets the value of the rxPackets property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRxPackets() {
        return rxPackets;
    }

    /**
     * Sets the value of the rxPackets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRxPackets(BigInteger value) {
        this.rxPackets = value;
    }

    /**
     * Gets the value of the rxErrors property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRxErrors() {
        return rxErrors;
    }

    /**
     * Sets the value of the rxErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRxErrors(BigInteger value) {
        this.rxErrors = value;
    }

    /**
     * Gets the value of the rxDrops property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRxDrops() {
        return rxDrops;
    }

    /**
     * Sets the value of the rxDrops property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRxDrops(BigInteger value) {
        this.rxDrops = value;
    }

    /**
     * Gets the value of the txKbytes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTxKbytes() {
        return txKbytes;
    }

    /**
     * Sets the value of the txKbytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTxKbytes(BigInteger value) {
        this.txKbytes = value;
    }

    /**
     * Gets the value of the txPackets property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTxPackets() {
        return txPackets;
    }

    /**
     * Sets the value of the txPackets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTxPackets(BigInteger value) {
        this.txPackets = value;
    }

    /**
     * Gets the value of the txErrors property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTxErrors() {
        return txErrors;
    }

    /**
     * Sets the value of the txErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTxErrors(BigInteger value) {
        this.txErrors = value;
    }

    /**
     * Gets the value of the txDrops property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTxDrops() {
        return txDrops;
    }

    /**
     * Sets the value of the txDrops property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTxDrops(BigInteger value) {
        this.txDrops = value;
    }

}
