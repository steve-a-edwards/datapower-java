
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSourceHTTPFeatureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmSourceHTTPFeatureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="HTTP-1.0" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="HTTP-1.1" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="POST" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="GET" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="PUT" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="HEAD" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="OPTIONS" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="TRACE" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="DELETE" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="CONNECT" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="QueryString" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="FragmentIdentifiers" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="DotDot" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="CmdExe" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmSourceHTTPFeatureType", propOrder = {

})
public class DmSourceHTTPFeatureType {

    @XmlElement(name = "HTTP-1.0")
    protected DmToggle http10;
    @XmlElement(name = "HTTP-1.1")
    protected DmToggle http11;
    @XmlElement(name = "POST")
    protected DmToggle post;
    @XmlElement(name = "GET")
    protected DmToggle get;
    @XmlElement(name = "PUT")
    protected DmToggle put;
    @XmlElement(name = "HEAD")
    protected DmToggle head;
    @XmlElement(name = "OPTIONS")
    protected DmToggle options;
    @XmlElement(name = "TRACE")
    protected DmToggle trace;
    @XmlElement(name = "DELETE")
    protected DmToggle delete;
    @XmlElement(name = "CONNECT")
    protected DmToggle connect;
    @XmlElement(name = "QueryString")
    protected DmToggle queryString;
    @XmlElement(name = "FragmentIdentifiers")
    protected DmToggle fragmentIdentifiers;
    @XmlElement(name = "DotDot")
    protected DmToggle dotDot;
    @XmlElement(name = "CmdExe")
    protected DmToggle cmdExe;

    /**
     * Gets the value of the http10 property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getHTTP10() {
        return http10;
    }

    /**
     * Sets the value of the http10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setHTTP10(DmToggle value) {
        this.http10 = value;
    }

    /**
     * Gets the value of the http11 property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getHTTP11() {
        return http11;
    }

    /**
     * Sets the value of the http11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setHTTP11(DmToggle value) {
        this.http11 = value;
    }

    /**
     * Gets the value of the post property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getPOST() {
        return post;
    }

    /**
     * Sets the value of the post property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setPOST(DmToggle value) {
        this.post = value;
    }

    /**
     * Gets the value of the get property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getGET() {
        return get;
    }

    /**
     * Sets the value of the get property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setGET(DmToggle value) {
        this.get = value;
    }

    /**
     * Gets the value of the put property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getPUT() {
        return put;
    }

    /**
     * Sets the value of the put property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setPUT(DmToggle value) {
        this.put = value;
    }

    /**
     * Gets the value of the head property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getHEAD() {
        return head;
    }

    /**
     * Sets the value of the head property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setHEAD(DmToggle value) {
        this.head = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getOPTIONS() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setOPTIONS(DmToggle value) {
        this.options = value;
    }

    /**
     * Gets the value of the trace property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getTRACE() {
        return trace;
    }

    /**
     * Sets the value of the trace property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setTRACE(DmToggle value) {
        this.trace = value;
    }

    /**
     * Gets the value of the delete property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getDELETE() {
        return delete;
    }

    /**
     * Sets the value of the delete property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setDELETE(DmToggle value) {
        this.delete = value;
    }

    /**
     * Gets the value of the connect property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getCONNECT() {
        return connect;
    }

    /**
     * Sets the value of the connect property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setCONNECT(DmToggle value) {
        this.connect = value;
    }

    /**
     * Gets the value of the queryString property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getQueryString() {
        return queryString;
    }

    /**
     * Sets the value of the queryString property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setQueryString(DmToggle value) {
        this.queryString = value;
    }

    /**
     * Gets the value of the fragmentIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getFragmentIdentifiers() {
        return fragmentIdentifiers;
    }

    /**
     * Sets the value of the fragmentIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setFragmentIdentifiers(DmToggle value) {
        this.fragmentIdentifiers = value;
    }

    /**
     * Gets the value of the dotDot property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getDotDot() {
        return dotDot;
    }

    /**
     * Sets the value of the dotDot property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setDotDot(DmToggle value) {
        this.dotDot = value;
    }

    /**
     * Gets the value of the cmdExe property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getCmdExe() {
        return cmdExe;
    }

    /**
     * Sets the value of the cmdExe property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setCmdExe(DmToggle value) {
        this.cmdExe = value;
    }

}
