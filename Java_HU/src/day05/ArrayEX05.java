package day05;

import java.util.Scanner;

public class ArrayEX05 {

	public static void main(String[] args) {
				
		//1~10사이의 랜덤한 수 3개를 저장하고 출력하는 예제 작성
		//예시 : 랜덤 생성 숫자1 3 2
		
		int [] arr  = new int[3];
		int min = 1, max = 10;		
		for(int i=0; i<arr.length; i++) {
			arr [i]= (int)(Math.random() * (max - min +1) + min);
			System.out.print(arr[i] + "");
		}
		System.out.println();
		
		//숫자를 입력해서 입력한 숫자가 랜덤한 수에 있는지 확인하는 예제
		//8 입력시 8은 없습니다
		//2 입력시 2는 있습니다 
		
		//정수 입력
	
			Scanner scan = new Scanner(System.in);
			System.out.println("정수 입력 (" + min +" ~ "+ max + ") : ");
			int num = scan.nextInt();
		
		/* 방법1
		 * 정수 3개가 있는데 내가 찾으려는 정수의 위치가 어딘지 확인.
		 * 중간에 찾았으면 1~3사이이에 위치할테고 없으면 3보다 크다
		 * =>중간에 찾았으면 0~2번지 상이에 있을테도 없으면 번지가 3이다
		 * 반복횟수 : i는 0번지부터 배열의 크기보다 작을 때까지 1씩 증가
		 * 규칙성 : 배열 i번지에 있는 값과 입력받은 값이 같으면
		 * 반복문 종료 후 : i가 배열의 크기보다 작으면 ~은 있습니다. 라고 출력 같으면 없습니다. 라고 출력
		 * */
		int i;
		for(i=0; i<arr.length; i++) {
			if(arr[i] == num){
				//있다
				break;
			}
		}
		/*else if( i == num.length - 1) {
			//없다
		}
		* 위의 코드도 입력할 순 있으나 추천하진 않음
		*/
		if( i < arr.length) {
			System.out.println(num + "는 있습니다");
		}
		else {
			System.out.println(num + "는 없습니다");
		}
			
		/* 방법2
		 * 반복횟수 : 향상된 for문을 이용하여 전체 탐색
		 * 규칙성 : 배열의 값과 입력받은 값이 같으면 boolean result를 true로 변경하고 반복문을 종료
		 * 반복문 종료 후 : result가 true이면 ~은 있습니다.라고 출력하고 아니면 ~은 없습니다로 출력*/
		boolean result = false;
		for(int tmp : arr) {
			if(tmp == num) {
				result = true;
				break;
			}
		}
			if(result) {
				System.out.println(num + "는 있습니다.");
			}
			else {
				System.out.println(num + "는 없습니다.");
		
			}

	}

}
