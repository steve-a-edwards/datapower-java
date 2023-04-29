
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionSecureBackup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionSecureBackup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cert" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="destination" type="{http://www.datapower.com/schemas/management}dmURL"/>
 *         &lt;element name="include-iscsi" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="include-raid" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionSecureBackup", propOrder = {
    "cert",
    "destination",
    "includeIscsi",
    "includeRaid"
})
public class ActionSecureBackup {

    @XmlElement(required = true)
    protected DmReference cert;
    @XmlElement(required = true)
    protected String destination;
    @XmlElement(name = "include-iscsi")
    protected DmToggle includeIscsi;
    @XmlElement(name = "include-raid")
    protected DmToggle includeRaid;

    /**
     * Gets the value of the cert property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getCert() {
        return cert;
    }

    /**
     * Sets the value of the cert property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setCert(DmReference value) {
        this.cert = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the includeIscsi property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getIncludeIscsi() {
        return includeIscsi;
    }

    /**
     * Sets the value of the includeIscsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setIncludeIscsi(DmToggle value) {
        this.includeIscsi = value;
    }

    /**
     * Gets the value of the includeRaid property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getIncludeRaid() {
        return includeRaid;
    }

    /**
     * Sets the value of the includeRaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setIncludeRaid(DmToggle value) {
        this.includeRaid = value;
    }

}
