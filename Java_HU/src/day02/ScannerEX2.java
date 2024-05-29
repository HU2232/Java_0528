package day02;

import java.util.Scanner;

public class ScannerEX2 {

	public static void main(String[] args) {
		/* 두 정수와 연낮를 입력 받고 입력받은 결과를 콘솔에 출력할 것.
		 * 예시
		 * 정수1을 입력하세요 : 1
		 * 정수2를 입력하세요 : 2
		 * 연산자를 입력하세요 : +
		 * 입력 결과 : 1 + 2
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 1을 입력하시오 : ");
		int num1 = scan.nextInt();
		System.out.println(num1);
		
		System.out.println("정수 2를 입력하시오 : ");
		int num2 = scan.nextInt();
		System.out.println(num2);
		
		System.out.println("연산자를 입력하시오 : ");
		char op = scan.next().charAt(0);
		System.out.println("" + num1 + op + num2);

	}

}
