
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmTFIMMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmTFIMMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="v6.0"/>
 *     &lt;enumeration value="v6.1"/>
 *     &lt;enumeration value="v6.2"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmTFIMMode")
@XmlEnum
public enum DmTFIMMode {

    @XmlEnumValue("v6.0")
    V_6_0("v6.0"),
    @XmlEnumValue("v6.1")
    V_6_1("v6.1"),
    @XmlEnumValue("v6.2")
    V_6_2("v6.2");
    private final String value;

    DmTFIMMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmTFIMMode fromValue(String v) {
        for (DmTFIMMode c: DmTFIMMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
