
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmProcessingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmProcessingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="all"/>
 *     &lt;enumeration value="response"/>
 *     &lt;enumeration value="request"/>
 *     &lt;enumeration value="call"/>
 *     &lt;enumeration value="error"/>
 *     &lt;enumeration value="scheduled"/>
 *     &lt;enumeration value="lbhealth"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmProcessingType")
@XmlEnum
public enum DmProcessingType {

    @XmlEnumValue("all")
    ALL("all"),
    @XmlEnumValue("response")
    RESPONSE("response"),
    @XmlEnumValue("request")
    REQUEST("request"),
    @XmlEnumValue("call")
    CALL("call"),
    @XmlEnumValue("error")
    ERROR("error"),
    @XmlEnumValue("scheduled")
    SCHEDULED("scheduled"),
    @XmlEnumValue("lbhealth")
    LBHEALTH("lbhealth");
    private final String value;

    DmProcessingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmProcessingType fromValue(String v) {
        for (DmProcessingType c: DmProcessingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
