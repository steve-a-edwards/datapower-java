
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusWSOperationsStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusWSOperationsStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WSGateway" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="Interface" type="{http://www.datapower.com/schemas/management}dmIPHostAddress" minOccurs="0"/>
 *         &lt;element name="Port" type="{http://www.datapower.com/schemas/management}dmIPPort" minOccurs="0"/>
 *         &lt;element name="URL" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="SOAPAction" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="SOAPBody" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.datapower.com/schemas/management}dmWSOperationStatus" minOccurs="0"/>
 *         &lt;element name="RemoteURL" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusWSOperationsStatus", propOrder = {
    "wsGateway",
    "_interface",
    "port",
    "url",
    "soapAction",
    "soapBody",
    "status",
    "remoteURL"
})
public class StatusWSOperationsStatus {

    @XmlElement(name = "WSGateway")
    protected DmReference wsGateway;
    @XmlElement(name = "Interface")
    protected String _interface;
    @XmlElement(name = "Port")
    protected Integer port;
    @XmlElement(name = "URL")
    protected String url;
    @XmlElement(name = "SOAPAction")
    protected String soapAction;
    @XmlElement(name = "SOAPBody")
    protected String soapBody;
    @XmlElement(name = "Status")
    protected DmWSOperationStatus status;
    @XmlElement(name = "RemoteURL")
    protected String remoteURL;

    /**
     * Gets the value of the wsGateway property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getWSGateway() {
        return wsGateway;
    }

    /**
     * Sets the value of the wsGateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setWSGateway(DmReference value) {
        this.wsGateway = value;
    }

    /**
     * Gets the value of the interface property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterface() {
        return _interface;
    }

    /**
     * Sets the value of the interface property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterface(String value) {
        this._interface = value;
    }

    /**
     * Gets the value of the port property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPort(Integer value) {
        this.port = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the soapAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOAPAction() {
        return soapAction;
    }

    /**
     * Sets the value of the soapAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOAPAction(String value) {
        this.soapAction = value;
    }

    /**
     * Gets the value of the soapBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOAPBody() {
        return soapBody;
    }

    /**
     * Sets the value of the soapBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOAPBody(String value) {
        this.soapBody = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link DmWSOperationStatus }
     *     
     */
    public DmWSOperationStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmWSOperationStatus }
     *     
     */
    public void setStatus(DmWSOperationStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the remoteURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteURL() {
        return remoteURL;
    }

    /**
     * Sets the value of the remoteURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteURL(String value) {
        this.remoteURL = value;
    }

}
