
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmQuarantineMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmQuarantineMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="buffer-until-verification"/>
 *     &lt;enumeration value="stream-until-infraction"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmQuarantineMode")
@XmlEnum
public enum DmQuarantineMode {

    @XmlEnumValue("buffer-until-verification")
    BUFFER_UNTIL_VERIFICATION("buffer-until-verification"),
    @XmlEnumValue("stream-until-infraction")
    STREAM_UNTIL_INFRACTION("stream-until-infraction");
    private final String value;

    DmQuarantineMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmQuarantineMode fromValue(String v) {
        for (DmQuarantineMode c: DmQuarantineMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
