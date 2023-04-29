
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSDLResponsePolicy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmWSDLResponsePolicy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="off"/>
 *     &lt;enumeration value="intercept"/>
 *     &lt;enumeration value="serve"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmWSDLResponsePolicy")
@XmlEnum
public enum DmWSDLResponsePolicy {

    @XmlEnumValue("off")
    OFF("off"),
    @XmlEnumValue("intercept")
    INTERCEPT("intercept"),
    @XmlEnumValue("serve")
    SERVE("serve");
    private final String value;

    DmWSDLResponsePolicy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmWSDLResponsePolicy fromValue(String v) {
        for (DmWSDLResponsePolicy c: DmWSDLResponsePolicy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
