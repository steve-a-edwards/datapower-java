
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmFilesystemPartitionEncryption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmFilesystemPartitionEncryption">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None-Unsupported"/>
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="aes"/>
 *     &lt;enumeration value="aesSha"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmFilesystemPartitionEncryption")
@XmlEnum
public enum DmFilesystemPartitionEncryption {

    @XmlEnumValue("None-Unsupported")
    NONE_UNSUPPORTED("None-Unsupported"),
    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("aes")
    AES("aes"),
    @XmlEnumValue("aesSha")
    AES_SHA("aesSha");
    private final String value;

    DmFilesystemPartitionEncryption(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmFilesystemPartitionEncryption fromValue(String v) {
        for (DmFilesystemPartitionEncryption c: DmFilesystemPartitionEncryption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
