
package client.soma.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigSQLDataSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigSQLDataSource">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ConfigConfigBase">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="UserSummary" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Database" type="{http://www.datapower.com/schemas/management}dmSQLDatabaseType"/>
 *         &lt;element name="Username" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="Password" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="DataSourceID" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="DataSourceHost" type="{http://www.datapower.com/schemas/management}dmHostname"/>
 *         &lt;element name="DataSourcePort" type="{http://www.datapower.com/schemas/management}dmIPPort"/>
 *         &lt;element name="LimitReturnedData" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="LimitReturnedDataSize" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="SQLDataSourceConfigNVPairs" type="{http://www.datapower.com/schemas/management}dmSQLDataSourceConfigNVPair" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaxConnection" type="{http://www.datapower.com/schemas/management}dmUInt16"/>
 *         &lt;element name="OracleDataSourceType" type="{http://www.datapower.com/schemas/management}dmSQLOracleDataSourceType" minOccurs="0"/>
 *         &lt;element name="OracleObjects" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.datapower.com/schemas/management}ConfigAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigSQLDataSource", propOrder = {
    "userSummaryOrDatabaseOrUsername"
})
public class ConfigSQLDataSource
    extends ConfigConfigBase
{

    @XmlElementRefs({
        @XmlElementRef(name = "MaxConnection", type = JAXBElement.class),
        @XmlElementRef(name = "Username", type = JAXBElement.class),
        @XmlElementRef(name = "DataSourceHost", type = JAXBElement.class),
        @XmlElementRef(name = "Database", type = JAXBElement.class),
        @XmlElementRef(name = "LimitReturnedDataSize", type = JAXBElement.class),
        @XmlElementRef(name = "LimitReturnedData", type = JAXBElement.class),
        @XmlElementRef(name = "DataSourcePort", type = JAXBElement.class),
        @XmlElementRef(name = "OracleDataSourceType", type = JAXBElement.class),
        @XmlElementRef(name = "OracleObjects", type = JAXBElement.class),
        @XmlElementRef(name = "Password", type = JAXBElement.class),
        @XmlElementRef(name = "DataSourceID", type = JAXBElement.class),
        @XmlElementRef(name = "SQLDataSourceConfigNVPairs", type = JAXBElement.class),
        @XmlElementRef(name = "UserSummary", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> userSummaryOrDatabaseOrUsername;
    @XmlAttribute
    protected String name;
    @XmlAttribute
    protected Boolean local;
    @XmlAttribute
    protected Boolean intrinsic;
    @XmlAttribute(name = "read-only")
    protected Boolean readOnly;
    @XmlAttribute
    protected Boolean external;

    /**
     * Gets the value of the userSummaryOrDatabaseOrUsername property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userSummaryOrDatabaseOrUsername property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserSummaryOrDatabaseOrUsername().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmSQLDatabaseType }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link DmSQLOracleDataSourceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmSQLDataSourceConfigNVPair }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getUserSummaryOrDatabaseOrUsername() {
        if (userSummaryOrDatabaseOrUsername == null) {
            userSummaryOrDatabaseOrUsername = new ArrayList<JAXBElement<?>>();
        }
        return this.userSummaryOrDatabaseOrUsername;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the local property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocal() {
        return local;
    }

    /**
     * Sets the value of the local property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocal(Boolean value) {
        this.local = value;
    }

    /**
     * Gets the value of the intrinsic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntrinsic() {
        return intrinsic;
    }

    /**
     * Sets the value of the intrinsic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntrinsic(Boolean value) {
        this.intrinsic = value;
    }

    /**
     * Gets the value of the readOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReadOnly() {
        return readOnly;
    }

    /**
     * Sets the value of the readOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReadOnly(Boolean value) {
        this.readOnly = value;
    }

    /**
     * Gets the value of the external property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExternal() {
        return external;
    }

    /**
     * Sets the value of the external property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExternal(Boolean value) {
        this.external = value;
    }

}
