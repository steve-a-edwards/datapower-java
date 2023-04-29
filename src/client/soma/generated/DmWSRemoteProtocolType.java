
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSRemoteProtocolType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmWSRemoteProtocolType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="default"/>
 *     &lt;enumeration value="http"/>
 *     &lt;enumeration value="https"/>
 *     &lt;enumeration value="dpmq"/>
 *     &lt;enumeration value="mq"/>
 *     &lt;enumeration value="dptibems"/>
 *     &lt;enumeration value="tibems"/>
 *     &lt;enumeration value="dpwasjms"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmWSRemoteProtocolType")
@XmlEnum
public enum DmWSRemoteProtocolType {

    @XmlEnumValue("default")
    DEFAULT("default"),
    @XmlEnumValue("http")
    HTTP("http"),
    @XmlEnumValue("https")
    HTTPS("https"),
    @XmlEnumValue("dpmq")
    DPMQ("dpmq"),
    @XmlEnumValue("mq")
    MQ("mq"),
    @XmlEnumValue("dptibems")
    DPTIBEMS("dptibems"),
    @XmlEnumValue("tibems")
    TIBEMS("tibems"),
    @XmlEnumValue("dpwasjms")
    DPWASJMS("dpwasjms");
    private final String value;

    DmWSRemoteProtocolType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmWSRemoteProtocolType fromValue(String v) {
        for (DmWSRemoteProtocolType c: DmWSRemoteProtocolType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
