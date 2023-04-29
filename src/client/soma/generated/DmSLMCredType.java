
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSLMCredType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSLMCredType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="aaa-mapped-credential"/>
 *     &lt;enumeration value="aaa-username"/>
 *     &lt;enumeration value="mq-application"/>
 *     &lt;enumeration value="client-ip"/>
 *     &lt;enumeration value="request-header"/>
 *     &lt;enumeration value="ip-from-header"/>
 *     &lt;enumeration value="custom-stylesheet"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSLMCredType")
@XmlEnum
public enum DmSLMCredType {

    @XmlEnumValue("aaa-mapped-credential")
    AAA_MAPPED_CREDENTIAL("aaa-mapped-credential"),
    @XmlEnumValue("aaa-username")
    AAA_USERNAME("aaa-username"),
    @XmlEnumValue("mq-application")
    MQ_APPLICATION("mq-application"),
    @XmlEnumValue("client-ip")
    CLIENT_IP("client-ip"),
    @XmlEnumValue("request-header")
    REQUEST_HEADER("request-header"),
    @XmlEnumValue("ip-from-header")
    IP_FROM_HEADER("ip-from-header"),
    @XmlEnumValue("custom-stylesheet")
    CUSTOM_STYLESHEET("custom-stylesheet");
    private final String value;

    DmSLMCredType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSLMCredType fromValue(String v) {
        for (DmSLMCredType c: DmSLMCredType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
