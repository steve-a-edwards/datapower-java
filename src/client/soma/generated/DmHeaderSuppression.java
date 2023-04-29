
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmHeaderSuppression complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmHeaderSuppression">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Direction" type="{http://www.datapower.com/schemas/management}dmHTTPHeaderLocationType"/>
 *         &lt;element name="HeaderTag" type="{http://www.datapower.com/schemas/management}dmString"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmHeaderSuppression", propOrder = {
    "direction",
    "headerTag"
})
public class DmHeaderSuppression {

    @XmlElement(name = "Direction", required = true, nillable = true)
    protected DmHTTPHeaderLocationType direction;
    @XmlElement(name = "HeaderTag", required = true, nillable = true)
    protected String headerTag;

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link DmHTTPHeaderLocationType }
     *     
     */
    public DmHTTPHeaderLocationType getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmHTTPHeaderLocationType }
     *     
     */
    public void setDirection(DmHTTPHeaderLocationType value) {
        this.direction = value;
    }

    /**
     * Gets the value of the headerTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderTag() {
        return headerTag;
    }

    /**
     * Sets the value of the headerTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderTag(String value) {
        this.headerTag = value;
    }

}
