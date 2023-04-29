
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmRaidLDAccessPolicy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmRaidLDAccessPolicy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="readWrite"/>
 *     &lt;enumeration value="readOnly"/>
 *     &lt;enumeration value="blocked"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmRaidLDAccessPolicy")
@XmlEnum
public enum DmRaidLDAccessPolicy {

    @XmlEnumValue("readWrite")
    READ_WRITE("readWrite"),
    @XmlEnumValue("readOnly")
    READ_ONLY("readOnly"),
    @XmlEnumValue("blocked")
    BLOCKED("blocked"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    DmRaidLDAccessPolicy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmRaidLDAccessPolicy fromValue(String v) {
        for (DmRaidLDAccessPolicy c: DmRaidLDAccessPolicy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
