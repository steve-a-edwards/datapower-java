
package client.soma.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigWSEndpointRewritePolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigWSEndpointRewritePolicy">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ConfigConfigBase">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="UserSummary" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="WSEndpointLocalRewriteRule" type="{http://www.datapower.com/schemas/management}dmWSEndpointLocalRewriteRule" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WSEndpointRemoteRewriteRule" type="{http://www.datapower.com/schemas/management}dmWSEndpointRemoteRewriteRule" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WSEndpointPublishRewriteRule" type="{http://www.datapower.com/schemas/management}dmWSEndpointPublishRewriteRule" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WSEndpointSubscriptionLocalRule" type="{http://www.datapower.com/schemas/management}dmWSEndpointSubscriptionLocalRule" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WSEndpointSubscriptionRemoteRule" type="{http://www.datapower.com/schemas/management}dmWSEndpointSubscriptionRemoteRule" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WSEndpointSubscriptionPublishRule" type="{http://www.datapower.com/schemas/management}dmWSEndpointSubscriptionPublishRule" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.datapower.com/schemas/management}ConfigAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigWSEndpointRewritePolicy", propOrder = {
    "userSummaryOrWSEndpointLocalRewriteRuleOrWSEndpointRemoteRewriteRule"
})
public class ConfigWSEndpointRewritePolicy
    extends ConfigConfigBase
{

    @XmlElements({
        @XmlElement(name = "WSEndpointSubscriptionLocalRule", type = DmWSEndpointSubscriptionLocalRule.class),
        @XmlElement(name = "WSEndpointSubscriptionPublishRule", type = DmWSEndpointSubscriptionPublishRule.class),
        @XmlElement(name = "WSEndpointSubscriptionRemoteRule", type = DmWSEndpointSubscriptionRemoteRule.class),
        @XmlElement(name = "UserSummary", type = String.class),
        @XmlElement(name = "WSEndpointLocalRewriteRule", type = DmWSEndpointLocalRewriteRule.class),
        @XmlElement(name = "WSEndpointPublishRewriteRule", type = DmWSEndpointPublishRewriteRule.class),
        @XmlElement(name = "WSEndpointRemoteRewriteRule", type = DmWSEndpointRemoteRewriteRule.class)
    })
    protected List<Object> userSummaryOrWSEndpointLocalRewriteRuleOrWSEndpointRemoteRewriteRule;
    @XmlAttribute
    protected String name;
    @XmlAttribute
    protected Boolean local;
    @XmlAttribute
    protected Boolean intrinsic;
    @XmlAttribute(name = "read-only")
    protected Boolean readOnly;
    @XmlAttribute
    protected Boolean external;

    /**
     * Gets the value of the userSummaryOrWSEndpointLocalRewriteRuleOrWSEndpointRemoteRewriteRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userSummaryOrWSEndpointLocalRewriteRuleOrWSEndpointRemoteRewriteRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserSummaryOrWSEndpointLocalRewriteRuleOrWSEndpointRemoteRewriteRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DmWSEndpointSubscriptionLocalRule }
     * {@link DmWSEndpointSubscriptionPublishRule }
     * {@link DmWSEndpointSubscriptionRemoteRule }
     * {@link String }
     * {@link DmWSEndpointLocalRewriteRule }
     * {@link DmWSEndpointPublishRewriteRule }
     * {@link DmWSEndpointRemoteRewriteRule }
     * 
     * 
     */
    public List<Object> getUserSummaryOrWSEndpointLocalRewriteRuleOrWSEndpointRemoteRewriteRule() {
        if (userSummaryOrWSEndpointLocalRewriteRuleOrWSEndpointRemoteRewriteRule == null) {
            userSummaryOrWSEndpointLocalRewriteRuleOrWSEndpointRemoteRewriteRule = new ArrayList<Object>();
        }
        return this.userSummaryOrWSEndpointLocalRewriteRuleOrWSEndpointRemoteRewriteRule;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the local property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocal() {
        return local;
    }

    /**
     * Sets the value of the local property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocal(Boolean value) {
        this.local = value;
    }

    /**
     * Gets the value of the intrinsic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntrinsic() {
        return intrinsic;
    }

    /**
     * Sets the value of the intrinsic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntrinsic(Boolean value) {
        this.intrinsic = value;
    }

    /**
     * Gets the value of the readOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReadOnly() {
        return readOnly;
    }

    /**
     * Sets the value of the readOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReadOnly(Boolean value) {
        this.readOnly = value;
    }

    /**
     * Gets the value of the external property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExternal() {
        return external;
    }

    /**
     * Sets the value of the external property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExternal(Boolean value) {
        this.external = value;
    }

}
