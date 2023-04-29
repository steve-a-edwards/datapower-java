
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusEthernetMIIRegisterStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusEthernetMIIRegisterStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InterfaceIndex" type="{http://www.datapower.com/schemas/management}dmInt32" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="MauIndex" type="{http://www.datapower.com/schemas/management}dmInt32" minOccurs="0"/>
 *         &lt;element name="Control" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="PhyIdentifierHigh" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="PhyIdentifierLow" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="AutoNegAdvertisement" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="AutoNegLinkPartnerAbility" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="AutoNegExpansion" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="AutoNegNextPageTransmit" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="AutoNegLinkPartnerRecNextPage" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="MasterSlaveControlRegister" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="MasterSlaveStatusRegister" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="PSEControl" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="PSEStatus" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="MMDAccessControl" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="MMDAccessAddressData" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="ExtendedStatus" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="Vendor16" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="Vendor17" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="Vendor18" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="Vendor19" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="Vendor20" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="Vendor21" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="Vendor22" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="Vendor23" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="Vendor24" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="Vendor25" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="Vendor26" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="Vendor27" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="Vendor28" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="Vendor29" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="Vendor30" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="Vendor31" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusEthernetMIIRegisterStatus", propOrder = {
    "interfaceIndex",
    "name",
    "mauIndex",
    "control",
    "status",
    "phyIdentifierHigh",
    "phyIdentifierLow",
    "autoNegAdvertisement",
    "autoNegLinkPartnerAbility",
    "autoNegExpansion",
    "autoNegNextPageTransmit",
    "autoNegLinkPartnerRecNextPage",
    "masterSlaveControlRegister",
    "masterSlaveStatusRegister",
    "pseControl",
    "pseStatus",
    "mmdAccessControl",
    "mmdAccessAddressData",
    "extendedStatus",
    "vendor16",
    "vendor17",
    "vendor18",
    "vendor19",
    "vendor20",
    "vendor21",
    "vendor22",
    "vendor23",
    "vendor24",
    "vendor25",
    "vendor26",
    "vendor27",
    "vendor28",
    "vendor29",
    "vendor30",
    "vendor31"
})
public class StatusEthernetMIIRegisterStatus {

