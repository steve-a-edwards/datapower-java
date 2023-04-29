
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmCryptoWSSX509TokenProfile10KeyIdentifierValueType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmCryptoWSSX509TokenProfile10KeyIdentifierValueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-x509-token-profile-1.0#X509v3SubjectKeyIdentifier"/>
 *     &lt;enumeration value="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-x509-token-profile-1.0#X509SubjectKeyIdentifier"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmCryptoWSSX509TokenProfile10KeyIdentifierValueType")
@XmlEnum
public enum DmCryptoWSSX509TokenProfile10KeyIdentifierValueType {

    @XmlEnumValue("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-x509-token-profile-1.0#X509v3SubjectKeyIdentifier")
    HTTP_DOCS_OASIS_OPEN_ORG_WSS_2004_01_OASIS_200401_WSS_X_509_TOKEN_PROFILE_1_0_X_509_V_3_SUBJECT_KEY_IDENTIFIER("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-x509-token-profile-1.0#X509v3SubjectKeyIdentifier"),
    @XmlEnumValue("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-x509-token-profile-1.0#X509SubjectKeyIdentifier")
    HTTP_DOCS_OASIS_OPEN_ORG_WSS_2004_01_OASIS_200401_WSS_X_509_TOKEN_PROFILE_1_0_X_509_SUBJECT_KEY_IDENTIFIER("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-x509-token-profile-1.0#X509SubjectKeyIdentifier");
    private final String value;

    DmCryptoWSSX509TokenProfile10KeyIdentifierValueType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmCryptoWSSX509TokenProfile10KeyIdentifierValueType fromValue(String v) {
        for (DmCryptoWSSX509TokenProfile10KeyIdentifierValueType c: DmCryptoWSSX509TokenProfile10KeyIdentifierValueType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
