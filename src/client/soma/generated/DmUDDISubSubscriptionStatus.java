
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmUDDISubSubscriptionStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmUDDISubSubscriptionStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Initializing"/>
 *     &lt;enumeration value="Okay"/>
 *     &lt;enumeration value="Error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmUDDISubSubscriptionStatus")
@XmlEnum
public enum DmUDDISubSubscriptionStatus {

    @XmlEnumValue("Initializing")
    INITIALIZING("Initializing"),
    @XmlEnumValue("Okay")
    OKAY("Okay"),
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    DmUDDISubSubscriptionStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmUDDISubSubscriptionStatus fromValue(String v) {
        for (DmUDDISubSubscriptionStatus c: DmUDDISubSubscriptionStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
