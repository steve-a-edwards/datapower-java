
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmErrorReportReason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmErrorReportReason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="crash"/>
 *     &lt;enumeration value="watchdog"/>
 *     &lt;enumeration value="low-memory"/>
 *     &lt;enumeration value="low-descriptor"/>
 *     &lt;enumeration value="user-requested"/>
 *     &lt;enumeration value="on-startup"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmErrorReportReason")
@XmlEnum
public enum DmErrorReportReason {

    @XmlEnumValue("crash")
    CRASH("crash"),
    @XmlEnumValue("watchdog")
    WATCHDOG("watchdog"),
    @XmlEnumValue("low-memory")
    LOW_MEMORY("low-memory"),
    @XmlEnumValue("low-descriptor")
    LOW_DESCRIPTOR("low-descriptor"),
    @XmlEnumValue("user-requested")
    USER_REQUESTED("user-requested"),
    @XmlEnumValue("on-startup")
    ON_STARTUP("on-startup"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    DmErrorReportReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmErrorReportReason fromValue(String v) {
        for (DmErrorReportReason c: DmErrorReportReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
