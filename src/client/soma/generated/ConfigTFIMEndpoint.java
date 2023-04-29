
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
 * <p>Java class for ConfigTFIMEndpoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigTFIMEndpoint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ConfigAccessControl">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="UserSummary" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="mServerURL" type="{http://www.datapower.com/schemas/management}dmHostname"/>
 *         &lt;element name="mServerPort" type="{http://www.datapower.com/schemas/management}dmIPPort"/>
 *         &lt;element name="mCompatibleMode" type="{http://www.datapower.com/schemas/management}dmTFIMMode"/>
 *         &lt;element name="mReqToken60Format" type="{http://www.datapower.com/schemas/management}dmTFIMReq60Format" minOccurs="0"/>
 *         &lt;element name="mReqToken61Format" type="{http://www.datapower.com/schemas/management}dmTFIMReq61Format" minOccurs="0"/>
 *         &lt;element name="mReqToken62Format" type="{http://www.datapower.com/schemas/management}dmTFIMReq62Format" minOccurs="0"/>
 *         &lt;element name="mReqCustomURL" type="{http://www.datapower.com/schemas/management}dmFSFile" minOccurs="0"/>
 *         &lt;element name="mAppliesToAddress" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="mIssuer" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="mPortType" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="mOperation" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="mSSLProxy" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="mSchemaValidate" type="{http://www.datapower.com/schemas/management}dmToggle"/>
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
@XmlType(name = "ConfigTFIMEndpoint", propOrder = {
    "userSummaryOrMServerURLOrMServerPort"
})
public class ConfigTFIMEndpoint
    extends ConfigAccessControl
{

    @XmlElementRefs({
        @XmlElementRef(name = "mReqToken61Format", type = JAXBElement.class),
        @XmlElementRef(name = "mOperation", type = JAXBElement.class),
        @XmlElementRef(name = "mAppliesToAddress", type = JAXBElement.class),
        @XmlElementRef(name = "mServerURL", type = JAXBElement.class),
        @XmlElementRef(name = "mReqToken62Format", type = JAXBElement.class),
        @XmlElementRef(name = "mPortType", type = JAXBElement.class),
        @XmlElementRef(name = "mSSLProxy", type = JAXBElement.class),
        @XmlElementRef(name = "mReqCustomURL", type = JAXBElement.class),
        @XmlElementRef(name = "mReqToken60Format", type = JAXBElement.class),
        @XmlElementRef(name = "UserSummary", type = JAXBElement.class),
        @XmlElementRef(name = "mCompatibleMode", type = JAXBElement.class),
        @XmlElementRef(name = "mSchemaValidate", type = JAXBElement.class),
        @XmlElementRef(name = "mServerPort", type = JAXBElement.class),
        @XmlElementRef(name = "mIssuer", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> userSummaryOrMServerURLOrMServerPort;
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
     * Gets the value of the userSummaryOrMServerURLOrMServerPort property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userSummaryOrMServerURLOrMServerPort property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserSummaryOrMServerURLOrMServerPort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DmTFIMReq61Format }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmTFIMReq62Format }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmTFIMReq60Format }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmTFIMMode }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getUserSummaryOrMServerURLOrMServerPort() {
        if (userSummaryOrMServerURLOrMServerPort == null) {
            userSummaryOrMServerURLOrMServerPort = new ArrayList<JAXBElement<?>>();
        }
        return this.userSummaryOrMServerURLOrMServerPort;
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
