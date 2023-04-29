
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmUDDISubServiceStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmUDDISubServiceStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Okay"/>
 *     &lt;enumeration value="MissingWSDL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmUDDISubServiceStatus")
@XmlEnum
public enum DmUDDISubServiceStatus {

    @XmlEnumValue("Okay")
    OKAY("Okay"),
    @XmlEnumValue("MissingWSDL")
    MISSING_WSDL("MissingWSDL");
    private final String value;

    DmUDDISubServiceStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmUDDISubServiceStatus fromValue(String v) {
        for (DmUDDISubServiceStatus c: DmUDDISubServiceStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
