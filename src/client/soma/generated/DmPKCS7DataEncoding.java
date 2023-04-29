
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmPKCS7DataEncoding.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmPKCS7DataEncoding">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="base64"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmPKCS7DataEncoding")
@XmlEnum
public enum DmPKCS7DataEncoding {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("base64")
    BASE_64("base64");
    private final String value;

    DmPKCS7DataEncoding(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmPKCS7DataEncoding fromValue(String v) {
        for (DmPKCS7DataEncoding c: DmPKCS7DataEncoding.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
