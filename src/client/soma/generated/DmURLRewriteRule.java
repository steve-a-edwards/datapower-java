
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmURLRewriteRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmURLRewriteRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.datapower.com/schemas/management}dmURLRewriteType"/>
 *         &lt;element name="MatchRegexp" type="{http://www.datapower.com/schemas/management}dmPCRE"/>
 *         &lt;element name="InputReplaceRegexp" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="StyleReplaceRegexp" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="InputUnescape" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="StylesheetUnescape" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="Header" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="NormalizeURL" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmURLRewriteRule", propOrder = {
    "type",
    "matchRegexp",
    "inputReplaceRegexp",
    "styleReplaceRegexp",
    "inputUnescape",
    "stylesheetUnescape",
    "header",
    "normalizeURL"
})
public class DmURLRewriteRule {

    @XmlElement(name = "Type", required = true)
    protected DmURLRewriteType type;
    @XmlElement(name = "MatchRegexp", required = true)
    protected String matchRegexp;
    @XmlElement(name = "InputReplaceRegexp", required = true, nillable = true)
    protected String inputReplaceRegexp;
    @XmlElement(name = "StyleReplaceRegexp", required = true, nillable = true)
    protected String styleReplaceRegexp;
    @XmlElement(name = "InputUnescape", required = true, nillable = true)
    protected DmToggle inputUnescape;
    @XmlElement(name = "StylesheetUnescape", required = true, nillable = true)
    protected DmToggle stylesheetUnescape;
    @XmlElement(name = "Header", required = true, nillable = true)
    protected String header;
    @XmlElement(name = "NormalizeURL", required = true, nillable = true)
    protected DmToggle normalizeURL;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link DmURLRewriteType }
     *     
     */
    public DmURLRewriteType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmURLRewriteType }
     *     
     */
    public void setType(DmURLRewriteType value) {
        this.type = value;
    }

    /**
     * Gets the value of the matchRegexp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchRegexp() {
        return matchRegexp;
    }

    /**
     * Sets the value of the matchRegexp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchRegexp(String value) {
        this.matchRegexp = value;
    }

    /**
     * Gets the value of the inputReplaceRegexp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputReplaceRegexp() {
        return inputReplaceRegexp;
    }

    /**
     * Sets the value of the inputReplaceRegexp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputReplaceRegexp(String value) {
        this.inputReplaceRegexp = value;
    }

    /**
     * Gets the value of the styleReplaceRegexp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyleReplaceRegexp() {
        return styleReplaceRegexp;
    }

    /**
     * Sets the value of the styleReplaceRegexp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyleReplaceRegexp(String value) {
        this.styleReplaceRegexp = value;
    }

    /**
     * Gets the value of the inputUnescape property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getInputUnescape() {
        return inputUnescape;
    }

    /**
     * Sets the value of the inputUnescape property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setInputUnescape(DmToggle value) {
        this.inputUnescape = value;
    }

    /**
     * Gets the value of the stylesheetUnescape property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getStylesheetUnescape() {
        return stylesheetUnescape;
    }

    /**
     * Sets the value of the stylesheetUnescape property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setStylesheetUnescape(DmToggle value) {
        this.stylesheetUnescape = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeader(String value) {
        this.header = value;
    }

    /**
     * Gets the value of the normalizeURL property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getNormalizeURL() {
        return normalizeURL;
    }

    /**
     * Sets the value of the normalizeURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setNormalizeURL(DmToggle value) {
        this.normalizeURL = value;
    }

}
