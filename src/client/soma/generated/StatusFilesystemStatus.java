
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusFilesystemStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusFilesystemStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FreeEncrypted" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="TotalEncrypted" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="FreeTemporary" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="TotalTemporary" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="FreeInternal" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="TotalInternal" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusFilesystemStatus", propOrder = {
    "freeEncrypted",
    "totalEncrypted",
    "freeTemporary",
    "totalTemporary",
    "freeInternal",
    "totalInternal"
})
public class StatusFilesystemStatus {

    @XmlElement(name = "FreeEncrypted")
    protected Long freeEncrypted;
    @XmlElement(name = "TotalEncrypted")
    protected Long totalEncrypted;
    @XmlElement(name = "FreeTemporary")
    protected Long freeTemporary;
    @XmlElement(name = "TotalTemporary")
    protected Long totalTemporary;
    @XmlElement(name = "FreeInternal")
    protected Long freeInternal;
    @XmlElement(name = "TotalInternal")
    protected Long totalInternal;

    /**
     * Gets the value of the freeEncrypted property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFreeEncrypted() {
        return freeEncrypted;
    }

    /**
     * Sets the value of the freeEncrypted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFreeEncrypted(Long value) {
        this.freeEncrypted = value;
    }

    /**
     * Gets the value of the totalEncrypted property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalEncrypted() {
        return totalEncrypted;
    }

    /**
     * Sets the value of the totalEncrypted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalEncrypted(Long value) {
        this.totalEncrypted = value;
    }

    /**
     * Gets the value of the freeTemporary property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFreeTemporary() {
        return freeTemporary;
    }

    /**
     * Sets the value of the freeTemporary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFreeTemporary(Long value) {
        this.freeTemporary = value;
    }

    /**
     * Gets the value of the totalTemporary property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalTemporary() {
        return totalTemporary;
    }

    /**
     * Sets the value of the totalTemporary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalTemporary(Long value) {
        this.totalTemporary = value;
    }

    /**
     * Gets the value of the freeInternal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFreeInternal() {
        return freeInternal;
    }

    /**
     * Sets the value of the freeInternal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFreeInternal(Long value) {
        this.freeInternal = value;
    }

    /**
     * Gets the value of the totalInternal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalInternal() {
        return totalInternal;
    }

    /**
     * Sets the value of the totalInternal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalInternal(Long value) {
        this.totalInternal = value;
    }

}
