
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmXACMLPEPType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmXACMLPEPType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="base"/>
 *     &lt;enumeration value="deny-biased"/>
 *     &lt;enumeration value="permit-biased"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmXACMLPEPType")
@XmlEnum
public enum DmXACMLPEPType {

    @XmlEnumValue("base")
    BASE("base"),
    @XmlEnumValue("deny-biased")
    DENY_BIASED("deny-biased"),
    @XmlEnumValue("permit-biased")
    PERMIT_BIASED("permit-biased");
    private final String value;

    DmXACMLPEPType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmXACMLPEPType fromValue(String v) {
        for (DmXACMLPEPType c: DmXACMLPEPType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
