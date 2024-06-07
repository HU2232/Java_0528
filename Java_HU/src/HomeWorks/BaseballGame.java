package HomeWorks;

import java.util.Arrays;
import java.util.Scanner;

public class BaseballGame {

	public static void main(String[] args) {
		/* 숫자 야구 게임을 구현하세요
		 * 규칙
		 * - 중복되지 않는 1~9사이의 랜덤한 수를 생성
		 * - 이 3개의 수를 맞추는 게임
		 * - 스트라이크 : 해당 숫자가 있고, 위치도 같은 경우
		 * - 볼 : 숫자가 있지만 위치가 다른 경우
		 * - 아웃 : 일치하는 숫자가 하나도 없는 경우
		 * 예시
		 * (3 9 7)
		 * 입력 : 1 2 3
		 * 1b
		 * 입력 : 5 6 7
		 * 1S
		 * 입력 : 4 5 6
		 * Out
		 * 입력 : 3 7 9
		 * 1S2B
		 * 입력 : 3 9 7
		 * 정답입니다.
		 * */
		
		
		//랜덤한 수를 생성(중복되지 않게 1~9사이의 3개의 수)
		int[]list = new int[3];
		int count = 0;
		int min = 1, max = 9;
		int random, i;
		
		while(count < 3) {
			random = (int)(Math.random()*(max - min +1)+min);
			
			for(i = 0; i<count; i++) {
				if(list[i] == random) {
					break;
				}
			}
			
			if(i == count) {
				list[count] = random;
				count++;
			}
		}
		System.out.println(Arrays.toString(list));
		
		Scanner scan = new Scanner(System.in);
		int [] user = new int [3];
		int s = 0, b = 0;
		//반복문을 이용하여 정수 3개를 입력 받은 후 판별(정답이 나올 때까지)
			
		do {
			s = 0;
			b = 0;
			//입력 안내문구 출력
			System.out.println("입력 : ");
			//3개 입력
			for(int k=0; k<user.length; k++) {
				user[k] = scan.nextInt();
			}
			/*user[0] = scan.nextInt();
			  user[1] = scan.nextInt();
			  user[2] = scan.nextInt();*/
			
			//결과 판별 후 출력
			for(i=0; i<list.length; i++) {
				for(int j=0; j<user.length; j++) {
					if(list[i] == user[j]) {
						if(i == j) {
							s++;
						}else {
							b++;
						}
					}
				}
			}

			//첫번째 랜덤 수와 첫번째 입력값이 같으면 스트라이크 또는 볼로 판별
			//스트라이크 또는 볼로 판별
			//위치가 같으면 스트라이크의 갯수를 다르면 볼의 갯수를 증가
			/*for(int j=0; j<user.length; j++) {
				if(list[0] == user[j]) {
					if(0 == j) {
						s++;
					}else {
						b++;
					}
				}
			}
						
			//두번째 랜덤 수와 첫번째 입력값이 같으면 스트라이크 또는 볼로 판별
			for(int j=0; j<user.length; j++) {
				if(list[1] == user[j]) {
					if(1 == j) {
						s++;
					}else {
						b++;
					}
				}
			}
			
			//세번째 랜덤 수와 첫번째 입력값이 같으면 스트라이크 또는 볼로 판별
			if(list[2] == user[0]) {
				if(2 == 0) {
					s++;
				}else {
					b++;
				}
			}
			//세번째 랜덤 수와 두번째 입력값이 같으면 스트라이크 또는 볼로 판별
			if(list[2] == user[1]) {
				if(2 == 1) {
					s++;
				}else {
					b++;
				}
			}
			//세번째 랜덤 수와 세번째 입력값이 같으면 스트라이크 또는 볼로 판별
			if(list[2] == user[2]) {
				if(2 == 2) {
					s++;
				}else {
					b++;
				}
			}*/
			//스트라이크와 볼의 개수를 이용하여 결과를 출력
			if (s != 0) {
				System.out.print(s + "S");
			}
			if (b != 0) {
				System.out.print(b + "B");
			}
			if (s == 0 && b == 0) {
				System.out.print("O");
			}
			System.out.println();
		}while(s != 3);
		System.out.println("정답입니다");
		}
	}

