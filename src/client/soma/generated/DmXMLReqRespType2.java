
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmXMLReqRespType2.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmXMLReqRespType2">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="soap"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmXMLReqRespType2")
@XmlEnum
public enum DmXMLReqRespType2 {

    @XmlEnumValue("soap")
    SOAP("soap");
    private final String value;

    DmXMLReqRespType2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmXMLReqRespType2 fromValue(String v) {
        for (DmXMLReqRespType2 c: DmXMLReqRespType2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
