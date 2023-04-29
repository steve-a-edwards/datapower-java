
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusMQSourceProtocolHandlerSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusMQSourceProtocolHandlerSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MQSourceProtocolHandler" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="Quiesce" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusMQSourceProtocolHandlerSummary", propOrder = {
    "mqSourceProtocolHandler",
    "quiesce"
})
public class StatusMQSourceProtocolHandlerSummary {

    @XmlElement(name = "MQSourceProtocolHandler")
    protected DmReference mqSourceProtocolHandler;
    @XmlElement(name = "Quiesce")
    protected String quiesce;

    /**
     * Gets the value of the mqSourceProtocolHandler property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getMQSourceProtocolHandler() {
        return mqSourceProtocolHandler;
    }

    /**
     * Sets the value of the mqSourceProtocolHandler property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setMQSourceProtocolHandler(DmReference value) {
        this.mqSourceProtocolHandler = value;
    }

    /**
     * Gets the value of the quiesce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuiesce() {
        return quiesce;
    }

    /**
     * Sets the value of the quiesce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuiesce(String value) {
        this.quiesce = value;
    }

}
