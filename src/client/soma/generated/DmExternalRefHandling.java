
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmExternalRefHandling.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmExternalRefHandling">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="forbid"/>
 *     &lt;enumeration value="ignore"/>
 *     &lt;enumeration value="allow"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmExternalRefHandling")
@XmlEnum
public enum DmExternalRefHandling {

    @XmlEnumValue("forbid")
    FORBID("forbid"),
    @XmlEnumValue("ignore")
    IGNORE("ignore"),
    @XmlEnumValue("allow")
    ALLOW("allow");
    private final String value;

    DmExternalRefHandling(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmExternalRefHandling fromValue(String v) {
        for (DmExternalRefHandling c: DmExternalRefHandling.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
