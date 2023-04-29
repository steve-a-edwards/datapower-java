
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSLMActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSLMActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="log-only"/>
 *     &lt;enumeration value="reject"/>
 *     &lt;enumeration value="shape"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSLMActionType")
@XmlEnum
public enum DmSLMActionType {

    @XmlEnumValue("log-only")
    LOG_ONLY("log-only"),
    @XmlEnumValue("reject")
    REJECT("reject"),
    @XmlEnumValue("shape")
    SHAPE("shape");
    private final String value;

    DmSLMActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSLMActionType fromValue(String v) {
        for (DmSLMActionType c: DmSLMActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
