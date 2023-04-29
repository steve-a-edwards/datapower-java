
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmLogFileUploadMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmLogFileUploadMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ftp"/>
 *     &lt;enumeration value="scp"/>
 *     &lt;enumeration value="sftp"/>
 *     &lt;enumeration value="smtp"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmLogFileUploadMethod")
@XmlEnum
public enum DmLogFileUploadMethod {

    @XmlEnumValue("ftp")
    FTP("ftp"),
    @XmlEnumValue("scp")
    SCP("scp"),
    @XmlEnumValue("sftp")
    SFTP("sftp"),
    @XmlEnumValue("smtp")
    SMTP("smtp");
    private final String value;

    DmLogFileUploadMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmLogFileUploadMethod fromValue(String v) {
        for (DmLogFileUploadMethod c: DmLogFileUploadMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
