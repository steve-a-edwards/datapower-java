
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionFetchFile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionFetchFile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="URL" type="{http://www.datapower.com/schemas/management}dmURL"/>
 *         &lt;element name="File" type="{http://www.datapower.com/schemas/management}dmFSFile"/>
 *         &lt;element name="Overwrite" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="XMLManager" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionFetchFile", propOrder = {
    "url",
    "file",
    "overwrite",
    "xmlManager"
})
public class ActionFetchFile {

    @XmlElement(name = "URL", required = true)
    protected String url;
    @XmlElement(name = "File", required = true)
    protected String file;
    @XmlElement(name = "Overwrite")
    protected DmToggle overwrite;
    @XmlElement(name = "XMLManager")
    protected DmReference xmlManager;

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the file property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFile() {
        return file;
    }

    /**
     * Sets the value of the file property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFile(String value) {
        this.file = value;
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

    /**
     * Gets the value of the xmlManager property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getXMLManager() {
        return xmlManager;
    }

    /**
     * Sets the value of the xmlManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setXMLManager(DmReference value) {
        this.xmlManager = value;
    }

}
