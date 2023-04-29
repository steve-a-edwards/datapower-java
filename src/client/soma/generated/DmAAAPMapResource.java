
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmAAAPMapResource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmAAAPMapResource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MRMethod" type="{http://www.datapower.com/schemas/management}dmAAAPMapResourceType"/>
 *         &lt;element name="MRCustomURL" type="{http://www.datapower.com/schemas/management}dmURL"/>
 *         &lt;element name="MRMapURL" type="{http://www.datapower.com/schemas/management}dmURL"/>
 *         &lt;element name="MRMapXPath" type="{http://www.datapower.com/schemas/management}dmXPathExpr"/>
 *         &lt;element name="MRTAMMap" type="{http://www.datapower.com/schemas/management}dmTAMObjectSpacePrefix"/>
 *         &lt;element name="MRTAMInstancePrefix" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="MRTAMWebSEALDynURLFile" type="{http://www.datapower.com/schemas/management}dmFSFile"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmAAAPMapResource", propOrder = {
    "mrMethod",
    "mrCustomURL",
    "mrMapURL",
    "mrMapXPath",
    "mrtamMap",
    "mrtamInstancePrefix",
    "mrtamWebSEALDynURLFile"
})
public class DmAAAPMapResource {

    @XmlElement(name = "MRMethod", required = true)
    protected DmAAAPMapResourceType mrMethod;
    @XmlElement(name = "MRCustomURL", required = true, nillable = true)
    protected String mrCustomURL;
    @XmlElement(name = "MRMapURL", required = true, nillable = true)
    protected String mrMapURL;
    @XmlElement(name = "MRMapXPath", required = true, nillable = true)
    protected String mrMapXPath;
    @XmlElement(name = "MRTAMMap", required = true, nillable = true)
    protected DmTAMObjectSpacePrefix mrtamMap;
    @XmlElement(name = "MRTAMInstancePrefix", required = true, nillable = true)
    protected String mrtamInstancePrefix;
    @XmlElement(name = "MRTAMWebSEALDynURLFile", required = true, nillable = true)
    protected String mrtamWebSEALDynURLFile;

    /**
     * Gets the value of the mrMethod property.
     * 
     * @return
     *     possible object is
     *     {@link DmAAAPMapResourceType }
     *     
     */
    public DmAAAPMapResourceType getMRMethod() {
        return mrMethod;
    }

    /**
     * Sets the value of the mrMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmAAAPMapResourceType }
     *     
     */
    public void setMRMethod(DmAAAPMapResourceType value) {
        this.mrMethod = value;
    }

    /**
     * Gets the value of the mrCustomURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMRCustomURL() {
        return mrCustomURL;
    }

    /**
     * Sets the value of the mrCustomURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMRCustomURL(String value) {
        this.mrCustomURL = value;
    }

    /**
     * Gets the value of the mrMapURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMRMapURL() {
        return mrMapURL;
    }

    /**
     * Sets the value of the mrMapURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMRMapURL(String value) {
        this.mrMapURL = value;
    }

    /**
     * Gets the value of the mrMapXPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMRMapXPath() {
        return mrMapXPath;
    }

    /**
     * Sets the value of the mrMapXPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMRMapXPath(String value) {
        this.mrMapXPath = value;
    }

    /**
     * Gets the value of the mrtamMap property.
     * 
     * @return
     *     possible object is
     *     {@link DmTAMObjectSpacePrefix }
     *     
     */
    public DmTAMObjectSpacePrefix getMRTAMMap() {
        return mrtamMap;
    }

    /**
     * Sets the value of the mrtamMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmTAMObjectSpacePrefix }
     *     
     */
    public void setMRTAMMap(DmTAMObjectSpacePrefix value) {
        this.mrtamMap = value;
    }

    /**
     * Gets the value of the mrtamInstancePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMRTAMInstancePrefix() {
        return mrtamInstancePrefix;
    }

    /**
     * Sets the value of the mrtamInstancePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMRTAMInstancePrefix(String value) {
        this.mrtamInstancePrefix = value;
    }

    /**
     * Gets the value of the mrtamWebSEALDynURLFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMRTAMWebSEALDynURLFile() {
        return mrtamWebSEALDynURLFile;
    }

    /**
     * Sets the value of the mrtamWebSEALDynURLFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMRTAMWebSEALDynURLFile(String value) {
        this.mrtamWebSEALDynURLFile = value;
    }

}
