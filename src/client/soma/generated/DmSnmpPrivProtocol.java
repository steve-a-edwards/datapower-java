
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSnmpPrivProtocol.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSnmpPrivProtocol">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="des"/>
 *     &lt;enumeration value="aes"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSnmpPrivProtocol")
@XmlEnum
public enum DmSnmpPrivProtocol {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("des")
    DES("des"),
    @XmlEnumValue("aes")
    AES("aes");
    private final String value;

    DmSnmpPrivProtocol(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSnmpPrivProtocol fromValue(String v) {
        for (DmSnmpPrivProtocol c: DmSnmpPrivProtocol.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
