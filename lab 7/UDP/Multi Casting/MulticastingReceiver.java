import java.io.IOException;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.DatagramPacket;

public class MulticastingReceiver {
    public static void main(String[] args) throws InterruptedException, IOException {
        String group = "226.4.5.6";  // Use the same multicast group as in the sender

        // Open a Multicast socket on the specified port
        MulticastSocket ms = new MulticastSocket(5000);
        ms.joinGroup(InetAddress.getByName(group));

        byte[] buf = new byte[1024];

        // Constructs a Datagram packet for receiving the packets of specified length
        DatagramPacket dp = new DatagramPacket(buf, 1024);

        ms.receive(dp);
        String str1 = new String(dp.getData(), 0, dp.getLength());
        System.out.println(str1);

        ms.receive(dp);
        String str2 = new String(dp.getData(), 0, dp.getLength());
        System.out.println(str2);

        // Leave the group
        ms.leaveGroup(InetAddress.getByName(group));

        // Closing the Datagram Socket
        ms.close();
    }
}
