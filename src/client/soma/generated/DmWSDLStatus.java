
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSDLStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmWSDLStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Processing"/>
 *     &lt;enumeration value="Okay"/>
 *     &lt;enumeration value="Warning"/>
 *     &lt;enumeration value="Error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmWSDLStatus")
@XmlEnum
public enum DmWSDLStatus {

    @XmlEnumValue("Processing")
    PROCESSING("Processing"),
    @XmlEnumValue("Okay")
    OKAY("Okay"),
    @XmlEnumValue("Warning")
    WARNING("Warning"),
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    DmWSDLStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmWSDLStatus fromValue(String v) {
        for (DmWSDLStatus c: DmWSDLStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
