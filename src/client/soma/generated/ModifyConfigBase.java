
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModifyConfigBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyConfigBase">
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
@XmlType(name = "ModifyConfigBase", propOrder = {
    "mAdminState"
})
@XmlSeeAlso({
    ModifyMatching.class,
    ModifyIScsiChapConfig.class,
    ModifySQLDataSource.class,
    ModifyAccessControlList.class,
    ModifyUDDIRegistry.class,
    ModifyLLMRouteBase.class,
    ModifyWSRRServer.class,
    ModifyIScsiHBAConfig.class,
    ModifyWebAppFW.class,
    ModifyFormsLoginPolicy.class,
    ModifyStylePolicy.class,
    ModifyAppSecurityPolicy.class,
    ModifySLMCredClass.class,
    ModifyUserGroup.class,
    ModifyWebServicesAgent.class,
    ModifyMTOMPolicy.class,
    ModifyWebAppSessionPolicy.class,
    ModifySLMPolicy.class,
    ModifyCompactFlash.class,
    ModifyConfigDeploymentPolicy.class,
    ModifyIncludeConfig.class,
    ModifyZosNSSClient.class,
    ModifySNMPSettings.class,
    ModifyWSEndpointRewritePolicy.class,
    ModifyThrottler.class,
    ModifyWebServiceMonitor.class,
    Modifyxmltrace.class,
    ModifyPolicyParameters.class,
    ModifyLoadBalancerGroup.class,
    ModifySecureCloudConnector.class,
    ModifyStatistics.class,
    ModifyHTTPInputConversionMap.class,
    ModifyURLRefreshPolicy.class,
    ModifyNameValueProfile.class,
    ModifyWebAppErrorHandlingPolicy.class,
    ModifyWCCService.class,
    ModifyIScsiTargetConfig.class,
    ModifyURLMap.class,
    ModifyLogLabel.class,
    ModifyNFSClientSettings.class,
    ModifyImportPackage.class,
    ModifyStylePolicyAction.class,
    ModifyConformancePolicy.class,
    ModifyIScsiVolumeConfig.class,
    ModifyIPMIUser.class,
    ModifyPeerGroup.class,
    ModifyWSStylePolicy.class,
    ModifyXMLManager.class,
    ModifyNFSStaticMount.class,
    ModifyMessageFlowControl.class,
    ModifySLMAction.class,
    ModifyUser.class,
    ModifyURLRewritePolicy.class,
    ModifySLMRsrcClass.class,
    ModifyFTPQuoteCommands.class,
    ModifyHTTPUserAgent.class,
    ModifyRaidVolume.class,
    ModifyAccessControl.class,
    ModifySimpleCountMonitor.class,
    ModifyLLMPolicyBase.class,
    ModifyDynamicXMLContentMap.class,
    ModifyStylePolicyRuleBase.class,
    ModifyDeviceSettings.class,
    ModifyIMSConnect.class,
    ModifyMQConfiguration.class,
    ModifyWebAppRequest.class,
    ModifyService.class,
    ModifyCrypto.class,
    ModifyZHybridTargetControlService.class,
    ModifyIPMILanChannel.class,
    ModifySLMSchedule.class,
    ModifyGatewayBase.class,
    ModifyShellAlias.class,
    ModifyEventlog.class,
    ModifyPolicyAttachments.class,
    ModifyIScsiInitiatorConfig.class,
    ModifyIPInterface.class,
    ModifyWebServiceSubscription.class,
    ModifyWebAppResponse.class,
    ModifyCompileOptionsPolicy.class,
    ModifyNFSDynamicMounts.class,
    ModifyNetworkConfiguration.class,
    ModifyJMSServer.class,
    ModifySourceProtocolHandler.class,
    ModifyRuntimeSettings.class
})
public class ModifyConfigBase {

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
