
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmMQServiceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmMQServiceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MQgateway"/>
 *     &lt;enumeration value="MQhost"/>
 *     &lt;enumeration value="MQproxy"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmMQServiceType")
@XmlEnum
public enum DmMQServiceType {

    @XmlEnumValue("MQgateway")
    M_QGATEWAY("MQgateway"),
    @XmlEnumValue("MQhost")
    M_QHOST("MQhost"),
    @XmlEnumValue("MQproxy")
    M_QPROXY("MQproxy");
    private final String value;

    DmMQServiceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmMQServiceType fromValue(String v) {
        for (DmMQServiceType c: DmMQServiceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
