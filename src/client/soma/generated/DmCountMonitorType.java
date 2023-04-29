
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmCountMonitorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmCountMonitorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="requests"/>
 *     &lt;enumeration value="responses"/>
 *     &lt;enumeration value="xpath"/>
 *     &lt;enumeration value="errors"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmCountMonitorType")
@XmlEnum
public enum DmCountMonitorType {

    @XmlEnumValue("requests")
    REQUESTS("requests"),
    @XmlEnumValue("responses")
    RESPONSES("responses"),
    @XmlEnumValue("xpath")
    XPATH("xpath"),
    @XmlEnumValue("errors")
    ERRORS("errors");
    private final String value;

    DmCountMonitorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmCountMonitorType fromValue(String v) {
        for (DmCountMonitorType c: DmCountMonitorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
