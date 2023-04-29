
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmCryptoWSSX509TokenType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmCryptoWSSX509TokenType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="X509"/>
 *     &lt;enumeration value="PKCS7"/>
 *     &lt;enumeration value="PKIPath"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmCryptoWSSX509TokenType")
@XmlEnum
public enum DmCryptoWSSX509TokenType {

    @XmlEnumValue("X509")
    X_509("X509"),
    @XmlEnumValue("PKCS7")
    PKCS_7("PKCS7"),
    @XmlEnumValue("PKIPath")
    PKI_PATH("PKIPath");
    private final String value;

    DmCryptoWSSX509TokenType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmCryptoWSSX509TokenType fromValue(String v) {
        for (DmCryptoWSSX509TokenType c: DmCryptoWSSX509TokenType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
