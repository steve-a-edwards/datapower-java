
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSDLComponentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmWSDLComponentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="all"/>
 *     &lt;enumeration value="subscription"/>
 *     &lt;enumeration value="wsdl"/>
 *     &lt;enumeration value="service"/>
 *     &lt;enumeration value="port"/>
 *     &lt;enumeration value="operation"/>
 *     &lt;enumeration value="fragmentid"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmWSDLComponentType")
@XmlEnum
public enum DmWSDLComponentType {

    @XmlEnumValue("all")
    ALL("all"),
    @XmlEnumValue("subscription")
    SUBSCRIPTION("subscription"),
    @XmlEnumValue("wsdl")
    WSDL("wsdl"),
    @XmlEnumValue("service")
    SERVICE("service"),
    @XmlEnumValue("port")
    PORT("port"),
    @XmlEnumValue("operation")
    OPERATION("operation"),
    @XmlEnumValue("fragmentid")
    FRAGMENTID("fragmentid");
    private final String value;

    DmWSDLComponentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmWSDLComponentType fromValue(String v) {
        for (DmWSDLComponentType c: DmWSDLComponentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
