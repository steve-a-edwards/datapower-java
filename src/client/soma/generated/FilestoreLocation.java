
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for filestore-location.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="filestore-location">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="local:"/>
 *     &lt;enumeration value="store:"/>
 *     &lt;enumeration value="export:"/>
 *     &lt;enumeration value="cert:"/>
 *     &lt;enumeration value="sharedcert:"/>
 *     &lt;enumeration value="pubcert:"/>
 *     &lt;enumeration value="image:"/>
 *     &lt;enumeration value="config:"/>
 *     &lt;enumeration value="chkpoints:"/>
 *     &lt;enumeration value="logtemp:"/>
 *     &lt;enumeration value="logstore:"/>
 *     &lt;enumeration value="temporary:"/>
 *     &lt;enumeration value="tasktemplates:"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "filestore-location")
@XmlEnum
public enum FilestoreLocation {

    @XmlEnumValue("local:")
    LOCAL("local:"),
    @XmlEnumValue("store:")
    STORE("store:"),
    @XmlEnumValue("export:")
    EXPORT("export:"),
    @XmlEnumValue("cert:")
    CERT("cert:"),
    @XmlEnumValue("sharedcert:")
    SHAREDCERT("sharedcert:"),
    @XmlEnumValue("pubcert:")
    PUBCERT("pubcert:"),
    @XmlEnumValue("image:")
    IMAGE("image:"),
    @XmlEnumValue("config:")
    CONFIG("config:"),
    @XmlEnumValue("chkpoints:")
    CHKPOINTS("chkpoints:"),
    @XmlEnumValue("logtemp:")
    LOGTEMP("logtemp:"),
    @XmlEnumValue("logstore:")
    LOGSTORE("logstore:"),
    @XmlEnumValue("temporary:")
    TEMPORARY("temporary:"),
    @XmlEnumValue("tasktemplates:")
    TASKTEMPLATES("tasktemplates:");
    private final String value;

    FilestoreLocation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FilestoreLocation fromValue(String v) {
        for (FilestoreLocation c: FilestoreLocation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
