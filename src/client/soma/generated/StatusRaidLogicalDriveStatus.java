
package client.soma.generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusRaidLogicalDriveStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusRaidLogicalDriveStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ControllerID" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="LogicalDriveID" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="LogicalDriveName" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="RaidLevel" type="{http://www.datapower.com/schemas/management}dmRaidLevel" minOccurs="0"/>
 *         &lt;element name="NumPhysicalDrives" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.datapower.com/schemas/management}dmRaidLDState" minOccurs="0"/>
 *         &lt;element name="InitProgress" type="{http://www.datapower.com/schemas/management}dmRaidLDInitProgress" minOccurs="0"/>
 *         &lt;element name="CurrReadPolicy" type="{http://www.datapower.com/schemas/management}dmRaidLDCachePolicy" minOccurs="0"/>
 *         &lt;element name="CurrWritePolicy" type="{http://www.datapower.com/schemas/management}dmRaidLDCachePolicy" minOccurs="0"/>
 *         &lt;element name="CurrCachePolicy" type="{http://www.datapower.com/schemas/management}dmRaidLDCachePolicy" minOccurs="0"/>
 *         &lt;element name="AccessPolicy" type="{http://www.datapower.com/schemas/management}dmRaidLDAccessPolicy" minOccurs="0"/>
 *         &lt;element name="BadBlockExists" type="{http://www.datapower.com/schemas/management}dmRaidLDBadBlockExists" minOccurs="0"/>
 *         &lt;element name="TotalSize" type="{http://www.datapower.com/schemas/management}dmUInt64" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusRaidLogicalDriveStatus", propOrder = {
    "controllerID",
    "logicalDriveID",
    "logicalDriveName",
    "raidLevel",
    "numPhysicalDrives",
    "state",
    "initProgress",
    "currReadPolicy",
    "currWritePolicy",
    "currCachePolicy",
    "accessPolicy",
    "badBlockExists",
    "totalSize"
})
public class StatusRaidLogicalDriveStatus {

    @XmlElement(name = "ControllerID")
    protected Long controllerID;
    @XmlElement(name = "LogicalDriveID")
    protected Long logicalDriveID;
    @XmlElement(name = "LogicalDriveName")
    protected String logicalDriveName;
    @XmlElement(name = "RaidLevel")
    protected DmRaidLevel raidLevel;
    @XmlElement(name = "NumPhysicalDrives")
    protected Long numPhysicalDrives;
    @XmlElement(name = "State")
    protected DmRaidLDState state;
    @XmlElement(name = "InitProgress")
    protected DmRaidLDInitProgress initProgress;
    @XmlElement(name = "CurrReadPolicy")
    protected DmRaidLDCachePolicy currReadPolicy;
    @XmlElement(name = "CurrWritePolicy")
    protected DmRaidLDCachePolicy currWritePolicy;
    @XmlElement(name = "CurrCachePolicy")
    protected DmRaidLDCachePolicy currCachePolicy;
    @XmlElement(name = "AccessPolicy")
    protected DmRaidLDAccessPolicy accessPolicy;
    @XmlElement(name = "BadBlockExists")
    protected DmRaidLDBadBlockExists badBlockExists;
    @XmlElement(name = "TotalSize")
    protected BigInteger totalSize;

    /**
     * Gets the value of the controllerID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getControllerID() {
        return controllerID;
    }

    /**
     * Sets the value of the controllerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setControllerID(Long value) {
        this.controllerID = value;
    }

    /**
     * Gets the value of the logicalDriveID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLogicalDriveID() {
        return logicalDriveID;
    }

    /**
     * Sets the value of the logicalDriveID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLogicalDriveID(Long value) {
        this.logicalDriveID = value;
    }

    /**
     * Gets the value of the logicalDriveName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogicalDriveName() {
        return logicalDriveName;
    }

    /**
     * Sets the value of the logicalDriveName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogicalDriveName(String value) {
        this.logicalDriveName = value;
    }

    /**
     * Gets the value of the raidLevel property.
     * 
     * @return
     *     possible object is
     *     {@link DmRaidLevel }
     *     
     */
    public DmRaidLevel getRaidLevel() {
        return raidLevel;
    }

    /**
     * Sets the value of the raidLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmRaidLevel }
     *     
     */
    public void setRaidLevel(DmRaidLevel value) {
        this.raidLevel = value;
    }

    /**
     * Gets the value of the numPhysicalDrives property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumPhysicalDrives() {
        return numPhysicalDrives;
    }

    /**
     * Sets the value of the numPhysicalDrives property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumPhysicalDrives(Long value) {
        this.numPhysicalDrives = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link DmRaidLDState }
     *     
     */
    public DmRaidLDState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmRaidLDState }
     *     
     */
    public void setState(DmRaidLDState value) {
        this.state = value;
    }

    /**
     * Gets the value of the initProgress property.
     * 
     * @return
     *     possible object is
     *     {@link DmRaidLDInitProgress }
     *     
     */
    public DmRaidLDInitProgress getInitProgress() {
        return initProgress;
    }

    /**
     * Sets the value of the initProgress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmRaidLDInitProgress }
     *     
     */
    public void setInitProgress(DmRaidLDInitProgress value) {
        this.initProgress = value;
    }

    /**
     * Gets the value of the currReadPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link DmRaidLDCachePolicy }
     *     
     */
    public DmRaidLDCachePolicy getCurrReadPolicy() {
        return currReadPolicy;
    }

    /**
     * Sets the value of the currReadPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmRaidLDCachePolicy }
     *     
     */
    public void setCurrReadPolicy(DmRaidLDCachePolicy value) {
        this.currReadPolicy = value;
    }

    /**
     * Gets the value of the currWritePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link DmRaidLDCachePolicy }
     *     
     */
    public DmRaidLDCachePolicy getCurrWritePolicy() {
        return currWritePolicy;
    }

    /**
     * Sets the value of the currWritePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmRaidLDCachePolicy }
     *     
     */
    public void setCurrWritePolicy(DmRaidLDCachePolicy value) {
        this.currWritePolicy = value;
    }

    /**
     * Gets the value of the currCachePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link DmRaidLDCachePolicy }
     *     
     */
    public DmRaidLDCachePolicy getCurrCachePolicy() {
        return currCachePolicy;
    }

    /**
     * Sets the value of the currCachePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmRaidLDCachePolicy }
     *     
     */
    public void setCurrCachePolicy(DmRaidLDCachePolicy value) {
        this.currCachePolicy = value;
    }

    /**
     * Gets the value of the accessPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link DmRaidLDAccessPolicy }
     *     
     */
    public DmRaidLDAccessPolicy getAccessPolicy() {
        return accessPolicy;
    }

    /**
     * Sets the value of the accessPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmRaidLDAccessPolicy }
     *     
     */
    public void setAccessPolicy(DmRaidLDAccessPolicy value) {
        this.accessPolicy = value;
    }

    /**
     * Gets the value of the badBlockExists property.
     * 
     * @return
     *     possible object is
     *     {@link DmRaidLDBadBlockExists }
     *     
     */
    public DmRaidLDBadBlockExists getBadBlockExists() {
        return badBlockExists;
    }

    /**
     * Sets the value of the badBlockExists property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmRaidLDBadBlockExists }
     *     
     */
    public void setBadBlockExists(DmRaidLDBadBlockExists value) {
        this.badBlockExists = value;
    }

    /**
     * Gets the value of the totalSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalSize() {
        return totalSize;
    }

    /**
     * Sets the value of the totalSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalSize(BigInteger value) {
        this.totalSize = value;
    }

}
