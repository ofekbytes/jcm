package jcm.examples.socket.ex02ClientServer;

import java.io.IOException;
import java.net.Socket;

public class Client {

	private String hostName = "localhost";
	private int portNumber = 4999;

	public Client() throws IOException {
		System.out.println("Client Side Socket");
		Socket socket = new Socket(hostName, portNumber);

	}

	public static void main(String[] args) {

		try {
			Client client = new Client();
		} catch (IOException e) {
			System.out.println("Clientmain()");
			e.printStackTrace();
		}

	}

}
