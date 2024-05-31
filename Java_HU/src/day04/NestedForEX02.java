package day04;

public class NestedForEX02 {
	
	public static void main(String[] args) {
		/* num가 소수인지 아닌지 판별하는 코드를 이용하여 100이하의 소수를 출력하는 코드를 작성하시오
		 * 반복횟수 : num은 2부터 100까지 1씩 증가
		 * 규칙성 : num이 소수인지 아닌지 판별하는 코드를 활용해서 소수이면 num을 출력 아미녀 아무것도 안함
		 * 반복문 종료 후 : 없음
		 * */
		int num = 3;
		int i, cou = 0;
		for(num = 2; num <+ 100; num++){
			//num이 소수인지 아닌지 판별하는 코드
			for(i = 1, cou = 0; i <= num; i++) {
				if(num % i == 0) {
					cou++;
			}
		}
		if(cou == 2) {
			System.out.print(num + ", ");
		}
		
	}
	}
}
