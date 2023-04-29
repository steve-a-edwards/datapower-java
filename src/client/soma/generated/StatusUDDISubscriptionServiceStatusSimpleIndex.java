
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusUDDISubscriptionServiceStatusSimpleIndex complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusUDDISubscriptionServiceStatusSimpleIndex">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Subscription" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="ServiceKey" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.datapower.com/schemas/management}dmUDDISubServiceStatus" minOccurs="0"/>
 *         &lt;element name="EndPoint" type="{http://www.datapower.com/schemas/management}dmURL" minOccurs="0"/>
 *         &lt;element name="ServiceName" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="PortName" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Namespace" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="WSDLKey" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="WSDLURL" type="{http://www.datapower.com/schemas/management}dmURL" minOccurs="0"/>
 *         &lt;element name="BindingName" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="BindingNamespace" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusUDDISubscriptionServiceStatusSimpleIndex", propOrder = {
    "subscription",
    "serviceKey",
    "status",
    "endPoint",
    "serviceName",
    "portName",
    "namespace",
    "wsdlKey",
    "wsdlurl",
    "bindingName",
    "bindingNamespace"
})
public class StatusUDDISubscriptionServiceStatusSimpleIndex {

    @XmlElement(name = "Subscription")
    protected DmReference subscription;
    @XmlElement(name = "ServiceKey")
    protected String serviceKey;
    @XmlElement(name = "Status")
    protected DmUDDISubServiceStatus status;
    @XmlElement(name = "EndPoint")
    protected String endPoint;
    @XmlElement(name = "ServiceName")
    protected String serviceName;
    @XmlElement(name = "PortName")
    protected String portName;
    @XmlElement(name = "Namespace")
    protected String namespace;
    @XmlElement(name = "WSDLKey")
    protected String wsdlKey;
    @XmlElement(name = "WSDLURL")
    protected String wsdlurl;
    @XmlElement(name = "BindingName")
    protected String bindingName;
    @XmlElement(name = "BindingNamespace")
    protected String bindingNamespace;

    /**
     * Gets the value of the subscription property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getSubscription() {
        return subscription;
    }

    /**
     * Sets the value of the subscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setSubscription(DmReference value) {
        this.subscription = value;
    }

    /**
     * Gets the value of the serviceKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceKey() {
        return serviceKey;
    }

    /**
     * Sets the value of the serviceKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceKey(String value) {
        this.serviceKey = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link DmUDDISubServiceStatus }
     *     
     */
    public DmUDDISubServiceStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmUDDISubServiceStatus }
     *     
     */
    public void setStatus(DmUDDISubServiceStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the endPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndPoint() {
        return endPoint;
    }

    /**
     * Sets the value of the endPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndPoint(String value) {
        this.endPoint = value;
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
     * Gets the value of the portName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortName() {
        return portName;
    }

    /**
     * Sets the value of the portName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortName(String value) {
        this.portName = value;
    }

    /**
     * Gets the value of the namespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * Sets the value of the namespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespace(String value) {
        this.namespace = value;
    }

    /**
     * Gets the value of the wsdlKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWSDLKey() {
        return wsdlKey;
    }

    /**
     * Sets the value of the wsdlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWSDLKey(String value) {
        this.wsdlKey = value;
    }

    /**
     * Gets the value of the wsdlurl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWSDLURL() {
        return wsdlurl;
    }

    /**
     * Sets the value of the wsdlurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWSDLURL(String value) {
        this.wsdlurl = value;
    }

    /**
     * Gets the value of the bindingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindingName() {
        return bindingName;
    }

    /**
     * Sets the value of the bindingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindingName(String value) {
        this.bindingName = value;
    }

    /**
     * Gets the value of the bindingNamespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindingNamespace() {
        return bindingNamespace;
    }

    /**
     * Sets the value of the bindingNamespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindingNamespace(String value) {
        this.bindingNamespace = value;
    }

}
