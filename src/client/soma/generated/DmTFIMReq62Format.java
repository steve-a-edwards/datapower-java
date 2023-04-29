
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmTFIMReq62Format.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmTFIMReq62Format">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WSUserNameToken"/>
 *     &lt;enumeration value="SAML1.0"/>
 *     &lt;enumeration value="SAML1.1"/>
 *     &lt;enumeration value="SAML2.0"/>
 *     &lt;enumeration value="WSKerberosToken"/>
 *     &lt;enumeration value="WSX509Token"/>
 *     &lt;enumeration value="BinarySecurityToken"/>
 *     &lt;enumeration value="CustomToken"/>
 *     &lt;enumeration value="Custom"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmTFIMReq62Format")
@XmlEnum
public enum DmTFIMReq62Format {

    @XmlEnumValue("WSUserNameToken")
    WS_USER_NAME_TOKEN("WSUserNameToken"),
    @XmlEnumValue("SAML1.0")
    SAML_1_0("SAML1.0"),
    @XmlEnumValue("SAML1.1")
    SAML_1_1("SAML1.1"),
    @XmlEnumValue("SAML2.0")
    SAML_2_0("SAML2.0"),
    @XmlEnumValue("WSKerberosToken")
    WS_KERBEROS_TOKEN("WSKerberosToken"),
    @XmlEnumValue("WSX509Token")
    WSX_509_TOKEN("WSX509Token"),
    @XmlEnumValue("BinarySecurityToken")
    BINARY_SECURITY_TOKEN("BinarySecurityToken"),
    @XmlEnumValue("CustomToken")
    CUSTOM_TOKEN("CustomToken"),
    @XmlEnumValue("Custom")
    CUSTOM("Custom");
    private final String value;

    DmTFIMReq62Format(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmTFIMReq62Format fromValue(String v) {
        for (DmTFIMReq62Format c: DmTFIMReq62Format.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
