
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusSelfBalancedStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusSelfBalancedStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="localVIPA" type="{http://www.datapower.com/schemas/management}dmLocalIPHostAddress" minOccurs="0"/>
 *         &lt;element name="port" type="{http://www.datapower.com/schemas/management}dmIPPort" minOccurs="0"/>
 *         &lt;element name="realServer" type="{http://www.datapower.com/schemas/management}dmIPHostAddress" minOccurs="0"/>
 *         &lt;element name="targetState" type="{http://www.datapower.com/schemas/management}dmStandbyMode" minOccurs="0"/>
 *         &lt;element name="serviceDomain" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="serviceType" type="{http://www.datapower.com/schemas/management}dmObjectClass" minOccurs="0"/>
 *         &lt;element name="serviceName" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="weight" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="activeconns" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="inactiveconns" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusSelfBalancedStatus", propOrder = {
    "localVIPA",
    "port",
    "realServer",
    "targetState",
    "serviceDomain",
    "serviceType",
    "serviceName",
    "weight",
    "activeconns",
    "inactiveconns"
})
public class StatusSelfBalancedStatus {

    protected String localVIPA;
    protected Integer port;
    protected String realServer;
    protected DmStandbyMode targetState;
    protected String serviceDomain;
    protected String serviceType;
    protected String serviceName;
    protected Integer weight;
    protected Long activeconns;
    protected Long inactiveconns;

    /**
     * Gets the value of the localVIPA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalVIPA() {
        return localVIPA;
    }

    /**
     * Sets the value of the localVIPA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalVIPA(String value) {
        this.localVIPA = value;
    }

    /**
     * Gets the value of the port property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPort(Integer value) {
        this.port = value;
    }

    /**
     * Gets the value of the realServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRealServer() {
        return realServer;
    }

    /**
     * Sets the value of the realServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealServer(String value) {
        this.realServer = value;
    }

    /**
     * Gets the value of the targetState property.
     * 
     * @return
     *     possible object is
     *     {@link DmStandbyMode }
     *     
     */
    public DmStandbyMode getTargetState() {
        return targetState;
    }

    /**
     * Sets the value of the targetState property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmStandbyMode }
     *     
     */
    public void setTargetState(DmStandbyMode value) {
        this.targetState = value;
    }

    /**
     * Gets the value of the serviceDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDomain() {
        return serviceDomain;
    }

    /**
     * Sets the value of the serviceDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDomain(String value) {
        this.serviceDomain = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWeight(Integer value) {
        this.weight = value;
    }

    /**
     * Gets the value of the activeconns property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getActiveconns() {
        return activeconns;
    }

    /**
     * Sets the value of the activeconns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActiveconns(Long value) {
        this.activeconns = value;
    }

    /**
     * Gets the value of the inactiveconns property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInactiveconns() {
        return inactiveconns;
    }

    /**
     * Sets the value of the inactiveconns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInactiveconns(Long value) {
        this.inactiveconns = value;
    }

}
