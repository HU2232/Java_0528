package day04;

public class WhileEX05 {

	public static void main(String[] args) {
		/* 12의 약수를 출력하는 코드를 작성하시오
		 * 약수 : 나누어서 나머지가 0으로 떨어지는 수
		 * 12의 약수 : 1, 2, 3, 4, 6, 12
		 * 반복횟수 : i는 1부터 12까지 1씩 증가
		 * 규칙성 : i가 12의 약수이면 i를 출력
		 * 		  => 12를 i로 나누었을 때 나머지가 0과 같으면 i를 출력해라
		 * 반복문 종료 후 : 
		 * */
		
		int i = 1;
		int n = 12;
		System.out.println(n + "의 약수 : ");
		while(i <= n) {				
			if(n % i == 0) {	
			System.out.println(i +(i != n ? ", " : "\n"));
				}
			++i;
		}
	}
}




