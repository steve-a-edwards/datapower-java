
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmRaidPhysDiskState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmRaidPhysDiskState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="online"/>
 *     &lt;enumeration value="missing"/>
 *     &lt;enumeration value="not-compatible"/>
 *     &lt;enumeration value="failed"/>
 *     &lt;enumeration value="initializing"/>
 *     &lt;enumeration value="requested-offline"/>
 *     &lt;enumeration value="requested-failed"/>
 *     &lt;enumeration value="other-offline"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmRaidPhysDiskState")
@XmlEnum
public enum DmRaidPhysDiskState {

    @XmlEnumValue("online")
    ONLINE("online"),
    @XmlEnumValue("missing")
    MISSING("missing"),
    @XmlEnumValue("not-compatible")
    NOT_COMPATIBLE("not-compatible"),
    @XmlEnumValue("failed")
    FAILED("failed"),
    @XmlEnumValue("initializing")
    INITIALIZING("initializing"),
    @XmlEnumValue("requested-offline")
    REQUESTED_OFFLINE("requested-offline"),
    @XmlEnumValue("requested-failed")
    REQUESTED_FAILED("requested-failed"),
    @XmlEnumValue("other-offline")
    OTHER_OFFLINE("other-offline");
    private final String value;

    DmRaidPhysDiskState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmRaidPhysDiskState fromValue(String v) {
        for (DmRaidPhysDiskState c: DmRaidPhysDiskState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
