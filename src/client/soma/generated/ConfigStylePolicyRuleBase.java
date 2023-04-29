
package client.soma.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigStylePolicyRuleBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigStylePolicyRuleBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ConfigConfigBase">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="UserSummary" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Direction" type="{http://www.datapower.com/schemas/management}dmStyleRuleDirection"/>
 *         &lt;element name="InputFormat" type="{http://www.datapower.com/schemas/management}dmStyleRuleFilterFormat"/>
 *         &lt;element name="OutputFormat" type="{http://www.datapower.com/schemas/management}dmStyleRuleFilterFormat"/>
 *         &lt;element name="NonXMLProcessing" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="Unprocessed" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigStylePolicyRuleBase", propOrder = {
    "userSummaryOrDirectionOrInputFormat"
})
@XmlSeeAlso({
    ConfigStylePolicyRule.class,
    ConfigWSStylePolicyRule.class
})
public class ConfigStylePolicyRuleBase
    extends ConfigConfigBase
{

    @XmlElementRefs({
        @XmlElementRef(name = "Unprocessed", type = JAXBElement.class),
        @XmlElementRef(name = "NonXMLProcessing", type = JAXBElement.class),
        @XmlElementRef(name = "OutputFormat", type = JAXBElement.class),
        @XmlElementRef(name = "UserSummary", type = JAXBElement.class),
        @XmlElementRef(name = "Direction", type = JAXBElement.class),
        @XmlElementRef(name = "InputFormat", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> userSummaryOrDirectionOrInputFormat;

    /**
     * Gets the value of the userSummaryOrDirectionOrInputFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userSummaryOrDirectionOrInputFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserSummaryOrDirectionOrInputFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmStyleRuleDirection }{@code >}
     * {@link JAXBElement }{@code <}{@link DmStyleRuleFilterFormat }{@code >}
     * {@link JAXBElement }{@code <}{@link DmStyleRuleFilterFormat }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getUserSummaryOrDirectionOrInputFormat() {
        if (userSummaryOrDirectionOrInputFormat == null) {
            userSummaryOrDirectionOrInputFormat = new ArrayList<JAXBElement<?>>();
        }
        return this.userSummaryOrDirectionOrInputFormat;
    }

}
