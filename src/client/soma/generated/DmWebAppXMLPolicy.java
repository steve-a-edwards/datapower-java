
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWebAppXMLPolicy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmWebAppXMLPolicy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="nothing"/>
 *     &lt;enumeration value="xml"/>
 *     &lt;enumeration value="soap"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmWebAppXMLPolicy")
@XmlEnum
public enum DmWebAppXMLPolicy {

    @XmlEnumValue("nothing")
    NOTHING("nothing"),
    @XmlEnumValue("xml")
    XML("xml"),
    @XmlEnumValue("soap")
    SOAP("soap");
    private final String value;

    DmWebAppXMLPolicy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmWebAppXMLPolicy fromValue(String v) {
        for (DmWebAppXMLPolicy c: DmWebAppXMLPolicy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
