
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
 * <p>Java class for ModifyEventlog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyEventlog">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ModifyConfigBase">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="UserSummary" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.datapower.com/schemas/management}dmLogType" minOccurs="0"/>
 *         &lt;element name="SoapVersion" type="{http://www.datapower.com/schemas/management}dmSoapVersion" minOccurs="0"/>
 *         &lt;element name="Format" type="{http://www.datapower.com/schemas/management}dmLogFormat" minOccurs="0"/>
 *         &lt;element name="TimestampFormat" type="{http://www.datapower.com/schemas/management}dmLogTimestampFormat" minOccurs="0"/>
 *         &lt;element name="LocalIdentifier" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="EmailAddress" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="SenderAddress" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="SMTPDomain" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Size" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="URL" type="{http://www.datapower.com/schemas/management}dmURL" minOccurs="0"/>
 *         &lt;element name="NFSMount" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="SSLProxyProfile" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="LocalFile" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="NFSFile" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="ArchiveMode" type="{http://www.datapower.com/schemas/management}dmLogFileArchiveMode" minOccurs="0"/>
 *         &lt;element name="UploadMethod" type="{http://www.datapower.com/schemas/management}dmLogFileUploadMethod" minOccurs="0"/>
 *         &lt;element name="Rotate" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="UseANSIColor" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="RemoteAddress" type="{http://www.datapower.com/schemas/management}dmHostname" minOccurs="0"/>
 *         &lt;element name="RemotePort" type="{http://www.datapower.com/schemas/management}dmIPPort" minOccurs="0"/>
 *         &lt;element name="RemoteLogin" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="RemotePassword" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="RemoteDirectory" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="LocalAddress" type="{http://www.datapower.com/schemas/management}dmLocalIPHostAddress" minOccurs="0"/>
 *         &lt;element name="SyslogFacility" type="{http://www.datapower.com/schemas/management}dmSyslogFacility" minOccurs="0"/>
 *         &lt;element name="SigningMode" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="SignAlgorithm" type="{http://www.datapower.com/schemas/management}dmCryptoSignAlgorithm" minOccurs="0"/>
 *         &lt;element name="IdentCredential" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="EncryptMode" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="EncryptAlgorithm" type="{http://www.datapower.com/schemas/management}dmCryptoEncryptAlgorithm" minOccurs="0"/>
 *         &lt;element name="Cert" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="RateLimit" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="FeedbackDetection" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="IdenticalEventSuppression" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="IdenticalEventPeriod" type="{http://www.datapower.com/schemas/management}dmTimeInterval" minOccurs="0"/>
 *         &lt;element name="LogEventCode" type="{http://www.datapower.com/schemas/management}dmEventCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LogEventFilter" type="{http://www.datapower.com/schemas/management}dmEventCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LogObjects" type="{http://www.datapower.com/schemas/management}dmLogObject" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LogIPFilter" type="{http://www.datapower.com/schemas/management}dmLogIPFilter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LogTriggers" type="{http://www.datapower.com/schemas/management}dmLogTrigger" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyEventlog", propOrder = {
    "userSummaryOrTypeOrSoapVersion"
})
@XmlSeeAlso({
    ModifyLogTarget.class
})
public class ModifyEventlog
    extends ModifyConfigBase
{

    @XmlElementRefs({
        @XmlElementRef(name = "LogObjects", type = JAXBElement.class),
        @XmlElementRef(name = "Rotate", type = JAXBElement.class),
        @XmlElementRef(name = "URL", type = JAXBElement.class),
        @XmlElementRef(name = "LogEventCode", type = JAXBElement.class),
        @XmlElementRef(name = "EmailAddress", type = JAXBElement.class),
        @XmlElementRef(name = "NFSFile", type = JAXBElement.class),
        @XmlElementRef(name = "RemotePort", type = JAXBElement.class),
        @XmlElementRef(name = "UserSummary", type = JAXBElement.class),
        @XmlElementRef(name = "LogIPFilter", type = JAXBElement.class),
        @XmlElementRef(name = "SSLProxyProfile", type = JAXBElement.class),
        @XmlElementRef(name = "Type", type = JAXBElement.class),
        @XmlElementRef(name = "SigningMode", type = JAXBElement.class),
        @XmlElementRef(name = "SenderAddress", type = JAXBElement.class),
        @XmlElementRef(name = "RemotePassword", type = JAXBElement.class),
        @XmlElementRef(name = "IdenticalEventSuppression", type = JAXBElement.class),
        @XmlElementRef(name = "LogTriggers", type = JAXBElement.class),
        @XmlElementRef(name = "Format", type = JAXBElement.class),
        @XmlElementRef(name = "IdenticalEventPeriod", type = JAXBElement.class),
        @XmlElementRef(name = "SMTPDomain", type = JAXBElement.class),
        @XmlElementRef(name = "EncryptMode", type = JAXBElement.class),
        @XmlElementRef(name = "NFSMount", type = JAXBElement.class),
        @XmlElementRef(name = "TimestampFormat", type = JAXBElement.class),
        @XmlElementRef(name = "RateLimit", type = JAXBElement.class),
        @XmlElementRef(name = "RemoteLogin", type = JAXBElement.class),
        @XmlElementRef(name = "Size", type = JAXBElement.class),
        @XmlElementRef(name = "EncryptAlgorithm", type = JAXBElement.class),
        @XmlElementRef(name = "FeedbackDetection", type = JAXBElement.class),
        @XmlElementRef(name = "IdentCredential", type = JAXBElement.class),
        @XmlElementRef(name = "SignAlgorithm", type = JAXBElement.class),
        @XmlElementRef(name = "RemoteAddress", type = JAXBElement.class),
        @XmlElementRef(name = "SoapVersion", type = JAXBElement.class),
        @XmlElementRef(name = "ArchiveMode", type = JAXBElement.class),
        @XmlElementRef(name = "UploadMethod", type = JAXBElement.class),
        @XmlElementRef(name = "LogEventFilter", type = JAXBElement.class),
        @XmlElementRef(name = "LocalFile", type = JAXBElement.class),
        @XmlElementRef(name = "Cert", type = JAXBElement.class),
        @XmlElementRef(name = "LocalIdentifier", type = JAXBElement.class),
        @XmlElementRef(name = "SyslogFacility", type = JAXBElement.class),
        @XmlElementRef(name = "LocalAddress", type = JAXBElement.class),
        @XmlElementRef(name = "UseANSIColor", type = JAXBElement.class),
        @XmlElementRef(name = "RemoteDirectory", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> userSummaryOrTypeOrSoapVersion;

    /**
     * Gets the value of the userSummaryOrTypeOrSoapVersion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userSummaryOrTypeOrSoapVersion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserSummaryOrTypeOrSoapVersion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmLogObject }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmLogType }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmLogIPFilter }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmLogFormat }{@code >}
     * {@link JAXBElement }{@code <}{@link DmLogTrigger }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmLogTimestampFormat }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmCryptoEncryptAlgorithm }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmCryptoSignAlgorithm }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmSoapVersion }{@code >}
     * {@link JAXBElement }{@code <}{@link DmLogFileArchiveMode }{@code >}
     * {@link JAXBElement }{@code <}{@link DmLogFileUploadMethod }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmSyslogFacility }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getUserSummaryOrTypeOrSoapVersion() {
        if (userSummaryOrTypeOrSoapVersion == null) {
            userSummaryOrTypeOrSoapVersion = new ArrayList<JAXBElement<?>>();
        }
        return this.userSummaryOrTypeOrSoapVersion;
    }

}
