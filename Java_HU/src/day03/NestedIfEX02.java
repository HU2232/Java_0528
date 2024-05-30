package day03;

import java.util.Scanner;

public class NestedIfEX02 {

	public static void main(String[] args) {
		
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
		
		//num2가 0이면 0으로 나눌 수 없습니다 라고 출력	
		}else if(oper == '/') {
			if(num2 != 0) {
				res = (double)num1 / num2;
				System.out.println("" + num1 + oper + num2 + "=" + res);
			}
		}else if(oper == '%') {
			if(num2 != 0) {
				res = (double)num1 % num2;
				System.out.println("" + num1 + oper + num2 + "=" + (int)res);
			}
		}else {
			System.out.println(oper + " 잘못된 연산자입니다");

	}
	}
}
