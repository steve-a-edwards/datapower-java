
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmIPMISensorEventDir.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmIPMISensorEventDir">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="asserted"/>
 *     &lt;enumeration value="deasserted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmIPMISensorEventDir")
@XmlEnum
public enum DmIPMISensorEventDir {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("asserted")
    ASSERTED("asserted"),
    @XmlEnumValue("deasserted")
    DEASSERTED("deasserted");
    private final String value;

    DmIPMISensorEventDir(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmIPMISensorEventDir fromValue(String v) {
        for (DmIPMISensorEventDir c: DmIPMISensorEventDir.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
