
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmStyleRuleFilterFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmStyleRuleFilterFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="gzip"/>
 *     &lt;enumeration value="pkzip"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmStyleRuleFilterFormat")
@XmlEnum
public enum DmStyleRuleFilterFormat {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("gzip")
    GZIP("gzip"),
    @XmlEnumValue("pkzip")
    PKZIP("pkzip");
    private final String value;

    DmStyleRuleFilterFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmStyleRuleFilterFormat fromValue(String v) {
        for (DmStyleRuleFilterFormat c: DmStyleRuleFilterFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
