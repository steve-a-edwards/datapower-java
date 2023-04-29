
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusFirmwareVersion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusFirmwareVersion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Serial" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Build" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="BuildDate" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="WatchdogBuild" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="InstalledDPOS" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="RunningDPOS" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="XMLAccelerator" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="MachineType" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="ModelType" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusFirmwareVersion", propOrder = {
    "serial",
    "version",
    "build",
    "buildDate",
    "watchdogBuild",
    "installedDPOS",
    "runningDPOS",
    "xmlAccelerator",
    "machineType",
    "modelType"
})
public class StatusFirmwareVersion {

    @XmlElement(name = "Serial")
    protected String serial;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "Build")
    protected String build;
    @XmlElement(name = "BuildDate")
    protected String buildDate;
    @XmlElement(name = "WatchdogBuild")
    protected String watchdogBuild;
    @XmlElement(name = "InstalledDPOS")
    protected String installedDPOS;
    @XmlElement(name = "RunningDPOS")
    protected String runningDPOS;
    @XmlElement(name = "XMLAccelerator")
    protected String xmlAccelerator;
    @XmlElement(name = "MachineType")
    protected String machineType;
    @XmlElement(name = "ModelType")
    protected String modelType;

    /**
     * Gets the value of the serial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerial() {
        return serial;
    }

    /**
     * Sets the value of the serial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerial(String value) {
        this.serial = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the build property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuild() {
        return build;
    }

    /**
     * Sets the value of the build property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuild(String value) {
        this.build = value;
    }

    /**
     * Gets the value of the buildDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildDate() {
        return buildDate;
    }

    /**
     * Sets the value of the buildDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildDate(String value) {
        this.buildDate = value;
    }

    /**
     * Gets the value of the watchdogBuild property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWatchdogBuild() {
        return watchdogBuild;
    }

    /**
     * Sets the value of the watchdogBuild property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWatchdogBuild(String value) {
        this.watchdogBuild = value;
    }

    /**
     * Gets the value of the installedDPOS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstalledDPOS() {
        return installedDPOS;
    }

    /**
     * Sets the value of the installedDPOS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstalledDPOS(String value) {
        this.installedDPOS = value;
    }

    /**
     * Gets the value of the runningDPOS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunningDPOS() {
        return runningDPOS;
    }

    /**
     * Sets the value of the runningDPOS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunningDPOS(String value) {
        this.runningDPOS = value;
    }

    /**
     * Gets the value of the xmlAccelerator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMLAccelerator() {
        return xmlAccelerator;
    }

    /**
     * Sets the value of the xmlAccelerator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMLAccelerator(String value) {
        this.xmlAccelerator = value;
    }

    /**
     * Gets the value of the machineType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMachineType() {
        return machineType;
    }

    /**
     * Sets the value of the machineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMachineType(String value) {
        this.machineType = value;
    }

    /**
     * Gets the value of the modelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelType() {
        return modelType;
    }

    /**
     * Sets the value of the modelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelType(String value) {
        this.modelType = value;
    }

}
