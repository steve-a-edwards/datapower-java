
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWsrrSynchronization.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmWsrrSynchronization">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="manual"/>
 *     &lt;enumeration value="poll"/>
 *     &lt;enumeration value="automatic"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmWsrrSynchronization")
@XmlEnum
public enum DmWsrrSynchronization {

    @XmlEnumValue("manual")
    MANUAL("manual"),
    @XmlEnumValue("poll")
    POLL("poll"),
    @XmlEnumValue("automatic")
    AUTOMATIC("automatic");
    private final String value;

    DmWsrrSynchronization(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmWsrrSynchronization fromValue(String v) {
        for (DmWsrrSynchronization c: DmWsrrSynchronization.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
