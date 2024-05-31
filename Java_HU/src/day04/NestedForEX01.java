package day04;

public class NestedForEX01 {

	public static void main(String[] args) {
		/* 구구단 2~9단을 출ㄹ겨하는 코드를 작성하시오
		 * 반복횟수 : num을 2부터 9까지 1씩 증가
		 * 규칙성 : num단 출ㄹ겨하는 코드
		 * 반복문 종료 후 : 없음
		 * */
		for(int i=2; i<=9; i++) {
			for(int n=1; n<=9; n++)
			System.out.println(i + " X " + n + " = " + i*n);
		}

	}
}

