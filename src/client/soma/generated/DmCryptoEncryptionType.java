
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmCryptoEncryptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmCryptoEncryptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="element"/>
 *     &lt;enumeration value="content"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmCryptoEncryptionType")
@XmlEnum
public enum DmCryptoEncryptionType {

    @XmlEnumValue("element")
    ELEMENT("element"),
    @XmlEnumValue("content")
    CONTENT("content");
    private final String value;

    DmCryptoEncryptionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmCryptoEncryptionType fromValue(String v) {
        for (DmCryptoEncryptionType c: DmCryptoEncryptionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
