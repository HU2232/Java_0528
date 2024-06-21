package day17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedStreamEX01 {

	public static void main(String[] args) {

		String fileName = "src/day17/charStream.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
			String str;
			/*do {
				str = br.readLine();
				System.out.println(str);
			}while(str != null);
			*/
			while((str = br.readLine()) != null) {
				System.out.println(str);
				//이 코드가 정석 코드임 마지막에 null이 안찍힌다
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다");
		} catch (IOException e) {
			System.out.println("파일 입출력 예외 발생");
		}

	}

}
