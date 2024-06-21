package day15;

import java.util.ArrayList;
import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		/* 전화번호를 5번 입력받아 리스트에 저장하는 코드를 작성하시오
		 * 단,전화번호는 올바르게 입력했다고 가정(정규표현식 사용안해도 됨)*/
		
		Scanner scan = new Scanner(System.in);
				
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i=0; i<5; i++) {
			System.out.print("번호 : ");
			String number = scan.next();
			list.add(number);
		}
		//또는 list.add(scan.next());를 사용해도 됨
		System.out.println(list);
		/* 삭제할 전화번호를 입력 받아 삭제하는 코드를 작성하시오*/
		System.out.println("삭제할 번호 : ");
		String number = scan.next();
		if(list.remove(number)) {
			System.out.println("번호를 삭제했습니다.");
		}
		else {
			System.out.println("번호를 삭제하지 못했습니다");
		}
		System.out.println(list);
	}

}


