import java.net.InetAddress;

class getIPAddress
{
	public static void main(Sring args[]) throws exception
	{
		InetAddress IP = InetAddress.getLocalHost();
		
		System.out.println("The IP Address is: " + IP.getHostAddress());
	}
}
