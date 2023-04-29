
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmEncryptionMethod2.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmEncryptionMethod2">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="passphrase"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmEncryptionMethod2")
@XmlEnum
public enum DmEncryptionMethod2 {

    @XmlEnumValue("passphrase")
    PASSPHRASE("passphrase");
    private final String value;

    DmEncryptionMethod2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmEncryptionMethod2 fromValue(String v) {
        for (DmEncryptionMethod2 c: DmEncryptionMethod2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
