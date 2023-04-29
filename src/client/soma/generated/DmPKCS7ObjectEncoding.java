
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmPKCS7ObjectEncoding.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmPKCS7ObjectEncoding">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="der"/>
 *     &lt;enumeration value="base64-der"/>
 *     &lt;enumeration value="pem"/>
 *     &lt;enumeration value="smime"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmPKCS7ObjectEncoding")
@XmlEnum
public enum DmPKCS7ObjectEncoding {

    @XmlEnumValue("der")
    DER("der"),
    @XmlEnumValue("base64-der")
    BASE_64_DER("base64-der"),
    @XmlEnumValue("pem")
    PEM("pem"),
    @XmlEnumValue("smime")
    SMIME("smime");
    private final String value;

    DmPKCS7ObjectEncoding(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmPKCS7ObjectEncoding fromValue(String v) {
        for (DmPKCS7ObjectEncoding c: DmPKCS7ObjectEncoding.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
