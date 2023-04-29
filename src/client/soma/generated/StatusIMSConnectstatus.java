
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusIMSConnectstatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusIMSConnectstatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IMSConnect" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="Requests" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="Responses" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="RequestErrors" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="ResponseErrors" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusIMSConnectstatus", propOrder = {
    "imsConnect",
    "requests",
    "responses",
    "requestErrors",
    "responseErrors"
})
public class StatusIMSConnectstatus {

    @XmlElement(name = "IMSConnect")
    protected DmReference imsConnect;
    @XmlElement(name = "Requests")
    protected Long requests;
    @XmlElement(name = "Responses")
    protected Long responses;
    @XmlElement(name = "RequestErrors")
    protected Long requestErrors;
    @XmlElement(name = "ResponseErrors")
    protected Long responseErrors;

    /**
     * Gets the value of the imsConnect property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getIMSConnect() {
        return imsConnect;
    }

    /**
     * Sets the value of the imsConnect property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setIMSConnect(DmReference value) {
        this.imsConnect = value;
    }

    /**
     * Gets the value of the requests property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRequests() {
        return requests;
    }

    /**
     * Sets the value of the requests property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRequests(Long value) {
        this.requests = value;
    }

    /**
     * Gets the value of the responses property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getResponses() {
        return responses;
    }

    /**
     * Sets the value of the responses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setResponses(Long value) {
        this.responses = value;
    }

    /**
     * Gets the value of the requestErrors property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRequestErrors() {
        return requestErrors;
    }

    /**
     * Sets the value of the requestErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRequestErrors(Long value) {
        this.requestErrors = value;
    }

    /**
     * Gets the value of the responseErrors property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getResponseErrors() {
        return responseErrors;
    }

    /**
     * Sets the value of the responseErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setResponseErrors(Long value) {
        this.responseErrors = value;
    }

}
