package day20.Socket5;

import java.net.Socket;
import java.util.Scanner;

public class ClientEX05 {

	public static void main(String[] args) {
		int port = 5001;
		String ip = "192.168.30.208";
		
		try{
			System.out.print("아이디 입력 : ");
			Scanner scan = new Scanner(System.in);
			String id =  scan.next();
			Socket socket = new Socket(ip, port);
			System.out.print("연결 성공");
			
			Client client = new Client(id, socket);
			client.recive();
			client.send();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
