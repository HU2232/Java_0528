package day04;

public class WhileEX06 {

	public static void main(String[] args) {
		/* 4가 소수인지 아닌지 판별하는 코드를 작성하시오
		 * 소수 : 약수가 1과 자기자신인 수를 소수라고 함
		 * 예시1
		 * 1 : 소수가 아님
		 * 2 : 소수
		 * 3 : 소수
		 * 4 : 소수가 아님
		 * 반복횟수 : 1부터 4까지 1씩 증가
		 * 규칙성 : i가 4의 약수이면 약수의 개수를 1증가
		 * 반복문 종료 후 : 약수의 개수가 2개이면 소수 아니면 소수가 아님이라고 출력*/
		
		int i = 1;
		int n = 4;
		int c = 0;
		while (i <= n) {
			i++;
			if (n % i == 0) {
				c++;			
			}
			if(c == 2) {
				System.out.println(n + " : 소수");
			}
			else {
				System.out.println(n + " : 소수가 아님");
			}
			
		}
		
		

	}

}
