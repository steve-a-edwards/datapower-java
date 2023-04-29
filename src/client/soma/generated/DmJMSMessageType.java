
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmJMSMessageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmJMSMessageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="byte"/>
 *     &lt;enumeration value="text"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmJMSMessageType")
@XmlEnum
public enum DmJMSMessageType {

    @XmlEnumValue("byte")
    BYTE("byte"),
    @XmlEnumValue("text")
    TEXT("text");
    private final String value;

    DmJMSMessageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmJMSMessageType fromValue(String v) {
        for (DmJMSMessageType c: DmJMSMessageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
