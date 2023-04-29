
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmTibemsLBAndFTPair complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmTibemsLBAndFTPair">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HostName" type="{http://www.datapower.com/schemas/management}dmHostname"/>
 *         &lt;element name="BackupHostName" type="{http://www.datapower.com/schemas/management}dmHostname"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmTibemsLBAndFTPair", propOrder = {
    "hostName",
    "backupHostName"
})
public class DmTibemsLBAndFTPair {

    @XmlElement(name = "HostName", required = true)
    protected String hostName;
    @XmlElement(name = "BackupHostName", required = true, nillable = true)
    protected String backupHostName;

    /**
     * Gets the value of the hostName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * Sets the value of the hostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostName(String value) {
        this.hostName = value;
    }

    /**
     * Gets the value of the backupHostName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackupHostName() {
        return backupHostName;
    }

    /**
     * Sets the value of the backupHostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackupHostName(String value) {
        this.backupHostName = value;
    }

}
