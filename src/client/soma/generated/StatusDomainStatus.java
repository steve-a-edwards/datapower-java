
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusDomainStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusDomainStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Domain" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="SaveNeeded" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="TraceEnabled" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="DebugEnabled" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="ProbeEnabled" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="DiagEnabled" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="CurrentCommand" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="QuiesceState" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusDomainStatus", propOrder = {
    "domain",
    "saveNeeded",
    "traceEnabled",
    "debugEnabled",
    "probeEnabled",
    "diagEnabled",
    "currentCommand",
    "quiesceState"
})
public class StatusDomainStatus {

    @XmlElement(name = "Domain")
    protected String domain;
    @XmlElement(name = "SaveNeeded")
    protected DmToggle saveNeeded;
    @XmlElement(name = "TraceEnabled")
    protected DmToggle traceEnabled;
    @XmlElement(name = "DebugEnabled")
    protected DmToggle debugEnabled;
    @XmlElement(name = "ProbeEnabled")
    protected DmToggle probeEnabled;
    @XmlElement(name = "DiagEnabled")
    protected DmToggle diagEnabled;
    @XmlElement(name = "CurrentCommand")
    protected String currentCommand;
    @XmlElement(name = "QuiesceState")
    protected String quiesceState;

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomain(String value) {
        this.domain = value;
    }

    /**
     * Gets the value of the saveNeeded property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getSaveNeeded() {
        return saveNeeded;
    }

    /**
     * Sets the value of the saveNeeded property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setSaveNeeded(DmToggle value) {
        this.saveNeeded = value;
    }

    /**
     * Gets the value of the traceEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getTraceEnabled() {
        return traceEnabled;
    }

    /**
     * Sets the value of the traceEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setTraceEnabled(DmToggle value) {
        this.traceEnabled = value;
    }

    /**
     * Gets the value of the debugEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getDebugEnabled() {
        return debugEnabled;
    }

    /**
     * Sets the value of the debugEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setDebugEnabled(DmToggle value) {
        this.debugEnabled = value;
    }

    /**
     * Gets the value of the probeEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getProbeEnabled() {
        return probeEnabled;
    }

    /**
     * Sets the value of the probeEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setProbeEnabled(DmToggle value) {
        this.probeEnabled = value;
    }

    /**
     * Gets the value of the diagEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getDiagEnabled() {
        return diagEnabled;
    }

    /**
     * Sets the value of the diagEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setDiagEnabled(DmToggle value) {
        this.diagEnabled = value;
    }

    /**
     * Gets the value of the currentCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentCommand() {
        return currentCommand;
    }

    /**
     * Sets the value of the currentCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentCommand(String value) {
        this.currentCommand = value;
    }

    /**
     * Gets the value of the quiesceState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuiesceState() {
        return quiesceState;
    }

    /**
     * Sets the value of the quiesceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuiesceState(String value) {
        this.quiesceState = value;
    }

}
