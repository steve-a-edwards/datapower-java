
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmAddHeaderPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmAddHeaderPolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegExp" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="AddHeader" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="AddValue" type="{http://www.datapower.com/schemas/management}dmString"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmAddHeaderPolicy", propOrder = {
    "regExp",
    "addHeader",
    "addValue"
})
public class DmAddHeaderPolicy {

    @XmlElement(name = "RegExp", required = true)
    protected String regExp;
    @XmlElement(name = "AddHeader", required = true)
    protected String addHeader;
    @XmlElement(name = "AddValue", required = true)
    protected String addValue;

    /**
     * Gets the value of the regExp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegExp() {
        return regExp;
    }

    /**
     * Sets the value of the regExp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegExp(String value) {
        this.regExp = value;
    }

    /**
     * Gets the value of the addHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddHeader() {
        return addHeader;
    }

    /**
     * Sets the value of the addHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddHeader(String value) {
        this.addHeader = value;
    }

    /**
     * Gets the value of the addValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddValue() {
        return addValue;
    }

    /**
     * Sets the value of the addValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddValue(String value) {
        this.addValue = value;
    }

}
