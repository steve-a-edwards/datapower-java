
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSEndpointLocalRewriteRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmWSEndpointLocalRewriteRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServicePortMatchRegexp" type="{http://www.datapower.com/schemas/management}dmPCRE"/>
 *         &lt;element name="LocalEndpointProtocol" type="{http://www.datapower.com/schemas/management}dmWSProtocolType"/>
 *         &lt;element name="LocalEndpointHostname" type="{http://www.datapower.com/schemas/management}dmLocalIPHostAddress"/>
 *         &lt;element name="LocalEndpointPort" type="{http://www.datapower.com/schemas/management}dmIPPort"/>
 *         &lt;element name="LocalEndpointURI" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="FrontProtocol" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="UseFrontProtocol" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="WSDLBindingProtocol" type="{http://www.datapower.com/schemas/management}dmWSDLBindingProtocol"/>
 *         &lt;element name="FrontsidePortSuffix" type="{http://www.datapower.com/schemas/management}dmString"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmWSEndpointLocalRewriteRule", propOrder = {
    "servicePortMatchRegexp",
    "localEndpointProtocol",
    "localEndpointHostname",
    "localEndpointPort",
    "localEndpointURI",
    "frontProtocol",
    "useFrontProtocol",
    "wsdlBindingProtocol",
    "frontsidePortSuffix"
})
public class DmWSEndpointLocalRewriteRule {

    @XmlElement(name = "ServicePortMatchRegexp", required = true, nillable = true)
    protected String servicePortMatchRegexp;
    @XmlElement(name = "LocalEndpointProtocol", required = true, nillable = true)
    protected DmWSProtocolType localEndpointProtocol;
    @XmlElement(name = "LocalEndpointHostname", required = true)
    protected String localEndpointHostname;
    @XmlElement(name = "LocalEndpointPort", required = true, type = Integer.class, nillable = true)
    protected Integer localEndpointPort;
    @XmlElement(name = "LocalEndpointURI", required = true, nillable = true)
    protected String localEndpointURI;
    @XmlElement(name = "FrontProtocol", required = true, nillable = true)
    protected DmReference frontProtocol;
    @XmlElement(name = "UseFrontProtocol", required = true, nillable = true)
    protected DmToggle useFrontProtocol;
    @XmlElement(name = "WSDLBindingProtocol", required = true, nillable = true)
    protected DmWSDLBindingProtocol wsdlBindingProtocol;
    @XmlElement(name = "FrontsidePortSuffix", required = true, nillable = true)
    protected String frontsidePortSuffix;

    /**
     * Gets the value of the servicePortMatchRegexp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicePortMatchRegexp() {
        return servicePortMatchRegexp;
    }

    /**
     * Sets the value of the servicePortMatchRegexp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicePortMatchRegexp(String value) {
        this.servicePortMatchRegexp = value;
    }

    /**
     * Gets the value of the localEndpointProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link DmWSProtocolType }
     *     
     */
    public DmWSProtocolType getLocalEndpointProtocol() {
        return localEndpointProtocol;
    }

    /**
     * Sets the value of the localEndpointProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmWSProtocolType }
     *     
     */
    public void setLocalEndpointProtocol(DmWSProtocolType value) {
        this.localEndpointProtocol = value;
    }

    /**
     * Gets the value of the localEndpointHostname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalEndpointHostname() {
        return localEndpointHostname;
    }

    /**
     * Sets the value of the localEndpointHostname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalEndpointHostname(String value) {
        this.localEndpointHostname = value;
    }

    /**
     * Gets the value of the localEndpointPort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLocalEndpointPort() {
        return localEndpointPort;
    }

    /**
     * Sets the value of the localEndpointPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocalEndpointPort(Integer value) {
        this.localEndpointPort = value;
    }

    /**
     * Gets the value of the localEndpointURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalEndpointURI() {
        return localEndpointURI;
    }

    /**
     * Sets the value of the localEndpointURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalEndpointURI(String value) {
        this.localEndpointURI = value;
    }

    /**
     * Gets the value of the frontProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getFrontProtocol() {
        return frontProtocol;
    }

    /**
     * Sets the value of the frontProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setFrontProtocol(DmReference value) {
        this.frontProtocol = value;
    }

    /**
     * Gets the value of the useFrontProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getUseFrontProtocol() {
        return useFrontProtocol;
    }

    /**
     * Sets the value of the useFrontProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setUseFrontProtocol(DmToggle value) {
        this.useFrontProtocol = value;
    }

    /**
     * Gets the value of the wsdlBindingProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link DmWSDLBindingProtocol }
     *     
     */
    public DmWSDLBindingProtocol getWSDLBindingProtocol() {
        return wsdlBindingProtocol;
    }

    /**
     * Sets the value of the wsdlBindingProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmWSDLBindingProtocol }
     *     
     */
    public void setWSDLBindingProtocol(DmWSDLBindingProtocol value) {
        this.wsdlBindingProtocol = value;
    }

    /**
     * Gets the value of the frontsidePortSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrontsidePortSuffix() {
        return frontsidePortSuffix;
    }

    /**
     * Sets the value of the frontsidePortSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrontsidePortSuffix(String value) {
        this.frontsidePortSuffix = value;
    }

}
