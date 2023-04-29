
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusSelfBalancedTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusSelfBalancedTable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="localVIPA" type="{http://www.datapower.com/schemas/management}dmLocalIPHostAddress" minOccurs="0"/>
 *         &lt;element name="localPort" type="{http://www.datapower.com/schemas/management}dmIPPort" minOccurs="0"/>
 *         &lt;element name="localSSL" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="serviceDomain" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="serviceType" type="{http://www.datapower.com/schemas/management}dmObjectClass" minOccurs="0"/>
 *         &lt;element name="serviceName" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusSelfBalancedTable", propOrder = {
    "localVIPA",
    "localPort",
    "localSSL",
    "serviceDomain",
    "serviceType",
    "serviceName"
})
public class StatusSelfBalancedTable {

    protected String localVIPA;
    protected Integer localPort;
    protected String localSSL;
    protected String serviceDomain;
    protected String serviceType;
    protected String serviceName;

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
     * Gets the value of the localPort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLocalPort() {
        return localPort;
    }

    /**
     * Sets the value of the localPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocalPort(Integer value) {
        this.localPort = value;
    }

    /**
     * Gets the value of the localSSL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalSSL() {
        return localSSL;
    }

    /**
     * Sets the value of the localSSL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalSSL(String value) {
        this.localSSL = value;
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

}
