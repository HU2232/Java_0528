package day04;

public class WhileEX04 {

	public static void main(String[] args) {
		/* 1부터 10까지 합을 구하는 코드를 작성하시오
		 * 
		 *  				sum
		 * i = 1	sum		0
		 * i = 2	sum		0 + 1
		 * i = 3	sum		0 + 1 + 2 + 3
		 * ....
		 * i = 10	sum		0 + 1 + 2 + 3 + ... + 9 + 10
		 * 
		 * 반복횟수 : i는 1부터 10까지 1씩 증가
		 * 규칙성 : sum = sum + i
		 * 반복문 종료 후 : sum을 출력
		 * */
		
		int i = 1;
		int sum = 0;
		while (i <= 10) {
			sum += i;
			++i;
		}
		System.out.println("1부터 10까지 의 합 : " + sum);
		
		/* 1부터 10까지 짝수 합을 구하는 코드를 작성하시오
		 * 
		 *  				sum
		 * j = 2	sum		+ 2
		 * j = 4	sum		+ 4
		 * j = 6	sum		+ 6
		 * ....
		 * j = 10	sum		+ 10
		 * 
		 * 반복횟수 : j는 2부터 10까지 2씩 증가
		 * 규칙성 : num = num + j
		 * 반복문 종료 후 : num을 출력
		 * */
		
		int num = 0;
		int j = 2;
		while (j <= 10) {
			num += j;
			j += 2;
		}
			System.out.println("1부터 10까지 짝수의 합은 : " + num);
			
		}
			

	}


