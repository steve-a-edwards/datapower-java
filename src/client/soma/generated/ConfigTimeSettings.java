
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
 * <p>Java class for ConfigTimeSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigTimeSettings">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ConfigDeviceSettings">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="LocalTimeZone" type="{http://www.datapower.com/schemas/management}dmTimeZone"/>
 *         &lt;element name="CustomTZName" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="UTCDirection" type="{http://www.datapower.com/schemas/management}dmTimeDirection" minOccurs="0"/>
 *         &lt;element name="OffsetHours" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="OffsetMinutes" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="DaylightOffsetHours" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="TZNameDST" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="DaylightStartMonth" type="{http://www.datapower.com/schemas/management}dmMonth" minOccurs="0"/>
 *         &lt;element name="DaylightStartWeek" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="DaylightStartDay" type="{http://www.datapower.com/schemas/management}dmWeekday" minOccurs="0"/>
 *         &lt;element name="DaylightStartTimeHours" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="DaylightStartTimeMinutes" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="DaylightStopMonth" type="{http://www.datapower.com/schemas/management}dmMonth" minOccurs="0"/>
 *         &lt;element name="DaylightStopWeek" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="DaylightStopDay" type="{http://www.datapower.com/schemas/management}dmWeekday" minOccurs="0"/>
 *         &lt;element name="DaylightStopTimeHours" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="DaylightStopTimeMinutes" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
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
@XmlType(name = "ConfigTimeSettings", propOrder = {
    "localTimeZoneOrCustomTZNameOrUTCDirection"
})
public class ConfigTimeSettings
    extends ConfigDeviceSettings
{

    @XmlElementRefs({
        @XmlElementRef(name = "OffsetHours", type = JAXBElement.class),
        @XmlElementRef(name = "DaylightStopTimeMinutes", type = JAXBElement.class),
        @XmlElementRef(name = "DaylightStopTimeHours", type = JAXBElement.class),
        @XmlElementRef(name = "DaylightStopWeek", type = JAXBElement.class),
        @XmlElementRef(name = "CustomTZName", type = JAXBElement.class),
        @XmlElementRef(name = "DaylightOffsetHours", type = JAXBElement.class),
        @XmlElementRef(name = "DaylightStartDay", type = JAXBElement.class),
        @XmlElementRef(name = "TZNameDST", type = JAXBElement.class),
        @XmlElementRef(name = "LocalTimeZone", type = JAXBElement.class),
        @XmlElementRef(name = "DaylightStartMonth", type = JAXBElement.class),
        @XmlElementRef(name = "DaylightStartTimeHours", type = JAXBElement.class),
        @XmlElementRef(name = "DaylightStopDay", type = JAXBElement.class),
        @XmlElementRef(name = "OffsetMinutes", type = JAXBElement.class),
        @XmlElementRef(name = "DaylightStartWeek", type = JAXBElement.class),
        @XmlElementRef(name = "DaylightStopMonth", type = JAXBElement.class),
        @XmlElementRef(name = "DaylightStartTimeMinutes", type = JAXBElement.class),
        @XmlElementRef(name = "UTCDirection", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> localTimeZoneOrCustomTZNameOrUTCDirection;
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
     * Gets the value of the localTimeZoneOrCustomTZNameOrUTCDirection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localTimeZoneOrCustomTZNameOrUTCDirection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalTimeZoneOrCustomTZNameOrUTCDirection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmWeekday }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmTimeZone }{@code >}
     * {@link JAXBElement }{@code <}{@link DmMonth }{@code >}
     * {@link JAXBElement }{@code <}{@link DmWeekday }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmMonth }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmTimeDirection }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getLocalTimeZoneOrCustomTZNameOrUTCDirection() {
        if (localTimeZoneOrCustomTZNameOrUTCDirection == null) {
            localTimeZoneOrCustomTZNameOrUTCDirection = new ArrayList<JAXBElement<?>>();
        }
        return this.localTimeZoneOrCustomTZNameOrUTCDirection;
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
