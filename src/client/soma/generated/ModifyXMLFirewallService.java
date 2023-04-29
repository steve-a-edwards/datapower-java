
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
 * <p>Java class for ModifyXMLFirewallService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyXMLFirewallService">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ModifyHTTPProxyService">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="Type" type="{http://www.datapower.com/schemas/management}dmFirewallType" minOccurs="0"/>
 *         &lt;element name="XMLManager" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="URLRewritePolicy" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="SSLProxy" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="StylePolicy" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="MaxMessageSize" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="RequestType" type="{http://www.datapower.com/schemas/management}dmXMLReqRespType" minOccurs="0"/>
 *         &lt;element name="ResponseType" type="{http://www.datapower.com/schemas/management}dmXMLReqRespType" minOccurs="0"/>
 *         &lt;element name="FWCred" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="ServiceMonitors" type="{http://www.datapower.com/schemas/management}dmReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RequestAttachments" type="{http://www.datapower.com/schemas/management}dmAttachmentMode" minOccurs="0"/>
 *         &lt;element name="ResponseAttachments" type="{http://www.datapower.com/schemas/management}dmAttachmentMode" minOccurs="0"/>
 *         &lt;element name="RootPartNotFirstAction" type="{http://www.datapower.com/schemas/management}dmRootPartNotFirstAction" minOccurs="0"/>
 *         &lt;element name="FrontAttachmentFormat" type="{http://www.datapower.com/schemas/management}dmAttachmentFormat" minOccurs="0"/>
 *         &lt;element name="BackAttachmentFormat" type="{http://www.datapower.com/schemas/management}dmAttachmentFormat" minOccurs="0"/>
 *         &lt;element name="MIMEHeaders" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="RewriteErrors" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="DelayErrors" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="DelayErrorsDuration" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="SOAPSchemaURL" type="{http://www.datapower.com/schemas/management}dmURL" minOccurs="0"/>
 *         &lt;element name="WSDLResponsePolicy" type="{http://www.datapower.com/schemas/management}dmWSDLResponsePolicy" minOccurs="0"/>
 *         &lt;element name="WSDLFileLocation" type="{http://www.datapower.com/schemas/management}dmURL" minOccurs="0"/>
 *         &lt;element name="FirewallParserLimits" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="ParserLimitsBytesScanned" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="ParserLimitsElementDepth" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="ParserLimitsAttributeCount" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="ParserLimitsMaxNodeSize" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="ParserLimitsForbidExternalReferences" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="ParserLimitsMaxPrefixes" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="ParserLimitsMaxNamespaces" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="ParserLimitsMaxLocalNames" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="ParserLimitsAttachmentByteCount" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="ParserLimitsAttachmentPackageByteCount" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="ParserLimitsExternalReferences" type="{http://www.datapower.com/schemas/management}dmExternalRefHandling" minOccurs="0"/>
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
@XmlType(name = "ModifyXMLFirewallService", propOrder = {
    "typeOrXMLManagerOrURLRewritePolicy"
})
public class ModifyXMLFirewallService
    extends ModifyHTTPProxyService
{

    @XmlElementRefs({
        @XmlElementRef(name = "MIMEHeaders", type = JAXBElement.class),
        @XmlElementRef(name = "ParserLimitsForbidExternalReferences", type = JAXBElement.class),
        @XmlElementRef(name = "ParserLimitsElementDepth", type = JAXBElement.class),
        @XmlElementRef(name = "ParserLimitsExternalReferences", type = JAXBElement.class),
        @XmlElementRef(name = "ResponseAttachments", type = JAXBElement.class),
        @XmlElementRef(name = "WSDLFileLocation", type = JAXBElement.class),
        @XmlElementRef(name = "FrontAttachmentFormat", type = JAXBElement.class),
        @XmlElementRef(name = "RequestAttachments", type = JAXBElement.class),
        @XmlElementRef(name = "URLRewritePolicy", type = JAXBElement.class),
        @XmlElementRef(name = "BackAttachmentFormat", type = JAXBElement.class),
        @XmlElementRef(name = "ParserLimitsAttachmentPackageByteCount", type = JAXBElement.class),
        @XmlElementRef(name = "SSLProxy", type = JAXBElement.class),
        @XmlElementRef(name = "DelayErrorsDuration", type = JAXBElement.class),
        @XmlElementRef(name = "DelayErrors", type = JAXBElement.class),
        @XmlElementRef(name = "XMLManager", type = JAXBElement.class),
        @XmlElementRef(name = "Type", type = JAXBElement.class),
        @XmlElementRef(name = "ParserLimitsMaxNodeSize", type = JAXBElement.class),
        @XmlElementRef(name = "ResponseType", type = JAXBElement.class),
        @XmlElementRef(name = "ParserLimitsMaxLocalNames", type = JAXBElement.class),
        @XmlElementRef(name = "StylePolicy", type = JAXBElement.class),
        @XmlElementRef(name = "WSDLResponsePolicy", type = JAXBElement.class),
        @XmlElementRef(name = "RewriteErrors", type = JAXBElement.class),
        @XmlElementRef(name = "RootPartNotFirstAction", type = JAXBElement.class),
        @XmlElementRef(name = "MaxMessageSize", type = JAXBElement.class),
        @XmlElementRef(name = "ParserLimitsMaxNamespaces", type = JAXBElement.class),
        @XmlElementRef(name = "ParserLimitsMaxPrefixes", type = JAXBElement.class),
        @XmlElementRef(name = "ServiceMonitors", type = JAXBElement.class),
        @XmlElementRef(name = "ParserLimitsBytesScanned", type = JAXBElement.class),
        @XmlElementRef(name = "ParserLimitsAttributeCount", type = JAXBElement.class),
        @XmlElementRef(name = "RequestType", type = JAXBElement.class),
        @XmlElementRef(name = "ParserLimitsAttachmentByteCount", type = JAXBElement.class),
        @XmlElementRef(name = "SOAPSchemaURL", type = JAXBElement.class),
        @XmlElementRef(name = "FirewallParserLimits", type = JAXBElement.class),
        @XmlElementRef(name = "FWCred", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> typeOrXMLManagerOrURLRewritePolicy;
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
     * Gets the value of the typeOrXMLManagerOrURLRewritePolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeOrXMLManagerOrURLRewritePolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeOrXMLManagerOrURLRewritePolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmAttachmentMode }{@code >}
     * {@link JAXBElement }{@code <}{@link DmExternalRefHandling }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmAttachmentFormat }{@code >}
     * {@link JAXBElement }{@code <}{@link DmAttachmentMode }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmAttachmentFormat }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmFirewallType }{@code >}
     * {@link JAXBElement }{@code <}{@link DmXMLReqRespType }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link DmWSDLResponsePolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmRootPartNotFirstAction }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmXMLReqRespType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getTypeOrXMLManagerOrURLRewritePolicy() {
        if (typeOrXMLManagerOrURLRewritePolicy == null) {
            typeOrXMLManagerOrURLRewritePolicy = new ArrayList<JAXBElement<?>>();
        }
        return this.typeOrXMLManagerOrURLRewritePolicy;
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
