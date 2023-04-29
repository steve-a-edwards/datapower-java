
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusEnvironmentalSensors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusEnvironmentalSensors">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="systemTemp" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="cpu1Temp" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="cpu2Temp" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="cpu1rpm" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="cpu2rpm" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="chassis1rpm" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="chassis2rpm" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="chassis3rpm" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="caseopen" type="{http://www.datapower.com/schemas/management}dmIntrusionDetected" minOccurs="0"/>
 *         &lt;element name="volt33" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="volt5" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="volt12" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="powersupply" type="{http://www.datapower.com/schemas/management}dmPowerSupplyStatus" minOccurs="0"/>
 *         &lt;element name="batteryinstalldate" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="checkintrusion" type="{http://www.datapower.com/schemas/management}dmIntrusionDetected" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusEnvironmentalSensors", propOrder = {
    "systemTemp",
    "cpu1Temp",
    "cpu2Temp",
    "cpu1Rpm",
    "cpu2Rpm",
    "chassis1Rpm",
    "chassis2Rpm",
    "chassis3Rpm",
    "caseopen",
    "volt33",
    "volt5",
    "volt12",
    "powersupply",
    "batteryinstalldate",
    "checkintrusion"
})
public class StatusEnvironmentalSensors {

    protected Integer systemTemp;
    protected Integer cpu1Temp;
    protected Integer cpu2Temp;
    @XmlElement(name = "cpu1rpm")
    protected Integer cpu1Rpm;
    @XmlElement(name = "cpu2rpm")
    protected Integer cpu2Rpm;
    @XmlElement(name = "chassis1rpm")
    protected Integer chassis1Rpm;
    @XmlElement(name = "chassis2rpm")
    protected Integer chassis2Rpm;
    @XmlElement(name = "chassis3rpm")
    protected Integer chassis3Rpm;
    protected DmIntrusionDetected caseopen;
    protected String volt33;
    protected String volt5;
    protected String volt12;
    protected DmPowerSupplyStatus powersupply;
    protected String batteryinstalldate;
    protected DmIntrusionDetected checkintrusion;

    /**
     * Gets the value of the systemTemp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSystemTemp() {
        return systemTemp;
    }

    /**
     * Sets the value of the systemTemp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSystemTemp(Integer value) {
        this.systemTemp = value;
    }

    /**
     * Gets the value of the cpu1Temp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCpu1Temp() {
        return cpu1Temp;
    }

    /**
     * Sets the value of the cpu1Temp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCpu1Temp(Integer value) {
        this.cpu1Temp = value;
    }

    /**
     * Gets the value of the cpu2Temp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCpu2Temp() {
        return cpu2Temp;
    }

    /**
     * Sets the value of the cpu2Temp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCpu2Temp(Integer value) {
        this.cpu2Temp = value;
    }

    /**
     * Gets the value of the cpu1Rpm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCpu1Rpm() {
        return cpu1Rpm;
    }

    /**
     * Sets the value of the cpu1Rpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCpu1Rpm(Integer value) {
        this.cpu1Rpm = value;
    }

    /**
     * Gets the value of the cpu2Rpm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCpu2Rpm() {
        return cpu2Rpm;
    }

    /**
     * Sets the value of the cpu2Rpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCpu2Rpm(Integer value) {
        this.cpu2Rpm = value;
    }

    /**
     * Gets the value of the chassis1Rpm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChassis1Rpm() {
        return chassis1Rpm;
    }

    /**
     * Sets the value of the chassis1Rpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChassis1Rpm(Integer value) {
        this.chassis1Rpm = value;
    }

    /**
     * Gets the value of the chassis2Rpm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChassis2Rpm() {
        return chassis2Rpm;
    }

    /**
     * Sets the value of the chassis2Rpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChassis2Rpm(Integer value) {
        this.chassis2Rpm = value;
    }

    /**
     * Gets the value of the chassis3Rpm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChassis3Rpm() {
        return chassis3Rpm;
    }

    /**
     * Sets the value of the chassis3Rpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChassis3Rpm(Integer value) {
        this.chassis3Rpm = value;
    }

    /**
     * Gets the value of the caseopen property.
     * 
     * @return
     *     possible object is
     *     {@link DmIntrusionDetected }
     *     
     */
    public DmIntrusionDetected getCaseopen() {
        return caseopen;
    }

    /**
     * Sets the value of the caseopen property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmIntrusionDetected }
     *     
     */
    public void setCaseopen(DmIntrusionDetected value) {
        this.caseopen = value;
    }

    /**
     * Gets the value of the volt33 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolt33() {
        return volt33;
    }

    /**
     * Sets the value of the volt33 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolt33(String value) {
        this.volt33 = value;
    }

    /**
     * Gets the value of the volt5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolt5() {
        return volt5;
    }

    /**
     * Sets the value of the volt5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolt5(String value) {
        this.volt5 = value;
    }

    /**
     * Gets the value of the volt12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolt12() {
        return volt12;
    }

    /**
     * Sets the value of the volt12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolt12(String value) {
        this.volt12 = value;
    }

    /**
     * Gets the value of the powersupply property.
     * 
     * @return
     *     possible object is
     *     {@link DmPowerSupplyStatus }
     *     
     */
    public DmPowerSupplyStatus getPowersupply() {
        return powersupply;
    }

    /**
     * Sets the value of the powersupply property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmPowerSupplyStatus }
     *     
     */
    public void setPowersupply(DmPowerSupplyStatus value) {
        this.powersupply = value;
    }

    /**
     * Gets the value of the batteryinstalldate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatteryinstalldate() {
        return batteryinstalldate;
    }

    /**
     * Sets the value of the batteryinstalldate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatteryinstalldate(String value) {
        this.batteryinstalldate = value;
    }

    /**
     * Gets the value of the checkintrusion property.
     * 
     * @return
     *     possible object is
     *     {@link DmIntrusionDetected }
     *     
     */
    public DmIntrusionDetected getCheckintrusion() {
        return checkintrusion;
    }

    /**
     * Sets the value of the checkintrusion property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmIntrusionDetected }
     *     
     */
    public void setCheckintrusion(DmIntrusionDetected value) {
        this.checkintrusion = value;
    }

}
