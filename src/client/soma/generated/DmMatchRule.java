
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmMatchRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmMatchRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.datapower.com/schemas/management}dmMatchType"/>
 *         &lt;element name="HttpTag" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="HttpValue" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="Url" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="ErrorCode" type="{http://www.datapower.com/schemas/management}dmEventCodeMatch"/>
 *         &lt;element name="XPATHExpression" type="{http://www.datapower.com/schemas/management}dmXPathExpr"/>
 *         &lt;element name="Method" type="{http://www.datapower.com/schemas/management}dmHTTPMethodMatchType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmMatchRule", propOrder = {
    "type",
    "httpTag",
    "httpValue",
    "url",
    "errorCode",
    "xpathExpression",
    "method"
})
public class DmMatchRule {

    @XmlElement(name = "Type", required = true)
    protected DmMatchType type;
    @XmlElement(name = "HttpTag", required = true, nillable = true)
    protected String httpTag;
    @XmlElement(name = "HttpValue", required = true, nillable = true)
    protected String httpValue;
    @XmlElement(name = "Url", required = true, nillable = true)
    protected String url;
    @XmlElement(name = "ErrorCode", required = true, nillable = true)
    protected String errorCode;
    @XmlElement(name = "XPATHExpression", required = true, nillable = true)
    protected String xpathExpression;
    @XmlElement(name = "Method", required = true, nillable = true)
    protected DmHTTPMethodMatchType method;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link DmMatchType }
     *     
     */
    public DmMatchType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmMatchType }
     *     
     */
    public void setType(DmMatchType value) {
        this.type = value;
    }

    /**
     * Gets the value of the httpTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpTag() {
        return httpTag;
    }

    /**
     * Sets the value of the httpTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpTag(String value) {
        this.httpTag = value;
    }

    /**
     * Gets the value of the httpValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpValue() {
        return httpValue;
    }

    /**
     * Sets the value of the httpValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpValue(String value) {
        this.httpValue = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
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
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the xpathExpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXPATHExpression() {
        return xpathExpression;
    }

    /**
     * Sets the value of the xpathExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXPATHExpression(String value) {
        this.xpathExpression = value;
    }

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link DmHTTPMethodMatchType }
     *     
     */
    public DmHTTPMethodMatchType getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmHTTPMethodMatchType }
     *     
     */
    public void setMethod(DmHTTPMethodMatchType value) {
        this.method = value;
    }

}
