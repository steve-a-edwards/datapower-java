
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmTxMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmTxMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="default"/>
 *     &lt;enumeration value="no-map"/>
 *     &lt;enumeration value="dpa"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmTxMode")
@XmlEnum
public enum DmTxMode {

    @XmlEnumValue("default")
    DEFAULT("default"),
    @XmlEnumValue("no-map")
    NO_MAP("no-map"),
    @XmlEnumValue("dpa")
    DPA("dpa");
    private final String value;

    DmTxMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmTxMode fromValue(String v) {
        for (DmTxMode c: DmTxMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
