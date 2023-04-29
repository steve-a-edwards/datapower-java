
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmLogType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmLogType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="console"/>
 *     &lt;enumeration value="cache"/>
 *     &lt;enumeration value="syslog"/>
 *     &lt;enumeration value="syslog-ng"/>
 *     &lt;enumeration value="smtp"/>
 *     &lt;enumeration value="file"/>
 *     &lt;enumeration value="soap"/>
 *     &lt;enumeration value="snmp"/>
 *     &lt;enumeration value="nfs"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmLogType")
@XmlEnum
public enum DmLogType {

    @XmlEnumValue("console")
    CONSOLE("console"),
    @XmlEnumValue("cache")
    CACHE("cache"),
    @XmlEnumValue("syslog")
    SYSLOG("syslog"),
    @XmlEnumValue("syslog-ng")
    SYSLOG_NG("syslog-ng"),
    @XmlEnumValue("smtp")
    SMTP("smtp"),
    @XmlEnumValue("file")
    FILE("file"),
    @XmlEnumValue("soap")
    SOAP("soap"),
    @XmlEnumValue("snmp")
    SNMP("snmp"),
    @XmlEnumValue("nfs")
    NFS("nfs");
    private final String value;

    DmLogType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmLogType fromValue(String v) {
        for (DmLogType c: DmLogType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
