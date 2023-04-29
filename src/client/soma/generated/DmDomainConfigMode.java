
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmDomainConfigMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmDomainConfigMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="local"/>
 *     &lt;enumeration value="import"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmDomainConfigMode")
@XmlEnum
public enum DmDomainConfigMode {

    @XmlEnumValue("local")
    LOCAL("local"),
    @XmlEnumValue("import")
    IMPORT("import");
    private final String value;

    DmDomainConfigMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmDomainConfigMode fromValue(String v) {
        for (DmDomainConfigMode c: DmDomainConfigMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
