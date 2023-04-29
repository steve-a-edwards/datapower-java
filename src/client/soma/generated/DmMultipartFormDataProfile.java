
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmMultipartFormDataProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmMultipartFormDataProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaxParts" type="{http://www.datapower.com/schemas/management}dmUInt32"/>
 *         &lt;element name="MaxSizePerPart" type="{http://www.datapower.com/schemas/management}dmUInt32"/>
 *         &lt;element name="MaxSize" type="{http://www.datapower.com/schemas/management}dmUInt32"/>
 *         &lt;element name="ContentTypeRestricted" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmMultipartFormDataProfile", propOrder = {
    "maxParts",
    "maxSizePerPart",
    "maxSize",
    "contentTypeRestricted"
})
public class DmMultipartFormDataProfile {

    @XmlElement(name = "MaxParts", required = true, type = Long.class, nillable = true)
    protected Long maxParts;
    @XmlElement(name = "MaxSizePerPart", required = true, type = Long.class, nillable = true)
    protected Long maxSizePerPart;
    @XmlElement(name = "MaxSize", required = true, type = Long.class, nillable = true)
    protected Long maxSize;
    @XmlElement(name = "ContentTypeRestricted", required = true, nillable = true)
    protected DmToggle contentTypeRestricted;

    /**
     * Gets the value of the maxParts property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxParts() {
        return maxParts;
    }

    /**
     * Sets the value of the maxParts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxParts(Long value) {
        this.maxParts = value;
    }

    /**
     * Gets the value of the maxSizePerPart property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxSizePerPart() {
        return maxSizePerPart;
    }

    /**
     * Sets the value of the maxSizePerPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxSizePerPart(Long value) {
        this.maxSizePerPart = value;
    }

    /**
     * Gets the value of the maxSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxSize() {
        return maxSize;
    }

    /**
     * Sets the value of the maxSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxSize(Long value) {
        this.maxSize = value;
    }

    /**
     * Gets the value of the contentTypeRestricted property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getContentTypeRestricted() {
        return contentTypeRestricted;
    }

    /**
     * Sets the value of the contentTypeRestricted property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setContentTypeRestricted(DmToggle value) {
        this.contentTypeRestricted = value;
    }

}
