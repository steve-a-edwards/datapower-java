
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusZosNSSstatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusZosNSSstatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ZosNSSClient" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="NumAuthenRequests" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="NumAuthorRequests" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusZosNSSstatus", propOrder = {
    "zosNSSClient",
    "numAuthenRequests",
    "numAuthorRequests"
})
public class StatusZosNSSstatus {

    @XmlElement(name = "ZosNSSClient")
    protected DmReference zosNSSClient;
    @XmlElement(name = "NumAuthenRequests")
    protected Long numAuthenRequests;
    @XmlElement(name = "NumAuthorRequests")
    protected Long numAuthorRequests;

    /**
     * Gets the value of the zosNSSClient property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getZosNSSClient() {
        return zosNSSClient;
    }

    /**
     * Sets the value of the zosNSSClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setZosNSSClient(DmReference value) {
        this.zosNSSClient = value;
    }

    /**
     * Gets the value of the numAuthenRequests property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumAuthenRequests() {
        return numAuthenRequests;
    }

    /**
     * Sets the value of the numAuthenRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumAuthenRequests(Long value) {
        this.numAuthenRequests = value;
    }

    /**
     * Gets the value of the numAuthorRequests property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumAuthorRequests() {
        return numAuthorRequests;
    }

    /**
     * Sets the value of the numAuthorRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumAuthorRequests(Long value) {
        this.numAuthorRequests = value;
    }

}
