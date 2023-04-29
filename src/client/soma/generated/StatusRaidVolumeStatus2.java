
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusRaidVolumeStatus2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusRaidVolumeStatus2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VolumeNumber" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.datapower.com/schemas/management}dmRaidVolumeType" minOccurs="0"/>
 *         &lt;element name="VolumeID" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="NumPhysDisks" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.datapower.com/schemas/management}dmRaidVolumeState" minOccurs="0"/>
 *         &lt;element name="Enabled" type="{http://www.datapower.com/schemas/management}dmTruthValue" minOccurs="0"/>
 *         &lt;element name="Quiesced" type="{http://www.datapower.com/schemas/management}dmTruthValue" minOccurs="0"/>
 *         &lt;element name="ResyncInProgress" type="{http://www.datapower.com/schemas/management}dmTruthValue" minOccurs="0"/>
 *         &lt;element name="ResyncPercentage" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="InactiveStatus" type="{http://www.datapower.com/schemas/management}dmRaidVolumeInactiveStatus" minOccurs="0"/>
 *         &lt;element name="BadBlockTableFull" type="{http://www.datapower.com/schemas/management}dmTruthValue" minOccurs="0"/>
 *         &lt;element name="WriteCachingEnable" type="{http://www.datapower.com/schemas/management}dmTruthValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusRaidVolumeStatus2", propOrder = {
    "volumeNumber",
    "type",
    "volumeID",
    "numPhysDisks",
    "state",
    "enabled",
    "quiesced",
    "resyncInProgress",
    "resyncPercentage",
    "inactiveStatus",
    "badBlockTableFull",
    "writeCachingEnable"
})
public class StatusRaidVolumeStatus2 {

    @XmlElement(name = "VolumeNumber")
    protected Long volumeNumber;
    @XmlElement(name = "Type")
    protected DmRaidVolumeType type;
    @XmlElement(name = "VolumeID")
    protected Long volumeID;
    @XmlElement(name = "NumPhysDisks")
    protected Long numPhysDisks;
    @XmlElement(name = "State")
    protected DmRaidVolumeState state;
    @XmlElement(name = "Enabled")
    protected DmTruthValue enabled;
    @XmlElement(name = "Quiesced")
    protected DmTruthValue quiesced;
    @XmlElement(name = "ResyncInProgress")
    protected DmTruthValue resyncInProgress;
    @XmlElement(name = "ResyncPercentage")
    protected Long resyncPercentage;
    @XmlElement(name = "InactiveStatus")
    protected DmRaidVolumeInactiveStatus inactiveStatus;
    @XmlElement(name = "BadBlockTableFull")
    protected DmTruthValue badBlockTableFull;
    @XmlElement(name = "WriteCachingEnable")
    protected DmTruthValue writeCachingEnable;

    /**
     * Gets the value of the volumeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVolumeNumber() {
        return volumeNumber;
    }

    /**
     * Sets the value of the volumeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVolumeNumber(Long value) {
        this.volumeNumber = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link DmRaidVolumeType }
     *     
     */
    public DmRaidVolumeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmRaidVolumeType }
     *     
     */
    public void setType(DmRaidVolumeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the volumeID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVolumeID() {
        return volumeID;
    }

    /**
     * Sets the value of the volumeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVolumeID(Long value) {
        this.volumeID = value;
    }

    /**
     * Gets the value of the numPhysDisks property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumPhysDisks() {
        return numPhysDisks;
    }

    /**
     * Sets the value of the numPhysDisks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumPhysDisks(Long value) {
        this.numPhysDisks = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link DmRaidVolumeState }
     *     
     */
    public DmRaidVolumeState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmRaidVolumeState }
     *     
     */
    public void setState(DmRaidVolumeState value) {
        this.state = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link DmTruthValue }
     *     
     */
    public DmTruthValue getEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmTruthValue }
     *     
     */
    public void setEnabled(DmTruthValue value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the quiesced property.
     * 
     * @return
     *     possible object is
     *     {@link DmTruthValue }
     *     
     */
    public DmTruthValue getQuiesced() {
        return quiesced;
    }

    /**
     * Sets the value of the quiesced property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmTruthValue }
     *     
     */
    public void setQuiesced(DmTruthValue value) {
        this.quiesced = value;
    }

    /**
     * Gets the value of the resyncInProgress property.
     * 
     * @return
     *     possible object is
     *     {@link DmTruthValue }
     *     
     */
    public DmTruthValue getResyncInProgress() {
        return resyncInProgress;
    }

    /**
     * Sets the value of the resyncInProgress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmTruthValue }
     *     
     */
    public void setResyncInProgress(DmTruthValue value) {
        this.resyncInProgress = value;
    }

    /**
     * Gets the value of the resyncPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getResyncPercentage() {
        return resyncPercentage;
    }

    /**
     * Sets the value of the resyncPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setResyncPercentage(Long value) {
        this.resyncPercentage = value;
    }

    /**
     * Gets the value of the inactiveStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DmRaidVolumeInactiveStatus }
     *     
     */
    public DmRaidVolumeInactiveStatus getInactiveStatus() {
        return inactiveStatus;
    }

    /**
     * Sets the value of the inactiveStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmRaidVolumeInactiveStatus }
     *     
     */
    public void setInactiveStatus(DmRaidVolumeInactiveStatus value) {
        this.inactiveStatus = value;
    }

    /**
     * Gets the value of the badBlockTableFull property.
     * 
     * @return
     *     possible object is
     *     {@link DmTruthValue }
     *     
     */
    public DmTruthValue getBadBlockTableFull() {
        return badBlockTableFull;
    }

    /**
     * Sets the value of the badBlockTableFull property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmTruthValue }
     *     
     */
    public void setBadBlockTableFull(DmTruthValue value) {
        this.badBlockTableFull = value;
    }

    /**
     * Gets the value of the writeCachingEnable property.
     * 
     * @return
     *     possible object is
     *     {@link DmTruthValue }
     *     
     */
    public DmTruthValue getWriteCachingEnable() {
        return writeCachingEnable;
    }

    /**
     * Sets the value of the writeCachingEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmTruthValue }
     *     
     */
    public void setWriteCachingEnable(DmTruthValue value) {
        this.writeCachingEnable = value;
    }

}
