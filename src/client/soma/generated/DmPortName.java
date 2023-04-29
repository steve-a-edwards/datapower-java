
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmPortName.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmPortName">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="eth0"/>
 *     &lt;enumeration value="eth1"/>
 *     &lt;enumeration value="eth2"/>
 *     &lt;enumeration value="eth3"/>
 *     &lt;enumeration value="mgt0"/>
 *     &lt;enumeration value="eth4"/>
 *     &lt;enumeration value="loopback"/>
 *     &lt;enumeration value="eth5"/>
 *     &lt;enumeration value="eth6"/>
 *     &lt;enumeration value="eth7"/>
 *     &lt;enumeration value="eth8"/>
 *     &lt;enumeration value="eth9"/>
 *     &lt;enumeration value="eth10"/>
 *     &lt;enumeration value="tun"/>
 *     &lt;enumeration value="mgt1"/>
 *     &lt;enumeration value="eth11"/>
 *     &lt;enumeration value="eth12"/>
 *     &lt;enumeration value="eth13"/>
 *     &lt;enumeration value="eth14"/>
 *     &lt;enumeration value="eth15"/>
 *     &lt;enumeration value="eth16"/>
 *     &lt;enumeration value="eth17"/>
 *     &lt;enumeration value="eth20"/>
 *     &lt;enumeration value="eth21"/>
 *     &lt;enumeration value="eth22"/>
 *     &lt;enumeration value="eth23"/>
 *     &lt;enumeration value="eth24"/>
 *     &lt;enumeration value="eth25"/>
 *     &lt;enumeration value="eth26"/>
 *     &lt;enumeration value="eth27"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmPortName")
@XmlEnum
public enum DmPortName {

    @XmlEnumValue("eth0")
    ETH_0("eth0"),
    @XmlEnumValue("eth1")
    ETH_1("eth1"),
    @XmlEnumValue("eth2")
    ETH_2("eth2"),
    @XmlEnumValue("eth3")
    ETH_3("eth3"),
    @XmlEnumValue("mgt0")
    MGT_0("mgt0"),
    @XmlEnumValue("eth4")
    ETH_4("eth4"),
    @XmlEnumValue("loopback")
    LOOPBACK("loopback"),
    @XmlEnumValue("eth5")
    ETH_5("eth5"),
    @XmlEnumValue("eth6")
    ETH_6("eth6"),
    @XmlEnumValue("eth7")
    ETH_7("eth7"),
    @XmlEnumValue("eth8")
    ETH_8("eth8"),
    @XmlEnumValue("eth9")
    ETH_9("eth9"),
    @XmlEnumValue("eth10")
    ETH_10("eth10"),
    @XmlEnumValue("tun")
    TUN("tun"),
    @XmlEnumValue("mgt1")
    MGT_1("mgt1"),
    @XmlEnumValue("eth11")
    ETH_11("eth11"),
    @XmlEnumValue("eth12")
    ETH_12("eth12"),
    @XmlEnumValue("eth13")
    ETH_13("eth13"),
    @XmlEnumValue("eth14")
    ETH_14("eth14"),
    @XmlEnumValue("eth15")
    ETH_15("eth15"),
    @XmlEnumValue("eth16")
    ETH_16("eth16"),
    @XmlEnumValue("eth17")
    ETH_17("eth17"),
    @XmlEnumValue("eth20")
    ETH_20("eth20"),
    @XmlEnumValue("eth21")
    ETH_21("eth21"),
    @XmlEnumValue("eth22")
    ETH_22("eth22"),
    @XmlEnumValue("eth23")
    ETH_23("eth23"),
    @XmlEnumValue("eth24")
    ETH_24("eth24"),
    @XmlEnumValue("eth25")
    ETH_25("eth25"),
    @XmlEnumValue("eth26")
    ETH_26("eth26"),
    @XmlEnumValue("eth27")
    ETH_27("eth27");
    private final String value;

    DmPortName(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmPortName fromValue(String v) {
        for (DmPortName c: DmPortName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
