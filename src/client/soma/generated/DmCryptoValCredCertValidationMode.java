
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmCryptoValCredCertValidationMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmCryptoValCredCertValidationMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="legacy"/>
 *     &lt;enumeration value="pkix"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmCryptoValCredCertValidationMode")
@XmlEnum
public enum DmCryptoValCredCertValidationMode {

    @XmlEnumValue("legacy")
    LEGACY("legacy"),
    @XmlEnumValue("pkix")
    PKIX("pkix");
    private final String value;

    DmCryptoValCredCertValidationMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmCryptoValCredCertValidationMode fromValue(String v) {
        for (DmCryptoValCredCertValidationMode c: DmCryptoValCredCertValidationMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
