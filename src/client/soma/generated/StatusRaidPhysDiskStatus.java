
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusRaidPhysDiskStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusRaidPhysDiskStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VolumeNumber" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="DiskNumber" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="PhysDiskNum" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="Target" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.datapower.com/schemas/management}dmRaidPhysDiskState" minOccurs="0"/>
 *         &lt;element name="Role" type="{http://www.datapower.com/schemas/management}dmRaidPhysDiskRole" minOccurs="0"/>
 *         &lt;element name="VendorID" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="ProductID" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Revision" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Identifier" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="OutOfSync" type="{http://www.datapower.com/schemas/management}dmTruthValue" minOccurs="0"/>
 *         &lt;element name="Quiesced" type="{http://www.datapower.com/schemas/management}dmTruthValue" minOccurs="0"/>
 *         &lt;element name="InactiveVolume" type="{http://www.datapower.com/schemas/management}dmTruthValue" minOccurs="0"/>
 *         &lt;element name="OptimalPrevious" type="{http://www.datapower.com/schemas/management}dmTruthValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusRaidPhysDiskStatus", propOrder = {
    "volumeNumber",
    "diskNumber",
    "physDiskNum",
    "target",
    "location",
    "state",
    "role",
    "vendorID",
    "productID",
    "revision",
    "identifier",
    "outOfSync",
    "quiesced",
    "inactiveVolume",
    "optimalPrevious"
})
public class StatusRaidPhysDiskStatus {

    @XmlElement(name = "VolumeNumber")
    protected Long volumeNumber;
    @XmlElement(name = "DiskNumber")
    protected Long diskNumber;
    @XmlElement(name = "PhysDiskNum")
    protected Long physDiskNum;
    @XmlElement(name = "Target")
    protected Long target;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "State")
    protected DmRaidPhysDiskState state;
    @XmlElement(name = "Role")
    protected DmRaidPhysDiskRole role;
    @XmlElement(name = "VendorID")
    protected String vendorID;
    @XmlElement(name = "ProductID")
    protected String productID;
    @XmlElement(name = "Revision")
    protected String revision;
    @XmlElement(name = "Identifier")
    protected String identifier;
    @XmlElement(name = "OutOfSync")
    protected DmTruthValue outOfSync;
    @XmlElement(name = "Quiesced")
    protected DmTruthValue quiesced;
    @XmlElement(name = "InactiveVolume")
    protected DmTruthValue inactiveVolume;
    @XmlElement(name = "OptimalPrevious")
    protected DmTruthValue optimalPrevious;

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
     * Gets the value of the diskNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDiskNumber() {
        return diskNumber;
    }

    /**
     * Sets the value of the diskNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDiskNumber(Long value) {
        this.diskNumber = value;
    }

    /**
     * Gets the value of the physDiskNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPhysDiskNum() {
        return physDiskNum;
    }

    /**
     * Sets the value of the physDiskNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPhysDiskNum(Long value) {
        this.physDiskNum = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTarget(Long value) {
        this.target = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link DmRaidPhysDiskState }
     *     
     */
    public DmRaidPhysDiskState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmRaidPhysDiskState }
     *     
     */
    public void setState(DmRaidPhysDiskState value) {
        this.state = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link DmRaidPhysDiskRole }
     *     
     */
    public DmRaidPhysDiskRole getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmRaidPhysDiskRole }
     *     
     */
    public void setRole(DmRaidPhysDiskRole value) {
        this.role = value;
    }

    /**
     * Gets the value of the vendorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorID() {
        return vendorID;
    }

    /**
     * Sets the value of the vendorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorID(String value) {
        this.vendorID = value;
    }

    /**
     * Gets the value of the productID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductID() {
        return productID;
    }

    /**
     * Sets the value of the productID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductID(String value) {
        this.productID = value;
    }

    /**
     * Gets the value of the revision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevision() {
        return revision;
    }

    /**
     * Sets the value of the revision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevision(String value) {
        this.revision = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the outOfSync property.
     * 
     * @return
     *     possible object is
     *     {@link DmTruthValue }
     *     
     */
    public DmTruthValue getOutOfSync() {
        return outOfSync;
    }

    /**
     * Sets the value of the outOfSync property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmTruthValue }
     *     
     */
    public void setOutOfSync(DmTruthValue value) {
        this.outOfSync = value;
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
     * Gets the value of the inactiveVolume property.
     * 
     * @return
     *     possible object is
     *     {@link DmTruthValue }
     *     
     */
    public DmTruthValue getInactiveVolume() {
        return inactiveVolume;
    }

    /**
     * Sets the value of the inactiveVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmTruthValue }
     *     
     */
    public void setInactiveVolume(DmTruthValue value) {
        this.inactiveVolume = value;
    }

    /**
     * Gets the value of the optimalPrevious property.
     * 
     * @return
     *     possible object is
     *     {@link DmTruthValue }
     *     
     */
    public DmTruthValue getOptimalPrevious() {
        return optimalPrevious;
    }

    /**
     * Sets the value of the optimalPrevious property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmTruthValue }
     *     
     */
    public void setOptimalPrevious(DmTruthValue value) {
        this.optimalPrevious = value;
    }

}
