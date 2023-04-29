
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmAccessPolicyURIType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmAccessPolicyURIType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeviceIP" type="{http://www.datapower.com/schemas/management}dmLocalIPHostAddress"/>
 *         &lt;element name="Domain" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="Type" type="{http://www.datapower.com/schemas/management}dmResourceType"/>
 *         &lt;element name="Name" type="{http://www.datapower.com/schemas/management}dmPCRE"/>
 *         &lt;element name="LocalAddress" type="{http://www.datapower.com/schemas/management}dmPCRE"/>
 *         &lt;element name="LocalPort" type="{http://www.datapower.com/schemas/management}dmPCRE"/>
 *         &lt;element name="Directory" type="{http://www.datapower.com/schemas/management}dmPCRE"/>
 *         &lt;element name="Filename" type="{http://www.datapower.com/schemas/management}dmPCRE"/>
 *         &lt;element name="Access" type="{http://www.datapower.com/schemas/management}dmAccessType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmAccessPolicyURIType", propOrder = {
    "deviceIP",
    "domain",
    "type",
    "name",
    "localAddress",
    "localPort",
    "directory",
    "filename",
    "access"
})
public class DmAccessPolicyURIType {

    @XmlElement(name = "DeviceIP", required = true, nillable = true)
    protected String deviceIP;
    @XmlElement(name = "Domain", required = true, nillable = true)
    protected DmReference domain;
    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "Name", required = true, nillable = true)
    protected String name;
    @XmlElement(name = "LocalAddress", required = true, nillable = true)
    protected String localAddress;
    @XmlElement(name = "LocalPort", required = true, nillable = true)
    protected String localPort;
    @XmlElement(name = "Directory", required = true, nillable = true)
    protected String directory;
    @XmlElement(name = "Filename", required = true, nillable = true)
    protected String filename;
    @XmlElement(name = "Access", required = true, nillable = true)
    protected DmAccessType access;

    /**
     * Gets the value of the deviceIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceIP() {
        return deviceIP;
    }

    /**
     * Sets the value of the deviceIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceIP(String value) {
        this.deviceIP = value;
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setDomain(DmReference value) {
        this.domain = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
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
     * Gets the value of the localAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalAddress() {
        return localAddress;
    }

    /**
     * Sets the value of the localAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalAddress(String value) {
        this.localAddress = value;
    }

    /**
     * Gets the value of the localPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalPort() {
        return localPort;
    }

    /**
     * Sets the value of the localPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalPort(String value) {
        this.localPort = value;
    }

    /**
     * Gets the value of the directory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectory() {
        return directory;
    }

    /**
     * Sets the value of the directory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectory(String value) {
        this.directory = value;
    }

    /**
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilename(String value) {
        this.filename = value;
    }

    /**
     * Gets the value of the access property.
     * 
     * @return
     *     possible object is
     *     {@link DmAccessType }
     *     
     */
    public DmAccessType getAccess() {
        return access;
    }

    /**
     * Sets the value of the access property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmAccessType }
     *     
     */
    public void setAccess(DmAccessType value) {
        this.access = value;
    }

}
