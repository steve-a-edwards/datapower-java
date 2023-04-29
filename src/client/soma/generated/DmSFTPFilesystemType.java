
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSFTPFilesystemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSFTPFilesystemType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="transparent"/>
 *     &lt;enumeration value="virtual-ephemeral"/>
 *     &lt;enumeration value="virtual-persistent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSFTPFilesystemType")
@XmlEnum
public enum DmSFTPFilesystemType {

    @XmlEnumValue("transparent")
    TRANSPARENT("transparent"),
    @XmlEnumValue("virtual-ephemeral")
    VIRTUAL_EPHEMERAL("virtual-ephemeral"),
    @XmlEnumValue("virtual-persistent")
    VIRTUAL_PERSISTENT("virtual-persistent");
    private final String value;

    DmSFTPFilesystemType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSFTPFilesystemType fromValue(String v) {
        for (DmSFTPFilesystemType c: DmSFTPFilesystemType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
