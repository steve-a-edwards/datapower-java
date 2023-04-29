
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusPortStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusPortStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PortName" type="{http://www.datapower.com/schemas/management}dmPortName" minOccurs="0"/>
 *         &lt;element name="ServiceNumber" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="ServiceStatus" type="{http://www.datapower.com/schemas/management}dmServiceStatus" minOccurs="0"/>
 *         &lt;element name="PortNumber" type="{http://www.datapower.com/schemas/management}dmIPPort" minOccurs="0"/>
 *         &lt;element name="PortStatus" type="{http://www.datapower.com/schemas/management}dmPortStatus" minOccurs="0"/>
 *         &lt;element name="PacketsReceived" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="PacketsSent" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="PacketsDropped" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="PacketCollisions" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusPortStatus", propOrder = {
    "portName",
    "serviceNumber",
    "serviceStatus",
    "portNumber",
    "portStatus",
    "packetsReceived",
    "packetsSent",
    "packetsDropped",
    "packetCollisions"
})
public class StatusPortStatus {

    @XmlElement(name = "PortName")
    protected DmPortName portName;
    @XmlElement(name = "ServiceNumber")
    protected Long serviceNumber;
    @XmlElement(name = "ServiceStatus")
    protected DmServiceStatus serviceStatus;
    @XmlElement(name = "PortNumber")
    protected Integer portNumber;
    @XmlElement(name = "PortStatus")
    protected DmPortStatus portStatus;
    @XmlElement(name = "PacketsReceived")
    protected Long packetsReceived;
    @XmlElement(name = "PacketsSent")
    protected Long packetsSent;
    @XmlElement(name = "PacketsDropped")
    protected Long packetsDropped;
    @XmlElement(name = "PacketCollisions")
    protected Long packetCollisions;

    /**
     * Gets the value of the portName property.
     * 
     * @return
     *     possible object is
     *     {@link DmPortName }
     *     
     */
    public DmPortName getPortName() {
        return portName;
    }

    /**
     * Sets the value of the portName property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmPortName }
     *     
     */
    public void setPortName(DmPortName value) {
        this.portName = value;
    }

    /**
     * Gets the value of the serviceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServiceNumber() {
        return serviceNumber;
    }

    /**
     * Sets the value of the serviceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServiceNumber(Long value) {
        this.serviceNumber = value;
    }

    /**
     * Gets the value of the serviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DmServiceStatus }
     *     
     */
    public DmServiceStatus getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Sets the value of the serviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmServiceStatus }
     *     
     */
    public void setServiceStatus(DmServiceStatus value) {
        this.serviceStatus = value;
    }

    /**
     * Gets the value of the portNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPortNumber() {
        return portNumber;
    }

    /**
     * Sets the value of the portNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPortNumber(Integer value) {
        this.portNumber = value;
    }

    /**
     * Gets the value of the portStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DmPortStatus }
     *     
     */
    public DmPortStatus getPortStatus() {
        return portStatus;
    }

    /**
     * Sets the value of the portStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmPortStatus }
     *     
     */
    public void setPortStatus(DmPortStatus value) {
        this.portStatus = value;
    }

    /**
     * Gets the value of the packetsReceived property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPacketsReceived() {
        return packetsReceived;
    }

    /**
     * Sets the value of the packetsReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPacketsReceived(Long value) {
        this.packetsReceived = value;
    }

    /**
     * Gets the value of the packetsSent property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPacketsSent() {
        return packetsSent;
    }

    /**
     * Sets the value of the packetsSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPacketsSent(Long value) {
        this.packetsSent = value;
    }

    /**
     * Gets the value of the packetsDropped property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPacketsDropped() {
        return packetsDropped;
    }

    /**
     * Sets the value of the packetsDropped property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPacketsDropped(Long value) {
        this.packetsDropped = value;
    }

    /**
     * Gets the value of the packetCollisions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPacketCollisions() {
        return packetCollisions;
    }

    /**
     * Sets the value of the packetCollisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPacketCollisions(Long value) {
        this.packetCollisions = value;
    }

}
