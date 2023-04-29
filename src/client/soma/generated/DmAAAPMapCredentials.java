
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmAAAPMapCredentials complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmAAAPMapCredentials">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MCMethod" type="{http://www.datapower.com/schemas/management}dmAAAPMapCredentialType"/>
 *         &lt;element name="MCCustomURL" type="{http://www.datapower.com/schemas/management}dmURL"/>
 *         &lt;element name="MCMapURL" type="{http://www.datapower.com/schemas/management}dmURL"/>
 *         &lt;element name="MCMapXPath" type="{http://www.datapower.com/schemas/management}dmXPathExpr"/>
 *         &lt;element name="MCTFIMEndpoint" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmAAAPMapCredentials", propOrder = {
    "mcMethod",
    "mcCustomURL",
    "mcMapURL",
    "mcMapXPath",
    "mctfimEndpoint"
})
public class DmAAAPMapCredentials {

    @XmlElement(name = "MCMethod", required = true)
    protected DmAAAPMapCredentialType mcMethod;
    @XmlElement(name = "MCCustomURL", required = true, nillable = true)
    protected String mcCustomURL;
    @XmlElement(name = "MCMapURL", required = true, nillable = true)
    protected String mcMapURL;
    @XmlElement(name = "MCMapXPath", required = true, nillable = true)
    protected String mcMapXPath;
    @XmlElement(name = "MCTFIMEndpoint", required = true, nillable = true)
    protected DmReference mctfimEndpoint;

    /**
     * Gets the value of the mcMethod property.
     * 
     * @return
     *     possible object is
     *     {@link DmAAAPMapCredentialType }
     *     
     */
    public DmAAAPMapCredentialType getMCMethod() {
        return mcMethod;
    }

    /**
     * Sets the value of the mcMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmAAAPMapCredentialType }
     *     
     */
    public void setMCMethod(DmAAAPMapCredentialType value) {
        this.mcMethod = value;
    }

    /**
     * Gets the value of the mcCustomURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCCustomURL() {
        return mcCustomURL;
    }

    /**
     * Sets the value of the mcCustomURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCCustomURL(String value) {
        this.mcCustomURL = value;
    }

    /**
     * Gets the value of the mcMapURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCMapURL() {
        return mcMapURL;
    }

    /**
     * Sets the value of the mcMapURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCMapURL(String value) {
        this.mcMapURL = value;
    }

    /**
     * Gets the value of the mcMapXPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCMapXPath() {
        return mcMapXPath;
    }

    /**
     * Sets the value of the mcMapXPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCMapXPath(String value) {
        this.mcMapXPath = value;
    }

    /**
     * Gets the value of the mctfimEndpoint property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getMCTFIMEndpoint() {
        return mctfimEndpoint;
    }

    /**
     * Sets the value of the mctfimEndpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setMCTFIMEndpoint(DmReference value) {
        this.mctfimEndpoint = value;
    }

}
