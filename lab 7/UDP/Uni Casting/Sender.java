import java.net.*;  
public class Sender{  
  public static void main(String[] args) throws Exception {  
    DatagramSocket ds = new DatagramSocket();  
    String str1 = "Welcome java";  
    String str2="Bye Bye Java";
    InetAddress ip = InetAddress.getByName("127.0.0.1");  
     
    DatagramPacket dp1 = new DatagramPacket(str1.getBytes(), str1.length(), ip, 3000);  
    DatagramPacket dp2 = new DatagramPacket(str2.getBytes(), str2.length(), ip, 3000);  

    ds.send(dp1);  
    ds.send(dp2);  

    ds.close();  
  }  
}  