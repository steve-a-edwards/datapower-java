
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmStandbyMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmStandbyMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="active"/>
 *     &lt;enumeration value="standby"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmStandbyMode")
@XmlEnum
public enum DmStandbyMode {

    @XmlEnumValue("active")
    ACTIVE("active"),
    @XmlEnumValue("standby")
    STANDBY("standby");
    private final String value;

    DmStandbyMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmStandbyMode fromValue(String v) {
        for (DmStandbyMode c: DmStandbyMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
