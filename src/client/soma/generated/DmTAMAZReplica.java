
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmTAMAZReplica complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmTAMAZReplica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TAMAZReplica" type="{http://www.datapower.com/schemas/management}dmHostname"/>
 *         &lt;element name="TAMAZReplicaPort" type="{http://www.datapower.com/schemas/management}dmIPPort"/>
 *         &lt;element name="TAMAZReplicaWeight" type="{http://www.datapower.com/schemas/management}dmUInt32"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmTAMAZReplica", propOrder = {
    "tamazReplica",
    "tamazReplicaPort",
    "tamazReplicaWeight"
})
public class DmTAMAZReplica {

    @XmlElement(name = "TAMAZReplica", required = true)
    protected String tamazReplica;
    @XmlElement(name = "TAMAZReplicaPort")
    protected int tamazReplicaPort;
    @XmlElement(name = "TAMAZReplicaWeight")
    protected long tamazReplicaWeight;

    /**
     * Gets the value of the tamazReplica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAMAZReplica() {
        return tamazReplica;
    }

    /**
     * Sets the value of the tamazReplica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAMAZReplica(String value) {
        this.tamazReplica = value;
    }

    /**
     * Gets the value of the tamazReplicaPort property.
     * 
     */
    public int getTAMAZReplicaPort() {
        return tamazReplicaPort;
    }

    /**
     * Sets the value of the tamazReplicaPort property.
     * 
     */
    public void setTAMAZReplicaPort(int value) {
        this.tamazReplicaPort = value;
    }

    /**
     * Gets the value of the tamazReplicaWeight property.
     * 
     */
    public long getTAMAZReplicaWeight() {
        return tamazReplicaWeight;
    }

    /**
     * Sets the value of the tamazReplicaWeight property.
     * 
     */
    public void setTAMAZReplicaWeight(long value) {
        this.tamazReplicaWeight = value;
    }

}
