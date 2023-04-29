
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmChassisFanStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmChassisFanStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ok"/>
 *     &lt;enumeration value="failed-speed"/>
 *     &lt;enumeration value="failed-speed-replaceable"/>
 *     &lt;enumeration value="failed-missing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmChassisFanStatus")
@XmlEnum
public enum DmChassisFanStatus {

    @XmlEnumValue("ok")
    OK("ok"),
    @XmlEnumValue("failed-speed")
    FAILED_SPEED("failed-speed"),
    @XmlEnumValue("failed-speed-replaceable")
    FAILED_SPEED_REPLACEABLE("failed-speed-replaceable"),
    @XmlEnumValue("failed-missing")
    FAILED_MISSING("failed-missing");
    private final String value;

    DmChassisFanStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmChassisFanStatus fromValue(String v) {
        for (DmChassisFanStatus c: DmChassisFanStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
