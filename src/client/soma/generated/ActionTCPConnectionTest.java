
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionTCPConnectionTest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionTCPConnectionTest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RemoteHost" type="{http://www.datapower.com/schemas/management}dmHostname"/>
 *         &lt;element name="RemotePort" type="{http://www.datapower.com/schemas/management}dmIPPort"/>
 *         &lt;element name="useIPv" type="{http://www.datapower.com/schemas/management}dmIPVersion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionTCPConnectionTest", propOrder = {
    "remoteHost",
    "remotePort",
    "useIPv"
})
public class ActionTCPConnectionTest {

    @XmlElement(name = "RemoteHost", required = true)
    protected String remoteHost;
    @XmlElement(name = "RemotePort")
    protected int remotePort;
    protected String useIPv;

    /**
     * Gets the value of the remoteHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteHost() {
        return remoteHost;
    }

    /**
     * Sets the value of the remoteHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteHost(String value) {
        this.remoteHost = value;
    }

    /**
     * Gets the value of the remotePort property.
     * 
     */
    public int getRemotePort() {
        return remotePort;
    }

    /**
     * Sets the value of the remotePort property.
     * 
     */
    public void setRemotePort(int value) {
        this.remotePort = value;
    }

    /**
     * Gets the value of the useIPv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseIPv() {
        return useIPv;
    }

    /**
     * Sets the value of the useIPv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseIPv(String value) {
        this.useIPv = value;
    }

}
