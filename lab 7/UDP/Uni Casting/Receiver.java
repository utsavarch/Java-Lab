import java.net.*;

public class Receiver {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(3000);
        byte[] buf1 = new byte[1024];
        byte[] buf2 = new byte[1024];

        DatagramPacket dp1 = new DatagramPacket(buf1, 1024);
        ds.receive(dp1);
        String str1 = new String(dp1.getData(), 0, dp1.getLength());

        DatagramPacket dp2 = new DatagramPacket(buf2, 1024);
        ds.receive(dp2);
        String str2 = new String(dp2.getData(), 0, dp2.getLength());

        System.out.println(str1);
        System.out.println(str2);

        ds.close();
    }
}
