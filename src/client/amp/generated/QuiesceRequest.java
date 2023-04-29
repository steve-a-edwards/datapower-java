
package client.amp.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="Device" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Timeout" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Domain" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{http://www.datapower.com/schemas/appliance/management/2.0}domain-name"/>
 *                   &lt;element name="Timeout" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "device",
    "domain"
})
@XmlRootElement(name = "QuiesceRequest")
public class QuiesceRequest {

    @XmlElement(name = "Device")
    protected QuiesceRequest.Device device;
    @XmlElement(name = "Domain")
    protected QuiesceRequest.Domain domain;

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link QuiesceRequest.Device }
     *     
     */
    public QuiesceRequest.Device getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuiesceRequest.Device }
     *     
     */
    public void setDevice(QuiesceRequest.Device value) {
        this.device = value;
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link QuiesceRequest.Domain }
     *     
     */
    public QuiesceRequest.Domain getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuiesceRequest.Domain }
     *     
     */
    public void setDomain(QuiesceRequest.Domain value) {
        this.domain = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Timeout" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "timeout"
    })
    public static class Device {

        @XmlElement(name = "Timeout")
        @XmlSchemaType(name = "unsignedShort")
        protected int timeout;

        /**
         * Gets the value of the timeout property.
         * 
         */
        public int getTimeout() {
            return timeout;
        }

        /**
         * Sets the value of the timeout property.
         * 
         */
        public void setTimeout(int value) {
            this.timeout = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Name" type="{http://www.datapower.com/schemas/appliance/management/2.0}domain-name"/>
     *         &lt;element name="Timeout" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "timeout"
    })
    public static class Domain {

        @XmlElement(name = "Name", required = true)
        protected String name;
        @XmlElement(name = "Timeout")
        @XmlSchemaType(name = "unsignedShort")
        protected int timeout;

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
         * Gets the value of the timeout property.
         * 
         */
        public int getTimeout() {
            return timeout;
        }

        /**
         * Sets the value of the timeout property.
         * 
         */
        public void setTimeout(int value) {
            this.timeout = value;
        }

    }

}
