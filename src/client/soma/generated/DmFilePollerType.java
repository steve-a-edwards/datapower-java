
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmFilePollerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmFilePollerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="nfsFilePoller"/>
 *     &lt;enumeration value="ftpFilePoller"/>
 *     &lt;enumeration value="sftpFilePoller"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmFilePollerType")
@XmlEnum
public enum DmFilePollerType {

    @XmlEnumValue("nfsFilePoller")
    NFS_FILE_POLLER("nfsFilePoller"),
    @XmlEnumValue("ftpFilePoller")
    FTP_FILE_POLLER("ftpFilePoller"),
    @XmlEnumValue("sftpFilePoller")
    SFTP_FILE_POLLER("sftpFilePoller");
    private final String value;

    DmFilePollerType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmFilePollerType fromValue(String v) {
        for (DmFilePollerType c: DmFilePollerType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
