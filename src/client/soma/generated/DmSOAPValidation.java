
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSOAPValidation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSOAPValidation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="body"/>
 *     &lt;enumeration value="body-or-detail"/>
 *     &lt;enumeration value="ignore-faults"/>
 *     &lt;enumeration value="envelope"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSOAPValidation")
@XmlEnum
public enum DmSOAPValidation {

    @XmlEnumValue("body")
    BODY("body"),
    @XmlEnumValue("body-or-detail")
    BODY_OR_DETAIL("body-or-detail"),
    @XmlEnumValue("ignore-faults")
    IGNORE_FAULTS("ignore-faults"),
    @XmlEnumValue("envelope")
    ENVELOPE("envelope");
    private final String value;

    DmSOAPValidation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSOAPValidation fromValue(String v) {
        for (DmSOAPValidation c: DmSOAPValidation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
