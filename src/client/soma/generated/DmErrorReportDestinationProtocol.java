
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmErrorReportDestinationProtocol.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmErrorReportDestinationProtocol">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ftp"/>
 *     &lt;enumeration value="nfs"/>
 *     &lt;enumeration value="raid"/>
 *     &lt;enumeration value="iscsi"/>
 *     &lt;enumeration value="smtp"/>
 *     &lt;enumeration value="temporary"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmErrorReportDestinationProtocol")
@XmlEnum
public enum DmErrorReportDestinationProtocol {

    @XmlEnumValue("ftp")
    FTP("ftp"),
    @XmlEnumValue("nfs")
    NFS("nfs"),
    @XmlEnumValue("raid")
    RAID("raid"),
    @XmlEnumValue("iscsi")
    ISCSI("iscsi"),
    @XmlEnumValue("smtp")
    SMTP("smtp"),
    @XmlEnumValue("temporary")
    TEMPORARY("temporary");
    private final String value;

    DmErrorReportDestinationProtocol(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmErrorReportDestinationProtocol fromValue(String v) {
        for (DmErrorReportDestinationProtocol c: DmErrorReportDestinationProtocol.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
