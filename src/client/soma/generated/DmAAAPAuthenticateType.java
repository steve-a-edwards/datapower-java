
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmAAAPAuthenticateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmAAAPAuthenticateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="xmlfile"/>
 *     &lt;enumeration value="ldap"/>
 *     &lt;enumeration value="tivoli"/>
 *     &lt;enumeration value="netegrity"/>
 *     &lt;enumeration value="oblix"/>
 *     &lt;enumeration value="cleartrust"/>
 *     &lt;enumeration value="radius"/>
 *     &lt;enumeration value="client-ssl"/>
 *     &lt;enumeration value="validate-signer"/>
 *     &lt;enumeration value="saml-signature"/>
 *     &lt;enumeration value="saml-artifact"/>
 *     &lt;enumeration value="saml-authen-query"/>
 *     &lt;enumeration value="ws-trust"/>
 *     &lt;enumeration value="ws-secureconversation"/>
 *     &lt;enumeration value="token"/>
 *     &lt;enumeration value="kerberos"/>
 *     &lt;enumeration value="ltpa"/>
 *     &lt;enumeration value="binarytokenx509"/>
 *     &lt;enumeration value="zosnss"/>
 *     &lt;enumeration value="custom"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmAAAPAuthenticateType")
@XmlEnum
public enum DmAAAPAuthenticateType {

    @XmlEnumValue("xmlfile")
    XMLFILE("xmlfile"),
    @XmlEnumValue("ldap")
    LDAP("ldap"),
    @XmlEnumValue("tivoli")
    TIVOLI("tivoli"),
    @XmlEnumValue("netegrity")
    NETEGRITY("netegrity"),
    @XmlEnumValue("oblix")
    OBLIX("oblix"),
    @XmlEnumValue("cleartrust")
    CLEARTRUST("cleartrust"),
    @XmlEnumValue("radius")
    RADIUS("radius"),
    @XmlEnumValue("client-ssl")
    CLIENT_SSL("client-ssl"),
    @XmlEnumValue("validate-signer")
    VALIDATE_SIGNER("validate-signer"),
    @XmlEnumValue("saml-signature")
    SAML_SIGNATURE("saml-signature"),
    @XmlEnumValue("saml-artifact")
    SAML_ARTIFACT("saml-artifact"),
    @XmlEnumValue("saml-authen-query")
    SAML_AUTHEN_QUERY("saml-authen-query"),
    @XmlEnumValue("ws-trust")
    WS_TRUST("ws-trust"),
    @XmlEnumValue("ws-secureconversation")
    WS_SECURECONVERSATION("ws-secureconversation"),
    @XmlEnumValue("token")
    TOKEN("token"),
    @XmlEnumValue("kerberos")
    KERBEROS("kerberos"),
    @XmlEnumValue("ltpa")
    LTPA("ltpa"),
    @XmlEnumValue("binarytokenx509")
    BINARYTOKENX_509("binarytokenx509"),
    @XmlEnumValue("zosnss")
    ZOSNSS("zosnss"),
    @XmlEnumValue("custom")
    CUSTOM("custom");
    private final String value;

    DmAAAPAuthenticateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmAAAPAuthenticateType fromValue(String v) {
        for (DmAAAPAuthenticateType c: DmAAAPAuthenticateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
