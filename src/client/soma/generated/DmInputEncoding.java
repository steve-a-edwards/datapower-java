
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmInputEncoding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmInputEncoding">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InputMatch" type="{http://www.datapower.com/schemas/management}dmPCRE"/>
 *         &lt;element name="Encoding" type="{http://www.datapower.com/schemas/management}dmHTTPInputEncoding"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmInputEncoding", propOrder = {
    "inputMatch",
    "encoding"
})
public class DmInputEncoding {

    @XmlElement(name = "InputMatch", required = true, nillable = true)
    protected String inputMatch;
    @XmlElement(name = "Encoding", required = true, nillable = true)
    protected DmHTTPInputEncoding encoding;

    /**
     * Gets the value of the inputMatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputMatch() {
        return inputMatch;
    }

    /**
     * Sets the value of the inputMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputMatch(String value) {
        this.inputMatch = value;
    }

    /**
     * Gets the value of the encoding property.
     * 
     * @return
     *     possible object is
     *     {@link DmHTTPInputEncoding }
     *     
     */
    public DmHTTPInputEncoding getEncoding() {
        return encoding;
    }

    /**
     * Sets the value of the encoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmHTTPInputEncoding }
     *     
     */
    public void setEncoding(DmHTTPInputEncoding value) {
        this.encoding = value;
    }

}
