
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmXMLReqRespType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmXMLReqRespType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="soap"/>
 *     &lt;enumeration value="xml"/>
 *     &lt;enumeration value="unprocessed"/>
 *     &lt;enumeration value="preprocessed"/>
 *     &lt;enumeration value="json"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmXMLReqRespType")
@XmlEnum
public enum DmXMLReqRespType {

    @XmlEnumValue("soap")
    SOAP("soap"),
    @XmlEnumValue("xml")
    XML("xml"),
    @XmlEnumValue("unprocessed")
    UNPROCESSED("unprocessed"),
    @XmlEnumValue("preprocessed")
    PREPROCESSED("preprocessed"),
    @XmlEnumValue("json")
    JSON("json");
    private final String value;

    DmXMLReqRespType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmXMLReqRespType fromValue(String v) {
        for (DmXMLReqRespType c: DmXMLReqRespType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
