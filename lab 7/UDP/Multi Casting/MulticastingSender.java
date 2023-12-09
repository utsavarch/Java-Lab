import java.io.IOException;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.DatagramPacket;

public class MulticastingSender {
    public static void main(String[] args) throws InterruptedException, IOException {
        // Pick any multicast address within the range 224.0.0.0 to 239.255.255.255
        String group = "226.4.5.6";

        // Multicast socket that binds to any available port in localhost
        MulticastSocket ms = new MulticastSocket();

        String message1 = "Hello using Multicast";
        String message2 = "Bye bye using Multicast";

        // create Datagram packets and send
        DatagramPacket dp1 = new DatagramPacket(message1.getBytes(), message1.length(), InetAddress.getByName(group), 5000);
        ms.send(dp1);

        DatagramPacket dp2 = new DatagramPacket(message2.getBytes(), message2.length(), InetAddress.getByName(group), 5000);
        ms.send(dp2);

        // close the socket
        ms.close();
    }
}
