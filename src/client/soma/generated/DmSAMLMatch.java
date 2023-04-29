
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSAMLMatch.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSAMLMatch">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="xpath"/>
 *     &lt;enumeration value="any"/>
 *     &lt;enumeration value="all"/>
 *     &lt;enumeration value="any-value"/>
 *     &lt;enumeration value="all-values"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSAMLMatch")
@XmlEnum
public enum DmSAMLMatch {

    @XmlEnumValue("xpath")
    XPATH("xpath"),
    @XmlEnumValue("any")
    ANY("any"),
    @XmlEnumValue("all")
    ALL("all"),
    @XmlEnumValue("any-value")
    ANY_VALUE("any-value"),
    @XmlEnumValue("all-values")
    ALL_VALUES("all-values");
    private final String value;

    DmSAMLMatch(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSAMLMatch fromValue(String v) {
        for (DmSAMLMatch c: DmSAMLMatch.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
