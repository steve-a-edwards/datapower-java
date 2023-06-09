
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmAuditLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmAuditLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="standard"/>
 *     &lt;enumeration value="full"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmAuditLevel")
@XmlEnum
public enum DmAuditLevel {

    @XmlEnumValue("standard")
    STANDARD("standard"),
    @XmlEnumValue("full")
    FULL("full");
    private final String value;

    DmAuditLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmAuditLevel fromValue(String v) {
        for (DmAuditLevel c: DmAuditLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
