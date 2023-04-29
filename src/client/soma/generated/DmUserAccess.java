
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmUserAccess.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmUserAccess">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="user"/>
 *     &lt;enumeration value="privileged"/>
 *     &lt;enumeration value="group-defined"/>
 *     &lt;enumeration value="technician"/>
 *     &lt;enumeration value="expired"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmUserAccess")
@XmlEnum
public enum DmUserAccess {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("user")
    USER("user"),
    @XmlEnumValue("privileged")
    PRIVILEGED("privileged"),
    @XmlEnumValue("group-defined")
    GROUP_DEFINED("group-defined"),
    @XmlEnumValue("technician")
    TECHNICIAN("technician"),
    @XmlEnumValue("expired")
    EXPIRED("expired");
    private final String value;

    DmUserAccess(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmUserAccess fromValue(String v) {
        for (DmUserAccess c: DmUserAccess.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
