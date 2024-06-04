package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEX07 {

	public static void main(String[] args) {
		/* UpDown 게임에 다음 기능을 추가하세요
		 * 메뉴
		 * 1. 플레이
		 * 2. 뒤로가기
		 * 3. 종료
		 * 메뉴 선택 : 
		 * 예시 (랜덤이 35라고 가정)
		 * 메뉴선택 1 -> 정수입력 : 50 -> Down!출력 -> 정수입력 25 ->Up!출력 ->정답입니다 출력
		 * 맞힌 횟수는 3회 입니다
		 * 기록이 등록됩니다.
		 * 기록확인
		 * 1위 3회
		 * 메뉴 선택 : 3
		 * 프로그램을 종료합니다
		 * */
		
		//변수 선언
		Scanner scan = new Scanner(System.in);
		int menu,min = 1, max = 100, ran, num,cou;
		int [] record = new int[5];
		int i,recordcount = 0;
		//선택한 메뉴가 3이 아닐 때 실행되는 반복문
		do {
			//메뉴 출력
			System.out.println("메뉴");
			System.out.println("1. 플레이");
			System.out.println("2. 기록 확인");
			System.out.println("3. 종료");
			System.out.print("메뉴선택 : ");
			// Scanner를 이용하여 메뉴를 입력
			menu = scan.nextInt();
			
			// 선택한 메뉴에 따른 기능 실행
			switch(menu) {
			// 선택한 메뉴가 1이면 플레이 문구 출력하는 코드 작성(게임 플레이 하는 코드 작성)
			case 1:
				//1~100사이의 랜덤한 수를 생성
				ran = (int)(Math.random() * (max - min +1) + min);
				System.out.println(ran);
				//횟수 초기화
				cou = 0;
				//입력한 값이 랜덤한 수와 같이 않으면 반복
				do {
					//정수 입력 : 안내문구 출력
					System.out.println("정수 입력 : ");
					//Scanner를 이용해 정수를 입력
					num = scan.nextInt();
					//입력한 횟수를 증가
					cou++;
					//입력한 값이 랜덤한 값보다 크면 Down이라고 출력 작으면 Up이라고 출력
					if(num > ran) {
						System.out.println("Down!");
					}
					else if(num<ran) {
						System.out.println("Up!");
					}
					//같으면 정답입니다를 출력하고 입력한 횟수를 출력
					else {
						System.out.println("정답입니다");
						System.out.println("맞힌 횟수는" + cou +"회 입니다.");
					}
				}while(ran != num);
				
				//기록의 갯수가 5개 미만이면
				if(recordcount < 5) {
					//기록을 등록
					//recordCount번지에 저장하고 recordCount를 1증가
					record[recordcount] = cou;
					recordcount++;
				}
				//아니면 내 기록이 5등보다 좋은지 비교해서 좋으면 기록을 등록
				else if(record[recordcount] - 1 > cou);
					//기록을 등록
					//마지막 번지에 내 기록을 등록
					record[recordcount - 1] = cou;
				
				//기록 정렬
				//Arrays.sort를 이용하여 0번지부터 recordCount번지 전까지 정렬
				Arrays.sort(record, 0, recordcount);
				break;
								
			// 선택한 메뉴가 2이면 기록 확인 문구 출력하는 코드 작성(기록 확인 하는 코드 작성)
			case 2:
				if(recordcount == 0) {
					System.out.println("등록된 기록이 없습니다.");
					break;
				}
				//record에 있는 기록들을 recordcount개 만큼 순서대로 출력
				/* 반복횟수 : i는 0부터 recordcount보다 작을 때까지 1씩 증가
				 * 규칙성 : i+1. 횟수를 출력
				 * 반복문 종료 후 : 없음
				 * */
				for(i = 0; i < recordcount; i++) {
					System.out.println(i+1 + ". " + record[i] + "회");
				}
				
				break;
			// 선택한 메뉴가 3이면 프로그램 종료 문구 출력하는 코드 작성(프로그램 종료 하는 코드 작성)
			case 3:
				System.out.println("프로그램을 종료합니다");
				break;
			// 아니면 잘못된 메뉴 문구 출력하는 코드 작성
			default:
				System.out.println("잘못된 메뉴입니다");
			}
		}while(menu != 3);
				
	}
}
		
	


	


