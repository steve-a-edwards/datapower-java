
package client.soma.generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusSQLRuntimeStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusSQLRuntimeStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Instance" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="ProfileName" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="MaxMemory" type="{http://www.datapower.com/schemas/management}dmUInt64" minOccurs="0"/>
 *         &lt;element name="FreeMemory" type="{http://www.datapower.com/schemas/management}dmUInt64" minOccurs="0"/>
 *         &lt;element name="TotalMemory" type="{http://www.datapower.com/schemas/management}dmUInt64" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusSQLRuntimeStatus", propOrder = {
    "instance",
    "profileName",
    "maxMemory",
    "freeMemory",
    "totalMemory"
})
public class StatusSQLRuntimeStatus {

    @XmlElement(name = "Instance")
    protected Long instance;
    @XmlElement(name = "ProfileName")
    protected String profileName;
    @XmlElement(name = "MaxMemory")
    protected BigInteger maxMemory;
    @XmlElement(name = "FreeMemory")
    protected BigInteger freeMemory;
    @XmlElement(name = "TotalMemory")
    protected BigInteger totalMemory;

    /**
     * Gets the value of the instance property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInstance() {
        return instance;
    }

    /**
     * Sets the value of the instance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInstance(Long value) {
        this.instance = value;
    }

    /**
     * Gets the value of the profileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileName() {
        return profileName;
    }

    /**
     * Sets the value of the profileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileName(String value) {
        this.profileName = value;
    }

    /**
     * Gets the value of the maxMemory property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxMemory() {
        return maxMemory;
    }

    /**
     * Sets the value of the maxMemory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxMemory(BigInteger value) {
        this.maxMemory = value;
    }

    /**
     * Gets the value of the freeMemory property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFreeMemory() {
        return freeMemory;
    }

    /**
     * Sets the value of the freeMemory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFreeMemory(BigInteger value) {
        this.freeMemory = value;
    }

    /**
     * Gets the value of the totalMemory property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalMemory() {
        return totalMemory;
    }

    /**
     * Sets the value of the totalMemory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalMemory(BigInteger value) {
        this.totalMemory = value;
    }

}
