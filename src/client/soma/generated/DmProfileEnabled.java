
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmProfileEnabled.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmProfileEnabled">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="disabled"/>
 *     &lt;enumeration value="enabled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmProfileEnabled")
@XmlEnum
public enum DmProfileEnabled {

    @XmlEnumValue("disabled")
    DISABLED("disabled"),
    @XmlEnumValue("enabled")
    ENABLED("enabled");
    private final String value;

    DmProfileEnabled(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmProfileEnabled fromValue(String v) {
        for (DmProfileEnabled c: DmProfileEnabled.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
