
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSSLOptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmSSLOptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="OpenSSL-default" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="Disable-SSLv2" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="Disable-SSLv3" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="Disable-TLSv1" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="Enable-Legacy-Renegotiation" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmSSLOptionType", propOrder = {

})
public class DmSSLOptionType {

    @XmlElement(name = "OpenSSL-default")
    protected DmToggle openSSLDefault;
    @XmlElement(name = "Disable-SSLv2")
    protected DmToggle disableSSLv2;
    @XmlElement(name = "Disable-SSLv3")
    protected DmToggle disableSSLv3;
    @XmlElement(name = "Disable-TLSv1")
    protected DmToggle disableTLSv1;
    @XmlElement(name = "Enable-Legacy-Renegotiation")
    protected DmToggle enableLegacyRenegotiation;

    /**
     * Gets the value of the openSSLDefault property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getOpenSSLDefault() {
        return openSSLDefault;
    }

    /**
     * Sets the value of the openSSLDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setOpenSSLDefault(DmToggle value) {
        this.openSSLDefault = value;
    }

    /**
     * Gets the value of the disableSSLv2 property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getDisableSSLv2() {
        return disableSSLv2;
    }

    /**
     * Sets the value of the disableSSLv2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setDisableSSLv2(DmToggle value) {
        this.disableSSLv2 = value;
    }

    /**
     * Gets the value of the disableSSLv3 property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getDisableSSLv3() {
        return disableSSLv3;
    }

    /**
     * Sets the value of the disableSSLv3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setDisableSSLv3(DmToggle value) {
        this.disableSSLv3 = value;
    }

    /**
     * Gets the value of the disableTLSv1 property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getDisableTLSv1() {
        return disableTLSv1;
    }

    /**
     * Sets the value of the disableTLSv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setDisableTLSv1(DmToggle value) {
        this.disableTLSv1 = value;
    }

    /**
     * Gets the value of the enableLegacyRenegotiation property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getEnableLegacyRenegotiation() {
        return enableLegacyRenegotiation;
    }

    /**
     * Sets the value of the enableLegacyRenegotiation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setEnableLegacyRenegotiation(DmToggle value) {
        this.enableLegacyRenegotiation = value;
    }

}
