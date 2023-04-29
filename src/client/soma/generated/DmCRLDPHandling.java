
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmCRLDPHandling.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmCRLDPHandling">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ignore"/>
 *     &lt;enumeration value="require"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmCRLDPHandling")
@XmlEnum
public enum DmCRLDPHandling {

    @XmlEnumValue("ignore")
    IGNORE("ignore"),
    @XmlEnumValue("require")
    REQUIRE("require");
    private final String value;

    DmCRLDPHandling(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmCRLDPHandling fromValue(String v) {
        for (DmCRLDPHandling c: DmCRLDPHandling.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
