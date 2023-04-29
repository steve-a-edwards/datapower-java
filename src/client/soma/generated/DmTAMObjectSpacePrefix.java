
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmTAMObjectSpacePrefix.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmTAMObjectSpacePrefix">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TFIM"/>
 *     &lt;enumeration value="TAMBI"/>
 *     &lt;enumeration value="WebSEAL"/>
 *     &lt;enumeration value="Custom"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmTAMObjectSpacePrefix")
@XmlEnum
public enum DmTAMObjectSpacePrefix {

    TFIM("TFIM"),
    TAMBI("TAMBI"),
    @XmlEnumValue("WebSEAL")
    WEB_SEAL("WebSEAL"),
    @XmlEnumValue("Custom")
    CUSTOM("Custom");
    private final String value;

    DmTAMObjectSpacePrefix(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmTAMObjectSpacePrefix fromValue(String v) {
        for (DmTAMObjectSpacePrefix c: DmTAMObjectSpacePrefix.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
