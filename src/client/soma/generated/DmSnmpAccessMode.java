
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSnmpAccessMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSnmpAccessMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="read-only"/>
 *     &lt;enumeration value="read-write"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSnmpAccessMode")
@XmlEnum
public enum DmSnmpAccessMode {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("read-only")
    READ_ONLY("read-only"),
    @XmlEnumValue("read-write")
    READ_WRITE("read-write");
    private final String value;

    DmSnmpAccessMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSnmpAccessMode fromValue(String v) {
        for (DmSnmpAccessMode c: DmSnmpAccessMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
