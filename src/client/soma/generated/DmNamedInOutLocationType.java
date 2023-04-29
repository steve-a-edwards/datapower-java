
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmNamedInOutLocationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmNamedInOutLocationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="default"/>
 *     &lt;enumeration value="explicit"/>
 *     &lt;enumeration value="dynamic"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmNamedInOutLocationType")
@XmlEnum
public enum DmNamedInOutLocationType {

    @XmlEnumValue("default")
    DEFAULT("default"),
    @XmlEnumValue("explicit")
    EXPLICIT("explicit"),
    @XmlEnumValue("dynamic")
    DYNAMIC("dynamic");
    private final String value;

    DmNamedInOutLocationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmNamedInOutLocationType fromValue(String v) {
        for (DmNamedInOutLocationType c: DmNamedInOutLocationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
