
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSOperationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmWSOperationStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Registered"/>
 *     &lt;enumeration value="Unregistered"/>
 *     &lt;enumeration value="RegistrationError"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmWSOperationStatus")
@XmlEnum
public enum DmWSOperationStatus {

    @XmlEnumValue("Registered")
    REGISTERED("Registered"),
    @XmlEnumValue("Unregistered")
    UNREGISTERED("Unregistered"),
    @XmlEnumValue("RegistrationError")
    REGISTRATION_ERROR("RegistrationError");
    private final String value;

    DmWSOperationStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmWSOperationStatus fromValue(String v) {
        for (DmWSOperationStatus c: DmWSOperationStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
