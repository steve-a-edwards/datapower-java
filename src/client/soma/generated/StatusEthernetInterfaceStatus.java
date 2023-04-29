
package client.soma.generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusEthernetInterfaceStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusEthernetInterfaceStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.datapower.com/schemas/management}dmPortName" minOccurs="0"/>
 *         &lt;element name="IP" type="{http://www.datapower.com/schemas/management}dmIPNetAddress" minOccurs="0"/>
 *         &lt;element name="MACAddress" type="{http://www.datapower.com/schemas/management}dmMACAddress" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.datapower.com/schemas/management}dmLinkStatus" minOccurs="0"/>
 *         &lt;element name="Negotiate" type="{http://www.datapower.com/schemas/management}dmNegotiateStatus" minOccurs="0"/>
 *         &lt;element name="Mode" type="{http://www.datapower.com/schemas/management}dmEthernetLinkMode" minOccurs="0"/>
 *         &lt;element name="MTU" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="RxKbytes" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *         &lt;element name="RxPackets" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *         &lt;element name="RxErrors" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *         &lt;element name="RxDrops" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *         &lt;element name="TxKbytes" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *         &lt;element name="TxPackets" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *         &lt;element name="TxErrors" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *         &lt;element name="TxDrops" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *         &lt;element name="Collisions" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusEthernetInterfaceStatus", propOrder = {
    "name",
    "ip",
    "macAddress",
    "status",
    "negotiate",
    "mode",
    "mtu",
    "rxKbytes",
    "rxPackets",
    "rxErrors",
    "rxDrops",
    "txKbytes",
    "txPackets",
    "txErrors",
    "txDrops",
    "collisions"
})
public class StatusEthernetInterfaceStatus {

    @XmlElement(name = "Name")
    protected DmPortName name;
    @XmlElement(name = "IP")
    protected String ip;
    @XmlElement(name = "MACAddress")
    protected String macAddress;
    @XmlElement(name = "Status")
    protected DmLinkStatus status;
    @XmlElement(name = "Negotiate")
    protected DmNegotiateStatus negotiate;
    @XmlElement(name = "Mode")
    protected String mode;
    @XmlElement(name = "MTU")
    protected Long mtu;
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
    @XmlElement(name = "Collisions")
    protected BigInteger collisions;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link DmPortName }
     *     
     */
    public DmPortName getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmPortName }
     *     
     */
    public void setName(DmPortName value) {
        this.name = value;
    }

    /**
     * Gets the value of the ip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIP() {
        return ip;
    }

    /**
     * Sets the value of the ip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIP(String value) {
        this.ip = value;
    }

    /**
     * Gets the value of the macAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMACAddress() {
        return macAddress;
    }

    /**
     * Sets the value of the macAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMACAddress(String value) {
        this.macAddress = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link DmLinkStatus }
     *     
     */
    public DmLinkStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmLinkStatus }
     *     
     */
    public void setStatus(DmLinkStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the negotiate property.
     * 
     * @return
     *     possible object is
     *     {@link DmNegotiateStatus }
     *     
     */
    public DmNegotiateStatus getNegotiate() {
        return negotiate;
    }

    /**
     * Sets the value of the negotiate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmNegotiateStatus }
     *     
     */
    public void setNegotiate(DmNegotiateStatus value) {
        this.negotiate = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * Gets the value of the mtu property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMTU() {
        return mtu;
    }

    /**
     * Sets the value of the mtu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMTU(Long value) {
        this.mtu = value;
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

    /**
     * Gets the value of the collisions property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCollisions() {
        return collisions;
    }

    /**
     * Sets the value of the collisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCollisions(BigInteger value) {
        this.collisions = value;
    }

}
