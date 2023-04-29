
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmIteratorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmIteratorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="XPATH"/>
 *     &lt;enumeration value="COUNT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmIteratorType")
@XmlEnum
public enum DmIteratorType {

    XPATH,
    COUNT;

    public String value() {
        return name();
    }

    public static DmIteratorType fromValue(String v) {
        return valueOf(v);
    }

}
