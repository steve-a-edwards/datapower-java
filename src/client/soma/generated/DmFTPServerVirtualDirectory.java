
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmFTPServerVirtualDirectory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmFTPServerVirtualDirectory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VirtualPath" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="ResponseDirectory" type="{http://www.datapower.com/schemas/management}dmString"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmFTPServerVirtualDirectory", propOrder = {
    "virtualPath",
    "responseDirectory"
})
public class DmFTPServerVirtualDirectory {

    @XmlElement(name = "VirtualPath", required = true, nillable = true)
    protected String virtualPath;
    @XmlElement(name = "ResponseDirectory", required = true, nillable = true)
    protected String responseDirectory;

    /**
     * Gets the value of the virtualPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVirtualPath() {
        return virtualPath;
    }

    /**
     * Sets the value of the virtualPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirtualPath(String value) {
        this.virtualPath = value;
    }

    /**
     * Gets the value of the responseDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseDirectory() {
        return responseDirectory;
    }

    /**
     * Sets the value of the responseDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseDirectory(String value) {
        this.responseDirectory = value;
    }

}
