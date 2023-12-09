// Client.java
import java.io.*;
import java.net.*;

public class Client {
	private Socket socket = null;
	private DataInputStream inputFromServer = null;
	private DataOutputStream outputToServer = null;
	private DataInputStream inputFromUser = null;

	public Client(String address, int port) {
		try {
			socket = new Socket(address, port);
			System.out.println("Connected");

			inputFromServer = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
			outputToServer = new DataOutputStream(socket.getOutputStream());
			inputFromUser = new DataInputStream(System.in);
			
			String line = "";

			while (!line.equals("Over")) {
				try {
					line = inputFromUser.readLine();
					outputToServer.writeUTF(line);
					String serverResponse = inputFromServer.readUTF();
					System.out.println("Echo from Server: " + serverResponse);
				} catch (IOException i) {
					System.out.println(i);
				}
			}

			inputFromUser.close();
			inputFromServer.close();
			outputToServer.close();
			socket.close();
		} catch (UnknownHostException u) {
			System.out.println(u);
			return;
		} catch (IOException i) {
			System.out.println(i);
			return;
		}
	}

	public static void main(String args[]) {
		Client client = new Client("127.0.0.1", 5000);
	}
}