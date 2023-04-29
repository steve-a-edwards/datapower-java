
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSQLDatabaseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSQLDatabaseType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DB2"/>
 *     &lt;enumeration value="Oracle"/>
 *     &lt;enumeration value="Sybase"/>
 *     &lt;enumeration value="MSSQLServer"/>
 *     &lt;enumeration value="DB2v9"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSQLDatabaseType")
@XmlEnum
public enum DmSQLDatabaseType {

    @XmlEnumValue("DB2")
    DB_2("DB2"),
    @XmlEnumValue("Oracle")
    ORACLE("Oracle"),
    @XmlEnumValue("Sybase")
    SYBASE("Sybase"),
    @XmlEnumValue("MSSQLServer")
    MSSQL_SERVER("MSSQLServer"),
    @XmlEnumValue("DB2v9")
    DB_2_V_9("DB2v9");
    private final String value;

    DmSQLDatabaseType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSQLDatabaseType fromValue(String v) {
        for (DmSQLDatabaseType c: DmSQLDatabaseType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
