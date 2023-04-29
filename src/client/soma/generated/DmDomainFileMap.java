
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmDomainFileMap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmDomainFileMap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="CopyFrom" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="CopyTo" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="Delete" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="Display" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="Exec" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="Subdir" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmDomainFileMap", propOrder = {

})
public class DmDomainFileMap {

    @XmlElement(name = "CopyFrom")
    protected DmToggle copyFrom;
    @XmlElement(name = "CopyTo")
    protected DmToggle copyTo;
    @XmlElement(name = "Delete")
    protected DmToggle delete;
    @XmlElement(name = "Display")
    protected DmToggle display;
    @XmlElement(name = "Exec")
    protected DmToggle exec;
    @XmlElement(name = "Subdir")
    protected DmToggle subdir;

    /**
     * Gets the value of the copyFrom property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getCopyFrom() {
        return copyFrom;
    }

    /**
     * Sets the value of the copyFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setCopyFrom(DmToggle value) {
        this.copyFrom = value;
    }

    /**
     * Gets the value of the copyTo property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getCopyTo() {
        return copyTo;
    }

    /**
     * Sets the value of the copyTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setCopyTo(DmToggle value) {
        this.copyTo = value;
    }

    /**
     * Gets the value of the delete property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getDelete() {
        return delete;
    }

    /**
     * Sets the value of the delete property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setDelete(DmToggle value) {
        this.delete = value;
    }

    /**
     * Gets the value of the display property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getDisplay() {
        return display;
    }

    /**
     * Sets the value of the display property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setDisplay(DmToggle value) {
        this.display = value;
    }

    /**
     * Gets the value of the exec property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getExec() {
        return exec;
    }

    /**
     * Sets the value of the exec property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setExec(DmToggle value) {
        this.exec = value;
    }

    /**
     * Gets the value of the subdir property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getSubdir() {
        return subdir;
    }

    /**
     * Sets the value of the subdir property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setSubdir(DmToggle value) {
        this.subdir = value;
    }

}
