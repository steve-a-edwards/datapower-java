
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmJMSUnsubscribe.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmJMSUnsubscribe">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="never"/>
 *     &lt;enumeration value="ondelete"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmJMSUnsubscribe")
@XmlEnum
public enum DmJMSUnsubscribe {

    @XmlEnumValue("never")
    NEVER("never"),
    @XmlEnumValue("ondelete")
    ONDELETE("ondelete");
    private final String value;

    DmJMSUnsubscribe(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmJMSUnsubscribe fromValue(String v) {
        for (DmJMSUnsubscribe c: DmJMSUnsubscribe.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
