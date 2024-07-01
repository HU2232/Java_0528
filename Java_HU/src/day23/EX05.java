package day23;

import java.util.Scanner;

public class EX05 {

	public static void main(String[] args) {
		/* 문자열을 입력받아 exit가 아니면 입력한 문자열을 출력하고,
		 * exit이면 종료하는 코드를 작성하려고 했다
		 * 원인 : 1. while문에서 false를 입력하면 조건식이 한 번도 실행이 되지 않는다
		 * 		 2. 문자열을 == 로 비교함
		 * 		 3. continue (while)문에서 조건식으로 이동함
		 * 해결방법 : false를 true로 바꿔줌, == 가 아니라 equals로 수정, continue를 break로 변경
		 */
		Scanner scan = new Scanner(System.in);
		boolean res = true; //false;
		while(res) {
			System.out.print("문자열 입력 : ");
			String str = scan.next();
			if(str.equals("exit")) {
				break;
			}
			System.out.println(str);
		}
	}
}

