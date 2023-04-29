
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmFilesystemEncryptionKeySource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmFilesystemEncryptionKeySource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="na"/>
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="internalKey"/>
 *     &lt;enumeration value="userPassphrase"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmFilesystemEncryptionKeySource")
@XmlEnum
public enum DmFilesystemEncryptionKeySource {

    @XmlEnumValue("na")
    NA("na"),
    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("internalKey")
    INTERNAL_KEY("internalKey"),
    @XmlEnumValue("userPassphrase")
    USER_PASSPHRASE("userPassphrase");
    private final String value;

    DmFilesystemEncryptionKeySource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmFilesystemEncryptionKeySource fromValue(String v) {
        for (DmFilesystemEncryptionKeySource c: DmFilesystemEncryptionKeySource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
