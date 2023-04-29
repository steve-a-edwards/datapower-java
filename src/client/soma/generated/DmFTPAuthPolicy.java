
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmFTPAuthPolicy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmFTPAuthPolicy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="auth-off"/>
 *     &lt;enumeration value="auth-tls-opt"/>
 *     &lt;enumeration value="auth-tls-req"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmFTPAuthPolicy")
@XmlEnum
public enum DmFTPAuthPolicy {

    @XmlEnumValue("auth-off")
    AUTH_OFF("auth-off"),
    @XmlEnumValue("auth-tls-opt")
    AUTH_TLS_OPT("auth-tls-opt"),
    @XmlEnumValue("auth-tls-req")
    AUTH_TLS_REQ("auth-tls-req");
    private final String value;

    DmFTPAuthPolicy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmFTPAuthPolicy fromValue(String v) {
        for (DmFTPAuthPolicy c: DmFTPAuthPolicy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
