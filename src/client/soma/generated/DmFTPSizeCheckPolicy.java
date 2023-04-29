
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmFTPSizeCheckPolicy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmFTPSizeCheckPolicy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="size-check-optional"/>
 *     &lt;enumeration value="size-check-disabled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmFTPSizeCheckPolicy")
@XmlEnum
public enum DmFTPSizeCheckPolicy {

    @XmlEnumValue("size-check-optional")
    SIZE_CHECK_OPTIONAL("size-check-optional"),
    @XmlEnumValue("size-check-disabled")
    SIZE_CHECK_DISABLED("size-check-disabled");
    private final String value;

    DmFTPSizeCheckPolicy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmFTPSizeCheckPolicy fromValue(String v) {
        for (DmFTPSizeCheckPolicy c: DmFTPSizeCheckPolicy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
