
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmFTPDataTypePolicy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmFTPDataTypePolicy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ascii"/>
 *     &lt;enumeration value="binary"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmFTPDataTypePolicy")
@XmlEnum
public enum DmFTPDataTypePolicy {

    @XmlEnumValue("ascii")
    ASCII("ascii"),
    @XmlEnumValue("binary")
    BINARY("binary");
    private final String value;

    DmFTPDataTypePolicy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmFTPDataTypePolicy fromValue(String v) {
        for (DmFTPDataTypePolicy c: DmFTPDataTypePolicy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
