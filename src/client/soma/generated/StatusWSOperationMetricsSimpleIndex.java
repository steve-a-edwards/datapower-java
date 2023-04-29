
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusWSOperationMetricsSimpleIndex complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusWSOperationMetricsSimpleIndex">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="ServiceEndpoint" type="{http://www.datapower.com/schemas/management}dmURL" minOccurs="0"/>
 *         &lt;element name="PortType" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Operation" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="NumberOfRequests" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="NumberOfFailedRequests" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="NumberOfSuccessfulRequests" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="ServiceTime" type="{http://www.datapower.com/schemas/management}dmTimeIntervalMillis" minOccurs="0"/>
 *         &lt;element name="MaxResponseTime" type="{http://www.datapower.com/schemas/management}dmTimeIntervalMillis" minOccurs="0"/>
 *         &lt;element name="LastResponseTime" type="{http://www.datapower.com/schemas/management}dmTimeIntervalMillis" minOccurs="0"/>
 *         &lt;element name="MaxRequestSize" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="LastRequestSize" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="MaxResponseSize" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="LastResponseSize" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusWSOperationMetricsSimpleIndex", propOrder = {
    "id",
    "serviceEndpoint",
    "portType",
    "operation",
    "numberOfRequests",
    "numberOfFailedRequests",
    "numberOfSuccessfulRequests",
    "serviceTime",
    "maxResponseTime",
    "lastResponseTime",
    "maxRequestSize",
    "lastRequestSize",
    "maxResponseSize",
    "lastResponseSize"
})
public class StatusWSOperationMetricsSimpleIndex {

    @XmlElement(name = "ID")
    protected Long id;
    @XmlElement(name = "ServiceEndpoint")
    protected String serviceEndpoint;
    @XmlElement(name = "PortType")
    protected String portType;
    @XmlElement(name = "Operation")
    protected String operation;
    @XmlElement(name = "NumberOfRequests")
    protected Long numberOfRequests;
    @XmlElement(name = "NumberOfFailedRequests")
    protected Long numberOfFailedRequests;
    @XmlElement(name = "NumberOfSuccessfulRequests")
    protected Long numberOfSuccessfulRequests;
    @XmlElement(name = "ServiceTime")
    protected Long serviceTime;
    @XmlElement(name = "MaxResponseTime")
    protected Long maxResponseTime;
    @XmlElement(name = "LastResponseTime")
    protected Long lastResponseTime;
    @XmlElement(name = "MaxRequestSize")
    protected Long maxRequestSize;
    @XmlElement(name = "LastRequestSize")
    protected Long lastRequestSize;
    @XmlElement(name = "MaxResponseSize")
    protected Long maxResponseSize;
    @XmlElement(name = "LastResponseSize")
    protected Long lastResponseSize;

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
     * Gets the value of the serviceEndpoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceEndpoint() {
        return serviceEndpoint;
    }

    /**
     * Sets the value of the serviceEndpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceEndpoint(String value) {
        this.serviceEndpoint = value;
    }

    /**
     * Gets the value of the portType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortType() {
        return portType;
    }

    /**
     * Sets the value of the portType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortType(String value) {
        this.portType = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

    /**
     * Gets the value of the numberOfRequests property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfRequests() {
        return numberOfRequests;
    }

    /**
     * Sets the value of the numberOfRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfRequests(Long value) {
        this.numberOfRequests = value;
    }

    /**
     * Gets the value of the numberOfFailedRequests property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfFailedRequests() {
        return numberOfFailedRequests;
    }

    /**
     * Sets the value of the numberOfFailedRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfFailedRequests(Long value) {
        this.numberOfFailedRequests = value;
    }

    /**
     * Gets the value of the numberOfSuccessfulRequests property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfSuccessfulRequests() {
        return numberOfSuccessfulRequests;
    }

    /**
     * Sets the value of the numberOfSuccessfulRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfSuccessfulRequests(Long value) {
        this.numberOfSuccessfulRequests = value;
    }

    /**
     * Gets the value of the serviceTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServiceTime() {
        return serviceTime;
    }

    /**
     * Sets the value of the serviceTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServiceTime(Long value) {
        this.serviceTime = value;
    }

    /**
     * Gets the value of the maxResponseTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxResponseTime() {
        return maxResponseTime;
    }

    /**
     * Sets the value of the maxResponseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxResponseTime(Long value) {
        this.maxResponseTime = value;
    }

    /**
     * Gets the value of the lastResponseTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLastResponseTime() {
        return lastResponseTime;
    }

    /**
     * Sets the value of the lastResponseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLastResponseTime(Long value) {
        this.lastResponseTime = value;
    }

    /**
     * Gets the value of the maxRequestSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxRequestSize() {
        return maxRequestSize;
    }

    /**
     * Sets the value of the maxRequestSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxRequestSize(Long value) {
        this.maxRequestSize = value;
    }

    /**
     * Gets the value of the lastRequestSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLastRequestSize() {
        return lastRequestSize;
    }

    /**
     * Sets the value of the lastRequestSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLastRequestSize(Long value) {
        this.lastRequestSize = value;
    }

    /**
     * Gets the value of the maxResponseSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxResponseSize() {
        return maxResponseSize;
    }

    /**
     * Sets the value of the maxResponseSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxResponseSize(Long value) {
        this.maxResponseSize = value;
    }

    /**
     * Gets the value of the lastResponseSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLastResponseSize() {
        return lastResponseSize;
    }

    /**
     * Sets the value of the lastResponseSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLastResponseSize(Long value) {
        this.lastResponseSize = value;
    }

}
