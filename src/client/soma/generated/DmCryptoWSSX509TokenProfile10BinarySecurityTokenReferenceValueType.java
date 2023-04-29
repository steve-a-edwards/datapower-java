
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmCryptoWSSX509TokenProfile10BinarySecurityTokenReferenceValueType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmCryptoWSSX509TokenProfile10BinarySecurityTokenReferenceValueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-x509-token-profile-1.0#X509"/>
 *     &lt;enumeration value="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-x509-token-profile-1.0#X509v3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmCryptoWSSX509TokenProfile10BinarySecurityTokenReferenceValueType")
@XmlEnum
public enum DmCryptoWSSX509TokenProfile10BinarySecurityTokenReferenceValueType {

    @XmlEnumValue("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-x509-token-profile-1.0#X509")
    HTTP_DOCS_OASIS_OPEN_ORG_WSS_2004_01_OASIS_200401_WSS_X_509_TOKEN_PROFILE_1_0_X_509("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-x509-token-profile-1.0#X509"),
    @XmlEnumValue("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-x509-token-profile-1.0#X509v3")
    HTTP_DOCS_OASIS_OPEN_ORG_WSS_2004_01_OASIS_200401_WSS_X_509_TOKEN_PROFILE_1_0_X_509_V_3("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-x509-token-profile-1.0#X509v3");
    private final String value;

    DmCryptoWSSX509TokenProfile10BinarySecurityTokenReferenceValueType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmCryptoWSSX509TokenProfile10BinarySecurityTokenReferenceValueType fromValue(String v) {
        for (DmCryptoWSSX509TokenProfile10BinarySecurityTokenReferenceValueType c: DmCryptoWSSX509TokenProfile10BinarySecurityTokenReferenceValueType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
