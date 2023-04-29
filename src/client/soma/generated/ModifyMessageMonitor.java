
package client.soma.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModifyMessageMonitor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyMessageMonitor">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ModifyMessageFlowControl">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="UserSummary" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="MessageType" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyMessageMonitor", propOrder = {
    "userSummaryOrMessageType"
})
@XmlSeeAlso({
    ModifyCountMonitor.class,
    ModifyDurationMonitor.class
})
public class ModifyMessageMonitor
    extends ModifyMessageFlowControl
{

    @XmlElements({
        @XmlElement(name = "MessageType", type = DmReference.class),
        @XmlElement(name = "UserSummary", type = String.class)
    })
    protected List<Object> userSummaryOrMessageType;

    /**
     * Gets the value of the userSummaryOrMessageType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userSummaryOrMessageType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserSummaryOrMessageType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DmReference }
     * {@link String }
     * 
     * 
     */
    public List<Object> getUserSummaryOrMessageType() {
        if (userSummaryOrMessageType == null) {
            userSummaryOrMessageType = new ArrayList<Object>();
        }
        return this.userSummaryOrMessageType;
    }

}
