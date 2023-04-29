
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSAOriginatedRequestType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmWSAOriginatedRequestType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="sync"/>
 *     &lt;enumeration value="async"/>
 *     &lt;enumeration value="oob"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmWSAOriginatedRequestType")
@XmlEnum
public enum DmWSAOriginatedRequestType {

    @XmlEnumValue("sync")
    SYNC("sync"),
    @XmlEnumValue("async")
    ASYNC("async"),
    @XmlEnumValue("oob")
    OOB("oob");
    private final String value;

    DmWSAOriginatedRequestType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmWSAOriginatedRequestType fromValue(String v) {
        for (DmWSAOriginatedRequestType c: DmWSAOriginatedRequestType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
