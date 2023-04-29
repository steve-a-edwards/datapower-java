
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
 * <p>Java class for ConfigAAAPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigAAAPolicy">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ConfigAccessControl">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="UserSummary" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="AuthorizedCounter" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="RejectedCounter" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="NamespaceMapping" type="{http://www.datapower.com/schemas/management}dmNamespaceMapping" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExtractIdentity" type="{http://www.datapower.com/schemas/management}dmAAAPExtractIdentity"/>
 *         &lt;element name="Authenticate" type="{http://www.datapower.com/schemas/management}dmAAAPAuthenticate"/>
 *         &lt;element name="MapCredentials" type="{http://www.datapower.com/schemas/management}dmAAAPMapCredentials"/>
 *         &lt;element name="ExtractResource" type="{http://www.datapower.com/schemas/management}dmAAAPExtractResource"/>
 *         &lt;element name="MapResource" type="{http://www.datapower.com/schemas/management}dmAAAPMapResource"/>
 *         &lt;element name="Authorize" type="{http://www.datapower.com/schemas/management}dmAAAPAuthorize"/>
 *         &lt;element name="PostProcess" type="{http://www.datapower.com/schemas/management}dmAAAPPostProcess"/>
 *         &lt;element name="SAMLAttribute" type="{http://www.datapower.com/schemas/management}dmSAMLAttributeNameAndValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LTPAAttributes" type="{http://www.datapower.com/schemas/management}dmLTPAUserAttributeNameAndValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TransactionPriority" type="{http://www.datapower.com/schemas/management}dmAAATransactionPriority" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SAMLValcred" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="SAMLSigningKey" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="SAMLSigningCert" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="SAMLSigningHashAlg" type="{http://www.datapower.com/schemas/management}dmCryptoHashAlgorithm" minOccurs="0"/>
 *         &lt;element name="SAMLSigningAlg" type="{http://www.datapower.com/schemas/management}dmCryptoSigningAlgorithm" minOccurs="0"/>
 *         &lt;element name="LDAPsuffix" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="LogAllowed" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="LogAllowedLevel" type="{http://www.datapower.com/schemas/management}dmLogLevel" minOccurs="0"/>
 *         &lt;element name="LogRejected" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="LogRejectedLevel" type="{http://www.datapower.com/schemas/management}dmLogLevel" minOccurs="0"/>
 *         &lt;element name="WSSecureConversationCryptoKey" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="SAMLSourceIDMappingFile" type="{http://www.datapower.com/schemas/management}dmFSFile" minOccurs="0"/>
 *         &lt;element name="PingIdentityCompatibility" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="SAML2MetadataFile" type="{http://www.datapower.com/schemas/management}dmFSFile" minOccurs="0"/>
 *         &lt;element name="DoSValve" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="LDAPVersion" type="{http://www.datapower.com/schemas/management}dmLDAPVersion" minOccurs="0"/>
 *         &lt;element name="EnforceSOAPActor" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="WSSecActorRoleID" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
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
@XmlType(name = "ConfigAAAPolicy", propOrder = {
    "userSummaryOrAuthorizedCounterOrRejectedCounter"
})
public class ConfigAAAPolicy
    extends ConfigAccessControl
{

    @XmlElementRefs({
        @XmlElementRef(name = "SAML2MetadataFile", type = JAXBElement.class),
        @XmlElementRef(name = "PostProcess", type = JAXBElement.class),
        @XmlElementRef(name = "ExtractIdentity", type = JAXBElement.class),
        @XmlElementRef(name = "NamespaceMapping", type = JAXBElement.class),
        @XmlElementRef(name = "SAMLAttribute", type = JAXBElement.class),
        @XmlElementRef(name = "PingIdentityCompatibility", type = JAXBElement.class),
        @XmlElementRef(name = "EnforceSOAPActor", type = JAXBElement.class),
        @XmlElementRef(name = "DoSValve", type = JAXBElement.class),
        @XmlElementRef(name = "SAMLSigningAlg", type = JAXBElement.class),
        @XmlElementRef(name = "LDAPsuffix", type = JAXBElement.class),
        @XmlElementRef(name = "MapCredentials", type = JAXBElement.class),
        @XmlElementRef(name = "SAMLSigningCert", type = JAXBElement.class),
        @XmlElementRef(name = "LTPAAttributes", type = JAXBElement.class),
        @XmlElementRef(name = "Authorize", type = JAXBElement.class),
        @XmlElementRef(name = "SAMLSigningKey", type = JAXBElement.class),
        @XmlElementRef(name = "MapResource", type = JAXBElement.class),
        @XmlElementRef(name = "TransactionPriority", type = JAXBElement.class),
        @XmlElementRef(name = "SAMLSigningHashAlg", type = JAXBElement.class),
        @XmlElementRef(name = "LDAPVersion", type = JAXBElement.class),
        @XmlElementRef(name = "UserSummary", type = JAXBElement.class),
        @XmlElementRef(name = "WSSecActorRoleID", type = JAXBElement.class),
        @XmlElementRef(name = "LogRejected", type = JAXBElement.class),
        @XmlElementRef(name = "LogAllowed", type = JAXBElement.class),
        @XmlElementRef(name = "AuthorizedCounter", type = JAXBElement.class),
        @XmlElementRef(name = "Authenticate", type = JAXBElement.class),
        @XmlElementRef(name = "LogAllowedLevel", type = JAXBElement.class),
        @XmlElementRef(name = "RejectedCounter", type = JAXBElement.class),
        @XmlElementRef(name = "SAMLValcred", type = JAXBElement.class),
        @XmlElementRef(name = "WSSecureConversationCryptoKey", type = JAXBElement.class),
        @XmlElementRef(name = "ExtractResource", type = JAXBElement.class),
        @XmlElementRef(name = "SAMLSourceIDMappingFile", type = JAXBElement.class),
        @XmlElementRef(name = "LogRejectedLevel", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> userSummaryOrAuthorizedCounterOrRejectedCounter;
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
     * Gets the value of the userSummaryOrAuthorizedCounterOrRejectedCounter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userSummaryOrAuthorizedCounterOrRejectedCounter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserSummaryOrAuthorizedCounterOrRejectedCounter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmAAAPPostProcess }{@code >}
     * {@link JAXBElement }{@code <}{@link DmAAAPExtractIdentity }{@code >}
     * {@link JAXBElement }{@code <}{@link DmNamespaceMapping }{@code >}
     * {@link JAXBElement }{@code <}{@link DmSAMLAttributeNameAndValue }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link DmCryptoSigningAlgorithm }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmAAAPMapCredentials }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmLTPAUserAttributeNameAndValue }{@code >}
     * {@link JAXBElement }{@code <}{@link DmAAAPAuthorize }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmAAAPMapResource }{@code >}
     * {@link JAXBElement }{@code <}{@link DmAAATransactionPriority }{@code >}
     * {@link JAXBElement }{@code <}{@link DmCryptoHashAlgorithm }{@code >}
     * {@link JAXBElement }{@code <}{@link DmLDAPVersion }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmAAAPAuthenticate }{@code >}
     * {@link JAXBElement }{@code <}{@link DmLogLevel }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmAAAPExtractResource }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmLogLevel }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getUserSummaryOrAuthorizedCounterOrRejectedCounter() {
        if (userSummaryOrAuthorizedCounterOrRejectedCounter == null) {
            userSummaryOrAuthorizedCounterOrRejectedCounter = new ArrayList<JAXBElement<?>>();
        }
        return this.userSummaryOrAuthorizedCounterOrRejectedCounter;
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
