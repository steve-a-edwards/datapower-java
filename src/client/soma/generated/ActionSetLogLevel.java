
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionSetLogLevel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionSetLogLevel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LogLevel" type="{http://www.datapower.com/schemas/management}dmLogLevel"/>
 *         &lt;element name="InternalLog" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="RBMLog" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="GlobalIPLogFilter" type="{http://www.datapower.com/schemas/management}dmIPHostAddress" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionSetLogLevel", propOrder = {
    "logLevel",
    "internalLog",
    "rbmLog",
    "globalIPLogFilter"
})
public class ActionSetLogLevel {

    @XmlElement(name = "LogLevel", required = true)
    protected DmLogLevel logLevel;
    @XmlElement(name = "InternalLog")
    protected DmToggle internalLog;
    @XmlElement(name = "RBMLog")
    protected DmToggle rbmLog;
    @XmlElement(name = "GlobalIPLogFilter")
    protected String globalIPLogFilter;

    /**
     * Gets the value of the logLevel property.
     * 
     * @return
     *     possible object is
     *     {@link DmLogLevel }
     *     
     */
    public DmLogLevel getLogLevel() {
        return logLevel;
    }

    /**
     * Sets the value of the logLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmLogLevel }
     *     
     */
    public void setLogLevel(DmLogLevel value) {
        this.logLevel = value;
    }

    /**
     * Gets the value of the internalLog property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getInternalLog() {
        return internalLog;
    }

    /**
     * Sets the value of the internalLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setInternalLog(DmToggle value) {
        this.internalLog = value;
    }

    /**
     * Gets the value of the rbmLog property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getRBMLog() {
        return rbmLog;
    }

    /**
     * Sets the value of the rbmLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setRBMLog(DmToggle value) {
        this.rbmLog = value;
    }

    /**
     * Gets the value of the globalIPLogFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalIPLogFilter() {
        return globalIPLogFilter;
    }

    /**
     * Sets the value of the globalIPLogFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalIPLogFilter(String value) {
        this.globalIPLogFilter = value;
    }

}
