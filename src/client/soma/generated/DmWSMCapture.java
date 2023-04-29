
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSMCapture.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmWSMCapture">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="faults"/>
 *     &lt;enumeration value="all-messages"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmWSMCapture")
@XmlEnum
public enum DmWSMCapture {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("faults")
    FAULTS("faults"),
    @XmlEnumValue("all-messages")
    ALL_MESSAGES("all-messages");
    private final String value;

    DmWSMCapture(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmWSMCapture fromValue(String v) {
        for (DmWSMCapture c: DmWSMCapture.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
