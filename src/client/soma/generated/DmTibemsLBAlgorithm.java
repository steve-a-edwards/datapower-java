
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmTibemsLBAlgorithm.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmTibemsLBAlgorithm">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="least-connections"/>
 *     &lt;enumeration value="byte-rate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmTibemsLBAlgorithm")
@XmlEnum
public enum DmTibemsLBAlgorithm {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("least-connections")
    LEAST_CONNECTIONS("least-connections"),
    @XmlEnumValue("byte-rate")
    BYTE_RATE("byte-rate");
    private final String value;

    DmTibemsLBAlgorithm(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmTibemsLBAlgorithm fromValue(String v) {
        for (DmTibemsLBAlgorithm c: DmTibemsLBAlgorithm.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
