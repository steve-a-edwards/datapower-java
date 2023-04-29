
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmStyleErrorMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmStyleErrorMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="abort"/>
 *     &lt;enumeration value="continue"/>
 *     &lt;enumeration value="alternative"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmStyleErrorMode")
@XmlEnum
public enum DmStyleErrorMode {

    @XmlEnumValue("abort")
    ABORT("abort"),
    @XmlEnumValue("continue")
    CONTINUE("continue"),
    @XmlEnumValue("alternative")
    ALTERNATIVE("alternative");
    private final String value;

    DmStyleErrorMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmStyleErrorMode fromValue(String v) {
        for (DmStyleErrorMode c: DmStyleErrorMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
