
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSMTPAuth.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSMTPAuth">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="plain"/>
 *     &lt;enumeration value="login"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSMTPAuth")
@XmlEnum
public enum DmSMTPAuth {

    @XmlEnumValue("plain")
    PLAIN("plain"),
    @XmlEnumValue("login")
    LOGIN("login");
    private final String value;

    DmSMTPAuth(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSMTPAuth fromValue(String v) {
        for (DmSMTPAuth c: DmSMTPAuth.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
