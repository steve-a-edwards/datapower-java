
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmURLProtocol.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmURLProtocol">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="attachment"/>
 *     &lt;enumeration value="cid"/>
 *     &lt;enumeration value="coproc"/>
 *     &lt;enumeration value="dpmq"/>
 *     &lt;enumeration value="dpmqfte"/>
 *     &lt;enumeration value="mq"/>
 *     &lt;enumeration value="mqfte"/>
 *     &lt;enumeration value="dpnfs"/>
 *     &lt;enumeration value="dptibems"/>
 *     &lt;enumeration value="tibems"/>
 *     &lt;enumeration value="dpwasjms"/>
 *     &lt;enumeration value="file"/>
 *     &lt;enumeration value="ftp"/>
 *     &lt;enumeration value="http"/>
 *     &lt;enumeration value="https"/>
 *     &lt;enumeration value="icap"/>
 *     &lt;enumeration value="icaps"/>
 *     &lt;enumeration value="smtp"/>
 *     &lt;enumeration value="snmp"/>
 *     &lt;enumeration value="sql"/>
 *     &lt;enumeration value="thismessage"/>
 *     &lt;enumeration value="tcp"/>
 *     &lt;enumeration value="tcps"/>
 *     &lt;enumeration value="tcpssl"/>
 *     &lt;enumeration value="tcpsssl"/>
 *     &lt;enumeration value="uuid"/>
 *     &lt;enumeration value="webgui"/>
 *     &lt;enumeration value="wsrr"/>
 *     &lt;enumeration value="xa35"/>
 *     &lt;enumeration value="xacmlpolicy"/>
 *     &lt;enumeration value="local"/>
 *     &lt;enumeration value="store"/>
 *     &lt;enumeration value="temporary"/>
 *     &lt;enumeration value="syslog"/>
 *     &lt;enumeration value="syslog-tcp"/>
 *     &lt;enumeration value="syslog-tcpssl"/>
 *     &lt;enumeration value="dpims"/>
 *     &lt;enumeration value="dpimsssl"/>
 *     &lt;enumeration value="sftp"/>
 *     &lt;enumeration value="saf-cert"/>
 *     &lt;enumeration value="saf-key"/>
 *     &lt;enumeration value="saf-remote-key"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmURLProtocol")
@XmlEnum
public enum DmURLProtocol {

    @XmlEnumValue("attachment")
    ATTACHMENT("attachment"),
    @XmlEnumValue("cid")
    CID("cid"),
    @XmlEnumValue("coproc")
    COPROC("coproc"),
    @XmlEnumValue("dpmq")
    DPMQ("dpmq"),
    @XmlEnumValue("dpmqfte")
    DPMQFTE("dpmqfte"),
    @XmlEnumValue("mq")
    MQ("mq"),
    @XmlEnumValue("mqfte")
    MQFTE("mqfte"),
    @XmlEnumValue("dpnfs")
    DPNFS("dpnfs"),
    @XmlEnumValue("dptibems")
    DPTIBEMS("dptibems"),
    @XmlEnumValue("tibems")
    TIBEMS("tibems"),
    @XmlEnumValue("dpwasjms")
    DPWASJMS("dpwasjms"),
    @XmlEnumValue("file")
    FILE("file"),
    @XmlEnumValue("ftp")
    FTP("ftp"),
    @XmlEnumValue("http")
    HTTP("http"),
    @XmlEnumValue("https")
    HTTPS("https"),
    @XmlEnumValue("icap")
    ICAP("icap"),
    @XmlEnumValue("icaps")
    ICAPS("icaps"),
    @XmlEnumValue("smtp")
    SMTP("smtp"),
    @XmlEnumValue("snmp")
    SNMP("snmp"),
    @XmlEnumValue("sql")
    SQL("sql"),
    @XmlEnumValue("thismessage")
    THISMESSAGE("thismessage"),
    @XmlEnumValue("tcp")
    TCP("tcp"),
    @XmlEnumValue("tcps")
    TCPS("tcps"),
    @XmlEnumValue("tcpssl")
    TCPSSL("tcpssl"),
    @XmlEnumValue("tcpsssl")
    TCPSSSL("tcpsssl"),
    @XmlEnumValue("uuid")
    UUID("uuid"),
    @XmlEnumValue("webgui")
    WEBGUI("webgui"),
    @XmlEnumValue("wsrr")
    WSRR("wsrr"),
    @XmlEnumValue("xa35")
    XA_35("xa35"),
    @XmlEnumValue("xacmlpolicy")
    XACMLPOLICY("xacmlpolicy"),
    @XmlEnumValue("local")
    LOCAL("local"),
    @XmlEnumValue("store")
    STORE("store"),
    @XmlEnumValue("temporary")
    TEMPORARY("temporary"),
    @XmlEnumValue("syslog")
    SYSLOG("syslog"),
    @XmlEnumValue("syslog-tcp")
    SYSLOG_TCP("syslog-tcp"),
    @XmlEnumValue("syslog-tcpssl")
    SYSLOG_TCPSSL("syslog-tcpssl"),
    @XmlEnumValue("dpims")
    DPIMS("dpims"),
    @XmlEnumValue("dpimsssl")
    DPIMSSSL("dpimsssl"),
    @XmlEnumValue("sftp")
    SFTP("sftp"),
    @XmlEnumValue("saf-cert")
    SAF_CERT("saf-cert"),
    @XmlEnumValue("saf-key")
    SAF_KEY("saf-key"),
    @XmlEnumValue("saf-remote-key")
    SAF_REMOTE_KEY("saf-remote-key");
    private final String value;

    DmURLProtocol(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmURLProtocol fromValue(String v) {
        for (DmURLProtocol c: DmURLProtocol.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
