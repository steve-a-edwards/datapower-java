
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmTimeZone.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmTimeZone">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HST10"/>
 *     &lt;enumeration value="AKST9AKDT"/>
 *     &lt;enumeration value="PST8PDT"/>
 *     &lt;enumeration value="MST7MDT"/>
 *     &lt;enumeration value="CST6CDT"/>
 *     &lt;enumeration value="EST5EDT"/>
 *     &lt;enumeration value="AST4ADT"/>
 *     &lt;enumeration value="UTC"/>
 *     &lt;enumeration value="GMT0BST"/>
 *     &lt;enumeration value="CET-1CEST"/>
 *     &lt;enumeration value="EET-2EEST"/>
 *     &lt;enumeration value="MKS-3MSD"/>
 *     &lt;enumeration value="MSK-3MSD"/>
 *     &lt;enumeration value="AST-3"/>
 *     &lt;enumeration value="KRT-5"/>
 *     &lt;enumeration value="IST-5:30"/>
 *     &lt;enumeration value="NOVST-6NOVDT"/>
 *     &lt;enumeration value="CST-8"/>
 *     &lt;enumeration value="WST-8"/>
 *     &lt;enumeration value="WST-8WDT"/>
 *     &lt;enumeration value="JST-9"/>
 *     &lt;enumeration value="CST-9:30CDT"/>
 *     &lt;enumeration value="EST-10EDT"/>
 *     &lt;enumeration value="EST-10"/>
 *     &lt;enumeration value="Custom"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmTimeZone")
@XmlEnum
public enum DmTimeZone {

    @XmlEnumValue("HST10")
    HST_10("HST10"),
    @XmlEnumValue("AKST9AKDT")
    AKST_9_AKDT("AKST9AKDT"),
    @XmlEnumValue("PST8PDT")
    PST_8_PDT("PST8PDT"),
    @XmlEnumValue("MST7MDT")
    MST_7_MDT("MST7MDT"),
    @XmlEnumValue("CST6CDT")
    CST_6_CDT("CST6CDT"),
    @XmlEnumValue("EST5EDT")
    EST_5_EDT("EST5EDT"),
    @XmlEnumValue("AST4ADT")
    AST_4_ADT("AST4ADT"),
    UTC("UTC"),
    @XmlEnumValue("GMT0BST")
    GMT_0_BST("GMT0BST"),
    @XmlEnumValue("CET-1CEST")
    CET_1_CEST("CET-1CEST"),
    @XmlEnumValue("EET-2EEST")
    EET_2_EEST("EET-2EEST"),
    @XmlEnumValue("MKS-3MSD")
    MKS_3_MSD("MKS-3MSD"),
    @XmlEnumValue("MSK-3MSD")
    MSK_3_MSD("MSK-3MSD"),
    @XmlEnumValue("AST-3")
    AST_3("AST-3"),
    @XmlEnumValue("KRT-5")
    KRT_5("KRT-5"),
    @XmlEnumValue("IST-5:30")
    IST_5_30("IST-5:30"),
    @XmlEnumValue("NOVST-6NOVDT")
    NOVST_6_NOVDT("NOVST-6NOVDT"),
    @XmlEnumValue("CST-8")
    CST_8("CST-8"),
    @XmlEnumValue("WST-8")
    WST_8("WST-8"),
    @XmlEnumValue("WST-8WDT")
    WST_8_WDT("WST-8WDT"),
    @XmlEnumValue("JST-9")
    JST_9("JST-9"),
    @XmlEnumValue("CST-9:30CDT")
    CST_9_30_CDT("CST-9:30CDT"),
    @XmlEnumValue("EST-10EDT")
    EST_10_EDT("EST-10EDT"),
    @XmlEnumValue("EST-10")
    EST_10("EST-10"),
    @XmlEnumValue("Custom")
    CUSTOM("Custom");
    private final String value;

    DmTimeZone(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmTimeZone fromValue(String v) {
        for (DmTimeZone c: DmTimeZone.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
