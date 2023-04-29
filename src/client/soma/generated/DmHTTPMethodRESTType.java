
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmHTTPMethodRESTType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmHTTPMethodRESTType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="POST"/>
 *     &lt;enumeration value="GET"/>
 *     &lt;enumeration value="PUT"/>
 *     &lt;enumeration value="DELETE"/>
 *     &lt;enumeration value="HEAD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmHTTPMethodRESTType")
@XmlEnum
public enum DmHTTPMethodRESTType {

    POST,
    GET,
    PUT,
    DELETE,
    HEAD;

    public String value() {
        return name();
    }

    public static DmHTTPMethodRESTType fromValue(String v) {
        return valueOf(v);
    }

}
