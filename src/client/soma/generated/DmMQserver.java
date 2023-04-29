
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmMQserver complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmMQserver">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServerGetQueue" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="ServerPutQueue" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="ServerPort" type="{http://www.datapower.com/schemas/management}dmIPPort"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmMQserver", propOrder = {
    "serverGetQueue",
    "serverPutQueue",
    "serverPort"
})
public class DmMQserver {

    @XmlElement(name = "ServerGetQueue", required = true, nillable = true)
    protected String serverGetQueue;
    @XmlElement(name = "ServerPutQueue", required = true, nillable = true)
    protected String serverPutQueue;
    @XmlElement(name = "ServerPort", required = true, type = Integer.class, nillable = true)
    protected Integer serverPort;

    /**
     * Gets the value of the serverGetQueue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerGetQueue() {
        return serverGetQueue;
    }

    /**
     * Sets the value of the serverGetQueue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerGetQueue(String value) {
        this.serverGetQueue = value;
    }

    /**
     * Gets the value of the serverPutQueue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerPutQueue() {
        return serverPutQueue;
    }

    /**
     * Sets the value of the serverPutQueue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerPutQueue(String value) {
        this.serverPutQueue = value;
    }

    /**
     * Gets the value of the serverPort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServerPort() {
        return serverPort;
    }

    /**
     * Sets the value of the serverPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServerPort(Integer value) {
        this.serverPort = value;
    }

}
