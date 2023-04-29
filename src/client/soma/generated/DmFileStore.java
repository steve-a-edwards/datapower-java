
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmFileStore.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmFileStore">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="local:"/>
 *     &lt;enumeration value="logtemp:"/>
 *     &lt;enumeration value="logstore:"/>
 *     &lt;enumeration value="temporary:"/>
 *     &lt;enumeration value="export:"/>
 *     &lt;enumeration value="config:"/>
 *     &lt;enumeration value="cert:"/>
 *     &lt;enumeration value="chkpoints:"/>
 *     &lt;enumeration value="dpnfsstatic:"/>
 *     &lt;enumeration value="dpnfsauto:"/>
 *     &lt;enumeration value="ftp-response:"/>
 *     &lt;enumeration value="store:"/>
 *     &lt;enumeration value="pubcert:"/>
 *     &lt;enumeration value="sharedcert:"/>
 *     &lt;enumeration value="dpcert:"/>
 *     &lt;enumeration value="audit:"/>
 *     &lt;enumeration value="image:"/>
 *     &lt;enumeration value="tasktemplates:"/>
 *     &lt;enumeration value="xa35:"/>
 *     &lt;enumeration value="webgui:"/>
 *     &lt;enumeration value="firmware:"/>
 *     &lt;enumeration value="unpack:"/>
 *     &lt;enumeration value="probe:"/>
 *     &lt;enumeration value="kerberos:"/>
 *     &lt;enumeration value="dp:"/>
 *     &lt;enumeration value="meta:"/>
 *     &lt;enumeration value="mappings:"/>
 *     &lt;enumeration value="raid-volume:"/>
 *     &lt;enumeration value="compact-flash:"/>
 *     &lt;enumeration value="iscsi:"/>
 *     &lt;enumeration value="logMQ:"/>
 *     &lt;enumeration value="logMQerror:"/>
 *     &lt;enumeration value="ramdisketc:"/>
 *     &lt;enumeration value="fibre-channel:"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmFileStore")
@XmlEnum
public enum DmFileStore {

    @XmlEnumValue("local:")
    LOCAL("local:"),
    @XmlEnumValue("logtemp:")
    LOGTEMP("logtemp:"),
    @XmlEnumValue("logstore:")
    LOGSTORE("logstore:"),
    @XmlEnumValue("temporary:")
    TEMPORARY("temporary:"),
    @XmlEnumValue("export:")
    EXPORT("export:"),
    @XmlEnumValue("config:")
    CONFIG("config:"),
    @XmlEnumValue("cert:")
    CERT("cert:"),
    @XmlEnumValue("chkpoints:")
    CHKPOINTS("chkpoints:"),
    @XmlEnumValue("dpnfsstatic:")
    DPNFSSTATIC("dpnfsstatic:"),
    @XmlEnumValue("dpnfsauto:")
    DPNFSAUTO("dpnfsauto:"),
    @XmlEnumValue("ftp-response:")
    FTP_RESPONSE("ftp-response:"),
    @XmlEnumValue("store:")
    STORE("store:"),
    @XmlEnumValue("pubcert:")
    PUBCERT("pubcert:"),
    @XmlEnumValue("sharedcert:")
    SHAREDCERT("sharedcert:"),
    @XmlEnumValue("dpcert:")
    DPCERT("dpcert:"),
    @XmlEnumValue("audit:")
    AUDIT("audit:"),
    @XmlEnumValue("image:")
    IMAGE("image:"),
    @XmlEnumValue("tasktemplates:")
    TASKTEMPLATES("tasktemplates:"),
    @XmlEnumValue("xa35:")
    XA_35("xa35:"),
    @XmlEnumValue("webgui:")
    WEBGUI("webgui:"),
    @XmlEnumValue("firmware:")
    FIRMWARE("firmware:"),
    @XmlEnumValue("unpack:")
    UNPACK("unpack:"),
    @XmlEnumValue("probe:")
    PROBE("probe:"),
    @XmlEnumValue("kerberos:")
    KERBEROS("kerberos:"),
    @XmlEnumValue("dp:")
    DP("dp:"),
    @XmlEnumValue("meta:")
    META("meta:"),
    @XmlEnumValue("mappings:")
    MAPPINGS("mappings:"),
    @XmlEnumValue("raid-volume:")
    RAID_VOLUME("raid-volume:"),
    @XmlEnumValue("compact-flash:")
    COMPACT_FLASH("compact-flash:"),
    @XmlEnumValue("iscsi:")
    ISCSI("iscsi:"),
    @XmlEnumValue("logMQ:")
    LOG_MQ("logMQ:"),
    @XmlEnumValue("logMQerror:")
    LOG_M_QERROR("logMQerror:"),
    @XmlEnumValue("ramdisketc:")
    RAMDISKETC("ramdisketc:"),
    @XmlEnumValue("fibre-channel:")
    FIBRE_CHANNEL("fibre-channel:");
    private final String value;

    DmFileStore(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmFileStore fromValue(String v) {
        for (DmFileStore c: DmFileStore.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
