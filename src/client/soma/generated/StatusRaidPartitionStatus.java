
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusRaidPartitionStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusRaidPartitionStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VolumeName" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="PartitionIndex" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="Purpose" type="{http://www.datapower.com/schemas/management}dmFilesystemPurpose" minOccurs="0"/>
 *         &lt;element name="Encryption" type="{http://www.datapower.com/schemas/management}dmFilesystemPartitionEncryption" minOccurs="0"/>
 *         &lt;element name="KeySource" type="{http://www.datapower.com/schemas/management}dmFilesystemEncryptionKeySource" minOccurs="0"/>
 *         &lt;element name="TotalSize" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="FreeSpace" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusRaidPartitionStatus", propOrder = {
    "volumeName",
    "partitionIndex",
    "purpose",
    "encryption",
    "keySource",
    "totalSize",
    "freeSpace"
})
public class StatusRaidPartitionStatus {

    @XmlElement(name = "VolumeName")
    protected String volumeName;
    @XmlElement(name = "PartitionIndex")
    protected Long partitionIndex;
    @XmlElement(name = "Purpose")
    protected DmFilesystemPurpose purpose;
    @XmlElement(name = "Encryption")
    protected DmFilesystemPartitionEncryption encryption;
    @XmlElement(name = "KeySource")
    protected DmFilesystemEncryptionKeySource keySource;
    @XmlElement(name = "TotalSize")
    protected Long totalSize;
    @XmlElement(name = "FreeSpace")
    protected Long freeSpace;

    /**
     * Gets the value of the volumeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeName() {
        return volumeName;
    }

    /**
     * Sets the value of the volumeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeName(String value) {
        this.volumeName = value;
    }

    /**
     * Gets the value of the partitionIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPartitionIndex() {
        return partitionIndex;
    }

    /**
     * Sets the value of the partitionIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPartitionIndex(Long value) {
        this.partitionIndex = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link DmFilesystemPurpose }
     *     
     */
    public DmFilesystemPurpose getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmFilesystemPurpose }
     *     
     */
    public void setPurpose(DmFilesystemPurpose value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the encryption property.
     * 
     * @return
     *     possible object is
     *     {@link DmFilesystemPartitionEncryption }
     *     
     */
    public DmFilesystemPartitionEncryption getEncryption() {
        return encryption;
    }

    /**
     * Sets the value of the encryption property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmFilesystemPartitionEncryption }
     *     
     */
    public void setEncryption(DmFilesystemPartitionEncryption value) {
        this.encryption = value;
    }

    /**
     * Gets the value of the keySource property.
     * 
     * @return
     *     possible object is
     *     {@link DmFilesystemEncryptionKeySource }
     *     
     */
    public DmFilesystemEncryptionKeySource getKeySource() {
        return keySource;
    }

    /**
     * Sets the value of the keySource property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmFilesystemEncryptionKeySource }
     *     
     */
    public void setKeySource(DmFilesystemEncryptionKeySource value) {
        this.keySource = value;
    }

    /**
     * Gets the value of the totalSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalSize() {
        return totalSize;
    }

    /**
     * Sets the value of the totalSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalSize(Long value) {
        this.totalSize = value;
    }

    /**
     * Gets the value of the freeSpace property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFreeSpace() {
        return freeSpace;
    }

    /**
     * Sets the value of the freeSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFreeSpace(Long value) {
        this.freeSpace = value;
    }

}
