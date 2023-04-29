
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmNodeDirection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmNodeDirection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MQ2HTTP"/>
 *     &lt;enumeration value="HTTP2MQ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmNodeDirection")
@XmlEnum
public enum DmNodeDirection {

    @XmlEnumValue("MQ2HTTP")
    MQ_2_HTTP("MQ2HTTP"),
    @XmlEnumValue("HTTP2MQ")
    HTTP_2_MQ("HTTP2MQ");
    private final String value;

    DmNodeDirection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmNodeDirection fromValue(String v) {
        for (DmNodeDirection c: DmNodeDirection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
