package client.xmi.coded.utility;
/* This is simple code to provide a sequence of IP addresses, used for DataPower
 * ACL entries testing.
 * (Note that this is not intended as production code.)
 * Steve Edwards (2011-10-27)
 */

public class IPSequenceProvider {

	protected int numberToProvide;
	
	int firstIPdigits;
	int secondIPdigits;
	int thirdIPdigits;
	int fourthIPdigits; 
	int currentCount;
	String ipAddressForNextCall;
	
	public static void main(String[] args) {
		// This main is intended for basic testing.
		// Client programs will create an instance of this class, and subsequently use
		// the nextIP() method.
		int numberToProvide = 4;
		int numberSoFar = 0;
		String ipAddress;

		System.out.println("Number to provide, no initial IP address");
		IPSequenceProvider iPSequenceProvider = new IPSequenceProvider(numberToProvide);
		while ((ipAddress = iPSequenceProvider.nextIP()) != null) {
			numberSoFar++;
			System.out.println(ipAddress + " : " + numberSoFar);
		}

		System.out.println("Number to provide, with initial IP address");
		numberSoFar = 0;
		//IPSequenceProvider
		iPSequenceProvider = new IPSequenceProvider(
				numberToProvide,
				10, 163, 4, 126);
		while ((ipAddress = iPSequenceProvider.nextIP()) != null) {
			numberSoFar++;
			System.out.println(ipAddress + " : " + numberSoFar);
		} 
	}
	
	public IPSequenceProvider(int numberToProvide) {
		this.numberToProvide = numberToProvide;
		this.firstIPdigits = 10;
		this.secondIPdigits = 162;
		//this.thirdIPdigits = 0;
		this.thirdIPdigits = 254;
		this.fourthIPdigits = 1;
		this.currentCount = 0;
		this.setIPAddressForNextCall();
	};
	
	
	public IPSequenceProvider(int numberToProvide,
			int firstIPdigits,
			int secondIPdigits,
			int thirdIPdigits,
			int fourthIPdigits) {
		this.numberToProvide = numberToProvide;
		this.firstIPdigits = firstIPdigits;
		this.secondIPdigits = secondIPdigits;
		this.thirdIPdigits = thirdIPdigits;
		this.fourthIPdigits = fourthIPdigits;
		this.currentCount = 0;
		this.setIPAddressForNextCall();
	};
	
	protected void setIPAddressForNextCall() {
		this.ipAddressForNextCall = "" + firstIPdigits + "." +
				secondIPdigits + "." +
				thirdIPdigits  + "." +
				fourthIPdigits;
	}
	
	public String nextIP(){
		String nextIP = ipAddressForNextCall;
		if (currentCount >= numberToProvide) return null;
		currentCount++;
		fourthIPdigits++;
		if (fourthIPdigits >= 256) {
			thirdIPdigits++;
			fourthIPdigits = 1;
			if (thirdIPdigits >= 256) {
				secondIPdigits++;
				thirdIPdigits = 0;
				if (secondIPdigits >= 256) {
					firstIPdigits++;
					secondIPdigits = 0;
				}
			}
		}
		this.setIPAddressForNextCall();
		// System.out.println("nextIP() at: " + currentCount);
		return nextIP;
	}
	
}
