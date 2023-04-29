
package client.soma.generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusRaidPhysicalDriveStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusRaidPhysicalDriveStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ControllerID" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="DeviceID" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="ArrayID" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="LogicalDriveID" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="LogicalDriveName" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Position" type="{http://www.datapower.com/schemas/management}dmRaidPDPos" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.datapower.com/schemas/management}dmRaidPDState" minOccurs="0"/>
 *         &lt;element name="ProgressPercent" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="RawSize" type="{http://www.datapower.com/schemas/management}dmUInt64" minOccurs="0"/>
 *         &lt;element name="CoercedSize" type="{http://www.datapower.com/schemas/management}dmUInt64" minOccurs="0"/>
 *         &lt;element name="InterfaceType" type="{http://www.datapower.com/schemas/management}dmRaidPDInterfaceType" minOccurs="0"/>
 *         &lt;element name="InterfaceSpeed" type="{http://www.datapower.com/schemas/management}dmRaidSasInterfaceSpeed" minOccurs="0"/>
 *         &lt;element name="SASaddress" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="VendorID" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="ProductID" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Revision" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="SpecificInfo" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusRaidPhysicalDriveStatus", propOrder = {
    "controllerID",
    "deviceID",
    "arrayID",
    "logicalDriveID",
    "logicalDriveName",
    "position",
    "state",
    "progressPercent",
    "rawSize",
    "coercedSize",
    "interfaceType",
    "interfaceSpeed",
    "saSaddress",
    "vendorID",
    "productID",
    "revision",
    "specificInfo"
})
public class StatusRaidPhysicalDriveStatus {

    @XmlElement(name = "ControllerID")
    protected Long controllerID;
    @XmlElement(name = "DeviceID")
    protected Long deviceID;
    @XmlElement(name = "ArrayID")
    protected Long arrayID;
    @XmlElement(name = "LogicalDriveID")
    protected Long logicalDriveID;
    @XmlElement(name = "LogicalDriveName")
    protected String logicalDriveName;
    @XmlElement(name = "Position")
    protected DmRaidPDPos position;
    @XmlElement(name = "State")
    protected DmRaidPDState state;
    @XmlElement(name = "ProgressPercent")
    protected Long progressPercent;
    @XmlElement(name = "RawSize")
    protected BigInteger rawSize;
    @XmlElement(name = "CoercedSize")
    protected BigInteger coercedSize;
    @XmlElement(name = "InterfaceType")
    protected DmRaidPDInterfaceType interfaceType;
    @XmlElement(name = "InterfaceSpeed")
    protected DmRaidSasInterfaceSpeed interfaceSpeed;
    @XmlElement(name = "SASaddress")
    protected String saSaddress;
    @XmlElement(name = "VendorID")
    protected String vendorID;
    @XmlElement(name = "ProductID")
    protected String productID;
    @XmlElement(name = "Revision")
    protected String revision;
    @XmlElement(name = "SpecificInfo")
    protected String specificInfo;

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
     * Gets the value of the deviceID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeviceID() {
        return deviceID;
    }

    /**
     * Sets the value of the deviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeviceID(Long value) {
        this.deviceID = value;
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
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link DmRaidPDPos }
     *     
     */
    public DmRaidPDPos getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmRaidPDPos }
     *     
     */
    public void setPosition(DmRaidPDPos value) {
        this.position = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link DmRaidPDState }
     *     
     */
    public DmRaidPDState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmRaidPDState }
     *     
     */
    public void setState(DmRaidPDState value) {
        this.state = value;
    }

    /**
     * Gets the value of the progressPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProgressPercent() {
        return progressPercent;
    }

    /**
     * Sets the value of the progressPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProgressPercent(Long value) {
        this.progressPercent = value;
    }

    /**
     * Gets the value of the rawSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRawSize() {
        return rawSize;
    }

    /**
     * Sets the value of the rawSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRawSize(BigInteger value) {
        this.rawSize = value;
    }

    /**
     * Gets the value of the coercedSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCoercedSize() {
        return coercedSize;
    }

    /**
     * Sets the value of the coercedSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCoercedSize(BigInteger value) {
        this.coercedSize = value;
    }

    /**
     * Gets the value of the interfaceType property.
     * 
     * @return
     *     possible object is
     *     {@link DmRaidPDInterfaceType }
     *     
     */
    public DmRaidPDInterfaceType getInterfaceType() {
        return interfaceType;
    }

    /**
     * Sets the value of the interfaceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmRaidPDInterfaceType }
     *     
     */
    public void setInterfaceType(DmRaidPDInterfaceType value) {
        this.interfaceType = value;
    }

    /**
     * Gets the value of the interfaceSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link DmRaidSasInterfaceSpeed }
     *     
     */
    public DmRaidSasInterfaceSpeed getInterfaceSpeed() {
        return interfaceSpeed;
    }

    /**
     * Sets the value of the interfaceSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmRaidSasInterfaceSpeed }
     *     
     */
    public void setInterfaceSpeed(DmRaidSasInterfaceSpeed value) {
        this.interfaceSpeed = value;
    }

    /**
     * Gets the value of the saSaddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSASaddress() {
        return saSaddress;
    }

    /**
     * Sets the value of the saSaddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSASaddress(String value) {
        this.saSaddress = value;
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
     * Gets the value of the specificInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificInfo() {
        return specificInfo;
    }

    /**
     * Sets the value of the specificInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificInfo(String value) {
        this.specificInfo = value;
    }

}
