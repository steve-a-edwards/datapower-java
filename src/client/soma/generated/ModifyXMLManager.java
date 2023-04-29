
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
 * <p>Java class for ModifyXMLManager complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyXMLManager">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ModifyConfigBase">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="UserSummary" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="SSLProxy" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="URLRefreshPolicy" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="CompileOptionsPolicy" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="CacheSize" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="SHA1Caching" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="StaticDocumentCalls" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="SearchResults" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="SupportTxWarn" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="VirtualServers" type="{http://www.datapower.com/schemas/management}dmReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExtensionFunctions" type="{http://www.datapower.com/schemas/management}dmExtensionFunction" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ParserLimitsBytesScanned" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="ParserLimitsElementDepth" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="ParserLimitsAttributeCount" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="ParserLimitsMaxNodeSize" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="ParserLimitsForbidExternalReferences" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="ParserLimitsExternalReferences" type="{http://www.datapower.com/schemas/management}dmExternalRefHandling" minOccurs="0"/>
 *         &lt;element name="ParserLimitsMaxPrefixes" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="ParserLimitsMaxNamespaces" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="ParserLimitsMaxLocalNames" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="DocCacheMaxDocs" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="DocCacheSize" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="DocCachePolicy" type="{http://www.datapower.com/schemas/management}dmDocCachePolicy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SchemaValidation" type="{http://www.datapower.com/schemas/management}dmSchemaValidation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ScheduledRule" type="{http://www.datapower.com/schemas/management}dmScheduledRule" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UserAgent" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
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
@XmlType(name = "ModifyXMLManager", propOrder = {
    "userSummaryOrSSLProxyOrURLRefreshPolicy"
})
public class ModifyXMLManager
    extends ModifyConfigBase
{

    @XmlElementRefs({
        @XmlElementRef(name = "CompileOptionsPolicy", type = JAXBElement.class),
        @XmlElementRef(name = "ParserLimitsMaxNamespaces", type = JAXBElement.class),
        @XmlElementRef(name = "ParserLimitsElementDepth", type = JAXBElement.class),
        @XmlElementRef(name = "DocCacheMaxDocs", type = JAXBElement.class),
        @XmlElementRef(name = "ParserLimitsMaxLocalNames", type = JAXBElement.class),
        @XmlElementRef(name = "ParserLimitsForbidExternalReferences", type = JAXBElement.class),
        @XmlElementRef(name = "SHA1Caching", type = JAXBElement.class),
        @XmlElementRef(name = "SSLProxy", type = JAXBElement.class),
        @XmlElementRef(name = "ParserLimitsBytesScanned", type = JAXBElement.class),
        @XmlElementRef(name = "ParserLimitsExternalReferences", type = JAXBElement.class),
        @XmlElementRef(name = "StaticDocumentCalls", type = JAXBElement.class),
        @XmlElementRef(name = "ParserLimitsMaxPrefixes", type = JAXBElement.class),
        @XmlElementRef(name = "ExtensionFunctions", type = JAXBElement.class),
        @XmlElementRef(name = "UserAgent", type = JAXBElement.class),
        @XmlElementRef(name = "ParserLimitsAttributeCount", type = JAXBElement.class),
        @XmlElementRef(name = "ParserLimitsMaxNodeSize", type = JAXBElement.class),
        @XmlElementRef(name = "VirtualServers", type = JAXBElement.class),
        @XmlElementRef(name = "ScheduledRule", type = JAXBElement.class),
        @XmlElementRef(name = "SearchResults", type = JAXBElement.class),
        @XmlElementRef(name = "SchemaValidation", type = JAXBElement.class),
        @XmlElementRef(name = "DocCacheSize", type = JAXBElement.class),
        @XmlElementRef(name = "DocCachePolicy", type = JAXBElement.class),
        @XmlElementRef(name = "UserSummary", type = JAXBElement.class),
        @XmlElementRef(name = "SupportTxWarn", type = JAXBElement.class),
        @XmlElementRef(name = "CacheSize", type = JAXBElement.class),
        @XmlElementRef(name = "URLRefreshPolicy", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> userSummaryOrSSLProxyOrURLRefreshPolicy;
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
     * Gets the value of the userSummaryOrSSLProxyOrURLRefreshPolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userSummaryOrSSLProxyOrURLRefreshPolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserSummaryOrSSLProxyOrURLRefreshPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmExternalRefHandling }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link DmExtensionFunction }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmScheduledRule }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmSchemaValidation }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDocCachePolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getUserSummaryOrSSLProxyOrURLRefreshPolicy() {
        if (userSummaryOrSSLProxyOrURLRefreshPolicy == null) {
            userSummaryOrSSLProxyOrURLRefreshPolicy = new ArrayList<JAXBElement<?>>();
        }
        return this.userSummaryOrSSLProxyOrURLRefreshPolicy;
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
