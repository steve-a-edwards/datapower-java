
package client.soma.generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusRaidArrayStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusRaidArrayStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ControllerID" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="ArrayID" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="LogicalDriveID" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="RaidLevel" type="{http://www.datapower.com/schemas/management}dmRaidLevel" minOccurs="0"/>
 *         &lt;element name="NumPhysicalDrives" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
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
@XmlType(name = "StatusRaidArrayStatus", propOrder = {
    "controllerID",
    "arrayID",
    "logicalDriveID",
    "raidLevel",
    "numPhysicalDrives",
    "totalSize"
})
public class StatusRaidArrayStatus {

    @XmlElement(name = "ControllerID")
    protected Long controllerID;
    @XmlElement(name = "ArrayID")
    protected Long arrayID;
    @XmlElement(name = "LogicalDriveID")
    protected Long logicalDriveID;
    @XmlElement(name = "RaidLevel")
    protected DmRaidLevel raidLevel;
    @XmlElement(name = "NumPhysicalDrives")
    protected Long numPhysicalDrives;
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
     * Gets the value of the arrayID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getArrayID() {
        return arrayID;
    }

    /**
     * Sets the value of the arrayID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setArrayID(Long value) {
        this.arrayID = value;
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
