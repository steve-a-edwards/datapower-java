
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmNegotiateStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmNegotiateStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="no"/>
 *     &lt;enumeration value="auto"/>
 *     &lt;enumeration value="failed"/>
 *     &lt;enumeration value="restarted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmNegotiateStatus")
@XmlEnum
public enum DmNegotiateStatus {

    @XmlEnumValue("no")
    NO("no"),
    @XmlEnumValue("auto")
    AUTO("auto"),
    @XmlEnumValue("failed")
    FAILED("failed"),
    @XmlEnumValue("restarted")
    RESTARTED("restarted");
    private final String value;

    DmNegotiateStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmNegotiateStatus fromValue(String v) {
        for (DmNegotiateStatus c: DmNegotiateStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
