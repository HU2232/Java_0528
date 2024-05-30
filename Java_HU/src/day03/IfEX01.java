package day03;

public class IfEX01 {
	
	public static void main(String[] args) {
		//if문을 이용한 홀짝 판별 예제
		int num = 3;
		//num이 홀수이면 홀수라고 출력
		if(num % 2 != 0) {
			System.out.println("홀수");
		}
		//num이 짝수이면 짝수라고 출력
		if(num % 2 == 0) {
			System.out.println("짝수");
		}
	}

}
