
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmPeerGroupType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmPeerGroupType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="slm"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmPeerGroupType")
@XmlEnum
public enum DmPeerGroupType {

    @XmlEnumValue("slm")
    SLM("slm");
    private final String value;

    DmPeerGroupType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmPeerGroupType fromValue(String v) {
        for (DmPeerGroupType c: DmPeerGroupType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
