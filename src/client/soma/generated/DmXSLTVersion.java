
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmXSLTVersion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmXSLTVersion">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="XSLT10"/>
 *     &lt;enumeration value="XSLT20"/>
 *     &lt;enumeration value="StylesheetSpecified"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmXSLTVersion")
@XmlEnum
public enum DmXSLTVersion {

    @XmlEnumValue("XSLT10")
    XSLT_10("XSLT10"),
    @XmlEnumValue("XSLT20")
    XSLT_20("XSLT20"),
    @XmlEnumValue("StylesheetSpecified")
    STYLESHEET_SPECIFIED("StylesheetSpecified");
    private final String value;

    DmXSLTVersion(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmXSLTVersion fromValue(String v) {
        for (DmXSLTVersion c: DmXSLTVersion.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
