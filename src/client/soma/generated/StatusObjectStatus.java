
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusObjectStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusObjectStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Class" type="{http://www.datapower.com/schemas/management}dmObjectClass" minOccurs="0"/>
 *         &lt;element name="OpState" type="{http://www.datapower.com/schemas/management}dmOpState" minOccurs="0"/>
 *         &lt;element name="AdminState" type="{http://www.datapower.com/schemas/management}dmAdminState" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="EventCode" type="{http://www.datapower.com/schemas/management}dmEventCode" minOccurs="0"/>
 *         &lt;element name="ErrorCode" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="ConfigState" type="{http://www.datapower.com/schemas/management}dmConfigState" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusObjectStatus", propOrder = {
    "clazz",
    "opState",
    "adminState",
    "name",
    "eventCode",
    "errorCode",
    "configState"
})
public class StatusObjectStatus {

    @XmlElement(name = "Class")
    protected String clazz;
    @XmlElement(name = "OpState")
    protected DmOpState opState;
    @XmlElement(name = "AdminState")
    protected DmAdminState adminState;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "EventCode")
    protected String eventCode;
    @XmlElement(name = "ErrorCode")
    protected String errorCode;
    @XmlElement(name = "ConfigState")
    protected DmConfigState configState;

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
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
     * Gets the value of the adminState property.
     * 
     * @return
     *     possible object is
     *     {@link DmAdminState }
     *     
     */
    public DmAdminState getAdminState() {
        return adminState;
    }

    /**
     * Sets the value of the adminState property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmAdminState }
     *     
     */
    public void setAdminState(DmAdminState value) {
        this.adminState = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the eventCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventCode() {
        return eventCode;
    }

    /**
     * Sets the value of the eventCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventCode(String value) {
        this.eventCode = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the configState property.
     * 
     * @return
     *     possible object is
     *     {@link DmConfigState }
     *     
     */
    public DmConfigState getConfigState() {
        return configState;
    }

    /**
     * Sets the value of the configState property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmConfigState }
     *     
     */
    public void setConfigState(DmConfigState value) {
        this.configState = value;
    }

}
