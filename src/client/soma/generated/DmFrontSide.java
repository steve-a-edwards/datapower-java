
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmFrontSide complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmFrontSide">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocalAddress" type="{http://www.datapower.com/schemas/management}dmLocalIPHostAddress"/>
 *         &lt;element name="LocalPort" type="{http://www.datapower.com/schemas/management}dmIPPort"/>
 *         &lt;element name="UseSSL" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmFrontSide", propOrder = {
    "localAddress",
    "localPort",
    "useSSL"
})
public class DmFrontSide {

    @XmlElement(name = "LocalAddress", required = true)
    protected String localAddress;
    @XmlElement(name = "LocalPort")
    protected int localPort;
    @XmlElement(name = "UseSSL", required = true, nillable = true)
    protected DmToggle useSSL;

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
     */
    public int getLocalPort() {
        return localPort;
    }

    /**
     * Sets the value of the localPort property.
     * 
     */
    public void setLocalPort(int value) {
        this.localPort = value;
    }

    /**
     * Gets the value of the useSSL property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getUseSSL() {
        return useSSL;
    }

    /**
     * Sets the value of the useSSL property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setUseSSL(DmToggle value) {
        this.useSSL = value;
    }

}
