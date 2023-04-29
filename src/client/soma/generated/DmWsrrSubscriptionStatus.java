
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWsrrSubscriptionStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmWsrrSubscriptionStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Okay"/>
 *     &lt;enumeration value="Error"/>
 *     &lt;enumeration value="Synchronizing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmWsrrSubscriptionStatus")
@XmlEnum
public enum DmWsrrSubscriptionStatus {

    @XmlEnumValue("Okay")
    OKAY("Okay"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Synchronizing")
    SYNCHRONIZING("Synchronizing");
    private final String value;

    DmWsrrSubscriptionStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmWsrrSubscriptionStatus fromValue(String v) {
        for (DmWsrrSubscriptionStatus c: DmWsrrSubscriptionStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
