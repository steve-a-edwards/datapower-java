
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSIValidationMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmWSIValidationMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ignore"/>
 *     &lt;enumeration value="warn"/>
 *     &lt;enumeration value="fail"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmWSIValidationMode")
@XmlEnum
public enum DmWSIValidationMode {

    @XmlEnumValue("ignore")
    IGNORE("ignore"),
    @XmlEnumValue("warn")
    WARN("warn"),
    @XmlEnumValue("fail")
    FAIL("fail");
    private final String value;

    DmWSIValidationMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmWSIValidationMode fromValue(String v) {
        for (DmWSIValidationMode c: DmWSIValidationMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
