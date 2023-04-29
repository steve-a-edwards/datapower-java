
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusZHybridTCSstatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusZHybridTCSstatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SDIP" type="{http://www.datapower.com/schemas/management}dmIPHostAddress" minOccurs="0"/>
 *         &lt;element name="SDPort" type="{http://www.datapower.com/schemas/management}dmIPPort" minOccurs="0"/>
 *         &lt;element name="DVIPA" type="{http://www.datapower.com/schemas/management}dmIPHostAddress" minOccurs="0"/>
 *         &lt;element name="DPort" type="{http://www.datapower.com/schemas/management}dmIPPort" minOccurs="0"/>
 *         &lt;element name="Ready" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="CurrConns" type="{http://www.datapower.com/schemas/management}dmInt32" minOccurs="0"/>
 *         &lt;element name="TotConns" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusZHybridTCSstatus", propOrder = {
    "sdip",
    "sdPort",
    "dvipa",
    "dPort",
    "ready",
    "currConns",
    "totConns"
})
public class StatusZHybridTCSstatus {

    @XmlElement(name = "SDIP")
    protected String sdip;
    @XmlElement(name = "SDPort")
    protected Integer sdPort;
    @XmlElement(name = "DVIPA")
    protected String dvipa;
    @XmlElement(name = "DPort")
    protected Integer dPort;
    @XmlElement(name = "Ready")
    protected String ready;
    @XmlElement(name = "CurrConns")
    protected Integer currConns;
    @XmlElement(name = "TotConns")
    protected Long totConns;

    /**
     * Gets the value of the sdip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDIP() {
        return sdip;
    }

    /**
     * Sets the value of the sdip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDIP(String value) {
        this.sdip = value;
    }

    /**
     * Gets the value of the sdPort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSDPort() {
        return sdPort;
    }

    /**
     * Sets the value of the sdPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSDPort(Integer value) {
        this.sdPort = value;
    }

    /**
     * Gets the value of the dvipa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDVIPA() {
        return dvipa;
    }

    /**
     * Sets the value of the dvipa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDVIPA(String value) {
        this.dvipa = value;
    }

    /**
     * Gets the value of the dPort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDPort() {
        return dPort;
    }

    /**
     * Sets the value of the dPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDPort(Integer value) {
        this.dPort = value;
    }

    /**
     * Gets the value of the ready property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReady() {
        return ready;
    }

    /**
     * Sets the value of the ready property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReady(String value) {
        this.ready = value;
    }

    /**
     * Gets the value of the currConns property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrConns() {
        return currConns;
    }

    /**
     * Sets the value of the currConns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrConns(Integer value) {
        this.currConns = value;
    }

    /**
     * Gets the value of the totConns property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotConns() {
        return totConns;
    }

    /**
     * Sets the value of the totConns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotConns(Long value) {
        this.totConns = value;
    }

}
