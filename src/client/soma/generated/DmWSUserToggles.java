
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSUserToggles complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmWSUserToggles">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WSDLName" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="ServiceName" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="ServicePortName" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="PortTypeName" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="BindingName" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="OperationName" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="Toggles" type="{http://www.datapower.com/schemas/management}dmWSDLUserPolicyToggles"/>
 *         &lt;element name="Subscription" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="UseFragmentID" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="FragmentID" type="{http://www.datapower.com/schemas/management}dmFragmentID"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmWSUserToggles", propOrder = {
    "wsdlName",
    "serviceName",
    "servicePortName",
    "portTypeName",
    "bindingName",
    "operationName",
    "toggles",
    "subscription",
    "useFragmentID",
    "fragmentID"
})
public class DmWSUserToggles {

    @XmlElement(name = "WSDLName", required = true)
    protected String wsdlName;
    @XmlElement(name = "ServiceName", required = true)
    protected String serviceName;
    @XmlElement(name = "ServicePortName", required = true)
    protected String servicePortName;
    @XmlElement(name = "PortTypeName", required = true)
    protected String portTypeName;
    @XmlElement(name = "BindingName", required = true)
    protected String bindingName;
    @XmlElement(name = "OperationName", required = true)
    protected String operationName;
    @XmlElement(name = "Toggles", required = true, nillable = true)
    protected DmWSDLUserPolicyToggles toggles;
    @XmlElement(name = "Subscription", required = true, nillable = true)
    protected DmReference subscription;
    @XmlElement(name = "UseFragmentID", required = true, nillable = true)
    protected DmToggle useFragmentID;
    @XmlElement(name = "FragmentID", required = true, nillable = true)
    protected String fragmentID;

    /**
     * Gets the value of the wsdlName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWSDLName() {
        return wsdlName;
    }

    /**
     * Sets the value of the wsdlName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWSDLName(String value) {
        this.wsdlName = value;
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
     * Gets the value of the servicePortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicePortName() {
        return servicePortName;
    }

    /**
     * Sets the value of the servicePortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicePortName(String value) {
        this.servicePortName = value;
    }

    /**
     * Gets the value of the portTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortTypeName() {
        return portTypeName;
    }

    /**
     * Sets the value of the portTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortTypeName(String value) {
        this.portTypeName = value;
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
     * Gets the value of the operationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationName() {
        return operationName;
    }

    /**
     * Sets the value of the operationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationName(String value) {
        this.operationName = value;
    }

    /**
     * Gets the value of the toggles property.
     * 
     * @return
     *     possible object is
     *     {@link DmWSDLUserPolicyToggles }
     *     
     */
    public DmWSDLUserPolicyToggles getToggles() {
        return toggles;
    }

    /**
     * Sets the value of the toggles property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmWSDLUserPolicyToggles }
     *     
     */
    public void setToggles(DmWSDLUserPolicyToggles value) {
        this.toggles = value;
    }

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
     * Gets the value of the useFragmentID property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getUseFragmentID() {
        return useFragmentID;
    }

    /**
     * Sets the value of the useFragmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setUseFragmentID(DmToggle value) {
        this.useFragmentID = value;
    }

    /**
     * Gets the value of the fragmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFragmentID() {
        return fragmentID;
    }

    /**
     * Sets the value of the fragmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFragmentID(String value) {
        this.fragmentID = value;
    }

}
