
package client.soma.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigFTPDemonSourceProtocolHandler complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigFTPDemonSourceProtocolHandler">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ConfigSourceProtocolHandler">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="UserSummary" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="LocalAddress" type="{http://www.datapower.com/schemas/management}dmLocalIPHostAddress"/>
 *         &lt;element name="LocalPort" type="{http://www.datapower.com/schemas/management}dmIPPort"/>
 *         &lt;element name="FilesystemType" type="{http://www.datapower.com/schemas/management}dmFTPFilesystemType" minOccurs="0"/>
 *         &lt;element name="PersistentFilesystemTimeout" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="VirtualDirectories" type="{http://www.datapower.com/schemas/management}dmFTPServerVirtualDirectory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DefaultDirectory" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="MaxFilenameLength" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="ACL" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="RequireTLS" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="SSLProxy" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="PasswordAAAPolicy" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="CertificateAAAPolicy" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="AllowCCC" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="Passive" type="{http://www.datapower.com/schemas/management}dmFTPPassive" minOccurs="0"/>
 *         &lt;element name="UsePasvPortRange" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="PasvMinPort" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="PasvMaxPort" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="PasvIdleTimeOut" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="DisablePASVIPCheck" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="DisablePORTIPCheck" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="UseAlternatePASVAddr" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="AlternatePASVAddr" type="{http://www.datapower.com/schemas/management}dmIPHostAddress" minOccurs="0"/>
 *         &lt;element name="AllowLISTCmd" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="AllowDELECmd" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="DataEncryption" type="{http://www.datapower.com/schemas/management}dmFTPDataEncryption" minOccurs="0"/>
 *         &lt;element name="AllowCompression" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="AllowSTOU" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="UniqueFilenamePrefix" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="AllowREST" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="RestartTimeout" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="IdleTimeout" type="{http://www.datapower.com/schemas/management}dmTimeInterval" minOccurs="0"/>
 *         &lt;element name="ResponseType" type="{http://www.datapower.com/schemas/management}dmFTPResponseType" minOccurs="0"/>
 *         &lt;element name="ResponseStorage" type="{http://www.datapower.com/schemas/management}dmFTPResponseStorage" minOccurs="0"/>
 *         &lt;element name="TemporaryStorageSize" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="ResponseNFSMount" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="ResponseSuffix" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigFTPDemonSourceProtocolHandler", propOrder = {
    "userSummaryOrLocalAddressOrLocalPort"
})
@XmlSeeAlso({
    ConfigFTPServerSourceProtocolHandler.class
})
public class ConfigFTPDemonSourceProtocolHandler
    extends ConfigSourceProtocolHandler
{

    @XmlElementRefs({
        @XmlElementRef(name = "PasvIdleTimeOut", type = JAXBElement.class),
        @XmlElementRef(name = "SSLProxy", type = JAXBElement.class),
        @XmlElementRef(name = "AllowSTOU", type = JAXBElement.class),
        @XmlElementRef(name = "AllowREST", type = JAXBElement.class),
        @XmlElementRef(name = "MaxFilenameLength", type = JAXBElement.class),
        @XmlElementRef(name = "PasvMinPort", type = JAXBElement.class),
        @XmlElementRef(name = "RequireTLS", type = JAXBElement.class),
        @XmlElementRef(name = "AllowDELECmd", type = JAXBElement.class),
        @XmlElementRef(name = "DefaultDirectory", type = JAXBElement.class),
        @XmlElementRef(name = "UserSummary", type = JAXBElement.class),
        @XmlElementRef(name = "DataEncryption", type = JAXBElement.class),
        @XmlElementRef(name = "IdleTimeout", type = JAXBElement.class),
        @XmlElementRef(name = "TemporaryStorageSize", type = JAXBElement.class),
        @XmlElementRef(name = "VirtualDirectories", type = JAXBElement.class),
        @XmlElementRef(name = "FilesystemType", type = JAXBElement.class),
        @XmlElementRef(name = "AllowCCC", type = JAXBElement.class),
        @XmlElementRef(name = "ResponseType", type = JAXBElement.class),
        @XmlElementRef(name = "UniqueFilenamePrefix", type = JAXBElement.class),
        @XmlElementRef(name = "Passive", type = JAXBElement.class),
        @XmlElementRef(name = "LocalPort", type = JAXBElement.class),
        @XmlElementRef(name = "PasswordAAAPolicy", type = JAXBElement.class),
        @XmlElementRef(name = "AllowCompression", type = JAXBElement.class),
        @XmlElementRef(name = "ResponseSuffix", type = JAXBElement.class),
        @XmlElementRef(name = "ACL", type = JAXBElement.class),
        @XmlElementRef(name = "AllowLISTCmd", type = JAXBElement.class),
        @XmlElementRef(name = "DisablePASVIPCheck", type = JAXBElement.class),
        @XmlElementRef(name = "ResponseNFSMount", type = JAXBElement.class),
        @XmlElementRef(name = "UsePasvPortRange", type = JAXBElement.class),
        @XmlElementRef(name = "RestartTimeout", type = JAXBElement.class),
        @XmlElementRef(name = "DisablePORTIPCheck", type = JAXBElement.class),
        @XmlElementRef(name = "PasvMaxPort", type = JAXBElement.class),
        @XmlElementRef(name = "LocalAddress", type = JAXBElement.class),
        @XmlElementRef(name = "ResponseStorage", type = JAXBElement.class),
        @XmlElementRef(name = "CertificateAAAPolicy", type = JAXBElement.class),
        @XmlElementRef(name = "PersistentFilesystemTimeout", type = JAXBElement.class),
        @XmlElementRef(name = "UseAlternatePASVAddr", type = JAXBElement.class),
        @XmlElementRef(name = "AlternatePASVAddr", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> userSummaryOrLocalAddressOrLocalPort;

    /**
     * Gets the value of the userSummaryOrLocalAddressOrLocalPort property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userSummaryOrLocalAddressOrLocalPort property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserSummaryOrLocalAddressOrLocalPort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmFTPDataEncryption }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmFTPServerVirtualDirectory }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmFTPResponseType }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmFTPFilesystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmFTPPassive }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link DmFTPResponseStorage }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getUserSummaryOrLocalAddressOrLocalPort() {
        if (userSummaryOrLocalAddressOrLocalPort == null) {
            userSummaryOrLocalAddressOrLocalPort = new ArrayList<JAXBElement<?>>();
        }
        return this.userSummaryOrLocalAddressOrLocalPort;
    }

}
