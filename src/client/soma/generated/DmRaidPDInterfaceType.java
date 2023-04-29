
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmRaidPDInterfaceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmRaidPDInterfaceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="parallelSCSI"/>
 *     &lt;enumeration value="sas"/>
 *     &lt;enumeration value="sata"/>
 *     &lt;enumeration value="fiberChannel"/>
 *     &lt;enumeration value="undefined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmRaidPDInterfaceType")
@XmlEnum
public enum DmRaidPDInterfaceType {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("parallelSCSI")
    PARALLEL_SCSI("parallelSCSI"),
    @XmlEnumValue("sas")
    SAS("sas"),
    @XmlEnumValue("sata")
    SATA("sata"),
    @XmlEnumValue("fiberChannel")
    FIBER_CHANNEL("fiberChannel"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined");
    private final String value;

    DmRaidPDInterfaceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmRaidPDInterfaceType fromValue(String v) {
        for (DmRaidPDInterfaceType c: DmRaidPDInterfaceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
