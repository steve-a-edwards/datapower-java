
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmRaidLDBadBlockExists.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmRaidLDBadBlockExists">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="noBadBlock"/>
 *     &lt;enumeration value="badBlockExist"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmRaidLDBadBlockExists")
@XmlEnum
public enum DmRaidLDBadBlockExists {

    @XmlEnumValue("noBadBlock")
    NO_BAD_BLOCK("noBadBlock"),
    @XmlEnumValue("badBlockExist")
    BAD_BLOCK_EXIST("badBlockExist");
    private final String value;

    DmRaidLDBadBlockExists(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmRaidLDBadBlockExists fromValue(String v) {
        for (DmRaidLDBadBlockExists c: DmRaidLDBadBlockExists.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
