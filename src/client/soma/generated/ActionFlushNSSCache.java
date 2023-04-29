
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionFlushNSSCache complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionFlushNSSCache">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ZosNSSClient" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionFlushNSSCache", propOrder = {
    "zosNSSClient"
})
public class ActionFlushNSSCache {

    @XmlElement(name = "ZosNSSClient", required = true)
    protected DmReference zosNSSClient;

    /**
     * Gets the value of the zosNSSClient property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getZosNSSClient() {
        return zosNSSClient;
    }

    /**
     * Sets the value of the zosNSSClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setZosNSSClient(DmReference value) {
        this.zosNSSClient = value;
    }

}
