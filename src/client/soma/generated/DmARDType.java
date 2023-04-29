
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmARDType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmARDType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="allow"/>
 *     &lt;enumeration value="require"/>
 *     &lt;enumeration value="deny"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmARDType")
@XmlEnum
public enum DmARDType {

    @XmlEnumValue("allow")
    ALLOW("allow"),
    @XmlEnumValue("require")
    REQUIRE("require"),
    @XmlEnumValue("deny")
    DENY("deny");
    private final String value;

    DmARDType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmARDType fromValue(String v) {
        for (DmARDType c: DmARDType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
