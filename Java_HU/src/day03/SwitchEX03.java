package day03;

import java.util.Scanner;

public class SwitchEX03 {

	public static void main(String[] args) {
		/*산술 연산자와 두 정수를 입력받아 산술연산자에 맞는 연산 결과를 출력하는 코드를 작성하세요(switch문)
		 *두 정수와 산술연산자를 입력하세요 (예 1 + 2) : 1 + 2 [엔터]
		 *1 + 2 = 3*/

		Scanner scan= new Scanner(System.in);
		System.out.println("두 정수와 산술 연산자를 입력하세요(예 : 1 + 2) : ");
		int num1 =scan.nextInt();
		char oper =scan.next().charAt(0);
		int num2 =scan.nextInt();
		
		switch (oper) {
		case '+':
			System.out.println("" + num1 + oper + num2 + '=' + (num1 + num2));
			break;
		}
		switch (oper) {
		case '-':
			System.out.println("" + num1 + oper + num2 + '=' + (num1 - num2));
			break;
		}
		switch (oper) {
		case '*':
			System.out.println("" + num1 + oper + num2 + '=' + (num1 * num2));
			break;
		}
		switch (oper) {
		case '/':
			System.out.println("" + num1 + oper + num2 + '=' + (num1 / (double)num2));
			break;
		default:
			System.out.println(oper + " 산술연산자가 아닙니다");
		}
	}
}