
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmPowerSupplyStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmPowerSupplyStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ok"/>
 *     &lt;enumeration value="power-1-failure"/>
 *     &lt;enumeration value="power-2-failure"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmPowerSupplyStatus")
@XmlEnum
public enum DmPowerSupplyStatus {

    @XmlEnumValue("ok")
    OK("ok"),
    @XmlEnumValue("power-1-failure")
    POWER_1_FAILURE("power-1-failure"),
    @XmlEnumValue("power-2-failure")
    POWER_2_FAILURE("power-2-failure");
    private final String value;

    DmPowerSupplyStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmPowerSupplyStatus fromValue(String v) {
        for (DmPowerSupplyStatus c: DmPowerSupplyStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
