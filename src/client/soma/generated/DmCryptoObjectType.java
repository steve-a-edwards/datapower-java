
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmCryptoObjectType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmCryptoObjectType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="key"/>
 *     &lt;enumeration value="cert"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmCryptoObjectType")
@XmlEnum
public enum DmCryptoObjectType {

    @XmlEnumValue("key")
    KEY("key"),
    @XmlEnumValue("cert")
    CERT("cert");
    private final String value;

    DmCryptoObjectType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmCryptoObjectType fromValue(String v) {
        for (DmCryptoObjectType c: DmCryptoObjectType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
