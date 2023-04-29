
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigConfigBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigConfigBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mAdminState" type="{http://www.datapower.com/schemas/management}dmAdminState" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigConfigBase", propOrder = {
    "mAdminState"
})
@XmlSeeAlso({
    ConfigCompileOptionsPolicy.class,
    ConfigCompactFlash.class,
    ConfigSNMPSettings.class,
    ConfigPeerGroup.class,
    ConfigPolicyParameters.class,
    ConfigNFSClientSettings.class,
    ConfigPolicyAttachments.class,
    ConfigMatching.class,
    ConfigURLRewritePolicy.class,
    ConfigSecureCloudConnector.class,
    ConfigStatistics.class,
    ConfigWebAppErrorHandlingPolicy.class,
    ConfigWebAppSessionPolicy.class,
    ConfigSLMCredClass.class,
    ConfigXMLManager.class,
    ConfigIScsiVolumeConfig.class,
    ConfigIScsiHBAConfig.class,
    ConfigSimpleCountMonitor.class,
    ConfigWebServiceMonitor.class,
    ConfigSQLDataSource.class,
    ConfigWebServicesAgent.class,
    ConfigConformancePolicy.class,
    ConfigAppSecurityPolicy.class,
    ConfigIPInterface.class,
    ConfigSLMRsrcClass.class,
    ConfigAccessControlList.class,
    ConfigZHybridTargetControlService.class,
    ConfigURLRefreshPolicy.class,
    ConfigWCCService.class,
    ConfigWSRRServer.class,
    ConfigGatewayBase.class,
    ConfigIncludeConfig.class,
    ConfigUserGroup.class,
    ConfigMTOMPolicy.class,
    ConfigSLMAction.class,
    ConfigSLMSchedule.class,
    ConfigIMSConnect.class,
    ConfigZosNSSClient.class,
    ConfigURLMap.class,
    ConfigNFSDynamicMounts.class,
    ConfigNameValueProfile.class,
    ConfigWebAppRequest.class,
    ConfigDeviceSettings.class,
    ConfigSLMPolicy.class,
    Configxmltrace.class,
    ConfigFTPQuoteCommands.class,
    ConfigFormsLoginPolicy.class,
    ConfigIPMIUser.class,
    ConfigRaidVolume.class,
    ConfigStylePolicyAction.class,
    ConfigLogLabel.class,
    ConfigLLMPolicyBase.class,
    ConfigRuntimeSettings.class,
    ConfigMQConfiguration.class,
    ConfigJMSServer.class,
    ConfigLLMRouteBase.class,
    ConfigShellAlias.class,
    ConfigSourceProtocolHandler.class,
    ConfigImportPackage.class,
    ConfigDynamicXMLContentMap.class,
    ConfigWebServiceSubscription.class,
    ConfigIScsiChapConfig.class,
    ConfigConfigDeploymentPolicy.class,
    ConfigHTTPUserAgent.class,
    ConfigWSStylePolicy.class,
    ConfigWebAppFW.class,
    ConfigNFSStaticMount.class,
    ConfigNetworkConfiguration.class,
    ConfigStylePolicyRuleBase.class,
    ConfigWebAppResponse.class,
    ConfigThrottler.class,
    ConfigUDDIRegistry.class,
    ConfigLoadBalancerGroup.class,
    ConfigUser.class,
    ConfigService.class,
    ConfigIScsiTargetConfig.class,
    ConfigAccessControl.class,
    ConfigEventlog.class,
    ConfigStylePolicy.class,
    ConfigIScsiInitiatorConfig.class,
    ConfigWSEndpointRewritePolicy.class,
    ConfigHTTPInputConversionMap.class,
    ConfigIPMILanChannel.class,
    ConfigCrypto.class,
    ConfigMessageFlowControl.class
})
public class ConfigConfigBase {

    protected DmAdminState mAdminState;

    /**
     * Gets the value of the mAdminState property.
     * 
     * @return
     *     possible object is
     *     {@link DmAdminState }
     *     
     */
    public DmAdminState getMAdminState() {
        return mAdminState;
    }

    /**
     * Sets the value of the mAdminState property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmAdminState }
     *     
     */
    public void setMAdminState(DmAdminState value) {
        this.mAdminState = value;
    }

}
