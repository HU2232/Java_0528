package HomeWorks;

import java.util.Scanner;

public class UpDownGame {
	
	public static void main(String[] args) {
		/* 1~100사이의 랜덤한 수를 생성하여 해당 숫자를 맞추는 게임을 작성하시오
		 * 예시 (랜덤한 수가 30)
		 * 정수 입력 : 50
		 * Down!출력
		 * 정수 입력 : 20
		 * UP!
		 * 정수 입력 : 30
		 * 정답입니다!
		 * 프로그램 종료*/
		
		int min = 1, max = 100;
		int ran = (int)(Math.random() * (max - min +1) + min);
		
		System.out.println("랜덤한 수 : " + ran);
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(num);
		
		do {
			if(ran > num) {
				System.out.println("Up!");
			}			
			else if(ran < num) {
				System.out.println("Down");
			}
			else {
				System.out.println("정답입니다");
			}
			while(num =)
		
		
		
		
	
				
		
		}
	}
	


