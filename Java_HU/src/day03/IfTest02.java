package day03;

import java.util.Scanner;

public class IfTest02 {
	
	public static void main(String[] args) {
		/*월을 입력받아 입력받은 월의 계절을 출력하세요
		 * 3,4,5 : 봄
		 * 6,7,8 : 여름
		 * 9,10,11 : 가을
		 * 12,1,2 : 겨울
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("달 : ");
		int cal = scan.nextInt();
		
		if(cal == 3 || cal == 4 || cal == 5) {
		 System.out.println(cal + "월은 봄입니다.");
		//3이거나 4이거나 5이면 봄이라고 출력
		}else if(cal == 6 || cal == 7 || cal == 8) {
		 System.out.println(cal + "월은 여름입니다.");
		//6이거나 7이거나 8이면 여름이라고 출력
		}else if(cal == 9 || cal == 10 || cal == 11) {
		 System.out.println(cal + "월은 가을입니다.");
		//9이거나 10이거나 11이면 가을이라고 출력
		}else if(cal == 12 || cal == 1 || cal ==2) {
		 System.out.println(cal + "월은 겨울입니다.");
		//12이거나 1이거나 2이면 겨울이라고 출력
		}else {
		 System.out.println("잘못된 날짜입니다.");
		//아니면 잘못된 날짜라고 출력
		}
	

		/*if(cal == 3,4,5) ,if(cal ==3 || 4 || 5)
		 * 			실행문;
		 * 위의 코드들은 모두 잘못된 코드임*/
		
		if(cal >= 3 && cal <= 5) {
			 System.out.println(cal + "월은 봄입니다.");
		// 월이 3이상 5이하이면 봄이라고 출력하고
		}else if(cal >=6 && cal <= 9) {
			 System.out.println(cal + "월은 여름입니다.");
		// 월이 6이상 8이하이면 여름이라고 출력하고
		}else if(cal >= 9 && cal <= 11) {
			 System.out.println(cal + "월은 가을입니다.");
		// 월이 9이상 11이하이면 가을이라고 출력하고
		}else if(cal == 12 || (cal >= 1 || cal <= 2 )) {
			 System.out.println(cal + "월은 겨울입니다.");
		// 월이 12이거나 1이살이고 2이하이면 겨울이라고 출력하고
		}else {
			 System.out.println("잘못된 날짜입니다.");
		// 아니면 잘못된 월이라고 출력
		}
	}
}

