
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusNFSMountStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusNFSMountStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.datapower.com/schemas/management}dmNFSMountType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Remote" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.datapower.com/schemas/management}dmNFSMountState" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.datapower.com/schemas/management}dmIPHostAddress" minOccurs="0"/>
 *         &lt;element name="Transport" type="{http://www.datapower.com/schemas/management}dmNFSTransportType" minOccurs="0"/>
 *         &lt;element name="Port" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="FilesRead" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="FilesWritten" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="FilesOpen" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusNFSMountStatus", propOrder = {
    "type",
    "name",
    "remote",
    "state",
    "version",
    "address",
    "transport",
    "port",
    "filesRead",
    "filesWritten",
    "filesOpen"
})
public class StatusNFSMountStatus {

    @XmlElement(name = "Type")
    protected DmNFSMountType type;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Remote")
    protected String remote;
    @XmlElement(name = "State")
    protected DmNFSMountState state;
    @XmlElement(name = "Version")
    protected Long version;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "Transport")
    protected DmNFSTransportType transport;
    @XmlElement(name = "Port")
    protected Long port;
    @XmlElement(name = "FilesRead")
    protected Long filesRead;
    @XmlElement(name = "FilesWritten")
    protected Long filesWritten;
    @XmlElement(name = "FilesOpen")
    protected Long filesOpen;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link DmNFSMountType }
     *     
     */
    public DmNFSMountType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmNFSMountType }
     *     
     */
    public void setType(DmNFSMountType value) {
        this.type = value;
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
     * Gets the value of the remote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemote() {
        return remote;
    }

    /**
     * Sets the value of the remote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemote(String value) {
        this.remote = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link DmNFSMountState }
     *     
     */
    public DmNFSMountState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmNFSMountState }
     *     
     */
    public void setState(DmNFSMountState value) {
        this.state = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVersion(Long value) {
        this.version = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the transport property.
     * 
     * @return
     *     possible object is
     *     {@link DmNFSTransportType }
     *     
     */
    public DmNFSTransportType getTransport() {
        return transport;
    }

    /**
     * Sets the value of the transport property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmNFSTransportType }
     *     
     */
    public void setTransport(DmNFSTransportType value) {
        this.transport = value;
    }

    /**
     * Gets the value of the port property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPort(Long value) {
        this.port = value;
    }

    /**
     * Gets the value of the filesRead property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFilesRead() {
        return filesRead;
    }

    /**
     * Sets the value of the filesRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFilesRead(Long value) {
        this.filesRead = value;
    }

    /**
     * Gets the value of the filesWritten property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFilesWritten() {
        return filesWritten;
    }

    /**
     * Sets the value of the filesWritten property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFilesWritten(Long value) {
        this.filesWritten = value;
    }

    /**
     * Gets the value of the filesOpen property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFilesOpen() {
        return filesOpen;
    }

    /**
     * Sets the value of the filesOpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFilesOpen(Long value) {
        this.filesOpen = value;
    }

}
