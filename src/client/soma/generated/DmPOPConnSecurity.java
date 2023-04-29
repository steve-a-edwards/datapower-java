
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmPOPConnSecurity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmPOPConnSecurity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="stls"/>
 *     &lt;enumeration value="ssl"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmPOPConnSecurity")
@XmlEnum
public enum DmPOPConnSecurity {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("stls")
    STLS("stls"),
    @XmlEnumValue("ssl")
    SSL("ssl");
    private final String value;

    DmPOPConnSecurity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmPOPConnSecurity fromValue(String v) {
        for (DmPOPConnSecurity c: DmPOPConnSecurity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
