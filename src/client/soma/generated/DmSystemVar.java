
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSystemVar.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSystemVar">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="var://system/map/debug"/>
 *     &lt;enumeration value="var://system/tasktemplates/debug"/>
 *     &lt;enumeration value="var://system/webgui/debug"/>
 *     &lt;enumeration value="var://system/AAA/defaultexpiry"/>
 *     &lt;enumeration value="var://system/xmlmgmt/config"/>
 *     &lt;enumeration value="var://system/rbm/config"/>
 *     &lt;enumeration value="var://system/slm/datashare-period"/>
 *     &lt;enumeration value="var://system/slm/datashare-counter"/>
 *     &lt;enumeration value="var://system/policy/debug"/>
 *     &lt;enumeration value="var://system/wsrr-subscription/auto-renew-interval"/>
 *     &lt;enumeration value="var://system/amp/debug"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSystemVar")
@XmlEnum
public enum DmSystemVar {

    @XmlEnumValue("var://system/map/debug")
    VAR_SYSTEM_MAP_DEBUG("var://system/map/debug"),
    @XmlEnumValue("var://system/tasktemplates/debug")
    VAR_SYSTEM_TASKTEMPLATES_DEBUG("var://system/tasktemplates/debug"),
    @XmlEnumValue("var://system/webgui/debug")
    VAR_SYSTEM_WEBGUI_DEBUG("var://system/webgui/debug"),
    @XmlEnumValue("var://system/AAA/defaultexpiry")
    VAR_SYSTEM_AAA_DEFAULTEXPIRY("var://system/AAA/defaultexpiry"),
    @XmlEnumValue("var://system/xmlmgmt/config")
    VAR_SYSTEM_XMLMGMT_CONFIG("var://system/xmlmgmt/config"),
    @XmlEnumValue("var://system/rbm/config")
    VAR_SYSTEM_RBM_CONFIG("var://system/rbm/config"),
    @XmlEnumValue("var://system/slm/datashare-period")
    VAR_SYSTEM_SLM_DATASHARE_PERIOD("var://system/slm/datashare-period"),
    @XmlEnumValue("var://system/slm/datashare-counter")
    VAR_SYSTEM_SLM_DATASHARE_COUNTER("var://system/slm/datashare-counter"),
    @XmlEnumValue("var://system/policy/debug")
    VAR_SYSTEM_POLICY_DEBUG("var://system/policy/debug"),
    @XmlEnumValue("var://system/wsrr-subscription/auto-renew-interval")
    VAR_SYSTEM_WSRR_SUBSCRIPTION_AUTO_RENEW_INTERVAL("var://system/wsrr-subscription/auto-renew-interval"),
    @XmlEnumValue("var://system/amp/debug")
    VAR_SYSTEM_AMP_DEBUG("var://system/amp/debug");
    private final String value;

    DmSystemVar(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSystemVar fromValue(String v) {
        for (DmSystemVar c: DmSystemVar.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
