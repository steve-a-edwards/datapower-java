
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusLicenseStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusLicenseStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Feature" type="{http://www.datapower.com/schemas/management}dmLicensedFeature" minOccurs="0"/>
 *         &lt;element name="Enabled" type="{http://www.datapower.com/schemas/management}dmLicenseStatus" minOccurs="0"/>
 *         &lt;element name="Available" type="{http://www.datapower.com/schemas/management}dmFeatureStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusLicenseStatus", propOrder = {
    "feature",
    "enabled",
    "available"
})
public class StatusLicenseStatus {

    @XmlElement(name = "Feature")
    protected DmLicensedFeature feature;
    @XmlElement(name = "Enabled")
    protected DmLicenseStatus enabled;
    @XmlElement(name = "Available")
    protected DmFeatureStatus available;

    /**
     * Gets the value of the feature property.
     * 
     * @return
     *     possible object is
     *     {@link DmLicensedFeature }
     *     
     */
    public DmLicensedFeature getFeature() {
        return feature;
    }

    /**
     * Sets the value of the feature property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmLicensedFeature }
     *     
     */
    public void setFeature(DmLicensedFeature value) {
        this.feature = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link DmLicenseStatus }
     *     
     */
    public DmLicenseStatus getEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmLicenseStatus }
     *     
     */
    public void setEnabled(DmLicenseStatus value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the available property.
     * 
     * @return
     *     possible object is
     *     {@link DmFeatureStatus }
     *     
     */
    public DmFeatureStatus getAvailable() {
        return available;
    }

    /**
     * Sets the value of the available property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmFeatureStatus }
     *     
     */
    public void setAvailable(DmFeatureStatus value) {
        this.available = value;
    }

}
