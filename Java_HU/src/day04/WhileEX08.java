package day04;

public class WhileEX08 {

	public static void main(String[] args) {
		/* a부터 z까지 출력하는 코드를 작성하시오
		 * A ~ Z까지 모두 출력되야함
		 * 반복횟수 : i는 0부터 25까지 1씩 증가
		 * 규칙성 : 'a'+1을 문자로 출력
		 * 반복문 종료 후 : 없음
		 * */
		char ch = 97;
		int i = 0;
		
		while(i <= 25) {
			System.out.print((char)(ch + i));
			i++;
		}
		System.out.print(" / ");
		/* 반복횟수 : ch는 'a'부터 'z'까지 1씩 증가
		 * 규칙성 : ch를 출력
		 * 반복문 종료 후 : 없음
		 */
		char ch1 = 'a';
		while(ch1 <='z') {
			System.out.print(ch1);
			ch1++;
		}
		}

	}


