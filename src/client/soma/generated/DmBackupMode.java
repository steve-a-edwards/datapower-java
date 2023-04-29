
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmBackupMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmBackupMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="normal"/>
 *     &lt;enumeration value="secure"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmBackupMode")
@XmlEnum
public enum DmBackupMode {

    @XmlEnumValue("normal")
    NORMAL("normal"),
    @XmlEnumValue("secure")
    SECURE("secure");
    private final String value;

    DmBackupMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmBackupMode fromValue(String v) {
        for (DmBackupMode c: DmBackupMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
