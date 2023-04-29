
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmConformanceReportLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmConformanceReportLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="never"/>
 *     &lt;enumeration value="failure"/>
 *     &lt;enumeration value="warning"/>
 *     &lt;enumeration value="always"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmConformanceReportLevel")
@XmlEnum
public enum DmConformanceReportLevel {

    @XmlEnumValue("never")
    NEVER("never"),
    @XmlEnumValue("failure")
    FAILURE("failure"),
    @XmlEnumValue("warning")
    WARNING("warning"),
    @XmlEnumValue("always")
    ALWAYS("always");
    private final String value;

    DmConformanceReportLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmConformanceReportLevel fromValue(String v) {
        for (DmConformanceReportLevel c: DmConformanceReportLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
