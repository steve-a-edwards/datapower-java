
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmNetworkRetry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmNetworkRetry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AutomaticRetry" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="RetryInterval" type="{http://www.datapower.com/schemas/management}dmUInt32"/>
 *         &lt;element name="ReportingInterval" type="{http://www.datapower.com/schemas/management}dmUInt32"/>
 *         &lt;element name="TotalRetries" type="{http://www.datapower.com/schemas/management}dmUInt32"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmNetworkRetry", propOrder = {
    "automaticRetry",
    "retryInterval",
    "reportingInterval",
    "totalRetries"
})
public class DmNetworkRetry {

    @XmlElement(name = "AutomaticRetry", required = true, nillable = true)
    protected DmToggle automaticRetry;
    @XmlElement(name = "RetryInterval", required = true, type = Long.class, nillable = true)
    protected Long retryInterval;
    @XmlElement(name = "ReportingInterval", required = true, type = Long.class, nillable = true)
    protected Long reportingInterval;
    @XmlElement(name = "TotalRetries", required = true, type = Long.class, nillable = true)
    protected Long totalRetries;

    /**
     * Gets the value of the automaticRetry property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getAutomaticRetry() {
        return automaticRetry;
    }

    /**
     * Sets the value of the automaticRetry property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setAutomaticRetry(DmToggle value) {
        this.automaticRetry = value;
    }

    /**
     * Gets the value of the retryInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRetryInterval() {
        return retryInterval;
    }

    /**
     * Sets the value of the retryInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRetryInterval(Long value) {
        this.retryInterval = value;
    }

    /**
     * Gets the value of the reportingInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReportingInterval() {
        return reportingInterval;
    }

    /**
     * Sets the value of the reportingInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReportingInterval(Long value) {
        this.reportingInterval = value;
    }

    /**
     * Gets the value of the totalRetries property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalRetries() {
        return totalRetries;
    }

    /**
     * Sets the value of the totalRetries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalRetries(Long value) {
        this.totalRetries = value;
    }

}
