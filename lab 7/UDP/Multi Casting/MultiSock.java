//Java program to illustrate various
//MulticastSocket class methods
import java.io.IOException;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.NetworkInterface;
import java.util.Enumeration;

public class MultiSock 
{
	public static void main(String[] args) throws IOException 
	{
		
		MulticastSocket ms = new MulticastSocket();
		InetAddress ip = InetAddress.getByName("224.168.1.124");

		// setTTL() method
		// this method is deprecated and instead
		// use setTimeToLive() method
		// Un-commenting below line would throw
		// a warning as the method is deprecated
		ms.setTTL((byte) 25);

		// setTimeToLive() method, will override
		// setting by setTTL() method
		ms.setTimeToLive(20);

		// getTTL() method
		// deprecated, so use getTimeToLive() method instead
		System.out.println("TTL : " + ms.getTTL());

		// getTimeToLive() method
		System.out.println("Time to Live : " + 
							ms.getTimeToLive());

		NetworkInterface nif = NetworkInterface.getByIndex(1);
		Enumeration<InetAddress> enu = nif.getInetAddresses();
		InetAddress intadd = enu.nextElement();

		// setInterface() method
		ms.setInterface(intadd);

		// getInterface() method
		System.out.println("Interface : " + ms.getInterface());

		// setNetworkInterface() method
		ms.setNetworkInterface(nif);

		// getNetworkInterface() method
		System.out.println("Network Interface : " + 
						ms.getNetworkInterface());

		// setLoopbackMode() method
		ms.setLoopbackMode(true);

		// getLoopbackMode() method
		System.out.println("Loopback mode : " + 
							ms.getLoopbackMode());
	}

}
