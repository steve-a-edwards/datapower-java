
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSGatewayType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmWSGatewayType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="static-backend"/>
 *     &lt;enumeration value="dynamic-backend"/>
 *     &lt;enumeration value="static-from-wsdl"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmWSGatewayType")
@XmlEnum
public enum DmWSGatewayType {

    @XmlEnumValue("static-backend")
    STATIC_BACKEND("static-backend"),
    @XmlEnumValue("dynamic-backend")
    DYNAMIC_BACKEND("dynamic-backend"),
    @XmlEnumValue("static-from-wsdl")
    STATIC_FROM_WSDL("static-from-wsdl");
    private final String value;

    DmWSGatewayType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmWSGatewayType fromValue(String v) {
        for (DmWSGatewayType c: DmWSGatewayType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
