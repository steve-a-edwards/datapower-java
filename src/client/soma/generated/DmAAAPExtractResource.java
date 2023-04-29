
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmAAAPExtractResource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmAAAPExtractResource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ERBitmap" type="{http://www.datapower.com/schemas/management}dmAAAPERBitmap"/>
 *         &lt;element name="ERXPath" type="{http://www.datapower.com/schemas/management}dmXPathExpr"/>
 *         &lt;element name="ERMetadata" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmAAAPExtractResource", propOrder = {
    "erBitmap",
    "erxPath",
    "erMetadata"
})
public class DmAAAPExtractResource {

    @XmlElement(name = "ERBitmap", required = true)
    protected DmAAAPERBitmap erBitmap;
    @XmlElement(name = "ERXPath", required = true, nillable = true)
    protected String erxPath;
    @XmlElement(name = "ERMetadata", required = true, nillable = true)
    protected DmReference erMetadata;

    /**
     * Gets the value of the erBitmap property.
     * 
     * @return
     *     possible object is
     *     {@link DmAAAPERBitmap }
     *     
     */
    public DmAAAPERBitmap getERBitmap() {
        return erBitmap;
    }

    /**
     * Sets the value of the erBitmap property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmAAAPERBitmap }
     *     
     */
    public void setERBitmap(DmAAAPERBitmap value) {
        this.erBitmap = value;
    }

    /**
     * Gets the value of the erxPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERXPath() {
        return erxPath;
    }

    /**
     * Sets the value of the erxPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERXPath(String value) {
        this.erxPath = value;
    }

    /**
     * Gets the value of the erMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getERMetadata() {
        return erMetadata;
    }

    /**
     * Sets the value of the erMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setERMetadata(DmReference value) {
        this.erMetadata = value;
    }

}
