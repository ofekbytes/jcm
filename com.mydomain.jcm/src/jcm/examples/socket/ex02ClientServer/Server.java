package jcm.examples.socket.ex02ClientServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	private String hostName = "localhost";
	private int portNumber = 4999;

	public Server() throws IOException {
		System.out.println("Server Side Socket");
		ServerSocket serverSocket = new ServerSocket(portNumber);
		Socket socket = serverSocket.accept();

		System.out.println("Client Connect");
	}

	public static void main(String[] args) {

		try {
			Server server = new Server();
		} catch (IOException e) {
			System.out.println("Server.main()");
			e.printStackTrace();
		}
	}

}

