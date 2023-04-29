
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmRaidLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmRaidLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="raidLevel0"/>
 *     &lt;enumeration value="raidLevel1"/>
 *     &lt;enumeration value="raidLevel1E"/>
 *     &lt;enumeration value="raidLevel5"/>
 *     &lt;enumeration value="raidLevel6"/>
 *     &lt;enumeration value="raidLevel10"/>
 *     &lt;enumeration value="raidLevel50"/>
 *     &lt;enumeration value="raidLevel60"/>
 *     &lt;enumeration value="undefined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmRaidLevel")
@XmlEnum
public enum DmRaidLevel {

    @XmlEnumValue("raidLevel0")
    RAID_LEVEL_0("raidLevel0"),
    @XmlEnumValue("raidLevel1")
    RAID_LEVEL_1("raidLevel1"),
    @XmlEnumValue("raidLevel1E")
    RAID_LEVEL_1_E("raidLevel1E"),
    @XmlEnumValue("raidLevel5")
    RAID_LEVEL_5("raidLevel5"),
    @XmlEnumValue("raidLevel6")
    RAID_LEVEL_6("raidLevel6"),
    @XmlEnumValue("raidLevel10")
    RAID_LEVEL_10("raidLevel10"),
    @XmlEnumValue("raidLevel50")
    RAID_LEVEL_50("raidLevel50"),
    @XmlEnumValue("raidLevel60")
    RAID_LEVEL_60("raidLevel60"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined");
    private final String value;

    DmRaidLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmRaidLevel fromValue(String v) {
        for (DmRaidLevel c: DmRaidLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
