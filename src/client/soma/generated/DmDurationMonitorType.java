
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmDurationMonitorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmDurationMonitorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="messages"/>
 *     &lt;enumeration value="requests"/>
 *     &lt;enumeration value="server"/>
 *     &lt;enumeration value="responses"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmDurationMonitorType")
@XmlEnum
public enum DmDurationMonitorType {

    @XmlEnumValue("messages")
    MESSAGES("messages"),
    @XmlEnumValue("requests")
    REQUESTS("requests"),
    @XmlEnumValue("server")
    SERVER("server"),
    @XmlEnumValue("responses")
    RESPONSES("responses");
    private final String value;

    DmDurationMonitorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmDurationMonitorType fromValue(String v) {
        for (DmDurationMonitorType c: DmDurationMonitorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
