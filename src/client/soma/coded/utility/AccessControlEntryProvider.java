package client.soma.coded.utility;
import java.util.List;

import client.soma.generated.ConfigAccessControlList;
import client.soma.generated.DmACE;
import client.soma.generated.DmACEAccess;
import client.soma.generated.ModifyAccessControlList;
import client.xmi.coded.utility.IPSequenceProvider;

public class AccessControlEntryProvider {
	
	// set-config
	public static void addSingleIPEntryToConfigAccessControlList(
			String singleIPAddress,
			ConfigAccessControlList accessControlList) {
			List<DmACE> accessControlEntryList = accessControlList.getAccessControlEntry();
			DmACE dmACE = accessControlEntry(singleIPAddress);
			accessControlEntryList.add(dmACE);
			System.out.println("Added the following set-config entry to deny: " + singleIPAddress);
	}
	
	// modify-config
	public static void addSingleIPEntryToModifyAccessControlList(
			String singleIPAddress,
			ModifyAccessControlList accessControlList) {
			List<DmACE> accessControlEntryList = accessControlList.getAccessControlEntry();
			DmACE dmACE = accessControlEntry(singleIPAddress);
			accessControlEntryList.add(dmACE);
			System.out.println("Added the following modify-config entry to deny: " + singleIPAddress);
	}
	
	public static DmACE accessControlEntry(
			String singleIPAddress) {
			String cidrAddress;
			DmACE dmACE = new DmACE();
			dmACE.setAccess(DmACEAccess.DENY);
			cidrAddress = singleIPAddress + "/32";
			dmACE.setAddress(cidrAddress);
			return dmACE;
	}

	public static void addMultipleIPEntriesTo(
			String spaceSeparatedIPAddressesString,		// e.g. "10.162.209.94 10.162.192.38"
			ConfigAccessControlList accessControlList) {
			String [] singleIPAddressArray = spaceSeparatedIPAddressesString.split(" ");
			for (String singleIPAddress: singleIPAddressArray) {
				addSingleIPEntryToConfigAccessControlList(singleIPAddress, accessControlList);
			}
	}

	public static void testAddGivenCountIPEntriesTo(
			int numberToProvide,
			ConfigAccessControlList accessControlList) {
		IPSequenceProvider ipSequenceProvider = new IPSequenceProvider(numberToProvide);
		String singleIPAddress;
		// ipSequenceProvider returns with null when finished providing numberToProvide
		while ((singleIPAddress = ipSequenceProvider.nextIP()) != null) {
			addSingleIPEntryToConfigAccessControlList(singleIPAddress, accessControlList);
		}	
	}
}
