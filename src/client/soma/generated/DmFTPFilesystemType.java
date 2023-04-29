
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmFTPFilesystemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmFTPFilesystemType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="virtual-ephemeral"/>
 *     &lt;enumeration value="virtual-persistent"/>
 *     &lt;enumeration value="transparent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmFTPFilesystemType")
@XmlEnum
public enum DmFTPFilesystemType {

    @XmlEnumValue("virtual-ephemeral")
    VIRTUAL_EPHEMERAL("virtual-ephemeral"),
    @XmlEnumValue("virtual-persistent")
    VIRTUAL_PERSISTENT("virtual-persistent"),
    @XmlEnumValue("transparent")
    TRANSPARENT("transparent");
    private final String value;

    DmFTPFilesystemType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmFTPFilesystemType fromValue(String v) {
        for (DmFTPFilesystemType c: DmFTPFilesystemType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
