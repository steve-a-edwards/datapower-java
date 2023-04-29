
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSideCarNames.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSideCarNames">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="main"/>
 *     &lt;enumeration value="llm"/>
 *     &lt;enumeration value="b2bp"/>
 *     &lt;enumeration value="wtx"/>
 *     &lt;enumeration value="ssh"/>
 *     &lt;enumeration value="odbc"/>
 *     &lt;enumeration value="db2cli"/>
 *     &lt;enumeration value="tamv6"/>
 *     &lt;enumeration value="tamv61"/>
 *     &lt;enumeration value="SecureCloudConnector"/>
 *     &lt;enumeration value="dco"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSideCarNames")
@XmlEnum
public enum DmSideCarNames {

    @XmlEnumValue("main")
    MAIN("main"),
    @XmlEnumValue("llm")
    LLM("llm"),
    @XmlEnumValue("b2bp")
    B_2_BP("b2bp"),
    @XmlEnumValue("wtx")
    WTX("wtx"),
    @XmlEnumValue("ssh")
    SSH("ssh"),
    @XmlEnumValue("odbc")
    ODBC("odbc"),
    @XmlEnumValue("db2cli")
    DB_2_CLI("db2cli"),
    @XmlEnumValue("tamv6")
    TAMV_6("tamv6"),
    @XmlEnumValue("tamv61")
    TAMV_61("tamv61"),
    @XmlEnumValue("SecureCloudConnector")
    SECURE_CLOUD_CONNECTOR("SecureCloudConnector"),
    @XmlEnumValue("dco")
    DCO("dco");
    private final String value;

    DmSideCarNames(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSideCarNames fromValue(String v) {
        for (DmSideCarNames c: DmSideCarNames.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
