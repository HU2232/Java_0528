package day05;

public class ArrayEX01 {

	public static void main(String[] args) {
		// 5명의 학생 성적을 저장하기 위한 변수를 선언해보세요
		//지역변수는 자동으로 초기화 되지 않음
		int s1,s2,s3,s4,s5;// <= 지역변수
	
				
		// 5명의 학생 성적을 저장할 수 있는 배열을 생성
		// 배열은 자동으로 자료형에 맞는 초기화가 된다
		// 배열은 참조형
		int [] scores1 = new int[5];
		int scores2 [] = new int[5];
		// 5개 짜리 배열을 만들어서 1,2,3,4,5 순서대로 초기화
		int scores3 [] = new int[] {1,2,3,4,5};
		//scores1 배열에 0번지에 1, 1번지에 2, 2번지에 3, 3번지에 4, 4번지에 5 저장
		/*scores3 [0] = 1; 
		scores3 [1] = 2;
		scores3 [2] = 3;
		scores3 [3] = 4;
		scores3 [4] = 5;*/
		
		int i;
		for(i=0; i<5; i++) {
			scores1[i] = i + 1;
			}
		
		/* 반복횟수 : i는 0부터 5보다 작을 때까지 1씩 증가
		 * 규칙성 : */
		/*System.out.println(scores3[0]);
		System.out.println(scores3[1]);
		System.out.println(scores3[2]);
		System.out.println(scores3[3]);
		System.out.println(scores3[4]);*/
		
		
		
		for(i=0; i<5; i++) {
			System.out.println(scores1[i]);
		}
										

	}
}

