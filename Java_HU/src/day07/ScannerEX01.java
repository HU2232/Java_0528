package day07;

import java.util.Scanner;

public class ScannerEX01 {

	public static void main(String[] args) {
		/* Scanner를 이용하여 next()와 nextLine()의 차이를 살펴보는 예제
		 * next() 
		 * -문자열
		 * -공백을 제외한 연속된 문자열
		 * -문자열을 입력하기 전에 입력 버퍼에 앤터가 있으면 버림
		 * nextLine()
		 * -문자열
		 * -공백을 포함한 한 줄의 문자열
		 * -문자열을 입력하기 전 입력 버퍼에 엔터가 있으면 가져와서 실행
		 * -문자열을 입력한 마지막에 입력한 엔터를 가져가고 가져간 엔터를 버림
		 * */ 
		
		Scanner scan = new Scanner(System.in);
		//next()는 여러번 연속으로 나와도 문제가 없음
		System.out.println("문자열 입력 1 (next) : ");
		String str1 = scan.next();
		System.out.println("문자열 입력 2 (next) : ");
		String str2 = scan.next();		
		System.out.println("문자열 입력 3 (next) : ");
		String str3 = scan.next();	
		
		System.out.println("엔터 제거용ㅁㄴㅇㄹ (nextLine) : ");
		String str0 = scan.nextLine();//엔터 제거용으로 이렇게 사용하기도 함
		
		//nextLine()도 여러번 연속으로 나와도 문제가 없음
		//근데 중간에 next 실행문이 있다면 nextLine은 씹힘
		System.out.println("문자열 입력 4 (nextLine) : ");
		String str4 = scan.nextLine();
		System.out.println("문자열 입력 5 (nextLine) : ");
		String str5 = scan.nextLine();	
		System.out.println("문자열 입력 6 (nextLine) : ");
		String str6 = scan.nextLine();


	}

}
