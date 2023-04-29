
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmRaidPDPos.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmRaidPDPos">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HDD0"/>
 *     &lt;enumeration value="HDD1"/>
 *     &lt;enumeration value="HDD2"/>
 *     &lt;enumeration value="HDD3"/>
 *     &lt;enumeration value="undefined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmRaidPDPos")
@XmlEnum
public enum DmRaidPDPos {

    @XmlEnumValue("HDD0")
    HDD_0("HDD0"),
    @XmlEnumValue("HDD1")
    HDD_1("HDD1"),
    @XmlEnumValue("HDD2")
    HDD_2("HDD2"),
    @XmlEnumValue("HDD3")
    HDD_3("HDD3"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined");
    private final String value;

    DmRaidPDPos(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmRaidPDPos fromValue(String v) {
        for (DmRaidPDPos c: DmRaidPDPos.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
