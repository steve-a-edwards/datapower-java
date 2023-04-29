
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSyslogFacility.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSyslogFacility">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="user"/>
 *     &lt;enumeration value="security"/>
 *     &lt;enumeration value="authpriv"/>
 *     &lt;enumeration value="local0"/>
 *     &lt;enumeration value="local1"/>
 *     &lt;enumeration value="local2"/>
 *     &lt;enumeration value="local3"/>
 *     &lt;enumeration value="local4"/>
 *     &lt;enumeration value="local5"/>
 *     &lt;enumeration value="local6"/>
 *     &lt;enumeration value="local7"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSyslogFacility")
@XmlEnum
public enum DmSyslogFacility {

    @XmlEnumValue("user")
    USER("user"),
    @XmlEnumValue("security")
    SECURITY("security"),
    @XmlEnumValue("authpriv")
    AUTHPRIV("authpriv"),
    @XmlEnumValue("local0")
    LOCAL_0("local0"),
    @XmlEnumValue("local1")
    LOCAL_1("local1"),
    @XmlEnumValue("local2")
    LOCAL_2("local2"),
    @XmlEnumValue("local3")
    LOCAL_3("local3"),
    @XmlEnumValue("local4")
    LOCAL_4("local4"),
    @XmlEnumValue("local5")
    LOCAL_5("local5"),
    @XmlEnumValue("local6")
    LOCAL_6("local6"),
    @XmlEnumValue("local7")
    LOCAL_7("local7");
    private final String value;

    DmSyslogFacility(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSyslogFacility fromValue(String v) {
        for (DmSyslogFacility c: DmSyslogFacility.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
