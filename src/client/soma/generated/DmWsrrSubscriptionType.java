
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWsrrSubscriptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmWsrrSubscriptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="wsdl"/>
 *     &lt;enumeration value="concept"/>
 *     &lt;enumeration value="saved-search"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmWsrrSubscriptionType")
@XmlEnum
public enum DmWsrrSubscriptionType {

    @XmlEnumValue("wsdl")
    WSDL("wsdl"),
    @XmlEnumValue("concept")
    CONCEPT("concept"),
    @XmlEnumValue("saved-search")
    SAVED_SEARCH("saved-search");
    private final String value;

    DmWsrrSubscriptionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmWsrrSubscriptionType fromValue(String v) {
        for (DmWsrrSubscriptionType c: DmWsrrSubscriptionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
