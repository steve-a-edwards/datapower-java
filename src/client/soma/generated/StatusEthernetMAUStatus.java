
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusEthernetMAUStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusEthernetMAUStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InterfaceIndex" type="{http://www.datapower.com/schemas/management}dmInt32" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="MauIndex" type="{http://www.datapower.com/schemas/management}dmInt32" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.datapower.com/schemas/management}dmMauLinkStatus" minOccurs="0"/>
 *         &lt;element name="JabberState" type="{http://www.datapower.com/schemas/management}dmMauJabber" minOccurs="0"/>
 *         &lt;element name="AutoNegRemoteSignaling" type="{http://www.datapower.com/schemas/management}dmMauAutoNegRemoteSignaling" minOccurs="0"/>
 *         &lt;element name="AutoNegConfig" type="{http://www.datapower.com/schemas/management}dmMauAutoNegConfig" minOccurs="0"/>
 *         &lt;element name="AutoNegCapabilities" type="{http://www.datapower.com/schemas/management}dmMauAutoNegotiationBits" minOccurs="0"/>
 *         &lt;element name="AutoNegCapabilitiesAdvertised" type="{http://www.datapower.com/schemas/management}dmMauAutoNegotiationBits" minOccurs="0"/>
 *         &lt;element name="AutoNegCapabilitiesLinkPartner" type="{http://www.datapower.com/schemas/management}dmMauAutoNegotiationBits" minOccurs="0"/>
 *         &lt;element name="AutoNegRemoteFaultAdvertised" type="{http://www.datapower.com/schemas/management}dmMauAutoNegFault" minOccurs="0"/>
 *         &lt;element name="AutoNegRemoteFaultReceived" type="{http://www.datapower.com/schemas/management}dmMauAutoNegFault" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusEthernetMAUStatus", propOrder = {
    "interfaceIndex",
    "name",
    "mauIndex",
    "status",
    "jabberState",
    "autoNegRemoteSignaling",
    "autoNegConfig",
    "autoNegCapabilities",
    "autoNegCapabilitiesAdvertised",
    "autoNegCapabilitiesLinkPartner",
    "autoNegRemoteFaultAdvertised",
    "autoNegRemoteFaultReceived"
})
public class StatusEthernetMAUStatus {

