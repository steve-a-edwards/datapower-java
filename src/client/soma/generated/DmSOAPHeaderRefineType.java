
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSOAPHeaderRefineType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSOAPHeaderRefineType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="processed"/>
 *     &lt;enumeration value="unprocessed"/>
 *     &lt;enumeration value="keep"/>
 *     &lt;enumeration value="remove"/>
 *     &lt;enumeration value="fault"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSOAPHeaderRefineType")
@XmlEnum
public enum DmSOAPHeaderRefineType {

    @XmlEnumValue("processed")
    PROCESSED("processed"),
    @XmlEnumValue("unprocessed")
    UNPROCESSED("unprocessed"),
    @XmlEnumValue("keep")
    KEEP("keep"),
    @XmlEnumValue("remove")
    REMOVE("remove"),
    @XmlEnumValue("fault")
    FAULT("fault");
    private final String value;

    DmSOAPHeaderRefineType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSOAPHeaderRefineType fromValue(String v) {
        for (DmSOAPHeaderRefineType c: DmSOAPHeaderRefineType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
