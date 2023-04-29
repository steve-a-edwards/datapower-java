
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmInterfaceOperStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmInterfaceOperStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="up"/>
 *     &lt;enumeration value="down"/>
 *     &lt;enumeration value="testing"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="dormant"/>
 *     &lt;enumeration value="notPresent"/>
 *     &lt;enumeration value="lowerLayerDown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmInterfaceOperStatus")
@XmlEnum
public enum DmInterfaceOperStatus {

    @XmlEnumValue("up")
    UP("up"),
    @XmlEnumValue("down")
    DOWN("down"),
    @XmlEnumValue("testing")
    TESTING("testing"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("dormant")
    DORMANT("dormant"),
    @XmlEnumValue("notPresent")
    NOT_PRESENT("notPresent"),
    @XmlEnumValue("lowerLayerDown")
    LOWER_LAYER_DOWN("lowerLayerDown");
    private final String value;

    DmInterfaceOperStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmInterfaceOperStatus fromValue(String v) {
        for (DmInterfaceOperStatus c: DmInterfaceOperStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
