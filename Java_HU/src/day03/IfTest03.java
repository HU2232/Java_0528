package day03;

import java.util.Scanner;

public class IfTest03 {
	
	public static void main(String[] args) {
		/*산술연산자와 두 정수를 입력받아 산술연산자에 맞는 연산 결과를 출력하는 코드를 작성하세요
		 * 예시 : 두 정수와 산술연산자를 입력하세요(예 : 1 + 2) : 1 + 2 [엔터]
		 * 1 + 2 = 3 
		 */
		
		//Scanner를 이용하여 두 정수와 산술 연산자를 입력
		Scanner scan= new Scanner(System.in);
		System.out.println("두 정수와 산술 연산자를 입력하세요(예 : 1 + 2) : ");
		int num1 =scan.nextInt();
		char oper =scan.next().charAt(0);
		int num2 =scan.nextInt();
		/* 연산자가 +이면 두 정수의 합을 출력하고
		 * 아니면 연산자가 - 이면 두 정수의 차를 출력하고
		 * 아니면 연산자가 * 이면 두 정수의 곱을 출력하고
		 * 아니면 연산자가 / 이면 두 정수를 나눈 결과를 출력하고
		 * 아니면 연산자가 % 이면 두 정수의 나머지 결과를 출력하고
		 * 아니면 잘못된 연산자 입니다
		 */
		double res;
		if(oper == '+') {
			res = num1 + num2;
			System.out.println("" + num1 + oper + num2 + "=" + (int)res);
		
		}else if(oper == '-') {
			res = num1 - num2;
			System.out.println("" + num1 + oper + num2 + "=" + (int)res);
		
		}else if(oper == '*') {
			res = num1 * num2;
			System.out.println("" + num1 + oper + num2 + "=" + (int)res);
			
		}else if(oper == '/') {
			res = (double)num1 / num2;
				System.out.println("" + num1 + oper + num2 + "=" + res);
			
		}else if(oper == '%') {
			res = (double)num1 % num2;
				System.out.println("" + num1 + oper + num2 + "=" + (int)res);
			
		}else {
			System.out.println(oper + " 잘못된 연산자입니다");
		}
			
	}	
}		
