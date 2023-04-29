
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSFTPPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmSFTPPolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegExp" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="SSHClientProfile" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="UseUniqueFilenames" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmSFTPPolicy", propOrder = {
    "regExp",
    "sshClientProfile",
    "useUniqueFilenames"
})
public class DmSFTPPolicy {

    @XmlElement(name = "RegExp", required = true)
    protected String regExp;
    @XmlElement(name = "SSHClientProfile", required = true)
    protected DmReference sshClientProfile;
    @XmlElement(name = "UseUniqueFilenames", required = true)
    protected DmToggle useUniqueFilenames;

    /**
     * Gets the value of the regExp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegExp() {
        return regExp;
    }

    /**
     * Sets the value of the regExp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegExp(String value) {
        this.regExp = value;
    }

    /**
     * Gets the value of the sshClientProfile property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getSSHClientProfile() {
        return sshClientProfile;
    }

    /**
     * Sets the value of the sshClientProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setSSHClientProfile(DmReference value) {
        this.sshClientProfile = value;
    }

    /**
     * Gets the value of the useUniqueFilenames property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getUseUniqueFilenames() {
        return useUniqueFilenames;
    }

    /**
     * Sets the value of the useUniqueFilenames property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setUseUniqueFilenames(DmToggle value) {
        this.useUniqueFilenames = value;
    }

}
