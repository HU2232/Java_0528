package day04;

public class WhileEX02 {

	public static void main(String[] args) {
		/* while문을 이용해서 1부터 5까지 콘솔에 출력하는 코드를 작성하시오
		 * 반복횟수 : 1부터 5까지 1씩 증가
		 * 규칙성 : num을 출력
		 * 반복문 종료 후 : 없음
		 * */
		
		int num1 = 1;
		while (num1 <= 5) {
			System.out.println(num1);
			num1++;
		}
		System.out.println("-------------");
		/* 10부터 1까지 콘솔에 출력하는 코드를 작성하시오
		 * 반복횟수 : num2는 10부터 1까지 1씩 감소
		 * 규칙성 : num2를 출력
		 * 반복문 종료 후 : 없음
		 * */
		int num2 = 10;
		while (num2 >= 1) {
			System.out.println(num2);
			num2--;
		}
	}
}
