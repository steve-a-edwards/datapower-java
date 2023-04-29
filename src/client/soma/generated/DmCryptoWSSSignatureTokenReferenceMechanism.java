
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmCryptoWSSSignatureTokenReferenceMechanism.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmCryptoWSSSignatureTokenReferenceMechanism">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Direct"/>
 *     &lt;enumeration value="KeyIdentifier"/>
 *     &lt;enumeration value="ThumbPrintSHA1"/>
 *     &lt;enumeration value="ThumbprintSHA1"/>
 *     &lt;enumeration value="X509IssuerSerial"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmCryptoWSSSignatureTokenReferenceMechanism")
@XmlEnum
public enum DmCryptoWSSSignatureTokenReferenceMechanism {

    @XmlEnumValue("Direct")
    DIRECT("Direct"),
    @XmlEnumValue("KeyIdentifier")
    KEY_IDENTIFIER("KeyIdentifier"),
    @XmlEnumValue("ThumbPrintSHA1")
    THUMB_PRINT_SHA_1("ThumbPrintSHA1"),
    @XmlEnumValue("ThumbprintSHA1")
    THUMBPRINT_SHA_1("ThumbprintSHA1"),
    @XmlEnumValue("X509IssuerSerial")
    X_509_ISSUER_SERIAL("X509IssuerSerial");
    private final String value;

    DmCryptoWSSSignatureTokenReferenceMechanism(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmCryptoWSSSignatureTokenReferenceMechanism fromValue(String v) {
        for (DmCryptoWSSSignatureTokenReferenceMechanism c: DmCryptoWSSSignatureTokenReferenceMechanism.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
