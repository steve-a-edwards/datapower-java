
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmRaidVolumeInactiveStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmRaidVolumeInactiveStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="active"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="stale-metadata"/>
 *     &lt;enumeration value="foreign-volume"/>
 *     &lt;enumeration value="insufficient-resources"/>
 *     &lt;enumeration value="clone-volume"/>
 *     &lt;enumeration value="insufficient-metadata"/>
 *     &lt;enumeration value="previously-deleted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmRaidVolumeInactiveStatus")
@XmlEnum
public enum DmRaidVolumeInactiveStatus {

    @XmlEnumValue("active")
    ACTIVE("active"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("stale-metadata")
    STALE_METADATA("stale-metadata"),
    @XmlEnumValue("foreign-volume")
    FOREIGN_VOLUME("foreign-volume"),
    @XmlEnumValue("insufficient-resources")
    INSUFFICIENT_RESOURCES("insufficient-resources"),
    @XmlEnumValue("clone-volume")
    CLONE_VOLUME("clone-volume"),
    @XmlEnumValue("insufficient-metadata")
    INSUFFICIENT_METADATA("insufficient-metadata"),
    @XmlEnumValue("previously-deleted")
    PREVIOUSLY_DELETED("previously-deleted");
    private final String value;

    DmRaidVolumeInactiveStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmRaidVolumeInactiveStatus fromValue(String v) {
        for (DmRaidVolumeInactiveStatus c: DmRaidVolumeInactiveStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
