
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmFormsLocation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmFormsLocation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="backend"/>
 *     &lt;enumeration value="appliance"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmFormsLocation")
@XmlEnum
public enum DmFormsLocation {

    @XmlEnumValue("backend")
    BACKEND("backend"),
    @XmlEnumValue("appliance")
    APPLIANCE("appliance");
    private final String value;

    DmFormsLocation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmFormsLocation fromValue(String v) {
        for (DmFormsLocation c: DmFormsLocation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
