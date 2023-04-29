
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmFTPResponseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmFTPResponseType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="virtual-filesystem"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmFTPResponseType")
@XmlEnum
public enum DmFTPResponseType {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("virtual-filesystem")
    VIRTUAL_FILESYSTEM("virtual-filesystem");
    private final String value;

    DmFTPResponseType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmFTPResponseType fromValue(String v) {
        for (DmFTPResponseType c: DmFTPResponseType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
