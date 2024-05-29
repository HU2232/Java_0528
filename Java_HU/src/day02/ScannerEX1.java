package day02;

import java.util.Scanner;

public class ScannerEX1 {
	public static void main(String[] args) {
		/* 콘솔창에서 원하는 값을 읽어와서 변수에 저장하는 예제
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오 : ");
		/* println(값) : 값을 출력하고 자동으로 줄바꿈을 함
		 * print(값) :  값을 출력 */		 
		int num1 = scan.nextInt();// 콘솔에서 정수를 가져옴
		System.out.println(num1);
		
		System.out.println("실수를 입력하세요 : ");
		double num2 = scan.nextDouble();//콘솔에서 실수를 가져옴
		System.out.println(num2);
		
		System.out.println("문자열(단어)를 입력하세요 : ");
		String str1 = scan.next();//콘솔에서 공백 전까지 문자열을 가져옴
		System.out.println("단어 : " + str1);
		
		scan.nextLine();//앞에서 입력한 엔터를 비워줌
		System.out.println("문자열(문장)을 입력하세요 : ");
		String str2 = scan.nextLine();//엔터까지 한 문장을 가져와서 엔터 전까지 저장함
		System.out.println(str2);
		
		System.out.println("문자를 입력하세요 : ");
		/*next()를 통해서 문자열을 가져오고, String 클래스에서 제공하는
		 *charAt(번지) 기능을 통해 0번째 글자를 가져옴
		 */
		char ch =  scan.next().charAt(0);
		System.out.println(ch);
	}

}
