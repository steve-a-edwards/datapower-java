
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmCryptoConvertCertificateFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmCryptoConvertCertificateFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="openssh-pubkey"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmCryptoConvertCertificateFormat")
@XmlEnum
public enum DmCryptoConvertCertificateFormat {

    @XmlEnumValue("openssh-pubkey")
    OPENSSH_PUBKEY("openssh-pubkey");
    private final String value;

    DmCryptoConvertCertificateFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmCryptoConvertCertificateFormat fromValue(String v) {
        for (DmCryptoConvertCertificateFormat c: DmCryptoConvertCertificateFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
