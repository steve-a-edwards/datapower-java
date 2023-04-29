
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmTransportType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmTransportType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="mq"/>
 *     &lt;enumeration value="http"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmTransportType")
@XmlEnum
public enum DmTransportType {

    @XmlEnumValue("mq")
    MQ("mq"),
    @XmlEnumValue("http")
    HTTP("http");
    private final String value;

    DmTransportType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmTransportType fromValue(String v) {
        for (DmTransportType c: DmTransportType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
