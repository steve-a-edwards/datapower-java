
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusWSWSDLStatusSimpleIndex complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusWSWSDLStatusSimpleIndex">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WSGateway" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="WSDLSourceLocation" type="{http://www.datapower.com/schemas/management}dmURL" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.datapower.com/schemas/management}dmWSDLStatus" minOccurs="0"/>
 *         &lt;element name="RefreshInterval" type="{http://www.datapower.com/schemas/management}dmTimeInterval" minOccurs="0"/>
 *         &lt;element name="LastRefresh" type="{http://www.datapower.com/schemas/management}dmTimestamp" minOccurs="0"/>
 *         &lt;element name="Log" type="{http://www.datapower.com/schemas/management}dmFormattedText" minOccurs="0"/>
 *         &lt;element name="PolicyExecution" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusWSWSDLStatusSimpleIndex", propOrder = {
    "wsGateway",
    "id",
    "wsdlSourceLocation",
    "status",
    "refreshInterval",
    "lastRefresh",
    "log",
    "policyExecution"
})
public class StatusWSWSDLStatusSimpleIndex {

    @XmlElement(name = "WSGateway")
    protected DmReference wsGateway;
    @XmlElement(name = "ID")
    protected Long id;
    @XmlElement(name = "WSDLSourceLocation")
    protected String wsdlSourceLocation;
    @XmlElement(name = "Status")
    protected DmWSDLStatus status;
    @XmlElement(name = "RefreshInterval")
    protected Long refreshInterval;
    @XmlElement(name = "LastRefresh")
    protected Long lastRefresh;
    @XmlElement(name = "Log")
    protected String log;
    @XmlElement(name = "PolicyExecution")
    protected Long policyExecution;

    /**
     * Gets the value of the wsGateway property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getWSGateway() {
        return wsGateway;
    }

    /**
     * Sets the value of the wsGateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setWSGateway(DmReference value) {
        this.wsGateway = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setID(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the wsdlSourceLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWSDLSourceLocation() {
        return wsdlSourceLocation;
    }

    /**
     * Sets the value of the wsdlSourceLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWSDLSourceLocation(String value) {
        this.wsdlSourceLocation = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link DmWSDLStatus }
     *     
     */
    public DmWSDLStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmWSDLStatus }
     *     
     */
    public void setStatus(DmWSDLStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the refreshInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRefreshInterval() {
        return refreshInterval;
    }

    /**
     * Sets the value of the refreshInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRefreshInterval(Long value) {
        this.refreshInterval = value;
    }

    /**
     * Gets the value of the lastRefresh property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLastRefresh() {
        return lastRefresh;
    }

    /**
     * Sets the value of the lastRefresh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLastRefresh(Long value) {
        this.lastRefresh = value;
    }

    /**
     * Gets the value of the log property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLog() {
        return log;
    }

    /**
     * Sets the value of the log property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLog(String value) {
        this.log = value;
    }

    /**
     * Gets the value of the policyExecution property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPolicyExecution() {
        return policyExecution;
    }

    /**
     * Sets the value of the policyExecution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPolicyExecution(Long value) {
        this.policyExecution = value;
    }

}
