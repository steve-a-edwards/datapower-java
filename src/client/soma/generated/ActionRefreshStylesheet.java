
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionRefreshStylesheet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionRefreshStylesheet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XMLManager" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="Stylesheet" type="{http://www.datapower.com/schemas/management}dmURL"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionRefreshStylesheet", propOrder = {
    "xmlManager",
    "stylesheet"
})
public class ActionRefreshStylesheet {

    @XmlElement(name = "XMLManager", required = true)
    protected DmReference xmlManager;
    @XmlElement(name = "Stylesheet", required = true)
    protected String stylesheet;

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

    /**
     * Gets the value of the stylesheet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStylesheet() {
        return stylesheet;
    }

    /**
     * Sets the value of the stylesheet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStylesheet(String value) {
        this.stylesheet = value;
    }

}
