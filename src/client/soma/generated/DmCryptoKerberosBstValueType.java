
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmCryptoKerberosBstValueType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmCryptoKerberosBstValueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="http://docs.oasis-open.org/wss/oasis-wss-kerberos-token-profile-1.1#Kerberosv5_AP_REQ"/>
 *     &lt;enumeration value="http://docs.oasis-open.org/wss/oasis-wss-kerberos-token-profile-1.1#GSS_Kerberosv5_AP_REQ"/>
 *     &lt;enumeration value="http://docs.oasis-open.org/wss/oasis-wss-kerberos-token-profile-1.1#Kerberosv5_AP_REQ1510"/>
 *     &lt;enumeration value="http://docs.oasis-open.org/wss/oasis-wss-kerberos-token-profile-1.1#GSS_Kerberosv5_AP_REQ1510"/>
 *     &lt;enumeration value="http://docs.oasis-open.org/wss/oasis-wss-kerberos-token-profile-1.1#Kerberosv5_AP_REQ4120"/>
 *     &lt;enumeration value="http://docs.oasis-open.org/wss/oasis-wss-kerberos-token-profile-1.1#GSS_Kerberosv5_AP_REQ4120"/>
 *     &lt;enumeration value="http://docs.oasis-open.org/wss/2005/xx/oasis-2005xx-wss-kerberos-token-profile-1.1#Kerberosv5_AP_REQ"/>
 *     &lt;enumeration value="http://docs.oasis-open.org/wss/2005/xx/oasis-2005xx-wss-kerberos-token-profile-1.1#GSS_Kerberosv5_AP_REQ"/>
 *     &lt;enumeration value="http://www.docs.oasis-open.org/wss/2004/07/oasis-000000-wss-kerberos-token-profile-1.0#Kerberosv5_AP_REQ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmCryptoKerberosBstValueType")
@XmlEnum
public enum DmCryptoKerberosBstValueType {

    @XmlEnumValue("http://docs.oasis-open.org/wss/oasis-wss-kerberos-token-profile-1.1#Kerberosv5_AP_REQ")
    HTTP_DOCS_OASIS_OPEN_ORG_WSS_OASIS_WSS_KERBEROS_TOKEN_PROFILE_1_1_KERBEROSV_5_AP_REQ("http://docs.oasis-open.org/wss/oasis-wss-kerberos-token-profile-1.1#Kerberosv5_AP_REQ"),
    @XmlEnumValue("http://docs.oasis-open.org/wss/oasis-wss-kerberos-token-profile-1.1#GSS_Kerberosv5_AP_REQ")
    HTTP_DOCS_OASIS_OPEN_ORG_WSS_OASIS_WSS_KERBEROS_TOKEN_PROFILE_1_1_GSS_KERBEROSV_5_AP_REQ("http://docs.oasis-open.org/wss/oasis-wss-kerberos-token-profile-1.1#GSS_Kerberosv5_AP_REQ"),
    @XmlEnumValue("http://docs.oasis-open.org/wss/oasis-wss-kerberos-token-profile-1.1#Kerberosv5_AP_REQ1510")
    HTTP_DOCS_OASIS_OPEN_ORG_WSS_OASIS_WSS_KERBEROS_TOKEN_PROFILE_1_1_KERBEROSV_5_AP_REQ_1510("http://docs.oasis-open.org/wss/oasis-wss-kerberos-token-profile-1.1#Kerberosv5_AP_REQ1510"),
    @XmlEnumValue("http://docs.oasis-open.org/wss/oasis-wss-kerberos-token-profile-1.1#GSS_Kerberosv5_AP_REQ1510")
    HTTP_DOCS_OASIS_OPEN_ORG_WSS_OASIS_WSS_KERBEROS_TOKEN_PROFILE_1_1_GSS_KERBEROSV_5_AP_REQ_1510("http://docs.oasis-open.org/wss/oasis-wss-kerberos-token-profile-1.1#GSS_Kerberosv5_AP_REQ1510"),
    @XmlEnumValue("http://docs.oasis-open.org/wss/oasis-wss-kerberos-token-profile-1.1#Kerberosv5_AP_REQ4120")
    HTTP_DOCS_OASIS_OPEN_ORG_WSS_OASIS_WSS_KERBEROS_TOKEN_PROFILE_1_1_KERBEROSV_5_AP_REQ_4120("http://docs.oasis-open.org/wss/oasis-wss-kerberos-token-profile-1.1#Kerberosv5_AP_REQ4120"),
    @XmlEnumValue("http://docs.oasis-open.org/wss/oasis-wss-kerberos-token-profile-1.1#GSS_Kerberosv5_AP_REQ4120")
    HTTP_DOCS_OASIS_OPEN_ORG_WSS_OASIS_WSS_KERBEROS_TOKEN_PROFILE_1_1_GSS_KERBEROSV_5_AP_REQ_4120("http://docs.oasis-open.org/wss/oasis-wss-kerberos-token-profile-1.1#GSS_Kerberosv5_AP_REQ4120"),
    @XmlEnumValue("http://docs.oasis-open.org/wss/2005/xx/oasis-2005xx-wss-kerberos-token-profile-1.1#Kerberosv5_AP_REQ")
    HTTP_DOCS_OASIS_OPEN_ORG_WSS_2005_XX_OASIS_2005_XX_WSS_KERBEROS_TOKEN_PROFILE_1_1_KERBEROSV_5_AP_REQ("http://docs.oasis-open.org/wss/2005/xx/oasis-2005xx-wss-kerberos-token-profile-1.1#Kerberosv5_AP_REQ"),
    @XmlEnumValue("http://docs.oasis-open.org/wss/2005/xx/oasis-2005xx-wss-kerberos-token-profile-1.1#GSS_Kerberosv5_AP_REQ")
    HTTP_DOCS_OASIS_OPEN_ORG_WSS_2005_XX_OASIS_2005_XX_WSS_KERBEROS_TOKEN_PROFILE_1_1_GSS_KERBEROSV_5_AP_REQ("http://docs.oasis-open.org/wss/2005/xx/oasis-2005xx-wss-kerberos-token-profile-1.1#GSS_Kerberosv5_AP_REQ"),
    @XmlEnumValue("http://www.docs.oasis-open.org/wss/2004/07/oasis-000000-wss-kerberos-token-profile-1.0#Kerberosv5_AP_REQ")
    HTTP_WWW_DOCS_OASIS_OPEN_ORG_WSS_2004_07_OASIS_000000_WSS_KERBEROS_TOKEN_PROFILE_1_0_KERBEROSV_5_AP_REQ("http://www.docs.oasis-open.org/wss/2004/07/oasis-000000-wss-kerberos-token-profile-1.0#Kerberosv5_AP_REQ");
    private final String value;

    DmCryptoKerberosBstValueType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmCryptoKerberosBstValueType fromValue(String v) {
        for (DmCryptoKerberosBstValueType c: DmCryptoKerberosBstValueType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
