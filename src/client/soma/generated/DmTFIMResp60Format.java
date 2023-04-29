
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmTFIMResp60Format.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmTFIMResp60Format">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WSUserNameToken"/>
 *     &lt;enumeration value="SAML1.0"/>
 *     &lt;enumeration value="SAML1.1"/>
 *     &lt;enumeration value="Custom"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmTFIMResp60Format")
@XmlEnum
public enum DmTFIMResp60Format {

    @XmlEnumValue("WSUserNameToken")
    WS_USER_NAME_TOKEN("WSUserNameToken"),
    @XmlEnumValue("SAML1.0")
    SAML_1_0("SAML1.0"),
    @XmlEnumValue("SAML1.1")
    SAML_1_1("SAML1.1"),
    @XmlEnumValue("Custom")
    CUSTOM("Custom");
    private final String value;

    DmTFIMResp60Format(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmTFIMResp60Format fromValue(String v) {
        for (DmTFIMResp60Format c: DmTFIMResp60Format.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
