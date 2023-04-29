
package client.soma.generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusNetworkInterfaceStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusNetworkInterfaceStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InterfaceIndex" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="InterfaceType" type="{http://www.datapower.com/schemas/management}dmInterfaceType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="AdminStatus" type="{http://www.datapower.com/schemas/management}dmInterfaceAdminStatus" minOccurs="0"/>
 *         &lt;element name="OperStatus" type="{http://www.datapower.com/schemas/management}dmInterfaceOperStatus" minOccurs="0"/>
 *         &lt;element name="IP" type="{http://www.datapower.com/schemas/management}dmIPNetAddress" minOccurs="0"/>
 *         &lt;element name="MACAddress" type="{http://www.datapower.com/schemas/management}dmMACAddress" minOccurs="0"/>
 *         &lt;element name="MTU" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
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
@XmlType(name = "StatusNetworkInterfaceStatus", propOrder = {
    "interfaceIndex",
    "interfaceType",
    "name",
    "adminStatus",
    "operStatus",
    "ip",
    "macAddress",
    "mtu",
    "rxKbytes",
    "rxPackets",
    "rxErrors",
    "rxDrops",
    "txKbytes",
    "txPackets",
    "txErrors",
    "txDrops"
})
public class StatusNetworkInterfaceStatus {

    @XmlElement(name = "InterfaceIndex")
    protected Long interfaceIndex;
    @XmlElement(name = "InterfaceType")
    protected DmInterfaceType interfaceType;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "AdminStatus")
    protected DmInterfaceAdminStatus adminStatus;
    @XmlElement(name = "OperStatus")
    protected DmInterfaceOperStatus operStatus;
    @XmlElement(name = "IP")
    protected String ip;
    @XmlElement(name = "MACAddress")
    protected String macAddress;
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

    /**
     * Gets the value of the interfaceIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInterfaceIndex() {
        return interfaceIndex;
    }

    /**
     * Sets the value of the interfaceIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInterfaceIndex(Long value) {
        this.interfaceIndex = value;
    }

    /**
     * Gets the value of the interfaceType property.
     * 
     * @return
     *     possible object is
     *     {@link DmInterfaceType }
     *     
     */
    public DmInterfaceType getInterfaceType() {
        return interfaceType;
    }

    /**
     * Sets the value of the interfaceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmInterfaceType }
     *     
     */
    public void setInterfaceType(DmInterfaceType value) {
        this.interfaceType = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the adminStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DmInterfaceAdminStatus }
     *     
     */
    public DmInterfaceAdminStatus getAdminStatus() {
        return adminStatus;
    }

    /**
     * Sets the value of the adminStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmInterfaceAdminStatus }
     *     
     */
    public void setAdminStatus(DmInterfaceAdminStatus value) {
        this.adminStatus = value;
    }

    /**
     * Gets the value of the operStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DmInterfaceOperStatus }
     *     
     */
    public DmInterfaceOperStatus getOperStatus() {
        return operStatus;
    }

    /**
     * Sets the value of the operStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmInterfaceOperStatus }
     *     
     */
    public void setOperStatus(DmInterfaceOperStatus value) {
        this.operStatus = value;
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

}
