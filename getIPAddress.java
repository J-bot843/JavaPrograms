import java.net.InetAddress;

class getIPAddress
{
	public static void main(String args[]) throws exception
	{
		InetAddress IP = InetAddress.getLocalHost();
		
		System.out.println("The IP Address is: " + IP.getHostAddress());
	}
}
