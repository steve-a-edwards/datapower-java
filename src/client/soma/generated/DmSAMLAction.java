
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSAMLAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSAMLAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AllHTTP"/>
 *     &lt;enumeration value="POST"/>
 *     &lt;enumeration value="GET"/>
 *     &lt;enumeration value="PUT"/>
 *     &lt;enumeration value="HEAD"/>
 *     &lt;enumeration value="General"/>
 *     &lt;enumeration value="Read"/>
 *     &lt;enumeration value="Write"/>
 *     &lt;enumeration value="Execute"/>
 *     &lt;enumeration value="Delete"/>
 *     &lt;enumeration value="Control"/>
 *     &lt;enumeration value="NegatedRead"/>
 *     &lt;enumeration value="NegatedWrite"/>
 *     &lt;enumeration value="NegatedExecute"/>
 *     &lt;enumeration value="NegatedDelete"/>
 *     &lt;enumeration value="NegatedControl"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSAMLAction")
@XmlEnum
public enum DmSAMLAction {

    @XmlEnumValue("AllHTTP")
    ALL_HTTP("AllHTTP"),
    POST("POST"),
    GET("GET"),
    PUT("PUT"),
    HEAD("HEAD"),
    @XmlEnumValue("General")
    GENERAL("General"),
    @XmlEnumValue("Read")
    READ("Read"),
    @XmlEnumValue("Write")
    WRITE("Write"),
    @XmlEnumValue("Execute")
    EXECUTE("Execute"),
    @XmlEnumValue("Delete")
    DELETE("Delete"),
    @XmlEnumValue("Control")
    CONTROL("Control"),
    @XmlEnumValue("NegatedRead")
    NEGATED_READ("NegatedRead"),
    @XmlEnumValue("NegatedWrite")
    NEGATED_WRITE("NegatedWrite"),
    @XmlEnumValue("NegatedExecute")
    NEGATED_EXECUTE("NegatedExecute"),
    @XmlEnumValue("NegatedDelete")
    NEGATED_DELETE("NegatedDelete"),
    @XmlEnumValue("NegatedControl")
    NEGATED_CONTROL("NegatedControl");
    private final String value;

    DmSAMLAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSAMLAction fromValue(String v) {
        for (DmSAMLAction c: DmSAMLAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
