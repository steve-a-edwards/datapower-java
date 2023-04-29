
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusIScsiVolumeStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusIScsiVolumeStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VolumeInstance" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="OpState" type="{http://www.datapower.com/schemas/management}dmOpState" minOccurs="0"/>
 *         &lt;element name="ReadOnly" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Directory" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="LunValue" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusIScsiVolumeStatus", propOrder = {
    "volumeInstance",
    "opState",
    "readOnly",
    "directory",
    "lunValue"
})
public class StatusIScsiVolumeStatus {

    @XmlElement(name = "VolumeInstance")
    protected String volumeInstance;
    @XmlElement(name = "OpState")
    protected DmOpState opState;
    @XmlElement(name = "ReadOnly")
    protected String readOnly;
    @XmlElement(name = "Directory")
    protected String directory;
    @XmlElement(name = "LunValue")
    protected Integer lunValue;

    /**
     * Gets the value of the volumeInstance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeInstance() {
        return volumeInstance;
    }

    /**
     * Sets the value of the volumeInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeInstance(String value) {
        this.volumeInstance = value;
    }

    /**
     * Gets the value of the opState property.
     * 
     * @return
     *     possible object is
     *     {@link DmOpState }
     *     
     */
    public DmOpState getOpState() {
        return opState;
    }

    /**
     * Sets the value of the opState property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmOpState }
     *     
     */
    public void setOpState(DmOpState value) {
        this.opState = value;
    }

    /**
     * Gets the value of the readOnly property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadOnly() {
        return readOnly;
    }

    /**
     * Sets the value of the readOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadOnly(String value) {
        this.readOnly = value;
    }

    /**
     * Gets the value of the directory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectory() {
        return directory;
    }

    /**
     * Sets the value of the directory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectory(String value) {
        this.directory = value;
    }

    /**
     * Gets the value of the lunValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLunValue() {
        return lunValue;
    }

    /**
     * Sets the value of the lunValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLunValue(Integer value) {
        this.lunValue = value;
    }

}
