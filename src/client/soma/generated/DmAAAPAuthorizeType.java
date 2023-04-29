
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmAAAPAuthorizeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmAAAPAuthorizeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="anyauthenticated"/>
 *     &lt;enumeration value="passthrough"/>
 *     &lt;enumeration value="tivoli"/>
 *     &lt;enumeration value="netegrity"/>
 *     &lt;enumeration value="oblix"/>
 *     &lt;enumeration value="cleartrust"/>
 *     &lt;enumeration value="custom"/>
 *     &lt;enumeration value="ldap"/>
 *     &lt;enumeration value="saml-authz"/>
 *     &lt;enumeration value="saml-attr"/>
 *     &lt;enumeration value="use-authen-attr"/>
 *     &lt;enumeration value="xacml"/>
 *     &lt;enumeration value="xmlfile"/>
 *     &lt;enumeration value="zosnss"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmAAAPAuthorizeType")
@XmlEnum
public enum DmAAAPAuthorizeType {

    @XmlEnumValue("anyauthenticated")
    ANYAUTHENTICATED("anyauthenticated"),
    @XmlEnumValue("passthrough")
    PASSTHROUGH("passthrough"),
    @XmlEnumValue("tivoli")
    TIVOLI("tivoli"),
    @XmlEnumValue("netegrity")
    NETEGRITY("netegrity"),
    @XmlEnumValue("oblix")
    OBLIX("oblix"),
    @XmlEnumValue("cleartrust")
    CLEARTRUST("cleartrust"),
    @XmlEnumValue("custom")
    CUSTOM("custom"),
    @XmlEnumValue("ldap")
    LDAP("ldap"),
    @XmlEnumValue("saml-authz")
    SAML_AUTHZ("saml-authz"),
    @XmlEnumValue("saml-attr")
    SAML_ATTR("saml-attr"),
    @XmlEnumValue("use-authen-attr")
    USE_AUTHEN_ATTR("use-authen-attr"),
    @XmlEnumValue("xacml")
    XACML("xacml"),
    @XmlEnumValue("xmlfile")
    XMLFILE("xmlfile"),
    @XmlEnumValue("zosnss")
    ZOSNSS("zosnss");
    private final String value;

    DmAAAPAuthorizeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmAAAPAuthorizeType fromValue(String v) {
        for (DmAAAPAuthorizeType c: DmAAAPAuthorizeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
