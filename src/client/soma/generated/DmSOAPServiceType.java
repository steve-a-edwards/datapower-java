
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSOAPServiceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSOAPServiceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ultimate"/>
 *     &lt;enumeration value="intermediary"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSOAPServiceType")
@XmlEnum
public enum DmSOAPServiceType {

    @XmlEnumValue("ultimate")
    ULTIMATE("ultimate"),
    @XmlEnumValue("intermediary")
    INTERMEDIARY("intermediary");
    private final String value;

    DmSOAPServiceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSOAPServiceType fromValue(String v) {
        for (DmSOAPServiceType c: DmSOAPServiceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
