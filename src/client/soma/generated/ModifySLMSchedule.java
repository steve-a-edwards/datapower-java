
package client.soma.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModifySLMSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifySLMSchedule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ModifyConfigBase">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="UserSummary" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="DaysOfWeek" type="{http://www.datapower.com/schemas/management}dmWeekdayBitmap" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.datapower.com/schemas/management}dmTimeOfDay" minOccurs="0"/>
 *         &lt;element name="Duration" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
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
@XmlType(name = "ModifySLMSchedule", propOrder = {
    "userSummaryOrDaysOfWeekOrStartTime"
})
public class ModifySLMSchedule
    extends ModifyConfigBase
{

    @XmlElementRefs({
        @XmlElementRef(name = "UserSummary", type = JAXBElement.class),
        @XmlElementRef(name = "StartTime", type = JAXBElement.class),
        @XmlElementRef(name = "DaysOfWeek", type = JAXBElement.class),
        @XmlElementRef(name = "Duration", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> userSummaryOrDaysOfWeekOrStartTime;
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
     * Gets the value of the userSummaryOrDaysOfWeekOrStartTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userSummaryOrDaysOfWeekOrStartTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserSummaryOrDaysOfWeekOrStartTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmWeekdayBitmap }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getUserSummaryOrDaysOfWeekOrStartTime() {
        if (userSummaryOrDaysOfWeekOrStartTime == null) {
            userSummaryOrDaysOfWeekOrStartTime = new ArrayList<JAXBElement<?>>();
        }
        return this.userSummaryOrDaysOfWeekOrStartTime;
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
