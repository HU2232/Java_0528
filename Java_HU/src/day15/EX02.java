package day15;

import java.util.ArrayList;
import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {
		/* 다음 기능을 가진 프로그램을 작성하시오
		 * 메뉴
		 * 1. 번호추가
		 * 2. 번호삭제
		 * 3. 번호조회(sysout(list))로 대체
		 * 4. 종료
		 * */
		Scanner scan = new Scanner(System.in);
		int menu;
		ArrayList<String> list = new ArrayList<String>();
		
		do {
			printMenu();
			menu = scan.nextInt();
			
			switch(menu) {
			case 1 : 
				System.out.print("추가할 번호 입력 : ");
				String number1 = scan.next();
				if(list.contains(number1)) {
					System.out.println("이미 등록된 번호입니다.");
				}
				else {
					System.out.println("번호를 등록했습니다.");
					list.add(number1);
				}
				break;
				
			case 2 : 
				System.out.print("삭제할 번호 입력 : ");
				String number2 = scan.next();
				if(list.remove(number2)) {
					System.out.println("번호를 삭제했습니다.");
				}
				else {
					System.out.println("일치하는 번호가 없습니다");
				}
				break;
				
			case 3 : 
				System.out.println(list);
				break;
				
			case 4 : 
				System.out.println("프로그램을 종료합니다");
				break;
				
			default:
				
				System.out.println("잘못된 선택입니다");
			}
						
		}while(menu != 4);
	}
	public static void printMenu() {
		System.out.println("1. 번호 추가");
		System.out.println("2. 번호 삭제");
		System.out.println("3. 번호 조회");
		System.out.println("4. 종료");
		System.out.print("프로그램 선택 : ");
	}
	
}
