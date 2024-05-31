package day04;

import java.util.Scanner;

public class ForEX03 {

	public static void main(String[] args) {
		/* 문자를 입력받고 입력받은 문자가 y이면 종료하는 코드를 작성하시오(for문)*/
		
			
		char ch;
		Scanner scan = new Scanner(System.in);
		for( ; ; ) {
			System.out.println("문자 입력 : ");
			ch = scan.next().charAt(0);
			if(ch == 'y') {
				break;
			}

	}
	}
}