    @XmlElement(name = "InterfaceIndex")
    protected Integer interfaceIndex;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "MauIndex")
    protected Integer mauIndex;
    @XmlElement(name = "Control")
    protected Integer control;
    @XmlElement(name = "Status")
    protected Integer status;
    @XmlElement(name = "PhyIdentifierHigh")
    protected Integer phyIdentifierHigh;
    @XmlElement(name = "PhyIdentifierLow")
    protected Integer phyIdentifierLow;
    @XmlElement(name = "AutoNegAdvertisement")
    protected Integer autoNegAdvertisement;
    @XmlElement(name = "AutoNegLinkPartnerAbility")
    protected Integer autoNegLinkPartnerAbility;
    @XmlElement(name = "AutoNegExpansion")
    protected Integer autoNegExpansion;
    @XmlElement(name = "AutoNegNextPageTransmit")
    protected Integer autoNegNextPageTransmit;
    @XmlElement(name = "AutoNegLinkPartnerRecNextPage")
    protected Integer autoNegLinkPartnerRecNextPage;
    @XmlElement(name = "MasterSlaveControlRegister")
    protected Integer masterSlaveControlRegister;
    @XmlElement(name = "MasterSlaveStatusRegister")
    protected Integer masterSlaveStatusRegister;
    @XmlElement(name = "PSEControl")
    protected Integer pseControl;
    @XmlElement(name = "PSEStatus")
    protected Integer pseStatus;
    @XmlElement(name = "MMDAccessControl")
    protected Integer mmdAccessControl;
    @XmlElement(name = "MMDAccessAddressData")
    protected Integer mmdAccessAddressData;
    @XmlElement(name = "ExtendedStatus")
    protected Integer extendedStatus;
    @XmlElement(name = "Vendor16")
    protected Integer vendor16;
    @XmlElement(name = "Vendor17")
    protected Integer vendor17;
    @XmlElement(name = "Vendor18")
    protected Integer vendor18;
    @XmlElement(name = "Vendor19")
    protected Integer vendor19;
    @XmlElement(name = "Vendor20")
    protected Integer vendor20;
    @XmlElement(name = "Vendor21")
    protected Integer vendor21;
    @XmlElement(name = "Vendor22")
    protected Integer vendor22;
    @XmlElement(name = "Vendor23")
    protected Integer vendor23;
    @XmlElement(name = "Vendor24")
    protected Integer vendor24;
    @XmlElement(name = "Vendor25")
    protected Integer vendor25;
    @XmlElement(name = "Vendor26")
    protected Integer vendor26;
    @XmlElement(name = "Vendor27")
    protected Integer vendor27;
    @XmlElement(name = "Vendor28")
    protected Integer vendor28;
    @XmlElement(name = "Vendor29")
    protected Integer vendor29;
    @XmlElement(name = "Vendor30")
    protected Integer vendor30;
    @XmlElement(name = "Vendor31")
    protected Integer vendor31;

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
     * Gets the value of the control property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getControl() {
        return control;
    }

    /**
     * Sets the value of the control property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setControl(Integer value) {
        this.control = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatus(Integer value) {
        this.status = value;
    }

    /**
     * Gets the value of the phyIdentifierHigh property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPhyIdentifierHigh() {
        return phyIdentifierHigh;
    }

    /**
     * Sets the value of the phyIdentifierHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPhyIdentifierHigh(Integer value) {
        this.phyIdentifierHigh = value;
    }

    /**
     * Gets the value of the phyIdentifierLow property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPhyIdentifierLow() {
        return phyIdentifierLow;
    }

    /**
     * Sets the value of the phyIdentifierLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPhyIdentifierLow(Integer value) {
        this.phyIdentifierLow = value;
    }

    /**
     * Gets the value of the autoNegAdvertisement property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAutoNegAdvertisement() {
        return autoNegAdvertisement;
    }

    /**
     * Sets the value of the autoNegAdvertisement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAutoNegAdvertisement(Integer value) {
        this.autoNegAdvertisement = value;
    }

    /**
     * Gets the value of the autoNegLinkPartnerAbility property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAutoNegLinkPartnerAbility() {
        return autoNegLinkPartnerAbility;
    }

    /**
     * Sets the value of the autoNegLinkPartnerAbility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAutoNegLinkPartnerAbility(Integer value) {
        this.autoNegLinkPartnerAbility = value;
    }

    /**
     * Gets the value of the autoNegExpansion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAutoNegExpansion() {
        return autoNegExpansion;
    }

    /**
     * Sets the value of the autoNegExpansion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAutoNegExpansion(Integer value) {
        this.autoNegExpansion = value;
    }

    /**
     * Gets the value of the autoNegNextPageTransmit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAutoNegNextPageTransmit() {
        return autoNegNextPageTransmit;
    }

    /**
     * Sets the value of the autoNegNextPageTransmit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAutoNegNextPageTransmit(Integer value) {
        this.autoNegNextPageTransmit = value;
    }

    /**
     * Gets the value of the autoNegLinkPartnerRecNextPage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAutoNegLinkPartnerRecNextPage() {
        return autoNegLinkPartnerRecNextPage;
    }

    /**
     * Sets the value of the autoNegLinkPartnerRecNextPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAutoNegLinkPartnerRecNextPage(Integer value) {
        this.autoNegLinkPartnerRecNextPage = value;
    }

    /**
     * Gets the value of the masterSlaveControlRegister property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMasterSlaveControlRegister() {
        return masterSlaveControlRegister;
    }

    /**
     * Sets the value of the masterSlaveControlRegister property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMasterSlaveControlRegister(Integer value) {
        this.masterSlaveControlRegister = value;
    }

    /**
     * Gets the value of the masterSlaveStatusRegister property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMasterSlaveStatusRegister() {
        return masterSlaveStatusRegister;
    }

    /**
     * Sets the value of the masterSlaveStatusRegister property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMasterSlaveStatusRegister(Integer value) {
        this.masterSlaveStatusRegister = value;
    }

    /**
     * Gets the value of the pseControl property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPSEControl() {
        return pseControl;
    }

    /**
     * Sets the value of the pseControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPSEControl(Integer value) {
        this.pseControl = value;
    }

    /**
     * Gets the value of the pseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPSEStatus() {
        return pseStatus;
    }

    /**
     * Sets the value of the pseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPSEStatus(Integer value) {
        this.pseStatus = value;
    }

    /**
     * Gets the value of the mmdAccessControl property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMMDAccessControl() {
        return mmdAccessControl;
    }

    /**
     * Sets the value of the mmdAccessControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMMDAccessControl(Integer value) {
        this.mmdAccessControl = value;
    }

    /**
     * Gets the value of the mmdAccessAddressData property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMMDAccessAddressData() {
        return mmdAccessAddressData;
    }

    /**
     * Sets the value of the mmdAccessAddressData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMMDAccessAddressData(Integer value) {
        this.mmdAccessAddressData = value;
    }

    /**
     * Gets the value of the extendedStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExtendedStatus() {
        return extendedStatus;
    }

    /**
     * Sets the value of the extendedStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExtendedStatus(Integer value) {
        this.extendedStatus = value;
    }

    /**
     * Gets the value of the vendor16 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVendor16() {
        return vendor16;
    }

    /**
     * Sets the value of the vendor16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVendor16(Integer value) {
        this.vendor16 = value;
    }

    /**
     * Gets the value of the vendor17 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVendor17() {
        return vendor17;
    }

    /**
     * Sets the value of the vendor17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVendor17(Integer value) {
        this.vendor17 = value;
    }

    /**
     * Gets the value of the vendor18 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVendor18() {
        return vendor18;
    }

    /**
     * Sets the value of the vendor18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVendor18(Integer value) {
        this.vendor18 = value;
    }

    /**
     * Gets the value of the vendor19 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVendor19() {
        return vendor19;
    }

    /**
     * Sets the value of the vendor19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVendor19(Integer value) {
        this.vendor19 = value;
    }

    /**
     * Gets the value of the vendor20 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVendor20() {
        return vendor20;
    }

    /**
     * Sets the value of the vendor20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVendor20(Integer value) {
        this.vendor20 = value;
    }

    /**
     * Gets the value of the vendor21 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVendor21() {
        return vendor21;
    }

    /**
     * Sets the value of the vendor21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVendor21(Integer value) {
        this.vendor21 = value;
    }

    /**
     * Gets the value of the vendor22 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVendor22() {
        return vendor22;
    }

    /**
     * Sets the value of the vendor22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVendor22(Integer value) {
        this.vendor22 = value;
    }

    /**
     * Gets the value of the vendor23 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVendor23() {
        return vendor23;
    }

    /**
     * Sets the value of the vendor23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVendor23(Integer value) {
        this.vendor23 = value;
    }

    /**
     * Gets the value of the vendor24 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVendor24() {
        return vendor24;
    }

    /**
     * Sets the value of the vendor24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVendor24(Integer value) {
        this.vendor24 = value;
    }

    /**
     * Gets the value of the vendor25 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVendor25() {
        return vendor25;
    }

    /**
     * Sets the value of the vendor25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVendor25(Integer value) {
        this.vendor25 = value;
    }

    /**
     * Gets the value of the vendor26 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVendor26() {
        return vendor26;
    }

    /**
     * Sets the value of the vendor26 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVendor26(Integer value) {
        this.vendor26 = value;
    }

    /**
     * Gets the value of the vendor27 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVendor27() {
        return vendor27;
    }

    /**
     * Sets the value of the vendor27 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVendor27(Integer value) {
        this.vendor27 = value;
    }

    /**
     * Gets the value of the vendor28 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVendor28() {
        return vendor28;
    }

    /**
     * Sets the value of the vendor28 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVendor28(Integer value) {
        this.vendor28 = value;
    }

    /**
     * Gets the value of the vendor29 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVendor29() {
        return vendor29;
    }

    /**
     * Sets the value of the vendor29 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVendor29(Integer value) {
        this.vendor29 = value;
    }

    /**
     * Gets the value of the vendor30 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVendor30() {
        return vendor30;
    }

    /**
     * Sets the value of the vendor30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVendor30(Integer value) {
        this.vendor30 = value;
    }

    /**
     * Gets the value of the vendor31 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVendor31() {
        return vendor31;
    }

    /**
     * Sets the value of the vendor31 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVendor31(Integer value) {
        this.vendor31 = value;
    }

}
