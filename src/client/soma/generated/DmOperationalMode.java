
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmOperationalMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmOperationalMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="normal"/>
 *     &lt;enumeration value="cc"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmOperationalMode")
@XmlEnum
public enum DmOperationalMode {

    @XmlEnumValue("normal")
    NORMAL("normal"),
    @XmlEnumValue("cc")
    CC("cc");
    private final String value;

    DmOperationalMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmOperationalMode fromValue(String v) {
        for (DmOperationalMode c: DmOperationalMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
