
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusVersion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusVersion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Version" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Build" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="BuildDate" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="WatchdogBuild" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="InstalledDPOS" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="RunningDPOS" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="LibraryMQ" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="LibraryTAM" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="CoprocVersion" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="LibraryReserved" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="LibraryODBC" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="LibraryTibco" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="LibraryXMS" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Serial" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="XMLAccelerator" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusVersion", propOrder = {
    "version",
    "build",
    "buildDate",
    "watchdogBuild",
    "installedDPOS",
    "runningDPOS",
    "libraryMQ",
    "libraryTAM",
    "coprocVersion",
    "libraryReserved",
    "libraryODBC",
    "libraryTibco",
    "libraryXMS",
    "serial",
    "xmlAccelerator"
})
public class StatusVersion {

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
    @XmlElement(name = "LibraryMQ")
    protected String libraryMQ;
    @XmlElement(name = "LibraryTAM")
    protected String libraryTAM;
    @XmlElement(name = "CoprocVersion")
    protected String coprocVersion;
    @XmlElement(name = "LibraryReserved")
    protected String libraryReserved;
    @XmlElement(name = "LibraryODBC")
    protected String libraryODBC;
    @XmlElement(name = "LibraryTibco")
    protected String libraryTibco;
    @XmlElement(name = "LibraryXMS")
    protected String libraryXMS;
    @XmlElement(name = "Serial")
    protected String serial;
    @XmlElement(name = "XMLAccelerator")
    protected String xmlAccelerator;

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
     * Gets the value of the libraryMQ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibraryMQ() {
        return libraryMQ;
    }

    /**
     * Sets the value of the libraryMQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibraryMQ(String value) {
        this.libraryMQ = value;
    }

    /**
     * Gets the value of the libraryTAM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibraryTAM() {
        return libraryTAM;
    }

    /**
     * Sets the value of the libraryTAM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibraryTAM(String value) {
        this.libraryTAM = value;
    }

    /**
     * Gets the value of the coprocVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoprocVersion() {
        return coprocVersion;
    }

    /**
     * Sets the value of the coprocVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoprocVersion(String value) {
        this.coprocVersion = value;
    }

    /**
     * Gets the value of the libraryReserved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibraryReserved() {
        return libraryReserved;
    }

    /**
     * Sets the value of the libraryReserved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibraryReserved(String value) {
        this.libraryReserved = value;
    }

    /**
     * Gets the value of the libraryODBC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibraryODBC() {
        return libraryODBC;
    }

    /**
     * Sets the value of the libraryODBC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibraryODBC(String value) {
        this.libraryODBC = value;
    }

    /**
     * Gets the value of the libraryTibco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibraryTibco() {
        return libraryTibco;
    }

    /**
     * Sets the value of the libraryTibco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibraryTibco(String value) {
        this.libraryTibco = value;
    }

    /**
     * Gets the value of the libraryXMS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibraryXMS() {
        return libraryXMS;
    }

    /**
     * Sets the value of the libraryXMS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibraryXMS(String value) {
        this.libraryXMS = value;
    }

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

}
