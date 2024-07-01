package day23;

public class EX07 {

	public static void main(String[] args) {
		/* 1부터 10까지의 합을 구하려고 했다
		 * 원인 : for문에 붙어있는 ; 때문에 반복문이 끝나버려서
		 * 		 아래에 붙어있는 계산식이 작동하지 못함
		 * 해결방법 : ;을 지우면 된다
		 * */
		
		int i;
		int sum = 0;
		//for(i=1; i<=10; i++); {
		for(i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 합 : " + sum);
	}
}

