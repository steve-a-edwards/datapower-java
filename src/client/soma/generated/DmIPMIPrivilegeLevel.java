
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmIPMIPrivilegeLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmIPMIPrivilegeLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="callback"/>
 *     &lt;enumeration value="user"/>
 *     &lt;enumeration value="operator"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmIPMIPrivilegeLevel")
@XmlEnum
public enum DmIPMIPrivilegeLevel {

    @XmlEnumValue("callback")
    CALLBACK("callback"),
    @XmlEnumValue("user")
    USER("user"),
    @XmlEnumValue("operator")
    OPERATOR("operator");
    private final String value;

    DmIPMIPrivilegeLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmIPMIPrivilegeLevel fromValue(String v) {
        for (DmIPMIPrivilegeLevel c: DmIPMIPrivilegeLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
