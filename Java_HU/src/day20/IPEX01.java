package day20;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class IPEX01 {

	public static void main(String[] args) {
		//xxx.xxx.xxx.xxx : IPv4 아이피 주소 형태
		try {
			InetAddress address = InetAddress.getByName("localhost");
			System.out.println(address);
			
			address = InetAddress.getByName("www.nexon.com");
			System.out.println(address);
			
			InetAddress [] list = InetAddress.getAllByName("www.nexon.com");
			System.out.println(Arrays.toString(list));
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