    @XmlElement(name = "InterfaceIndex")
    protected Integer interfaceIndex;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "MauIndex")
    protected Integer mauIndex;
    @XmlElement(name = "Status")
    protected DmMauLinkStatus status;
    @XmlElement(name = "JabberState")
    protected DmMauJabber jabberState;
    @XmlElement(name = "AutoNegRemoteSignaling")
    protected DmMauAutoNegRemoteSignaling autoNegRemoteSignaling;
    @XmlElement(name = "AutoNegConfig")
    protected DmMauAutoNegConfig autoNegConfig;
    @XmlElement(name = "AutoNegCapabilities")
    protected DmMauAutoNegotiationBits autoNegCapabilities;
    @XmlElement(name = "AutoNegCapabilitiesAdvertised")
    protected DmMauAutoNegotiationBits autoNegCapabilitiesAdvertised;
    @XmlElement(name = "AutoNegCapabilitiesLinkPartner")
    protected DmMauAutoNegotiationBits autoNegCapabilitiesLinkPartner;
    @XmlElement(name = "AutoNegRemoteFaultAdvertised")
    protected DmMauAutoNegFault autoNegRemoteFaultAdvertised;
    @XmlElement(name = "AutoNegRemoteFaultReceived")
    protected DmMauAutoNegFault autoNegRemoteFaultReceived;

    /**
     * Gets the value of the interfaceIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInterfaceIndex() {
        return interfaceIndex;
    }

    /**
     * Sets the value of the interfaceIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInterfaceIndex(Integer value) {
        this.interfaceIndex = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the mauIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMauIndex() {
        return mauIndex;
    }

    /**
     * Sets the value of the mauIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMauIndex(Integer value) {
        this.mauIndex = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link DmMauLinkStatus }
     *     
     */
    public DmMauLinkStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmMauLinkStatus }
     *     
     */
    public void setStatus(DmMauLinkStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the jabberState property.
     * 
     * @return
     *     possible object is
     *     {@link DmMauJabber }
     *     
     */
    public DmMauJabber getJabberState() {
        return jabberState;
    }

    /**
     * Sets the value of the jabberState property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmMauJabber }
     *     
     */
    public void setJabberState(DmMauJabber value) {
        this.jabberState = value;
    }

    /**
     * Gets the value of the autoNegRemoteSignaling property.
     * 
     * @return
     *     possible object is
     *     {@link DmMauAutoNegRemoteSignaling }
     *     
     */
    public DmMauAutoNegRemoteSignaling getAutoNegRemoteSignaling() {
        return autoNegRemoteSignaling;
    }

    /**
     * Sets the value of the autoNegRemoteSignaling property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmMauAutoNegRemoteSignaling }
     *     
     */
    public void setAutoNegRemoteSignaling(DmMauAutoNegRemoteSignaling value) {
        this.autoNegRemoteSignaling = value;
    }

    /**
     * Gets the value of the autoNegConfig property.
     * 
     * @return
     *     possible object is
     *     {@link DmMauAutoNegConfig }
     *     
     */
    public DmMauAutoNegConfig getAutoNegConfig() {
        return autoNegConfig;
    }

    /**
     * Sets the value of the autoNegConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmMauAutoNegConfig }
     *     
     */
    public void setAutoNegConfig(DmMauAutoNegConfig value) {
        this.autoNegConfig = value;
    }

    /**
     * Gets the value of the autoNegCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link DmMauAutoNegotiationBits }
     *     
     */
    public DmMauAutoNegotiationBits getAutoNegCapabilities() {
        return autoNegCapabilities;
    }

    /**
     * Sets the value of the autoNegCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmMauAutoNegotiationBits }
     *     
     */
    public void setAutoNegCapabilities(DmMauAutoNegotiationBits value) {
        this.autoNegCapabilities = value;
    }

    /**
     * Gets the value of the autoNegCapabilitiesAdvertised property.
     * 
     * @return
     *     possible object is
     *     {@link DmMauAutoNegotiationBits }
     *     
     */
    public DmMauAutoNegotiationBits getAutoNegCapabilitiesAdvertised() {
        return autoNegCapabilitiesAdvertised;
    }

    /**
     * Sets the value of the autoNegCapabilitiesAdvertised property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmMauAutoNegotiationBits }
     *     
     */
    public void setAutoNegCapabilitiesAdvertised(DmMauAutoNegotiationBits value) {
        this.autoNegCapabilitiesAdvertised = value;
    }

    /**
     * Gets the value of the autoNegCapabilitiesLinkPartner property.
     * 
     * @return
     *     possible object is
     *     {@link DmMauAutoNegotiationBits }
     *     
     */
    public DmMauAutoNegotiationBits getAutoNegCapabilitiesLinkPartner() {
        return autoNegCapabilitiesLinkPartner;
    }

    /**
     * Sets the value of the autoNegCapabilitiesLinkPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmMauAutoNegotiationBits }
     *     
     */
    public void setAutoNegCapabilitiesLinkPartner(DmMauAutoNegotiationBits value) {
        this.autoNegCapabilitiesLinkPartner = value;
    }

    /**
     * Gets the value of the autoNegRemoteFaultAdvertised property.
     * 
     * @return
     *     possible object is
     *     {@link DmMauAutoNegFault }
     *     
     */
    public DmMauAutoNegFault getAutoNegRemoteFaultAdvertised() {
        return autoNegRemoteFaultAdvertised;
    }

    /**
     * Sets the value of the autoNegRemoteFaultAdvertised property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmMauAutoNegFault }
     *     
     */
    public void setAutoNegRemoteFaultAdvertised(DmMauAutoNegFault value) {
        this.autoNegRemoteFaultAdvertised = value;
    }

    /**
     * Gets the value of the autoNegRemoteFaultReceived property.
     * 
     * @return
     *     possible object is
     *     {@link DmMauAutoNegFault }
     *     
     */
    public DmMauAutoNegFault getAutoNegRemoteFaultReceived() {
        return autoNegRemoteFaultReceived;
    }

    /**
     * Sets the value of the autoNegRemoteFaultReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmMauAutoNegFault }
     *     
     */
    public void setAutoNegRemoteFaultReceived(DmMauAutoNegFault value) {
        this.autoNegRemoteFaultReceived = value;
    }

}
