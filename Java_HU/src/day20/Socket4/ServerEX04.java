package day20.Socket4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEX04 {

	public static void main(String[] args) {
		int port = 5001;
		
		try(ServerSocket serverSocket = new ServerSocket(port)){
			System.out.println("[대기중]");
			Socket socket = serverSocket.accept();
			Client client = new Client(socket);
			client.send();
			client.recive();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}