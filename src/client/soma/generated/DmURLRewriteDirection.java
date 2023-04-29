
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmURLRewriteDirection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmURLRewriteDirection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="all"/>
 *     &lt;enumeration value="request"/>
 *     &lt;enumeration value="response"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmURLRewriteDirection")
@XmlEnum
public enum DmURLRewriteDirection {

    @XmlEnumValue("all")
    ALL("all"),
    @XmlEnumValue("request")
    REQUEST("request"),
    @XmlEnumValue("response")
    RESPONSE("response");
    private final String value;

    DmURLRewriteDirection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmURLRewriteDirection fromValue(String v) {
        for (DmURLRewriteDirection c: DmURLRewriteDirection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
