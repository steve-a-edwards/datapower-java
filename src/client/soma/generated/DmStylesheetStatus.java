
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmStylesheetStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmStylesheetStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ready"/>
 *     &lt;enumeration value="pending"/>
 *     &lt;enumeration value="bad"/>
 *     &lt;enumeration value="expired"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmStylesheetStatus")
@XmlEnum
public enum DmStylesheetStatus {

    @XmlEnumValue("ready")
    READY("ready"),
    @XmlEnumValue("pending")
    PENDING("pending"),
    @XmlEnumValue("bad")
    BAD("bad"),
    @XmlEnumValue("expired")
    EXPIRED("expired");
    private final String value;

    DmStylesheetStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmStylesheetStatus fromValue(String v) {
        for (DmStylesheetStatus c: DmStylesheetStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
