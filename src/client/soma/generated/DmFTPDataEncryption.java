
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmFTPDataEncryption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmFTPDataEncryption">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="disallow"/>
 *     &lt;enumeration value="allow"/>
 *     &lt;enumeration value="require"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmFTPDataEncryption")
@XmlEnum
public enum DmFTPDataEncryption {

    @XmlEnumValue("disallow")
    DISALLOW("disallow"),
    @XmlEnumValue("allow")
    ALLOW("allow"),
    @XmlEnumValue("require")
    REQUIRE("require");
    private final String value;

    DmFTPDataEncryption(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmFTPDataEncryption fromValue(String v) {
        for (DmFTPDataEncryption c: DmFTPDataEncryption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
