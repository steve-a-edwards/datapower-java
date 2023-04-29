
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmFTPResponseStorage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmFTPResponseStorage">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="temporary"/>
 *     &lt;enumeration value="nfs"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmFTPResponseStorage")
@XmlEnum
public enum DmFTPResponseStorage {

    @XmlEnumValue("temporary")
    TEMPORARY("temporary"),
    @XmlEnumValue("nfs")
    NFS("nfs");
    private final String value;

    DmFTPResponseStorage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmFTPResponseStorage fromValue(String v) {
        for (DmFTPResponseStorage c: DmFTPResponseStorage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
