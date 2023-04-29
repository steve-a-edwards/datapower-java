
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSnmpSecurityLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSnmpSecurityLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="noAuthNoPriv"/>
 *     &lt;enumeration value="authNoPriv"/>
 *     &lt;enumeration value="authPriv"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSnmpSecurityLevel")
@XmlEnum
public enum DmSnmpSecurityLevel {

    @XmlEnumValue("noAuthNoPriv")
    NO_AUTH_NO_PRIV("noAuthNoPriv"),
    @XmlEnumValue("authNoPriv")
    AUTH_NO_PRIV("authNoPriv"),
    @XmlEnumValue("authPriv")
    AUTH_PRIV("authPriv");
    private final String value;

    DmSnmpSecurityLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSnmpSecurityLevel fromValue(String v) {
        for (DmSnmpSecurityLevel c: DmSnmpSecurityLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
