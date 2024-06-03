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
		int num;
		
		do {
			System.out.println("정수 입력 : "); //정수 입력 : 이라는 안내 문구 출력
			num = scan.nextInt();//int num = scan.nextInt(); 이렇게 쓰면 오류가 발생함
			System.out.println(num);
								
			if(ran > num) {
				System.out.println("Up!");
				//num이 ran보다 작다면 up! 출력
			}			
			else if(ran < num) {
				System.out.println("Down");
				//num이 ran보다 크다면 down출력
			}
			else if(ran == num) {
				System.out.println("정답입니다");
				//num이 ran과 같다면 정답입니다 출력
			}
			else {
				System.out.println("정확하지 않은 수 입니다");
				//1보다 낮거나 100보다 큰 수를 입력했을 때
			}
		}while(num != ran);
			//랜덤한 수가 입력한 정수와 같이 않을 때 재시작을 해야함
	
	}
}
	
		
	

		
		
	
	


