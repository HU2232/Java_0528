package day03;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		/* 2개의 과목 성적을 입력받아 평균 60점이 넘고 모든 과목이 과락(40점 미만)이 없으면 합격, 아니면 불합격을 출력하는 코드를 작성하시오
		 * 예시1
		 * 과목 1 성적 입력 :  100
		 * 과목 2 성적 입력 :  35
		 * 결과 : 불합격
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("시험 1 성적 입력 : ");
		int score1 = scan.nextInt();
		
		System.out.println("시험 2 성적 입력 : ");
		int score2 = scan.nextInt();
		
		int all = (score1 + score2);
		double avg = (double)all/2;
		boolean fail = score1 < 40 || score2 < 40;
		String str = (avg >= 60 && !fail ) ? "합격" : "불합격";
		System.out.println("총점은 : " + all + " 평균은 " + avg + str);
		/*총점은 all에 저장
		 *평균은 Avg에 저장
		 *과락의 유무는 Fail에 저장
		 *평균이 60점 이상이고 과락이 아니면 합격, 아니면 불합격을 문자열 str에 저장
		 *조건식은 :평균이 60점 이상이고 과락이 아니다 avg이 60보다 크거나 같다 && fail이 아니다
		 *str을 이용해 결과를 출력*/
		
		

	}

}
