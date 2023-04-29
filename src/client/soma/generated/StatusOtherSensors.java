
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusOtherSensors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusOtherSensors">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.datapower.com/schemas/management}dmOtherSensorValue" minOccurs="0"/>
 *         &lt;element name="ReadingStatus" type="{http://www.datapower.com/schemas/management}dmSensorReadingStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusOtherSensors", propOrder = {
    "name",
    "value",
    "readingStatus"
})
public class StatusOtherSensors {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Value")
    protected DmOtherSensorValue value;
    @XmlElement(name = "ReadingStatus")
    protected DmSensorReadingStatus readingStatus;

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
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link DmOtherSensorValue }
     *     
     */
    public DmOtherSensorValue getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmOtherSensorValue }
     *     
     */
    public void setValue(DmOtherSensorValue value) {
        this.value = value;
    }

    /**
     * Gets the value of the readingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DmSensorReadingStatus }
     *     
     */
    public DmSensorReadingStatus getReadingStatus() {
        return readingStatus;
    }

    /**
     * Sets the value of the readingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmSensorReadingStatus }
     *     
     */
    public void setReadingStatus(DmSensorReadingStatus value) {
        this.readingStatus = value;
    }

}
