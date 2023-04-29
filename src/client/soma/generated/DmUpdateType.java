
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmUpdateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmUpdateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="poll"/>
 *     &lt;enumeration value="subscribe"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmUpdateType")
@XmlEnum
public enum DmUpdateType {

    @XmlEnumValue("poll")
    POLL("poll"),
    @XmlEnumValue("subscribe")
    SUBSCRIBE("subscribe");
    private final String value;

    DmUpdateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmUpdateType fromValue(String v) {
        for (DmUpdateType c: DmUpdateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
