
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmPOPAuthMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmPOPAuthMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="basic"/>
 *     &lt;enumeration value="apop"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmPOPAuthMethod")
@XmlEnum
public enum DmPOPAuthMethod {

    @XmlEnumValue("basic")
    BASIC("basic"),
    @XmlEnumValue("apop")
    APOP("apop");
    private final String value;

    DmPOPAuthMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmPOPAuthMethod fromValue(String v) {
        for (DmPOPAuthMethod c: DmPOPAuthMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
