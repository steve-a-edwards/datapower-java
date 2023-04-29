
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmLTPATokenVersionNonBitmap.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmLTPATokenVersionNonBitmap">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LTPA"/>
 *     &lt;enumeration value="LTPA1FIPS"/>
 *     &lt;enumeration value="LTPA2"/>
 *     &lt;enumeration value="LTPA2WAS7"/>
 *     &lt;enumeration value="LTPADomino"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmLTPATokenVersionNonBitmap")
@XmlEnum
public enum DmLTPATokenVersionNonBitmap {

    LTPA("LTPA"),
    @XmlEnumValue("LTPA1FIPS")
    LTPA_1_FIPS("LTPA1FIPS"),
    @XmlEnumValue("LTPA2")
    LTPA_2("LTPA2"),
    @XmlEnumValue("LTPA2WAS7")
    LTPA_2_WAS_7("LTPA2WAS7"),
    @XmlEnumValue("LTPADomino")
    LTPA_DOMINO("LTPADomino");
    private final String value;

    DmLTPATokenVersionNonBitmap(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmLTPATokenVersionNonBitmap fromValue(String v) {
        for (DmLTPATokenVersionNonBitmap c: DmLTPATokenVersionNonBitmap.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
