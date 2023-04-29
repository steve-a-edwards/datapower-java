
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmLogStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmLogStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="active"/>
 *     &lt;enumeration value="warning"/>
 *     &lt;enumeration value="failure"/>
 *     &lt;enumeration value="suspended"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmLogStatus")
@XmlEnum
public enum DmLogStatus {

    @XmlEnumValue("active")
    ACTIVE("active"),
    @XmlEnumValue("warning")
    WARNING("warning"),
    @XmlEnumValue("failure")
    FAILURE("failure"),
    @XmlEnumValue("suspended")
    SUSPENDED("suspended");
    private final String value;

    DmLogStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmLogStatus fromValue(String v) {
        for (DmLogStatus c: DmLogStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
