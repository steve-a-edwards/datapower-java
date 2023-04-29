
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSOAPActionMatchPolicy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSOAPActionMatchPolicy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="lax"/>
 *     &lt;enumeration value="strict"/>
 *     &lt;enumeration value="off"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSOAPActionMatchPolicy")
@XmlEnum
public enum DmSOAPActionMatchPolicy {

    @XmlEnumValue("lax")
    LAX("lax"),
    @XmlEnumValue("strict")
    STRICT("strict"),
    @XmlEnumValue("off")
    OFF("off");
    private final String value;

    DmSOAPActionMatchPolicy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSOAPActionMatchPolicy fromValue(String v) {
        for (DmSOAPActionMatchPolicy c: DmSOAPActionMatchPolicy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
