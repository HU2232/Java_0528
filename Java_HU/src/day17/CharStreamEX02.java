package day17;

import java.io.FileWriter;
import java.io.IOException;

public class CharStreamEX02 {

	public static void main(String[] args) {
		String fileName = "src/day17/charStream.txt";
		
		try(FileWriter fw = new FileWriter(fileName)){
			String str = "아 배고프다 삼겹살 땡긴다.\n근데 못먹는다";
			/*for(int i=0; i<str.length(); i++) {
				fw.write(str.charAt(i));
			}*/
			fw.write(str);//위 코드를 한줄로 압축
		} catch (IOException e) {
			System.out.println("파일 입출력 예외가 발생");
		}

	}

}
