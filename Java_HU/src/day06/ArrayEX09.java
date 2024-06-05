package day06;

import java.util.Scanner;

public class ArrayEX09 {

	public static void main(String[] args) {
		String [] list = {"dog", "cat", "java", "cup", "computer"};
		
		//문자열을 입력받아 입력받은 문자열이 있는지 없는지 알려주는 코드를 작성하시오.
		/* 찾을 문자열 입력 : cat
		 * cat 있습니다.
		 * 
		 * 찾을 문자열 입력 : abc
		 * abc 없습니다
		 * */
		
		//찾을 문자열 입력 : 문구를 콘솔에 출력
		System.out.println("찾을 문자열 입력 : ");
		//단어 입력
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		//입력받은 단어가 있는지 없는지 찾아서 결과를 콘솔에 출력
		//1. list에서 입력받은 단어가 있는지 없는지 하나씩 탐색해서 찾음
		//1-1. 단어가 있는지 없는지 확인하기 위한 변수를 선언합니다(모아니면 도 boolean)
		boolean result = false;//처음부터 true로 설정하면 이후에 있다고 바꿀 수가 없음
		//1-2. list에서 하나씩 꺼내서 입력받은 단어와 같은지 비요하여 같으면 변수를 있다로 만들고 빠져나옴
		for(String tmp : list) {
			if(str.equals(tmp)) {
				result = true;
				break;
				
			}
		}
		//2. 있으면 있습니다. 아니면 없습니다라고 콘솔에 출력
		if(result) {
			System.out.println(str +" 있습니다.");
		}
		else {
			System.out.println(str +" 없습니다.");
		}

	}

}
