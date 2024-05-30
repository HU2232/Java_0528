package day03;

import java.util.Scanner;

public class IfTest04 {

	public static void main(String[] args) {
		/* 정수를 입력 받아 3의 배수인지 아닌지 판별하는 코드를 작성하시오
		 * 예시 1
		 * 정수 입력 : 6
		 * 3의 배수입니다
		 * 예시 2
		 * 정수 입력 : 2
		 * 3의 배수가 아닙니다
		 */
		
		Scanner scan= new Scanner(System.in);
		System.out.println("정수 : ");
		int num = scan.nextInt();
		
		if (num % 3 == 0) {
			System.out.println(num + " 이 수는 3의 배수 입니다");
		}
		else {
			System.out.println(num + " 이 수는 3의 배수가 아닙니다");
		}

	}

}
