
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmTFIMRetrieveMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmTFIMRetrieveMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CallTFIM"/>
 *     &lt;enumeration value="FromMC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmTFIMRetrieveMode")
@XmlEnum
public enum DmTFIMRetrieveMode {

    @XmlEnumValue("CallTFIM")
    CALL_TFIM("CallTFIM"),
    @XmlEnumValue("FromMC")
    FROM_MC("FromMC");
    private final String value;

    DmTFIMRetrieveMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmTFIMRetrieveMode fromValue(String v) {
        for (DmTFIMRetrieveMode c: DmTFIMRetrieveMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
