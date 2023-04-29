
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmLicensedFeatureBits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmLicensedFeatureBits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="MQ"/>
 *     &lt;enumeration value="TAM"/>
 *     &lt;enumeration value="DataGlue"/>
 *     &lt;enumeration value="JAXP-API"/>
 *     &lt;enumeration value="HSM"/>
 *     &lt;enumeration value="PKCS7-SMIME"/>
 *     &lt;enumeration value="Reserved"/>
 *     &lt;enumeration value="SQL-ODBC"/>
 *     &lt;enumeration value="Tibco-EMS"/>
 *     &lt;enumeration value="WebSphere-JMS"/>
 *     &lt;enumeration value="Compact-Flash"/>
 *     &lt;enumeration value="RaidVolume"/>
 *     &lt;enumeration value="iSCSI"/>
 *     &lt;enumeration value="LocateLED"/>
 *     &lt;enumeration value="AppOpt"/>
 *     &lt;enumeration value="XG4"/>
 *     &lt;enumeration value="Tibco-RV"/>
 *     &lt;enumeration value="FibreChannel"/>
 *     &lt;enumeration value="IPMI"/>
 *     &lt;enumeration value="DCO"/>
 *     &lt;enumeration value="RaidVolumeMpt"/>
 *     &lt;enumeration value="RaidVolumeSr"/>
 *     &lt;enumeration value="IntrusionDetection"/>
 *     &lt;enumeration value="IPMI-LAN"/>
 *     &lt;enumeration value="zBX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmLicensedFeatureBits")
@XmlEnum
public enum DmLicensedFeatureBits {

    UNKNOWN("UNKNOWN"),
    MQ("MQ"),
    TAM("TAM"),
    @XmlEnumValue("DataGlue")
    DATA_GLUE("DataGlue"),
    @XmlEnumValue("JAXP-API")
    JAXP_API("JAXP-API"),
    HSM("HSM"),
    @XmlEnumValue("PKCS7-SMIME")
    PKCS_7_SMIME("PKCS7-SMIME"),
    @XmlEnumValue("Reserved")
    RESERVED("Reserved"),
    @XmlEnumValue("SQL-ODBC")
    SQL_ODBC("SQL-ODBC"),
    @XmlEnumValue("Tibco-EMS")
    TIBCO_EMS("Tibco-EMS"),
    @XmlEnumValue("WebSphere-JMS")
    WEB_SPHERE_JMS("WebSphere-JMS"),
    @XmlEnumValue("Compact-Flash")
    COMPACT_FLASH("Compact-Flash"),
    @XmlEnumValue("RaidVolume")
    RAID_VOLUME("RaidVolume"),
    @XmlEnumValue("iSCSI")
    I_SCSI("iSCSI"),
    @XmlEnumValue("LocateLED")
    LOCATE_LED("LocateLED"),
    @XmlEnumValue("AppOpt")
    APP_OPT("AppOpt"),
    @XmlEnumValue("XG4")
    XG_4("XG4"),
    @XmlEnumValue("Tibco-RV")
    TIBCO_RV("Tibco-RV"),
    @XmlEnumValue("FibreChannel")
    FIBRE_CHANNEL("FibreChannel"),
    IPMI("IPMI"),
    DCO("DCO"),
    @XmlEnumValue("RaidVolumeMpt")
    RAID_VOLUME_MPT("RaidVolumeMpt"),
    @XmlEnumValue("RaidVolumeSr")
    RAID_VOLUME_SR("RaidVolumeSr"),
    @XmlEnumValue("IntrusionDetection")
    INTRUSION_DETECTION("IntrusionDetection"),
    @XmlEnumValue("IPMI-LAN")
    IPMI_LAN("IPMI-LAN"),
    @XmlEnumValue("zBX")
    Z_BX("zBX");
    private final String value;

    DmLicensedFeatureBits(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmLicensedFeatureBits fromValue(String v) {
        for (DmLicensedFeatureBits c: DmLicensedFeatureBits.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
