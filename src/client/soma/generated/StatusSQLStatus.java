
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusSQLStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusSQLStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataSource" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="ReadRequests" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="WriteRequests" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="FailedReadRequests" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="FailedWriteRequests" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusSQLStatus", propOrder = {
    "dataSource",
    "readRequests",
    "writeRequests",
    "failedReadRequests",
    "failedWriteRequests"
})
public class StatusSQLStatus {

    @XmlElement(name = "DataSource")
    protected DmReference dataSource;
    @XmlElement(name = "ReadRequests")
    protected Long readRequests;
    @XmlElement(name = "WriteRequests")
    protected Long writeRequests;
    @XmlElement(name = "FailedReadRequests")
    protected Long failedReadRequests;
    @XmlElement(name = "FailedWriteRequests")
    protected Long failedWriteRequests;

    /**
     * Gets the value of the dataSource property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getDataSource() {
        return dataSource;
    }

    /**
     * Sets the value of the dataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setDataSource(DmReference value) {
        this.dataSource = value;
    }

    /**
     * Gets the value of the readRequests property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReadRequests() {
        return readRequests;
    }

    /**
     * Sets the value of the readRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReadRequests(Long value) {
        this.readRequests = value;
    }

    /**
     * Gets the value of the writeRequests property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWriteRequests() {
        return writeRequests;
    }

    /**
     * Sets the value of the writeRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWriteRequests(Long value) {
        this.writeRequests = value;
    }

    /**
     * Gets the value of the failedReadRequests property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFailedReadRequests() {
        return failedReadRequests;
    }

    /**
     * Sets the value of the failedReadRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFailedReadRequests(Long value) {
        this.failedReadRequests = value;
    }

    /**
     * Gets the value of the failedWriteRequests property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFailedWriteRequests() {
        return failedWriteRequests;
    }

    /**
     * Sets the value of the failedWriteRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFailedWriteRequests(Long value) {
        this.failedWriteRequests = value;
    }

}
