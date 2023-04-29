
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSDLValidationMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmWSDLValidationMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="strict"/>
 *     &lt;enumeration value="lax"/>
 *     &lt;enumeration value="skip"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmWSDLValidationMode")
@XmlEnum
public enum DmWSDLValidationMode {

    @XmlEnumValue("strict")
    STRICT("strict"),
    @XmlEnumValue("lax")
    LAX("lax"),
    @XmlEnumValue("skip")
    SKIP("skip");
    private final String value;

    DmWSDLValidationMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmWSDLValidationMode fromValue(String v) {
        for (DmWSDLValidationMode c: DmWSDLValidationMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
