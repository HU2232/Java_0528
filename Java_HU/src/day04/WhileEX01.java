package day04;

public class WhileEX01 {

	public static void main(String[] args) {
		// Hello World를 5번 출력하는 예제
		
		/*while(조건식){
		 * 		실행문;
		 * 	}
		 * 
		 * 초기화;
		 * while(조건식){
		 * 		실행문;
		 * 		증감식;
		 * }
		 */
		
			
		int i = 1;
		while(i <= 5) {
			System.out.println("Hello World");;
			 ++i; //i++;, i+=1;, i=i+1;
		/* 반복횟수 : i는 1부터 5까지 1씩 증가 -> 초기화, 증감식, 조건식 결정
		 * 규칙성 : Hello World를 콘솔에 출력 -> 실행문
		 * 반복문 종료 후 : 없음
		 * */ 
			 
		}
		}
	}
	


