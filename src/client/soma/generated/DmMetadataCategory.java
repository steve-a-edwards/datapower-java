
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmMetadataCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmMetadataCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="all"/>
 *     &lt;enumeration value="mq"/>
 *     &lt;enumeration value="tibco"/>
 *     &lt;enumeration value="wasjms"/>
 *     &lt;enumeration value="http"/>
 *     &lt;enumeration value="CUSTOMIZABLE"/>
 *     &lt;enumeration value="header"/>
 *     &lt;enumeration value="variable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmMetadataCategory")
@XmlEnum
public enum DmMetadataCategory {

    @XmlEnumValue("all")
    ALL("all"),
    @XmlEnumValue("mq")
    MQ("mq"),
    @XmlEnumValue("tibco")
    TIBCO("tibco"),
    @XmlEnumValue("wasjms")
    WASJMS("wasjms"),
    @XmlEnumValue("http")
    HTTP("http"),
    CUSTOMIZABLE("CUSTOMIZABLE"),
    @XmlEnumValue("header")
    HEADER("header"),
    @XmlEnumValue("variable")
    VARIABLE("variable");
    private final String value;

    DmMetadataCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmMetadataCategory fromValue(String v) {
        for (DmMetadataCategory c: DmMetadataCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
