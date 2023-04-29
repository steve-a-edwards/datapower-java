
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSSCKeySourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmWSSCKeySourceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="client-entropy"/>
 *     &lt;enumeration value="in-kerberos"/>
 *     &lt;enumeration value="in-encryptedkey"/>
 *     &lt;enumeration value="static"/>
 *     &lt;enumeration value="random"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmWSSCKeySourceType")
@XmlEnum
public enum DmWSSCKeySourceType {

    @XmlEnumValue("client-entropy")
    CLIENT_ENTROPY("client-entropy"),
    @XmlEnumValue("in-kerberos")
    IN_KERBEROS("in-kerberos"),
    @XmlEnumValue("in-encryptedkey")
    IN_ENCRYPTEDKEY("in-encryptedkey"),
    @XmlEnumValue("static")
    STATIC("static"),
    @XmlEnumValue("random")
    RANDOM("random");
    private final String value;

    DmWSSCKeySourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmWSSCKeySourceType fromValue(String v) {
        for (DmWSSCKeySourceType c: DmWSSCKeySourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
