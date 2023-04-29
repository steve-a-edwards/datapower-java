
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmLBGroupAffinity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmLBGroupAffinity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EnableSA" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="InsertionCookieName" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="InsertionPath" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="InsertionDomain" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="AffinityWLMOverride" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="AffinityMode" type="{http://www.datapower.com/schemas/management}dmAffinityMode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmLBGroupAffinity", propOrder = {
    "enableSA",
    "insertionCookieName",
    "insertionPath",
    "insertionDomain",
    "affinityWLMOverride",
    "affinityMode"
})
public class DmLBGroupAffinity {

    @XmlElement(name = "EnableSA", required = true)
    protected DmToggle enableSA;
    @XmlElement(name = "InsertionCookieName", required = true, nillable = true)
    protected String insertionCookieName;
    @XmlElement(name = "InsertionPath", required = true, nillable = true)
    protected String insertionPath;
    @XmlElement(name = "InsertionDomain", required = true, nillable = true)
    protected String insertionDomain;
    @XmlElement(name = "AffinityWLMOverride", required = true, nillable = true)
    protected DmToggle affinityWLMOverride;
    @XmlElement(name = "AffinityMode", required = true, nillable = true)
    protected DmAffinityMode affinityMode;

    /**
     * Gets the value of the enableSA property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getEnableSA() {
        return enableSA;
    }

    /**
     * Sets the value of the enableSA property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setEnableSA(DmToggle value) {
        this.enableSA = value;
    }

    /**
     * Gets the value of the insertionCookieName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsertionCookieName() {
        return insertionCookieName;
    }

    /**
     * Sets the value of the insertionCookieName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsertionCookieName(String value) {
        this.insertionCookieName = value;
    }

    /**
     * Gets the value of the insertionPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsertionPath() {
        return insertionPath;
    }

    /**
     * Sets the value of the insertionPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsertionPath(String value) {
        this.insertionPath = value;
    }

    /**
     * Gets the value of the insertionDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsertionDomain() {
        return insertionDomain;
    }

    /**
     * Sets the value of the insertionDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsertionDomain(String value) {
        this.insertionDomain = value;
    }

    /**
     * Gets the value of the affinityWLMOverride property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getAffinityWLMOverride() {
        return affinityWLMOverride;
    }

    /**
     * Sets the value of the affinityWLMOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setAffinityWLMOverride(DmToggle value) {
        this.affinityWLMOverride = value;
    }

    /**
     * Gets the value of the affinityMode property.
     * 
     * @return
     *     possible object is
     *     {@link DmAffinityMode }
     *     
     */
    public DmAffinityMode getAffinityMode() {
        return affinityMode;
    }

    /**
     * Sets the value of the affinityMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmAffinityMode }
     *     
     */
    public void setAffinityMode(DmAffinityMode value) {
        this.affinityMode = value;
    }

}
