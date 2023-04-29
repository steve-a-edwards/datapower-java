
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
 * <p>Java class for ConfigWSGateway complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigWSGateway">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ConfigGatewayBase">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="RequestType" type="{http://www.datapower.com/schemas/management}dmXMLReqRespType1" minOccurs="0"/>
 *         &lt;element name="ResponseType" type="{http://www.datapower.com/schemas/management}dmXMLReqRespType1" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.datapower.com/schemas/management}dmWSGatewayType"/>
 *         &lt;element name="AutoCreateSources" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="EndpointRewritePolicy" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="LocalEndpointRewrite" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="RemoteEndpointRewrite" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="AAAPolicy" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="StylePolicy" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="RemoteFetchRetry" type="{http://www.datapower.com/schemas/management}dmNetworkRetry" minOccurs="0"/>
 *         &lt;element name="WSDLCachePolicy" type="{http://www.datapower.com/schemas/management}dmWSDLCachePolicy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BaseWSDL" type="{http://www.datapower.com/schemas/management}dmWSBaseWSDL" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UserToggles" type="{http://www.datapower.com/schemas/management}dmWSUserToggles" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ClientPrincipal" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="ServerPrincipal" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="KerberosKeytab" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="DecryptKey" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="EncryptedKeySHA1CacheLifeTime" type="{http://www.datapower.com/schemas/management}dmTimeInterval" minOccurs="0"/>
 *         &lt;element name="PreserveKeyChain" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="DecryptWithKeyFromED" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="SOAPActionPolicy" type="{http://www.datapower.com/schemas/management}dmSOAPActionMatchPolicy" minOccurs="0"/>
 *         &lt;element name="UDDISubscriptions" type="{http://www.datapower.com/schemas/management}dmUDDIWSDLSource" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WSRRSubscriptions" type="{http://www.datapower.com/schemas/management}dmWSRRWSDLSource" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WSRRSavedSearchSubscriptions" type="{http://www.datapower.com/schemas/management}dmWSRRSavedSearchWSDLSource" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OperationPriority" type="{http://www.datapower.com/schemas/management}dmWSOperationSchedulerPriority" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OperationConformancePolicy" type="{http://www.datapower.com/schemas/management}dmWSOperationConformancePolicy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OperationPolicySubjectOptOut" type="{http://www.datapower.com/schemas/management}dmWSOperationPolicySubjectOptOut" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PolicyParameter" type="{http://www.datapower.com/schemas/management}dmWSPolicyParameters" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReliableMessaging" type="{http://www.datapower.com/schemas/management}dmWSOperationReliableMessaging" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ConfigWSGateway", propOrder = {
    "requestTypeOrResponseTypeOrType"
})
public class ConfigWSGateway
    extends ConfigGatewayBase
{

    @XmlElementRefs({
        @XmlElementRef(name = "RequestType", type = JAXBElement.class),
        @XmlElementRef(name = "Type", type = JAXBElement.class),
        @XmlElementRef(name = "RemoteFetchRetry", type = JAXBElement.class),
        @XmlElementRef(name = "RemoteEndpointRewrite", type = JAXBElement.class),
        @XmlElementRef(name = "PreserveKeyChain", type = JAXBElement.class),
        @XmlElementRef(name = "ResponseType", type = JAXBElement.class),
        @XmlElementRef(name = "ReliableMessaging", type = JAXBElement.class),
        @XmlElementRef(name = "UDDISubscriptions", type = JAXBElement.class),
        @XmlElementRef(name = "WSRRSubscriptions", type = JAXBElement.class),
        @XmlElementRef(name = "ServerPrincipal", type = JAXBElement.class),
        @XmlElementRef(name = "SOAPActionPolicy", type = JAXBElement.class),
        @XmlElementRef(name = "AAAPolicy", type = JAXBElement.class),
        @XmlElementRef(name = "KerberosKeytab", type = JAXBElement.class),
        @XmlElementRef(name = "WSRRSavedSearchSubscriptions", type = JAXBElement.class),
        @XmlElementRef(name = "ClientPrincipal", type = JAXBElement.class),
        @XmlElementRef(name = "UserToggles", type = JAXBElement.class),
        @XmlElementRef(name = "DecryptWithKeyFromED", type = JAXBElement.class),
        @XmlElementRef(name = "DecryptKey", type = JAXBElement.class),
        @XmlElementRef(name = "BaseWSDL", type = JAXBElement.class),
        @XmlElementRef(name = "LocalEndpointRewrite", type = JAXBElement.class),
        @XmlElementRef(name = "AutoCreateSources", type = JAXBElement.class),
        @XmlElementRef(name = "OperationConformancePolicy", type = JAXBElement.class),
        @XmlElementRef(name = "WSDLCachePolicy", type = JAXBElement.class),
        @XmlElementRef(name = "EncryptedKeySHA1CacheLifeTime", type = JAXBElement.class),
        @XmlElementRef(name = "PolicyParameter", type = JAXBElement.class),
        @XmlElementRef(name = "OperationPolicySubjectOptOut", type = JAXBElement.class),
        @XmlElementRef(name = "OperationPriority", type = JAXBElement.class),
        @XmlElementRef(name = "EndpointRewritePolicy", type = JAXBElement.class),
        @XmlElementRef(name = "StylePolicy", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> requestTypeOrResponseTypeOrType;
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
     * Gets the value of the requestTypeOrResponseTypeOrType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestTypeOrResponseTypeOrType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestTypeOrResponseTypeOrType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DmXMLReqRespType1 }{@code >}
     * {@link JAXBElement }{@code <}{@link DmWSGatewayType }{@code >}
     * {@link JAXBElement }{@code <}{@link DmNetworkRetry }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmXMLReqRespType1 }{@code >}
     * {@link JAXBElement }{@code <}{@link DmWSOperationReliableMessaging }{@code >}
     * {@link JAXBElement }{@code <}{@link DmUDDIWSDLSource }{@code >}
     * {@link JAXBElement }{@code <}{@link DmWSRRWSDLSource }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmSOAPActionMatchPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmWSRRSavedSearchWSDLSource }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmWSUserToggles }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmWSBaseWSDL }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmWSOperationConformancePolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link DmWSDLCachePolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmWSPolicyParameters }{@code >}
     * {@link JAXBElement }{@code <}{@link DmWSOperationPolicySubjectOptOut }{@code >}
     * {@link JAXBElement }{@code <}{@link DmWSOperationSchedulerPriority }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRequestTypeOrResponseTypeOrType() {
        if (requestTypeOrResponseTypeOrType == null) {
            requestTypeOrResponseTypeOrType = new ArrayList<JAXBElement<?>>();
        }
        return this.requestTypeOrResponseTypeOrType;
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
