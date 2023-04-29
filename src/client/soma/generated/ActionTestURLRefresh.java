
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionTestURLRefresh complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionTestURLRefresh">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="URLRefreshPolicy" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="URL" type="{http://www.datapower.com/schemas/management}dmURL"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionTestURLRefresh", propOrder = {
    "urlRefreshPolicy",
    "url"
})
public class ActionTestURLRefresh {

    @XmlElement(name = "URLRefreshPolicy", required = true)
    protected DmReference urlRefreshPolicy;
    @XmlElement(name = "URL", required = true)
    protected String url;

    /**
     * Gets the value of the urlRefreshPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getURLRefreshPolicy() {
        return urlRefreshPolicy;
    }

    /**
     * Sets the value of the urlRefreshPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setURLRefreshPolicy(DmReference value) {
        this.urlRefreshPolicy = value;
    }

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

}
