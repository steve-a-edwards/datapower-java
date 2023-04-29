
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmFTPPassive.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmFTPPassive">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="allow"/>
 *     &lt;enumeration value="disallow"/>
 *     &lt;enumeration value="require"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmFTPPassive")
@XmlEnum
public enum DmFTPPassive {

    @XmlEnumValue("allow")
    ALLOW("allow"),
    @XmlEnumValue("disallow")
    DISALLOW("disallow"),
    @XmlEnumValue("require")
    REQUIRE("require");
    private final String value;

    DmFTPPassive(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmFTPPassive fromValue(String v) {
        for (DmFTPPassive c: DmFTPPassive.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
