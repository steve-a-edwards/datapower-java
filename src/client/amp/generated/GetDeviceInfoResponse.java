
package client.amp.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="DeviceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="DeviceSerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="DeviceID" type="{http://www.datapower.com/schemas/appliance/management/2.0}device-id"/>
 *           &lt;element name="DeviceType" type="{http://www.datapower.com/schemas/appliance/management/2.0}device-type"/>
 *           &lt;element name="FirmwareVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="FailureDetected" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="CurrentAMPVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="ManagementInterface" type="{http://www.datapower.com/schemas/appliance/management/2.0}management-interface" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="DeviceFeature" type="{http://www.datapower.com/schemas/appliance/management/2.0}device-feature" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "deviceName",
    "deviceSerialNo",
    "deviceID",
    "deviceType",
    "firmwareVersion",
    "failureDetected",
    "currentAMPVersion",
    "managementInterface",
    "deviceFeature"
})
@XmlRootElement(name = "GetDeviceInfoResponse")
public class GetDeviceInfoResponse {

    @XmlElement(name = "DeviceName")
    protected String deviceName;
    @XmlElement(name = "DeviceSerialNo")
    protected String deviceSerialNo;
    @XmlElement(name = "DeviceID")
    protected String deviceID;
    @XmlElement(name = "DeviceType")
    protected DeviceType deviceType;
    @XmlElement(name = "FirmwareVersion")
    protected String firmwareVersion;
    @XmlElement(name = "FailureDetected")
    protected Boolean failureDetected;
    @XmlElement(name = "CurrentAMPVersion")
    protected String currentAMPVersion;
    @XmlElement(name = "ManagementInterface")
    protected List<ManagementInterface> managementInterface;
    @XmlElement(name = "DeviceFeature")
    protected List<DeviceFeature> deviceFeature;

    /**
     * Gets the value of the deviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * Sets the value of the deviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceName(String value) {
        this.deviceName = value;
    }

    /**
     * Gets the value of the deviceSerialNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceSerialNo() {
        return deviceSerialNo;
    }

    /**
     * Sets the value of the deviceSerialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceSerialNo(String value) {
        this.deviceSerialNo = value;
    }

    /**
     * Gets the value of the deviceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceID() {
        return deviceID;
    }

    /**
     * Sets the value of the deviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceID(String value) {
        this.deviceID = value;
    }

    /**
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceType }
     *     
     */
    public DeviceType getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceType }
     *     
     */
    public void setDeviceType(DeviceType value) {
        this.deviceType = value;
    }

    /**
     * Gets the value of the firmwareVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    /**
     * Sets the value of the firmwareVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmwareVersion(String value) {
        this.firmwareVersion = value;
    }

    /**
     * Gets the value of the failureDetected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFailureDetected() {
        return failureDetected;
    }

    /**
     * Sets the value of the failureDetected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFailureDetected(Boolean value) {
        this.failureDetected = value;
    }

    /**
     * Gets the value of the currentAMPVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentAMPVersion() {
        return currentAMPVersion;
    }

    /**
     * Sets the value of the currentAMPVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentAMPVersion(String value) {
        this.currentAMPVersion = value;
    }

    /**
     * Gets the value of the managementInterface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the managementInterface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManagementInterface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManagementInterface }
     * 
     * 
     */
    public List<ManagementInterface> getManagementInterface() {
        if (managementInterface == null) {
            managementInterface = new ArrayList<ManagementInterface>();
        }
        return this.managementInterface;
    }

    /**
     * Gets the value of the deviceFeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceFeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceFeature }
     * 
     * 
     */
    public List<DeviceFeature> getDeviceFeature() {
        if (deviceFeature == null) {
            deviceFeature = new ArrayList<DeviceFeature>();
        }
        return this.deviceFeature;
    }

}
