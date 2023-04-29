
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmEncryptionMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmEncryptionMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="internal"/>
 *     &lt;enumeration value="passphrase"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmEncryptionMethod")
@XmlEnum
public enum DmEncryptionMethod {

    @XmlEnumValue("internal")
    INTERNAL("internal"),
    @XmlEnumValue("passphrase")
    PASSPHRASE("passphrase");
    private final String value;

    DmEncryptionMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmEncryptionMethod fromValue(String v) {
        for (DmEncryptionMethod c: DmEncryptionMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
