
package client.amp.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Status" type="{http://www.datapower.com/schemas/appliance/management/2.0}status"/>
 *         &lt;element name="ErrorReport" type="{http://www.datapower.com/schemas/appliance/management/2.0}file"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "status",
    "errorReport"
})
@XmlRootElement(name = "GetErrorReportResponse")
public class GetErrorReportResponse {

    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "ErrorReport")
    protected File errorReport;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the errorReport property.
     * 
     * @return
     *     possible object is
     *     {@link File }
     *     
     */
    public File getErrorReport() {
        return errorReport;
    }

    /**
     * Sets the value of the errorReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link File }
     *     
     */
    public void setErrorReport(File value) {
        this.errorReport = value;
    }

}
