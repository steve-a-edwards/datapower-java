
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmNFSMountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmNFSMountType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="staticURL"/>
 *     &lt;enumeration value="dynamicURL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmNFSMountType")
@XmlEnum
public enum DmNFSMountType {

    @XmlEnumValue("staticURL")
    STATIC_URL("staticURL"),
    @XmlEnumValue("dynamicURL")
    DYNAMIC_URL("dynamicURL");
    private final String value;

    DmNFSMountType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmNFSMountType fromValue(String v) {
        for (DmNFSMountType c: DmNFSMountType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
