
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmMauAutoNegFault.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmMauAutoNegFault">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="noError"/>
 *     &lt;enumeration value="offline"/>
 *     &lt;enumeration value="linkFailure"/>
 *     &lt;enumeration value="autoNegError"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmMauAutoNegFault")
@XmlEnum
public enum DmMauAutoNegFault {

    @XmlEnumValue("noError")
    NO_ERROR("noError"),
    @XmlEnumValue("offline")
    OFFLINE("offline"),
    @XmlEnumValue("linkFailure")
    LINK_FAILURE("linkFailure"),
    @XmlEnumValue("autoNegError")
    AUTO_NEG_ERROR("autoNegError");
    private final String value;

    DmMauAutoNegFault(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmMauAutoNegFault fromValue(String v) {
        for (DmMauAutoNegFault c: DmMauAutoNegFault.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
