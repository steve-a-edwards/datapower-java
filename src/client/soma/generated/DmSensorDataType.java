
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSensorDataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSensorDataType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="voltsAC"/>
 *     &lt;enumeration value="voltsDC"/>
 *     &lt;enumeration value="watts"/>
 *     &lt;enumeration value="hertz"/>
 *     &lt;enumeration value="celsius"/>
 *     &lt;enumeration value="percentRH"/>
 *     &lt;enumeration value="rpm"/>
 *     &lt;enumeration value="cmm"/>
 *     &lt;enumeration value="truthvalue"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSensorDataType")
@XmlEnum
public enum DmSensorDataType {

    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("voltsAC")
    VOLTS_AC("voltsAC"),
    @XmlEnumValue("voltsDC")
    VOLTS_DC("voltsDC"),
    @XmlEnumValue("watts")
    WATTS("watts"),
    @XmlEnumValue("hertz")
    HERTZ("hertz"),
    @XmlEnumValue("celsius")
    CELSIUS("celsius"),
    @XmlEnumValue("percentRH")
    PERCENT_RH("percentRH"),
    @XmlEnumValue("rpm")
    RPM("rpm"),
    @XmlEnumValue("cmm")
    CMM("cmm"),
    @XmlEnumValue("truthvalue")
    TRUTHVALUE("truthvalue");
    private final String value;

    DmSensorDataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSensorDataType fromValue(String v) {
        for (DmSensorDataType c: DmSensorDataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
