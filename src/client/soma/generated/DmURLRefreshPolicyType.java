
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmURLRefreshPolicyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmURLRefreshPolicyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="default"/>
 *     &lt;enumeration value="no-cache"/>
 *     &lt;enumeration value="no-flush"/>
 *     &lt;enumeration value="protocol-specified"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmURLRefreshPolicyType")
@XmlEnum
public enum DmURLRefreshPolicyType {

    @XmlEnumValue("default")
    DEFAULT("default"),
    @XmlEnumValue("no-cache")
    NO_CACHE("no-cache"),
    @XmlEnumValue("no-flush")
    NO_FLUSH("no-flush"),
    @XmlEnumValue("protocol-specified")
    PROTOCOL_SPECIFIED("protocol-specified");
    private final String value;

    DmURLRefreshPolicyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmURLRefreshPolicyType fromValue(String v) {
        for (DmURLRefreshPolicyType c: DmURLRefreshPolicyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
