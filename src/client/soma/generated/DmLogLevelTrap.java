
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmLogLevelTrap.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmLogLevelTrap">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="emerg"/>
 *     &lt;enumeration value="alert"/>
 *     &lt;enumeration value="critic"/>
 *     &lt;enumeration value="error"/>
 *     &lt;enumeration value="warn"/>
 *     &lt;enumeration value="notice"/>
 *     &lt;enumeration value="info"/>
 *     &lt;enumeration value="debug"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmLogLevelTrap")
@XmlEnum
public enum DmLogLevelTrap {

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
    DEBUG("debug");
    private final String value;

    DmLogLevelTrap(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmLogLevelTrap fromValue(String v) {
        for (DmLogLevelTrap c: DmLogLevelTrap.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
