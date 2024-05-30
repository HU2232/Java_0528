package day03;

import java.util.Scanner;

public class SwitchEX02 {

	public static void main(String[] args) {
		/*월을 입력받아 입력받은 월의 계절을 출력하세요 (switch문 사용)*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("달 : ");
		int mon = scan.nextInt();
		
		switch(mon) {
		case 3,4,5:
			System.out.println("월은 봄입니다");
			break;
		case 6,7,8:
			System.out.println("월은 여름입니다");
			break;
		case 9,10,11:
			System.out.println("월은 가을입니다");
			break;
		case 12,1,2:
			System.out.println("월은 겨울입니다");
			break;
		default:
			System.out.println("잘못 된 날짜입니다");
		
		}

	}

}
