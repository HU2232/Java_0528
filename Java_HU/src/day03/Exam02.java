package day03;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		/*학생 3명의 성적을 입력받아 총점과 평균을 구하는 코드를 작성하세요.
		예시 1 
		학생 1 성적 : 65
		학생 2 성적 : 100
		학생 3 성적 : 76
		총점 : 241점, 평균 : 80.33333....*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("시험 성적 입력 : ");
		int score1 = scan.nextInt();
			
		System.out.println("시험 성적 입력 : ");
		int score2 = scan.nextInt();
				
		System.out.println("시험 성적 입력 : ");
		int score3 = scan.nextInt();
		
		int all = (score1 + score2 + score3);
		System.out.println("총점은 : " + all);
		
		double avg = (double)all / 3;
		System.out.println("평균 : " + avg);

	}

}
