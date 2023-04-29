
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSSHProfileUsage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSSHProfileUsage">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="sftp"/>
 *     &lt;enumeration value="scc"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSSHProfileUsage")
@XmlEnum
public enum DmSSHProfileUsage {

    @XmlEnumValue("sftp")
    SFTP("sftp"),
    @XmlEnumValue("scc")
    SCC("scc");
    private final String value;

    DmSSHProfileUsage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSSHProfileUsage fromValue(String v) {
        for (DmSSHProfileUsage c: DmSSHProfileUsage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
