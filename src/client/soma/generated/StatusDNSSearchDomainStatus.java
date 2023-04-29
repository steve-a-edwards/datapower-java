
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusDNSSearchDomainStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusDNSSearchDomainStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchDomain" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusDNSSearchDomainStatus", propOrder = {
    "searchDomain"
})
public class StatusDNSSearchDomainStatus {

    @XmlElement(name = "SearchDomain")
    protected String searchDomain;

    /**
     * Gets the value of the searchDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchDomain() {
        return searchDomain;
    }

    /**
     * Sets the value of the searchDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchDomain(String value) {
        this.searchDomain = value;
    }

}
