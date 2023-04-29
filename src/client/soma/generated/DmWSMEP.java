
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSMEP.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmWSMEP">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OneWay"/>
 *     &lt;enumeration value="RequestResponse"/>
 *     &lt;enumeration value="SolicitResponse"/>
 *     &lt;enumeration value="Notification"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmWSMEP")
@XmlEnum
public enum DmWSMEP {

    @XmlEnumValue("OneWay")
    ONE_WAY("OneWay"),
    @XmlEnumValue("RequestResponse")
    REQUEST_RESPONSE("RequestResponse"),
    @XmlEnumValue("SolicitResponse")
    SOLICIT_RESPONSE("SolicitResponse"),
    @XmlEnumValue("Notification")
    NOTIFICATION("Notification"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    DmWSMEP(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmWSMEP fromValue(String v) {
        for (DmWSMEP c: DmWSMEP.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
