
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSensorReadingStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSensorReadingStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="lowerNonRecoverable"/>
 *     &lt;enumeration value="lowerCritical"/>
 *     &lt;enumeration value="lowerNonCritical"/>
 *     &lt;enumeration value="ok"/>
 *     &lt;enumeration value="upperNonCritical"/>
 *     &lt;enumeration value="upperCritical"/>
 *     &lt;enumeration value="upperNonRecoverable"/>
 *     &lt;enumeration value="failure"/>
 *     &lt;enumeration value="noReading"/>
 *     &lt;enumeration value="invalid"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSensorReadingStatus")
@XmlEnum
public enum DmSensorReadingStatus {

    @XmlEnumValue("lowerNonRecoverable")
    LOWER_NON_RECOVERABLE("lowerNonRecoverable"),
    @XmlEnumValue("lowerCritical")
    LOWER_CRITICAL("lowerCritical"),
    @XmlEnumValue("lowerNonCritical")
    LOWER_NON_CRITICAL("lowerNonCritical"),
    @XmlEnumValue("ok")
    OK("ok"),
    @XmlEnumValue("upperNonCritical")
    UPPER_NON_CRITICAL("upperNonCritical"),
    @XmlEnumValue("upperCritical")
    UPPER_CRITICAL("upperCritical"),
    @XmlEnumValue("upperNonRecoverable")
    UPPER_NON_RECOVERABLE("upperNonRecoverable"),
    @XmlEnumValue("failure")
    FAILURE("failure"),
    @XmlEnumValue("noReading")
    NO_READING("noReading"),
    @XmlEnumValue("invalid")
    INVALID("invalid");
    private final String value;

    DmSensorReadingStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSensorReadingStatus fromValue(String v) {
        for (DmSensorReadingStatus c: DmSensorReadingStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
