
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmMauAutoNegRemoteSignaling.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmMauAutoNegRemoteSignaling">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="detected"/>
 *     &lt;enumeration value="notDetected"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmMauAutoNegRemoteSignaling")
@XmlEnum
public enum DmMauAutoNegRemoteSignaling {

    @XmlEnumValue("detected")
    DETECTED("detected"),
    @XmlEnumValue("notDetected")
    NOT_DETECTED("notDetected");
    private final String value;

    DmMauAutoNegRemoteSignaling(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmMauAutoNegRemoteSignaling fromValue(String v) {
        for (DmMauAutoNegRemoteSignaling c: DmMauAutoNegRemoteSignaling.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
