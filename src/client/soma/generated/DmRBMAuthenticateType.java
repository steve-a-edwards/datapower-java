
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmRBMAuthenticateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmRBMAuthenticateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="local"/>
 *     &lt;enumeration value="xmlfile"/>
 *     &lt;enumeration value="ldap"/>
 *     &lt;enumeration value="radius"/>
 *     &lt;enumeration value="spnego"/>
 *     &lt;enumeration value="zosnss"/>
 *     &lt;enumeration value="custom"/>
 *     &lt;enumeration value="client-ssl"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmRBMAuthenticateType")
@XmlEnum
public enum DmRBMAuthenticateType {

    @XmlEnumValue("local")
    LOCAL("local"),
    @XmlEnumValue("xmlfile")
    XMLFILE("xmlfile"),
    @XmlEnumValue("ldap")
    LDAP("ldap"),
    @XmlEnumValue("radius")
    RADIUS("radius"),
    @XmlEnumValue("spnego")
    SPNEGO("spnego"),
    @XmlEnumValue("zosnss")
    ZOSNSS("zosnss"),
    @XmlEnumValue("custom")
    CUSTOM("custom"),
    @XmlEnumValue("client-ssl")
    CLIENT_SSL("client-ssl");
    private final String value;

    DmRBMAuthenticateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmRBMAuthenticateType fromValue(String v) {
        for (DmRBMAuthenticateType c: DmRBMAuthenticateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
