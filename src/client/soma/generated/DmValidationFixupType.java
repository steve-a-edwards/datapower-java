
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmValidationFixupType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmValidationFixupType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="passthrough"/>
 *     &lt;enumeration value="strip"/>
 *     &lt;enumeration value="error"/>
 *     &lt;enumeration value="set"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmValidationFixupType")
@XmlEnum
public enum DmValidationFixupType {

    @XmlEnumValue("passthrough")
    PASSTHROUGH("passthrough"),
    @XmlEnumValue("strip")
    STRIP("strip"),
    @XmlEnumValue("error")
    ERROR("error"),
    @XmlEnumValue("set")
    SET("set");
    private final String value;

    DmValidationFixupType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmValidationFixupType fromValue(String v) {
        for (DmValidationFixupType c: DmValidationFixupType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
