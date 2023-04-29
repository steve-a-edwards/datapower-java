
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmFilesystemPurpose.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmFilesystemPurpose">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="localStorage"/>
 *     &lt;enumeration value="b2bPersistence"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmFilesystemPurpose")
@XmlEnum
public enum DmFilesystemPurpose {

    @XmlEnumValue("localStorage")
    LOCAL_STORAGE("localStorage"),
    @XmlEnumValue("b2bPersistence")
    B_2_B_PERSISTENCE("b2bPersistence");
    private final String value;

    DmFilesystemPurpose(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmFilesystemPurpose fromValue(String v) {
        for (DmFilesystemPurpose c: DmFilesystemPurpose.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
