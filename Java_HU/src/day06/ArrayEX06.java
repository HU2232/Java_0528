package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEX06 {
	
	public static void main(String[] args) {
		/* 4과목의 성적을 입력받아 배열에 저장하고, 과락이 없고 평균이 60점 이상이면 pass,아니면 fail이라고 출력하세요.*/
		
		// 4개짜리 배열 생성
		int[]score = new int[4];
		Scanner scan = new Scanner(System.in);
		// 성적 4개를 입력
		/* 반복횟수 : i는 0부터 score.length보다 작을 때까지 1씩 증가
		 * 실행문 : Scanner를 이용하여 score 배열에 i번지에 값을 입력해서 저장
		 * 반복문 종료 후 : 없음*/
		
		System.out.println("4과목 성적 : ");
		for(int i=0; i<score.length; i++) {
			score[i] = scan.nextInt();
		}
		
		// 입력받은 성적의 총합을 계산
		/* 반복횟수 : 향상된 for문을 이용해 전체 탐색
		 * 실행문 : 배열에서 가져온 값을 sum에 누적
		 * 반복문 종료 후 : 없음
		 * */
		int sum = 0;
		for(int tmp : score) {
			sum += tmp;
			System.out.println("성적 :" + tmp);			
		}
		// 총합을 이용하여 평균을 계산
		double avg = sum/(double)score.length;
			System.out.println("평균은 : " + avg);
		
		// 과락 여부를 확인하여 변수에 저장
		/* 반복횟수 : 향상된 for문을 이용 전체 탐색
		 * 실행문 : 배열에서 가져온 값이 40보다 작으면 과락 변수를 true로 변경
		 * 반복문 종료 후 : 없음*/
		boolean isFail = false;
		for(int tmp : score) {
			if(tmp < 40) {
				isFail = true;
				break;//break가 없어도 결과는 같음 허나 조금이라도 덜 비교하기 위해 쓰는 게 좋음
			}
			
		}
			
		// 과락이 아니고 평균이 60 이상이면 pass
		if(!isFail && avg>=60) {
			System.out.println("Pass");
		}
		// 아니면 fail
		else {
			System.out.println("Fail");
		}
	}

}
