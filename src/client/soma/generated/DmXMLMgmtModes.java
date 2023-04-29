
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmXMLMgmtModes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmXMLMgmtModes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="any" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="soma" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="v2004" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="amp" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="slm" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="wsm" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="wsdm" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="uddi-subscription" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="wsrr-subscription" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmXMLMgmtModes", propOrder = {

})
public class DmXMLMgmtModes {

    protected DmToggle any;
    protected DmToggle soma;
    protected DmToggle v2004;
    protected DmToggle amp;
    protected DmToggle slm;
    protected DmToggle wsm;
    protected DmToggle wsdm;
    @XmlElement(name = "uddi-subscription")
    protected DmToggle uddiSubscription;
    @XmlElement(name = "wsrr-subscription")
    protected DmToggle wsrrSubscription;

    /**
     * Gets the value of the any property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getAny() {
        return any;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setAny(DmToggle value) {
        this.any = value;
    }

    /**
     * Gets the value of the soma property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getSoma() {
        return soma;
    }

    /**
     * Sets the value of the soma property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setSoma(DmToggle value) {
        this.soma = value;
    }

    /**
     * Gets the value of the v2004 property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getV2004() {
        return v2004;
    }

    /**
     * Sets the value of the v2004 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setV2004(DmToggle value) {
        this.v2004 = value;
    }

    /**
     * Gets the value of the amp property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getAmp() {
        return amp;
    }

    /**
     * Sets the value of the amp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setAmp(DmToggle value) {
        this.amp = value;
    }

    /**
     * Gets the value of the slm property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getSlm() {
        return slm;
    }

    /**
     * Sets the value of the slm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setSlm(DmToggle value) {
        this.slm = value;
    }

    /**
     * Gets the value of the wsm property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getWsm() {
        return wsm;
    }

    /**
     * Sets the value of the wsm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setWsm(DmToggle value) {
        this.wsm = value;
    }

    /**
     * Gets the value of the wsdm property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getWsdm() {
        return wsdm;
    }

    /**
     * Sets the value of the wsdm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setWsdm(DmToggle value) {
        this.wsdm = value;
    }

    /**
     * Gets the value of the uddiSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getUddiSubscription() {
        return uddiSubscription;
    }

    /**
     * Sets the value of the uddiSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setUddiSubscription(DmToggle value) {
        this.uddiSubscription = value;
    }

    /**
     * Gets the value of the wsrrSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getWsrrSubscription() {
        return wsrrSubscription;
    }

    /**
     * Sets the value of the wsrrSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setWsrrSubscription(DmToggle value) {
        this.wsrrSubscription = value;
    }

}
