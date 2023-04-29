
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmDocCachePolicyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmDocCachePolicyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="protocol"/>
 *     &lt;enumeration value="no-cache"/>
 *     &lt;enumeration value="fixed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmDocCachePolicyType")
@XmlEnum
public enum DmDocCachePolicyType {

    @XmlEnumValue("protocol")
    PROTOCOL("protocol"),
    @XmlEnumValue("no-cache")
    NO_CACHE("no-cache"),
    @XmlEnumValue("fixed")
    FIXED("fixed");
    private final String value;

    DmDocCachePolicyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmDocCachePolicyType fromValue(String v) {
        for (DmDocCachePolicyType c: DmDocCachePolicyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
