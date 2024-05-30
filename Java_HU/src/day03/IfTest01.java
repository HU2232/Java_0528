package day03;

import java.util.Scanner;

public class IfTest01 {

	public static void main(String[] args) {
		//나이를 입력받아 나이가 19세 이상이면 성인을 출력하고 미만이면 미성년자로 출력하는 코드를 작성				
		Scanner scan = new Scanner(System.in);
		System.out.println("나이 : ");
		int age = scan.nextInt();
		
		if(age > 19) {
			System.out.println(age + "살은 성인입니다.");
		}else if (age < 19 && age > 8) {
			System.out.println(age + "살은 미성년자입니다.");
		}else {
			System.out.println(age + "살은 유아입니다");
	}
	}
}

