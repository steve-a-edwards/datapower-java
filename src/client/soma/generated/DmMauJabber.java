
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmMauJabber.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmMauJabber">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="noJabber"/>
 *     &lt;enumeration value="jabbering"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmMauJabber")
@XmlEnum
public enum DmMauJabber {

    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("noJabber")
    NO_JABBER("noJabber"),
    @XmlEnumValue("jabbering")
    JABBERING("jabbering");
    private final String value;

    DmMauJabber(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmMauJabber fromValue(String v) {
        for (DmMauJabber c: DmMauJabber.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
