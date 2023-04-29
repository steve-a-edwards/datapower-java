
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmRaidPhysDiskRole.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmRaidPhysDiskRole">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="primary"/>
 *     &lt;enumeration value="secondary"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmRaidPhysDiskRole")
@XmlEnum
public enum DmRaidPhysDiskRole {

    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("primary")
    PRIMARY("primary"),
    @XmlEnumValue("secondary")
    SECONDARY("secondary");
    private final String value;

    DmRaidPhysDiskRole(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmRaidPhysDiskRole fromValue(String v) {
        for (DmRaidPhysDiskRole c: DmRaidPhysDiskRole.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
