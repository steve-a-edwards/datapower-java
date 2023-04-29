
package client.soma.generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusEthernetCountersStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusEthernetCountersStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InterfaceIndex" type="{http://www.datapower.com/schemas/management}dmInt32" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="InUnicastPackets" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *         &lt;element name="InMulticastPackets" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *         &lt;element name="InBroadcastPackets" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *         &lt;element name="OutUnicastPackets" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *         &lt;element name="OutMulticastPackets" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *         &lt;element name="OutBroadcastPackets" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *         &lt;element name="InOctets" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *         &lt;element name="OutOctets" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *         &lt;element name="InErrors" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *         &lt;element name="OutErrors" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *         &lt;element name="OutDiscards" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *         &lt;element name="AlignmentErrors" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *         &lt;element name="FCSErrors" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *         &lt;element name="SingleCollisionFrames" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *         &lt;element name="MultipleCollisionFrames" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *         &lt;element name="SQETestErrors" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *         &lt;element name="DeferredTransmissions" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *         &lt;element name="LateCollisions" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *         &lt;element name="ExcessiveCollisions" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *         &lt;element name="InternalMacTransmitErrors" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *         &lt;element name="CarrierSenseErrors" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *         &lt;element name="FrameTooShorts" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *         &lt;element name="FrameTooLongs" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *         &lt;element name="InternalMacReceiveErrors" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *         &lt;element name="InPauseFrames" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *         &lt;element name="OutPauseFrames" type="{http://www.datapower.com/schemas/management}dmCounter64" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusEthernetCountersStatus", propOrder = {
    "interfaceIndex",
    "name",
    "inUnicastPackets",
    "inMulticastPackets",
    "inBroadcastPackets",
    "outUnicastPackets",
    "outMulticastPackets",
    "outBroadcastPackets",
    "inOctets",
    "outOctets",
    "inErrors",
    "outErrors",
    "outDiscards",
    "alignmentErrors",
    "fcsErrors",
    "singleCollisionFrames",
    "multipleCollisionFrames",
    "sqeTestErrors",
    "deferredTransmissions",
    "lateCollisions",
    "excessiveCollisions",
    "internalMacTransmitErrors",
    "carrierSenseErrors",
    "frameTooShorts",
    "frameTooLongs",
    "internalMacReceiveErrors",
    "inPauseFrames",
    "outPauseFrames"
})
public class StatusEthernetCountersStatus {

