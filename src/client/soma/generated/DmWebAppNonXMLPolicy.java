
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWebAppNonXMLPolicy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmWebAppNonXMLPolicy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="nothing"/>
 *     &lt;enumeration value="side"/>
 *     &lt;enumeration value="binary"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmWebAppNonXMLPolicy")
@XmlEnum
public enum DmWebAppNonXMLPolicy {

    @XmlEnumValue("nothing")
    NOTHING("nothing"),
    @XmlEnumValue("side")
    SIDE("side"),
    @XmlEnumValue("binary")
    BINARY("binary");
    private final String value;

    DmWebAppNonXMLPolicy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmWebAppNonXMLPolicy fromValue(String v) {
        for (DmWebAppNonXMLPolicy c: DmWebAppNonXMLPolicy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
