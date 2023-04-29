
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmPasswordRetrievalMechanism.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmPasswordRetrievalMechanism">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="xmlfile"/>
 *     &lt;enumeration value="custom"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmPasswordRetrievalMechanism")
@XmlEnum
public enum DmPasswordRetrievalMechanism {

    @XmlEnumValue("xmlfile")
    XMLFILE("xmlfile"),
    @XmlEnumValue("custom")
    CUSTOM("custom");
    private final String value;

    DmPasswordRetrievalMechanism(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmPasswordRetrievalMechanism fromValue(String v) {
        for (DmPasswordRetrievalMechanism c: DmPasswordRetrievalMechanism.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
