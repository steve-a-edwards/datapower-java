
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusRoutingStatus2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusRoutingStatus2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Destination" type="{http://www.datapower.com/schemas/management}dmIPNetAddress" minOccurs="0"/>
 *         &lt;element name="InterfaceType" type="{http://www.datapower.com/schemas/management}dmInterfaceType" minOccurs="0"/>
 *         &lt;element name="MacInterface" type="{http://www.datapower.com/schemas/management}dmPortName" minOccurs="0"/>
 *         &lt;element name="VlanName" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Gateway" type="{http://www.datapower.com/schemas/management}dmIPHostAddress" minOccurs="0"/>
 *         &lt;element name="Metric" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="RouteType" type="{http://www.datapower.com/schemas/management}dmRouteType" minOccurs="0"/>
 *         &lt;element name="RouteProto" type="{http://www.datapower.com/schemas/management}dmRouteProto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusRoutingStatus2", propOrder = {
    "destination",
    "interfaceType",
    "macInterface",
    "vlanName",
    "gateway",
    "metric",
    "routeType",
    "routeProto"
})
public class StatusRoutingStatus2 {

    @XmlElement(name = "Destination")
    protected String destination;
    @XmlElement(name = "InterfaceType")
    protected DmInterfaceType interfaceType;
    @XmlElement(name = "MacInterface")
    protected DmPortName macInterface;
    @XmlElement(name = "VlanName")
    protected String vlanName;
    @XmlElement(name = "Gateway")
    protected String gateway;
    @XmlElement(name = "Metric")
    protected Long metric;
    @XmlElement(name = "RouteType")
    protected DmRouteType routeType;
    @XmlElement(name = "RouteProto")
    protected DmRouteProto routeProto;

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
     * Gets the value of the interfaceType property.
     * 
     * @return
     *     possible object is
     *     {@link DmInterfaceType }
     *     
     */
    public DmInterfaceType getInterfaceType() {
        return interfaceType;
    }

    /**
     * Sets the value of the interfaceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmInterfaceType }
     *     
     */
    public void setInterfaceType(DmInterfaceType value) {
        this.interfaceType = value;
    }

    /**
     * Gets the value of the macInterface property.
     * 
     * @return
     *     possible object is
     *     {@link DmPortName }
     *     
     */
    public DmPortName getMacInterface() {
        return macInterface;
    }

    /**
     * Sets the value of the macInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmPortName }
     *     
     */
    public void setMacInterface(DmPortName value) {
        this.macInterface = value;
    }

    /**
     * Gets the value of the vlanName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVlanName() {
        return vlanName;
    }

    /**
     * Sets the value of the vlanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVlanName(String value) {
        this.vlanName = value;
    }

    /**
     * Gets the value of the gateway property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGateway() {
        return gateway;
    }

    /**
     * Sets the value of the gateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGateway(String value) {
        this.gateway = value;
    }

    /**
     * Gets the value of the metric property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMetric() {
        return metric;
    }

    /**
     * Sets the value of the metric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMetric(Long value) {
        this.metric = value;
    }

    /**
     * Gets the value of the routeType property.
     * 
     * @return
     *     possible object is
     *     {@link DmRouteType }
     *     
     */
    public DmRouteType getRouteType() {
        return routeType;
    }

    /**
     * Sets the value of the routeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmRouteType }
     *     
     */
    public void setRouteType(DmRouteType value) {
        this.routeType = value;
    }

    /**
     * Gets the value of the routeProto property.
     * 
     * @return
     *     possible object is
     *     {@link DmRouteProto }
     *     
     */
    public DmRouteProto getRouteProto() {
        return routeProto;
    }

    /**
     * Sets the value of the routeProto property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmRouteProto }
     *     
     */
    public void setRouteProto(DmRouteProto value) {
        this.routeProto = value;
    }

}
