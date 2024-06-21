package HomeWorks;

import java.util.Scanner;

public class PhoneEX01 {

	public static void main(String[] args) {
		/* 연락처 관리를 위한 프로그램을 만드시오
		 * 메뉴
		 * 1. 연락처 추가
		 * 2. 연락처 수정
		 * 3. 연락처 삭제
		 * 4. 연락처 검색
		 * 5. 프로그램 종료
		 * 메뉴 선택 :
		 *  
		 * 1번 선택 시
		 * ---------------
		 * 이름 : 홍길동
		 * 번호 : 010-1234-5678
		 * ---------------
		 * 등록이 완료되었습니다
		 * 이 출력되야함 (중복가능)
		 * 단, 번호가 중복될 경우 "이미 등록된 번호입니다."출력
		 * 
		 * 2번 선택 시
		 * ---------------
		 * 이름 검색 : 홍(이 단어가 들어간 이름은 전부 출력되도록 함) 
		 * 1. 홍길동 : 010-1234-5678
		 * 2. 홍길동 : 010-1234-8765
		 * 번호 선택 : 1
		 * 1번 연락처 수정하는 코드 작성
		 * 단, 번호 수정 과정에서 이미 있는 번호일 경우 "이미 등록된 번호입니다" 출력
		 * 
		 * 3번 선택 시
		 * ---------------
		 * 이름 검색 : 홍(이 단어가 들어간 이름은 전부 출력되도록 함) 
		 * 1. 홍길동 : 010-1234-5678
		 * 2. 홍길동 : 010-1234-8765
		 * 
		 * 4번 선택 시
		 * ---------------
		 * 이름 검색 : 홍(이 단어가 들어간 이름은 전부 출력되도록 함) 
		 * 1. 홍길동 : 010-1234-5678
		 * 2. 홍길동 : 010-1234-8765
		 * 삭제할 번호 선택 : 1
		 * ---------------
		 * 번호를 삭제했습니다.
 		 * */
		
		Scanner scan = new Scanner(System.in);
		int menu;
		Number [] list = new Number[10];
		
		
		
		do {
			printMenu();
			menu = scan.nextInt();
			
			switch(menu) {
				case 1: 
					
				case 2: 
					
				case 3: 
					
				case 4: 
					
				case 5: 
					System.out.println("프로그램을 종료합니다");
				}
			}while(menu  != 5);

	}
	public static void printMenu() {
		System.out.println("1. 연락처 추가");
		System.out.println("2. 연락처 검색");
		System.out.println("3. 연락처 삭제");
		System.out.println("4. 연락처 검색");
		System.out.println("5. 프로그램 종료");
		System.out.print("프로그램 선택 : ");
	}
}
