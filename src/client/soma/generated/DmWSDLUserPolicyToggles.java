
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSDLUserPolicyToggles complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmWSDLUserPolicyToggles">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Enable" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="Publish" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="VerifyFaults" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="VerifyHeaders" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="NoRequestValidation" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="NoResponseValidation" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="SuppressFaultsElementsForRPCWrappers" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="NoWSA" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="NoWSRM" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="AllowXOPInclude" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmWSDLUserPolicyToggles", propOrder = {

})
public class DmWSDLUserPolicyToggles {

    @XmlElement(name = "Enable")
    protected DmToggle enable;
    @XmlElement(name = "Publish")
    protected DmToggle publish;
    @XmlElement(name = "VerifyFaults")
    protected DmToggle verifyFaults;
    @XmlElement(name = "VerifyHeaders")
    protected DmToggle verifyHeaders;
    @XmlElement(name = "NoRequestValidation")
    protected DmToggle noRequestValidation;
    @XmlElement(name = "NoResponseValidation")
    protected DmToggle noResponseValidation;
    @XmlElement(name = "SuppressFaultsElementsForRPCWrappers")
    protected DmToggle suppressFaultsElementsForRPCWrappers;
    @XmlElement(name = "NoWSA")
    protected DmToggle noWSA;
    @XmlElement(name = "NoWSRM")
    protected DmToggle noWSRM;
    @XmlElement(name = "AllowXOPInclude")
    protected DmToggle allowXOPInclude;

    /**
     * Gets the value of the enable property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getEnable() {
        return enable;
    }

    /**
     * Sets the value of the enable property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setEnable(DmToggle value) {
        this.enable = value;
    }

    /**
     * Gets the value of the publish property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getPublish() {
        return publish;
    }

    /**
     * Sets the value of the publish property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setPublish(DmToggle value) {
        this.publish = value;
    }

    /**
     * Gets the value of the verifyFaults property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getVerifyFaults() {
        return verifyFaults;
    }

    /**
     * Sets the value of the verifyFaults property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setVerifyFaults(DmToggle value) {
        this.verifyFaults = value;
    }

    /**
     * Gets the value of the verifyHeaders property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getVerifyHeaders() {
        return verifyHeaders;
    }

    /**
     * Sets the value of the verifyHeaders property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setVerifyHeaders(DmToggle value) {
        this.verifyHeaders = value;
    }

    /**
     * Gets the value of the noRequestValidation property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getNoRequestValidation() {
        return noRequestValidation;
    }

    /**
     * Sets the value of the noRequestValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setNoRequestValidation(DmToggle value) {
        this.noRequestValidation = value;
    }

    /**
     * Gets the value of the noResponseValidation property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getNoResponseValidation() {
        return noResponseValidation;
    }

    /**
     * Sets the value of the noResponseValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setNoResponseValidation(DmToggle value) {
        this.noResponseValidation = value;
    }

    /**
     * Gets the value of the suppressFaultsElementsForRPCWrappers property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getSuppressFaultsElementsForRPCWrappers() {
        return suppressFaultsElementsForRPCWrappers;
    }

    /**
     * Sets the value of the suppressFaultsElementsForRPCWrappers property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setSuppressFaultsElementsForRPCWrappers(DmToggle value) {
        this.suppressFaultsElementsForRPCWrappers = value;
    }

    /**
     * Gets the value of the noWSA property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getNoWSA() {
        return noWSA;
    }

    /**
     * Sets the value of the noWSA property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setNoWSA(DmToggle value) {
        this.noWSA = value;
    }

    /**
     * Gets the value of the noWSRM property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getNoWSRM() {
        return noWSRM;
    }

    /**
     * Sets the value of the noWSRM property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setNoWSRM(DmToggle value) {
        this.noWSRM = value;
    }

    /**
     * Gets the value of the allowXOPInclude property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getAllowXOPInclude() {
        return allowXOPInclude;
    }

    /**
     * Sets the value of the allowXOPInclude property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setAllowXOPInclude(DmToggle value) {
        this.allowXOPInclude = value;
    }

}
