
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSRRVersion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmWSRRVersion">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WSRR_6.0"/>
 *     &lt;enumeration value="WSRR_6.1"/>
 *     &lt;enumeration value="WSRR_6.2"/>
 *     &lt;enumeration value="WSRR_7.5"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmWSRRVersion")
@XmlEnum
public enum DmWSRRVersion {

    @XmlEnumValue("WSRR_6.0")
    WSRR_6_0("WSRR_6.0"),
    @XmlEnumValue("WSRR_6.1")
    WSRR_6_1("WSRR_6.1"),
    @XmlEnumValue("WSRR_6.2")
    WSRR_6_2("WSRR_6.2"),
    @XmlEnumValue("WSRR_7.5")
    WSRR_7_5("WSRR_7.5");
    private final String value;

    DmWSRRVersion(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmWSRRVersion fromValue(String v) {
        for (DmWSRRVersion c: DmWSRRVersion.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
