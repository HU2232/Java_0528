package day03;

import java.util.Scanner;

public class IfTest06 {

	public static void main(String[] args) {
		/*성적을 입력받아 성적에 맞는 학점을 출력하는 코드를 작성하시오
		 *100이하 90이상 A
		 *90이하 80이상 B
		 *80이하 70이상 C
		 *.....50미만 F
		 *0보다 작거나 큰 경우 : 잘못된 성적입니다*/
		
		Scanner scan= new Scanner(System.in);
		System.out.println("성적 : ");
		int num = scan.nextInt();
				
		if(num < 100 && num > 90) {
			System.out.println(num + "점은 A 학점입니다");
		}
		else if(num < 90 && num > 80) {
			System.out.println(num + "점은 B 학점입니다");
		}
		else if(num < 80 && num > 70) {
			System.out.println(num + "점은 C 학점입니다");
		}
		else if(num < 70 && num > 60) {
			System.out.println(num + "점은 D 학점입니다");
		}
		else if(num < 60 && num > 50){
			System.out.println(num + "점은 E 학점입니다");
		}
		else if(num < 50 && num > 0) {
			System.out.println(num + "점은 F 학점입니다");
		}
		else {
			System.out.println(num + "점은 학점 부여 불가합니다");
		}
	
		if(num < 0 || num > 0) {
			System.out.println("잘못 된 성적입니다");
		}
		//여기까지 왔다면 num은 0이상 100이하
		else if(num >= 90) {
			System.out.println("A");
		}
		//여기까지 왔다면 num은 0이상 90이하
		else if(num >= 80) {
			System.out.println("B");
		}
		//여기까지 왔다면 num은 0이상 80이하
		else if(num >= 70) {
			System.out.println("C");
		}
		//여기까지 왔다면 num은 0이상 70이하
		else if(num >= 60) {
			System.out.println("D");
		}
		//여기까지 왔다면 num은 0이상 60이하
		else if(num >= 50) {
			System.out.println("E");
		}
		//여기까지 왔다면 num은 0이상 50이하
		else {
			System.out.println("F");
		}
		}
	}

