
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmNFSAuthenticationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmNFSAuthenticationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="auth_sys"/>
 *     &lt;enumeration value="krb5"/>
 *     &lt;enumeration value="krb5i"/>
 *     &lt;enumeration value="krb5p"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmNFSAuthenticationType")
@XmlEnum
public enum DmNFSAuthenticationType {

    @XmlEnumValue("auth_sys")
    AUTH_SYS("auth_sys"),
    @XmlEnumValue("krb5")
    KRB_5("krb5"),
    @XmlEnumValue("krb5i")
    KRB_5_I("krb5i"),
    @XmlEnumValue("krb5p")
    KRB_5_P("krb5p");
    private final String value;

    DmNFSAuthenticationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmNFSAuthenticationType fromValue(String v) {
        for (DmNFSAuthenticationType c: DmNFSAuthenticationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
