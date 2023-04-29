
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionMoveFile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionMoveFile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sURL" type="{http://www.datapower.com/schemas/management}dmURL"/>
 *         &lt;element name="dURL" type="{http://www.datapower.com/schemas/management}dmURL"/>
 *         &lt;element name="Overwrite" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionMoveFile", propOrder = {
    "surl",
    "durl",
    "overwrite"
})
public class ActionMoveFile {

    @XmlElement(name = "sURL", required = true)
    protected String surl;
    @XmlElement(name = "dURL", required = true)
    protected String durl;
    @XmlElement(name = "Overwrite")
    protected DmToggle overwrite;

    /**
     * Gets the value of the surl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSURL() {
        return surl;
    }

    /**
     * Sets the value of the surl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSURL(String value) {
        this.surl = value;
    }

    /**
     * Gets the value of the durl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDURL() {
        return durl;
    }

    /**
     * Sets the value of the durl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDURL(String value) {
        this.durl = value;
    }

    /**
     * Gets the value of the overwrite property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getOverwrite() {
        return overwrite;
    }

    /**
     * Sets the value of the overwrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setOverwrite(DmToggle value) {
        this.overwrite = value;
    }

}
