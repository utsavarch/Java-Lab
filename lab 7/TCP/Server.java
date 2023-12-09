// Server.java
import java.net.*;
import java.io.*;

public class Server {
	private Socket socket = null;
	private ServerSocket server = null;
	private DataInputStream inputFromClient = null;
	private DataOutputStream outputToClient = null;

	public Server(int port) {
		try {
			server = new ServerSocket(port);
			System.out.println("Server started");

			System.out.println("Waiting for a client ...");

			socket = server.accept();
			System.out.println("Client accepted");

			inputFromClient = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
			outputToClient = new DataOutputStream(socket.getOutputStream());

			String line = "";

			while (!line.equals("Over")) {
				try {
					line = inputFromClient.readUTF();
					System.out.println(line);

					// Echo back to the client
					outputToClient.writeUTF(line);
				} catch (IOException i) {
					System.out.println(i);
				}
			}
			System.out.println("Closing connection");

			inputFromClient.close();
			outputToClient.close();
			socket.close();
		} catch (IOException i) {
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		Server server = new Server(5000);
	}
}