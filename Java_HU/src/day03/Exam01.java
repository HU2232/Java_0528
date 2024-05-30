package day03;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		//예제1 성적을 입력받아 입력받은 성적이 60점 이상이면 pass,아니면 fail이 출력되도록 코드를 작성하시오.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("시험 점수는 : ");
		int score = scan.nextInt();
		//성적이 60점 이상이면 pass, 아니면 fail을 문자열 변수 Str에 저장
		String str = (score >= 60) ? "Pass" : "Fail";
		System.out.println(score + "점은" + str);
				

	}

}
