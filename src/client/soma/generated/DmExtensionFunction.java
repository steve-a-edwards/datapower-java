
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmExtensionFunction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmExtensionFunction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionFunctionNamespace" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="ExtensionFunction" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="LocalFunctionNamespace" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="LocalFunction" type="{http://www.datapower.com/schemas/management}dmString"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmExtensionFunction", propOrder = {
    "extensionFunctionNamespace",
    "extensionFunction",
    "localFunctionNamespace",
    "localFunction"
})
public class DmExtensionFunction {

    @XmlElement(name = "ExtensionFunctionNamespace", required = true)
    protected String extensionFunctionNamespace;
    @XmlElement(name = "ExtensionFunction", required = true)
    protected String extensionFunction;
    @XmlElement(name = "LocalFunctionNamespace", required = true, nillable = true)
    protected String localFunctionNamespace;
    @XmlElement(name = "LocalFunction", required = true)
    protected String localFunction;

    /**
     * Gets the value of the extensionFunctionNamespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionFunctionNamespace() {
        return extensionFunctionNamespace;
    }

    /**
     * Sets the value of the extensionFunctionNamespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionFunctionNamespace(String value) {
        this.extensionFunctionNamespace = value;
    }

    /**
     * Gets the value of the extensionFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionFunction() {
        return extensionFunction;
    }

    /**
     * Sets the value of the extensionFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionFunction(String value) {
        this.extensionFunction = value;
    }

    /**
     * Gets the value of the localFunctionNamespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalFunctionNamespace() {
        return localFunctionNamespace;
    }

    /**
     * Sets the value of the localFunctionNamespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalFunctionNamespace(String value) {
        this.localFunctionNamespace = value;
    }

    /**
     * Gets the value of the localFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalFunction() {
        return localFunction;
    }

    /**
     * Sets the value of the localFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalFunction(String value) {
        this.localFunction = value;
    }

}
