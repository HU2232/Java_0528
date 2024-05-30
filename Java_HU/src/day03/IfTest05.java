package day03;

import java.util.Scanner;

public class IfTest05 {

	public static void main(String[] args) {
		/*정수를 입력받아 2,3,6의 배수인지 판별하는 코드를 작성하시오
		 *예시1
		 *정수 입력 : 6
		 *6의 배수입니다
		 *예시2
		 *정수 입력 : 2
		 *2의 배수입니다*/
		
		Scanner scan= new Scanner(System.in);
		System.out.println("정수 : ");
		int num = scan.nextInt();
		
		if (num % 6 == 0) {
			System.out.println(" 6의 배수입니다");
		}
		//아니면 num이 3의 배수이면 3의 배수라고 출력하고
		else if(num % 3 == 0) {
			System.out.println(" 3의 배수입니다");
		}
		//아니면 num이 2의 배수이면 2의 배수라고 출력하고
		else if(num % 2 == 0) {
			System.out.println(" 2의 배수입니다");
		}
		//관련이 없는 수면 관련이 없다고 출력한다
		else {
			System.out.println(" 관련이 없는 수 입니다");
		}
	


		if (num % 2 == 0 && num % 3 != 0 ) {
			System.out.println(" 2의 배수입니다");
		}
		 //num이 2의 배수이고 3의 배수가 아니면 2의 배수라고 출력하고
		else if(num % 3 == 0 && num % 2 !=0) {
			System.out.println(" 3의 배수입니다");
		}
		 //num이 3의 배수이면 2의 배수가 아니면 3의 배수라고 출력하고
		else if(num % 3 == 0 && num % 2 !=0) {
			System.out.println(" 3의 배수입니다");
		}
		 //num이 6의 배수면 6의 배수라고 출력하고
		else if(num % 6 == 0) {
			System.out.println(" 3의 배수입니다");
		}
		 //관련이 없는 수면 관련이 없다고 출력한다
		else{
			System.out.println(" 관련이 없는 수입니다");
		}
	}
}


