
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmXMLReqRespType1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmXMLReqRespType1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="soap"/>
 *     &lt;enumeration value="xml"/>
 *     &lt;enumeration value="unprocessed"/>
 *     &lt;enumeration value="preprocessed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmXMLReqRespType1")
@XmlEnum
public enum DmXMLReqRespType1 {

    @XmlEnumValue("soap")
    SOAP("soap"),
    @XmlEnumValue("xml")
    XML("xml"),
    @XmlEnumValue("unprocessed")
    UNPROCESSED("unprocessed"),
    @XmlEnumValue("preprocessed")
    PREPROCESSED("preprocessed");
    private final String value;

    DmXMLReqRespType1(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmXMLReqRespType1 fromValue(String v) {
        for (DmXMLReqRespType1 c: DmXMLReqRespType1 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