    @XmlElement(name = "InterfaceIndex")
    protected Integer interfaceIndex;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "InUnicastPackets")
    protected BigInteger inUnicastPackets;
    @XmlElement(name = "InMulticastPackets")
    protected BigInteger inMulticastPackets;
    @XmlElement(name = "InBroadcastPackets")
    protected BigInteger inBroadcastPackets;
    @XmlElement(name = "OutUnicastPackets")
    protected BigInteger outUnicastPackets;
    @XmlElement(name = "OutMulticastPackets")
    protected BigInteger outMulticastPackets;
    @XmlElement(name = "OutBroadcastPackets")
    protected BigInteger outBroadcastPackets;
    @XmlElement(name = "InOctets")
    protected BigInteger inOctets;
    @XmlElement(name = "OutOctets")
    protected BigInteger outOctets;
    @XmlElement(name = "InErrors")
    protected BigInteger inErrors;
    @XmlElement(name = "OutErrors")
    protected BigInteger outErrors;
    @XmlElement(name = "OutDiscards")
    protected BigInteger outDiscards;
    @XmlElement(name = "AlignmentErrors")
    protected BigInteger alignmentErrors;
    @XmlElement(name = "FCSErrors")
    protected BigInteger fcsErrors;
    @XmlElement(name = "SingleCollisionFrames")
    protected BigInteger singleCollisionFrames;
    @XmlElement(name = "MultipleCollisionFrames")
    protected BigInteger multipleCollisionFrames;
    @XmlElement(name = "SQETestErrors")
    protected BigInteger sqeTestErrors;
    @XmlElement(name = "DeferredTransmissions")
    protected BigInteger deferredTransmissions;
    @XmlElement(name = "LateCollisions")
    protected BigInteger lateCollisions;
    @XmlElement(name = "ExcessiveCollisions")
    protected BigInteger excessiveCollisions;
    @XmlElement(name = "InternalMacTransmitErrors")
    protected BigInteger internalMacTransmitErrors;
    @XmlElement(name = "CarrierSenseErrors")
    protected BigInteger carrierSenseErrors;
    @XmlElement(name = "FrameTooShorts")
    protected BigInteger frameTooShorts;
    @XmlElement(name = "FrameTooLongs")
    protected BigInteger frameTooLongs;
    @XmlElement(name = "InternalMacReceiveErrors")
    protected BigInteger internalMacReceiveErrors;
    @XmlElement(name = "InPauseFrames")
    protected BigInteger inPauseFrames;
    @XmlElement(name = "OutPauseFrames")
    protected BigInteger outPauseFrames;

    /**
     * Gets the value of the interfaceIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInterfaceIndex() {
        return interfaceIndex;
    }

    /**
     * Sets the value of the interfaceIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInterfaceIndex(Integer value) {
        this.interfaceIndex = value;
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
     * Gets the value of the inUnicastPackets property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInUnicastPackets() {
        return inUnicastPackets;
    }

    /**
     * Sets the value of the inUnicastPackets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInUnicastPackets(BigInteger value) {
        this.inUnicastPackets = value;
    }

    /**
     * Gets the value of the inMulticastPackets property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInMulticastPackets() {
        return inMulticastPackets;
    }

    /**
     * Sets the value of the inMulticastPackets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInMulticastPackets(BigInteger value) {
        this.inMulticastPackets = value;
    }

    /**
     * Gets the value of the inBroadcastPackets property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInBroadcastPackets() {
        return inBroadcastPackets;
    }

    /**
     * Sets the value of the inBroadcastPackets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInBroadcastPackets(BigInteger value) {
        this.inBroadcastPackets = value;
    }

    /**
     * Gets the value of the outUnicastPackets property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOutUnicastPackets() {
        return outUnicastPackets;
    }

    /**
     * Sets the value of the outUnicastPackets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOutUnicastPackets(BigInteger value) {
        this.outUnicastPackets = value;
    }

    /**
     * Gets the value of the outMulticastPackets property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOutMulticastPackets() {
        return outMulticastPackets;
    }

    /**
     * Sets the value of the outMulticastPackets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOutMulticastPackets(BigInteger value) {
        this.outMulticastPackets = value;
    }

    /**
     * Gets the value of the outBroadcastPackets property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOutBroadcastPackets() {
        return outBroadcastPackets;
    }

    /**
     * Sets the value of the outBroadcastPackets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOutBroadcastPackets(BigInteger value) {
        this.outBroadcastPackets = value;
    }

    /**
     * Gets the value of the inOctets property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInOctets() {
        return inOctets;
    }

    /**
     * Sets the value of the inOctets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInOctets(BigInteger value) {
        this.inOctets = value;
    }

    /**
     * Gets the value of the outOctets property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOutOctets() {
        return outOctets;
    }

    /**
     * Sets the value of the outOctets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOutOctets(BigInteger value) {
        this.outOctets = value;
    }

    /**
     * Gets the value of the inErrors property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInErrors() {
        return inErrors;
    }

    /**
     * Sets the value of the inErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInErrors(BigInteger value) {
        this.inErrors = value;
    }

    /**
     * Gets the value of the outErrors property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOutErrors() {
        return outErrors;
    }

    /**
     * Sets the value of the outErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOutErrors(BigInteger value) {
        this.outErrors = value;
    }

    /**
     * Gets the value of the outDiscards property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOutDiscards() {
        return outDiscards;
    }

    /**
     * Sets the value of the outDiscards property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOutDiscards(BigInteger value) {
        this.outDiscards = value;
    }

    /**
     * Gets the value of the alignmentErrors property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAlignmentErrors() {
        return alignmentErrors;
    }

    /**
     * Sets the value of the alignmentErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAlignmentErrors(BigInteger value) {
        this.alignmentErrors = value;
    }

    /**
     * Gets the value of the fcsErrors property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFCSErrors() {
        return fcsErrors;
    }

    /**
     * Sets the value of the fcsErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFCSErrors(BigInteger value) {
        this.fcsErrors = value;
    }

    /**
     * Gets the value of the singleCollisionFrames property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSingleCollisionFrames() {
        return singleCollisionFrames;
    }

    /**
     * Sets the value of the singleCollisionFrames property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSingleCollisionFrames(BigInteger value) {
        this.singleCollisionFrames = value;
    }

    /**
     * Gets the value of the multipleCollisionFrames property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMultipleCollisionFrames() {
        return multipleCollisionFrames;
    }

    /**
     * Sets the value of the multipleCollisionFrames property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMultipleCollisionFrames(BigInteger value) {
        this.multipleCollisionFrames = value;
    }

    /**
     * Gets the value of the sqeTestErrors property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSQETestErrors() {
        return sqeTestErrors;
    }

    /**
     * Sets the value of the sqeTestErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSQETestErrors(BigInteger value) {
        this.sqeTestErrors = value;
    }

    /**
     * Gets the value of the deferredTransmissions property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeferredTransmissions() {
        return deferredTransmissions;
    }

    /**
     * Sets the value of the deferredTransmissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeferredTransmissions(BigInteger value) {
        this.deferredTransmissions = value;
    }

    /**
     * Gets the value of the lateCollisions property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLateCollisions() {
        return lateCollisions;
    }

    /**
     * Sets the value of the lateCollisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLateCollisions(BigInteger value) {
        this.lateCollisions = value;
    }

    /**
     * Gets the value of the excessiveCollisions property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExcessiveCollisions() {
        return excessiveCollisions;
    }

    /**
     * Sets the value of the excessiveCollisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExcessiveCollisions(BigInteger value) {
        this.excessiveCollisions = value;
    }

    /**
     * Gets the value of the internalMacTransmitErrors property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInternalMacTransmitErrors() {
        return internalMacTransmitErrors;
    }

    /**
     * Sets the value of the internalMacTransmitErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInternalMacTransmitErrors(BigInteger value) {
        this.internalMacTransmitErrors = value;
    }

    /**
     * Gets the value of the carrierSenseErrors property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCarrierSenseErrors() {
        return carrierSenseErrors;
    }

    /**
     * Sets the value of the carrierSenseErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCarrierSenseErrors(BigInteger value) {
        this.carrierSenseErrors = value;
    }

    /**
     * Gets the value of the frameTooShorts property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFrameTooShorts() {
        return frameTooShorts;
    }

    /**
     * Sets the value of the frameTooShorts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFrameTooShorts(BigInteger value) {
        this.frameTooShorts = value;
    }

    /**
     * Gets the value of the frameTooLongs property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFrameTooLongs() {
        return frameTooLongs;
    }

    /**
     * Sets the value of the frameTooLongs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFrameTooLongs(BigInteger value) {
        this.frameTooLongs = value;
    }

    /**
     * Gets the value of the internalMacReceiveErrors property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInternalMacReceiveErrors() {
        return internalMacReceiveErrors;
    }

    /**
     * Sets the value of the internalMacReceiveErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInternalMacReceiveErrors(BigInteger value) {
        this.internalMacReceiveErrors = value;
    }

    /**
     * Gets the value of the inPauseFrames property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInPauseFrames() {
        return inPauseFrames;
    }

    /**
     * Sets the value of the inPauseFrames property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInPauseFrames(BigInteger value) {
        this.inPauseFrames = value;
    }

    /**
     * Gets the value of the outPauseFrames property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOutPauseFrames() {
        return outPauseFrames;
    }

    /**
     * Sets the value of the outPauseFrames property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOutPauseFrames(BigInteger value) {
        this.outPauseFrames = value;
    }

}
