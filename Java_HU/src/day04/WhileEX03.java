package day04;

public class WhileEX03 {

	public static void main(String[] args) {
		/* 구구단 2단을 출력하는 코드를 작성하시오
		 * 2 * 1 = 2
		 * ....
		 * 2 * 9 = 18
		 * 반복횟수 : i는 1부터 9까지 1씩 증가
		 * 규칙성 : 2 x i = (2*i)
		 * 반복문 종료 후 : 없음*/
		
		int i = 1;
		int n = 2;
		while (i <= 9) {
			int b = n * i;
			System.out.println(n +" x " + i + " = " + b);
			i++;
			
		}
		

	}

}
