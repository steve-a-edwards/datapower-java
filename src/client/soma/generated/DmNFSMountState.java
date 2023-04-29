
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmNFSMountState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmNFSMountState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="new"/>
 *     &lt;enumeration value="mounting"/>
 *     &lt;enumeration value="up"/>
 *     &lt;enumeration value="down"/>
 *     &lt;enumeration value="unmounting"/>
 *     &lt;enumeration value="unmountingForRemount"/>
 *     &lt;enumeration value="unmounted"/>
 *     &lt;enumeration value="defective"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmNFSMountState")
@XmlEnum
public enum DmNFSMountState {

    @XmlEnumValue("new")
    NEW("new"),
    @XmlEnumValue("mounting")
    MOUNTING("mounting"),
    @XmlEnumValue("up")
    UP("up"),
    @XmlEnumValue("down")
    DOWN("down"),
    @XmlEnumValue("unmounting")
    UNMOUNTING("unmounting"),
    @XmlEnumValue("unmountingForRemount")
    UNMOUNTING_FOR_REMOUNT("unmountingForRemount"),
    @XmlEnumValue("unmounted")
    UNMOUNTED("unmounted"),
    @XmlEnumValue("defective")
    DEFECTIVE("defective");
    private final String value;

    DmNFSMountState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmNFSMountState fromValue(String v) {
        for (DmNFSMountState c: DmNFSMountState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
