
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
 * <p>Java class for ConfigWSRRSubscription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigWSRRSubscription">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ConfigWebServiceSubscription">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="Server" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="Namespace" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="ObjectType" type="{http://www.datapower.com/schemas/management}dmWsrrSubscriptionType"/>
 *         &lt;element name="ObjectName" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="Method" type="{http://www.datapower.com/schemas/management}dmWsrrSynchronization" minOccurs="0"/>
 *         &lt;element name="RefreshInterval" type="{http://www.datapower.com/schemas/management}dmTimeInterval" minOccurs="0"/>
 *         &lt;element name="UseVersion" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="ObjectVersion" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="FetchPolicyAttachments" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
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
@XmlType(name = "ConfigWSRRSubscription", propOrder = {
    "serverOrNamespaceOrObjectType"
})
public class ConfigWSRRSubscription
    extends ConfigWebServiceSubscription
{

    @XmlElementRefs({
        @XmlElementRef(name = "ObjectName", type = JAXBElement.class),
        @XmlElementRef(name = "Server", type = JAXBElement.class),
        @XmlElementRef(name = "Method", type = JAXBElement.class),
        @XmlElementRef(name = "FetchPolicyAttachments", type = JAXBElement.class),
        @XmlElementRef(name = "UseVersion", type = JAXBElement.class),
        @XmlElementRef(name = "Namespace", type = JAXBElement.class),
        @XmlElementRef(name = "ObjectVersion", type = JAXBElement.class),
        @XmlElementRef(name = "RefreshInterval", type = JAXBElement.class),
        @XmlElementRef(name = "ObjectType", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> serverOrNamespaceOrObjectType;
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
     * Gets the value of the serverOrNamespaceOrObjectType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serverOrNamespaceOrObjectType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServerOrNamespaceOrObjectType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmWsrrSynchronization }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmWsrrSubscriptionType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getServerOrNamespaceOrObjectType() {
        if (serverOrNamespaceOrObjectType == null) {
            serverOrNamespaceOrObjectType = new ArrayList<JAXBElement<?>>();
        }
        return this.serverOrNamespaceOrObjectType;
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
