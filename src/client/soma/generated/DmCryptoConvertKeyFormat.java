
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmCryptoConvertKeyFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmCryptoConvertKeyFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="openssh-pubkey"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmCryptoConvertKeyFormat")
@XmlEnum
public enum DmCryptoConvertKeyFormat {

    @XmlEnumValue("openssh-pubkey")
    OPENSSH_PUBKEY("openssh-pubkey");
    private final String value;

    DmCryptoConvertKeyFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmCryptoConvertKeyFormat fromValue(String v) {
        for (DmCryptoConvertKeyFormat c: DmCryptoConvertKeyFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
