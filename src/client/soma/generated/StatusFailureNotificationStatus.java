
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusFailureNotificationStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusFailureNotificationStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Date" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Reason" type="{http://www.datapower.com/schemas/management}dmErrorReportReason" minOccurs="0"/>
 *         &lt;element name="UploadStatus" type="{http://www.datapower.com/schemas/management}dmErrorReportUploadStatus" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusFailureNotificationStatus", propOrder = {
    "date",
    "reason",
    "uploadStatus",
    "location"
})
public class StatusFailureNotificationStatus {

    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "Reason")
    protected DmErrorReportReason reason;
    @XmlElement(name = "UploadStatus")
    protected DmErrorReportUploadStatus uploadStatus;
    @XmlElement(name = "Location")
    protected String location;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link DmErrorReportReason }
     *     
     */
    public DmErrorReportReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmErrorReportReason }
     *     
     */
    public void setReason(DmErrorReportReason value) {
        this.reason = value;
    }

    /**
     * Gets the value of the uploadStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DmErrorReportUploadStatus }
     *     
     */
    public DmErrorReportUploadStatus getUploadStatus() {
        return uploadStatus;
    }

    /**
     * Sets the value of the uploadStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmErrorReportUploadStatus }
     *     
     */
    public void setUploadStatus(DmErrorReportUploadStatus value) {
        this.uploadStatus = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

}
