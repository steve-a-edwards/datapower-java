
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmMQclient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmMQclient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClientGetQueue" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="ClientPutQueue" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="ClientPort" type="{http://www.datapower.com/schemas/management}dmIPPort"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmMQclient", propOrder = {
    "clientGetQueue",
    "clientPutQueue",
    "clientPort"
})
public class DmMQclient {

    @XmlElement(name = "ClientGetQueue", required = true, nillable = true)
    protected String clientGetQueue;
    @XmlElement(name = "ClientPutQueue", required = true, nillable = true)
    protected String clientPutQueue;
    @XmlElement(name = "ClientPort", required = true, type = Integer.class, nillable = true)
    protected Integer clientPort;

    /**
     * Gets the value of the clientGetQueue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientGetQueue() {
        return clientGetQueue;
    }

    /**
     * Sets the value of the clientGetQueue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientGetQueue(String value) {
        this.clientGetQueue = value;
    }

    /**
     * Gets the value of the clientPutQueue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientPutQueue() {
        return clientPutQueue;
    }

    /**
     * Sets the value of the clientPutQueue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientPutQueue(String value) {
        this.clientPutQueue = value;
    }

    /**
     * Gets the value of the clientPort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClientPort() {
        return clientPort;
    }

    /**
     * Sets the value of the clientPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClientPort(Integer value) {
        this.clientPort = value;
    }

}
