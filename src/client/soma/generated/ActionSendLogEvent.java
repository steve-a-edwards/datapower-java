
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionSendLogEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionSendLogEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LogType" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="GenLogLevel" type="{http://www.datapower.com/schemas/management}dmLogLevel"/>
 *         &lt;element name="LogEvent" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="EventCode" type="{http://www.datapower.com/schemas/management}dmEventCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionSendLogEvent", propOrder = {
    "logType",
    "genLogLevel",
    "logEvent",
    "eventCode"
})
public class ActionSendLogEvent {

    @XmlElement(name = "LogType", required = true)
    protected DmReference logType;
    @XmlElement(name = "GenLogLevel", required = true)
    protected DmLogLevel genLogLevel;
    @XmlElement(name = "LogEvent", required = true)
    protected String logEvent;
    @XmlElement(name = "EventCode")
    protected String eventCode;

    /**
     * Gets the value of the logType property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getLogType() {
        return logType;
    }

    /**
     * Sets the value of the logType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setLogType(DmReference value) {
        this.logType = value;
    }

    /**
     * Gets the value of the genLogLevel property.
     * 
     * @return
     *     possible object is
     *     {@link DmLogLevel }
     *     
     */
    public DmLogLevel getGenLogLevel() {
        return genLogLevel;
    }

    /**
     * Sets the value of the genLogLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmLogLevel }
     *     
     */
    public void setGenLogLevel(DmLogLevel value) {
        this.genLogLevel = value;
    }

    /**
     * Gets the value of the logEvent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogEvent() {
        return logEvent;
    }

    /**
     * Sets the value of the logEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogEvent(String value) {
        this.logEvent = value;
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

}
