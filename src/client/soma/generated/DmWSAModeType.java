
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSAModeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmWSAModeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="wsa2sync"/>
 *     &lt;enumeration value="sync2wsa"/>
 *     &lt;enumeration value="wsa2wsa"/>
 *     &lt;enumeration value="sync2sync"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmWSAModeType")
@XmlEnum
public enum DmWSAModeType {

    @XmlEnumValue("wsa2sync")
    WSA_2_SYNC("wsa2sync"),
    @XmlEnumValue("sync2wsa")
    SYNC_2_WSA("sync2wsa"),
    @XmlEnumValue("wsa2wsa")
    WSA_2_WSA("wsa2wsa"),
    @XmlEnumValue("sync2sync")
    SYNC_2_SYNC("sync2sync");
    private final String value;

    DmWSAModeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmWSAModeType fromValue(String v) {
        for (DmWSAModeType c: DmWSAModeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
