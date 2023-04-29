
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmFTPDataEncryptionPolicy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmFTPDataEncryptionPolicy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="enc-data-off"/>
 *     &lt;enumeration value="enc-data-opt"/>
 *     &lt;enumeration value="enc-data-req"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmFTPDataEncryptionPolicy")
@XmlEnum
public enum DmFTPDataEncryptionPolicy {

    @XmlEnumValue("enc-data-off")
    ENC_DATA_OFF("enc-data-off"),
    @XmlEnumValue("enc-data-opt")
    ENC_DATA_OPT("enc-data-opt"),
    @XmlEnumValue("enc-data-req")
    ENC_DATA_REQ("enc-data-req");
    private final String value;

    DmFTPDataEncryptionPolicy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmFTPDataEncryptionPolicy fromValue(String v) {
        for (DmFTPDataEncryptionPolicy c: DmFTPDataEncryptionPolicy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
