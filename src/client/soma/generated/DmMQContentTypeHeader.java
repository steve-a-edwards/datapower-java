
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmMQContentTypeHeader.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmMQContentTypeHeader">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="MQRFH"/>
 *     &lt;enumeration value="MQRFH2"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmMQContentTypeHeader")
@XmlEnum
public enum DmMQContentTypeHeader {

    @XmlEnumValue("None")
    NONE("None"),
    MQRFH("MQRFH"),
    @XmlEnumValue("MQRFH2")
    MQRFH_2("MQRFH2");
    private final String value;

    DmMQContentTypeHeader(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmMQContentTypeHeader fromValue(String v) {
        for (DmMQContentTypeHeader c: DmMQContentTypeHeader.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
