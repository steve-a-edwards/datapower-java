
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmRaidBBUStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmRaidBBUStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="chargeActive"/>
 *     &lt;enumeration value="dischargeActive"/>
 *     &lt;enumeration value="i2cErrorsDetected"/>
 *     &lt;enumeration value="learnCycleActive"/>
 *     &lt;enumeration value="learnCycleFailed"/>
 *     &lt;enumeration value="learnCycleRequested"/>
 *     &lt;enumeration value="learnCycleTimeout"/>
 *     &lt;enumeration value="packMissing"/>
 *     &lt;enumeration value="temperatureHigh"/>
 *     &lt;enumeration value="voltageLow"/>
 *     &lt;enumeration value="periodicLearnRequired"/>
 *     &lt;enumeration value="remainingCapacityLow"/>
 *     &lt;enumeration value="replacePack"/>
 *     &lt;enumeration value="normal"/>
 *     &lt;enumeration value="undefined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmRaidBBUStatus")
@XmlEnum
public enum DmRaidBBUStatus {

    @XmlEnumValue("chargeActive")
    CHARGE_ACTIVE("chargeActive"),
    @XmlEnumValue("dischargeActive")
    DISCHARGE_ACTIVE("dischargeActive"),
    @XmlEnumValue("i2cErrorsDetected")
    I_2_C_ERRORS_DETECTED("i2cErrorsDetected"),
    @XmlEnumValue("learnCycleActive")
    LEARN_CYCLE_ACTIVE("learnCycleActive"),
    @XmlEnumValue("learnCycleFailed")
    LEARN_CYCLE_FAILED("learnCycleFailed"),
    @XmlEnumValue("learnCycleRequested")
    LEARN_CYCLE_REQUESTED("learnCycleRequested"),
    @XmlEnumValue("learnCycleTimeout")
    LEARN_CYCLE_TIMEOUT("learnCycleTimeout"),
    @XmlEnumValue("packMissing")
    PACK_MISSING("packMissing"),
    @XmlEnumValue("temperatureHigh")
    TEMPERATURE_HIGH("temperatureHigh"),
    @XmlEnumValue("voltageLow")
    VOLTAGE_LOW("voltageLow"),
    @XmlEnumValue("periodicLearnRequired")
    PERIODIC_LEARN_REQUIRED("periodicLearnRequired"),
    @XmlEnumValue("remainingCapacityLow")
    REMAINING_CAPACITY_LOW("remainingCapacityLow"),
    @XmlEnumValue("replacePack")
    REPLACE_PACK("replacePack"),
    @XmlEnumValue("normal")
    NORMAL("normal"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined");
    private final String value;

    DmRaidBBUStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmRaidBBUStatus fromValue(String v) {
        for (DmRaidBBUStatus c: DmRaidBBUStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
