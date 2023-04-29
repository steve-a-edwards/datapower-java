
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmHeaderRetentionPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmHeaderRetentionPolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegExp" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="HeaderRetention" type="{http://www.datapower.com/schemas/management}dmHeaderRetentionBitmap"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmHeaderRetentionPolicy", propOrder = {
    "regExp",
    "headerRetention"
})
public class DmHeaderRetentionPolicy {

    @XmlElement(name = "RegExp", required = true)
    protected String regExp;
    @XmlElement(name = "HeaderRetention", required = true, nillable = true)
    protected DmHeaderRetentionBitmap headerRetention;

    /**
     * Gets the value of the regExp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegExp() {
        return regExp;
    }

    /**
     * Sets the value of the regExp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegExp(String value) {
        this.regExp = value;
    }

    /**
     * Gets the value of the headerRetention property.
     * 
     * @return
     *     possible object is
     *     {@link DmHeaderRetentionBitmap }
     *     
     */
    public DmHeaderRetentionBitmap getHeaderRetention() {
        return headerRetention;
    }

    /**
     * Sets the value of the headerRetention property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmHeaderRetentionBitmap }
     *     
     */
    public void setHeaderRetention(DmHeaderRetentionBitmap value) {
        this.headerRetention = value;
    }

}
