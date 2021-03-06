package dataHelpers;

public class AddressDataHelper {

	public static long convertIpAddressToNumber(String address){
		String[] ipAddressParts = address.split("\\.");
		System.out.println("Converting: " + address); //TODO remove, debug
		//translate to ip number:
		System.out.println(ipAddressParts);
		System.out.println(ipAddressParts[0]);
		System.out.println(ipAddressParts[1]);
		System.out.println(ipAddressParts[2]);
		System.out.println(ipAddressParts[3]);
		int w = Integer.parseInt(ipAddressParts[0].trim());
		int x = Integer.parseInt(ipAddressParts[1].trim());
		int y = Integer.parseInt(ipAddressParts[2].trim());
		int z = Integer.parseInt(ipAddressParts[3].trim());
		long ipNumber = (long)(16777216*w + 65536*x + 256*y + z);
		System.out.println("ip num: " + ipNumber); //TODO debug, remove
		return ipNumber;
		
	}
	
	public static String convertIpNumberToAddress(long ipNumber){
		//translate to ip address
		int w = (int) ((ipNumber/16777216)%256);
		int x = (int) ((ipNumber/65536)%256);
		int y = (int) ((ipNumber/256)%256);
		int z = (int) (ipNumber%256);
		String ipAddress = w + "." + x + "." + y + "." +z;
		System.out.println(ipAddress); //TODO debug, remove
		return ipAddress;
	}
	
}
