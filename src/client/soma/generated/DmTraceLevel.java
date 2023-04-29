
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmTraceLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmTraceLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="emerg"/>
 *     &lt;enumeration value="alert"/>
 *     &lt;enumeration value="critic"/>
 *     &lt;enumeration value="error"/>
 *     &lt;enumeration value="warn"/>
 *     &lt;enumeration value="notice"/>
 *     &lt;enumeration value="info"/>
 *     &lt;enumeration value="debug"/>
 *     &lt;enumeration value="debug1"/>
 *     &lt;enumeration value="debug2"/>
 *     &lt;enumeration value="debug3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmTraceLevel")
@XmlEnum
public enum DmTraceLevel {

    @XmlEnumValue("emerg")
    EMERG("emerg"),
    @XmlEnumValue("alert")
    ALERT("alert"),
    @XmlEnumValue("critic")
    CRITIC("critic"),
    @XmlEnumValue("error")
    ERROR("error"),
    @XmlEnumValue("warn")
    WARN("warn"),
    @XmlEnumValue("notice")
    NOTICE("notice"),
    @XmlEnumValue("info")
    INFO("info"),
    @XmlEnumValue("debug")
    DEBUG("debug"),
    @XmlEnumValue("debug1")
    DEBUG_1("debug1"),
    @XmlEnumValue("debug2")
    DEBUG_2("debug2"),
    @XmlEnumValue("debug3")
    DEBUG_3("debug3");
    private final String value;

    DmTraceLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmTraceLevel fromValue(String v) {
        for (DmTraceLevel c: DmTraceLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
