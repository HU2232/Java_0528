package day07;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEX01 {

	public static void main(String[] args) {
		/* 3명의 학생의 국어, 영어, 수학 성적을 입력받고 각 학생의 평균을 구하는 코드를 작성하시오
		 * 예시1
		 * 학생1의 성적을 입력하시오(국어, 영어, 수학 순) : 100 90 80
		 * 학생2의 성적을 입력하시오(국어, 영어, 수학 순) : 90 80 70
		 * 학생3의 성적을 입력하시오(국어, 영어, 수학 순) : 70 60 50
		 * 학생1의 평균 : 
		 * 학생2의 평균 : 
		 * 학생3의 평균 : 
		 * */

		Scanner scan = new Scanner(System.in);

		int[] kor, eng, math;
		int studnet = 3;
		kor = new int[studnet];
		eng = new int[studnet];
		math = new int[studnet];

		//반복문을 이용하여 학생 성적을 입력
		for(int i = 0; i<studnet; i++) {
			//i는 0부터 3보다 작을 때까지 1씩 증가
			System.out.println((i+1) + "의 성적을 입력하세요 (국어, 영어, 수학 순) : ");
			//학생(i + 1)의 성적 입력 문구를 출력
			kor[i] = scan.nextInt();
			eng[i] = scan.nextInt();
			math[i] = scan.nextInt();
			//국어 영어 수학 점수를 입력받음 => 배열에 저장	
		}				
		System.out.println(Arrays.toString(kor));
		System.out.println(Arrays.toString(eng));
		System.out.println(Arrays.toString(math));

		int sum;
		double avg;
		//각 학생의 평균을 구함
		sum = kor[0] + eng[0] + math[0];
		avg = sum/3.0;
		System.out.println("학생 1의 평균 : " + avg);

		sum = kor[1] + eng[1] + math[1];
		avg = sum/3.0;
		System.out.println("학생 2의 평균 : " + avg);

		sum = kor[2] + eng[2] + math[2];
		avg = sum/3.0;
		System.out.println("학생 3의 평균 : " + avg);

		//위 코드를 반복문으로 사용할 경우

		for(int i = 0; i<studnet; i++) {
			sum = kor[i] + eng[i] + math[i];
			avg = sum/3.0;
			System.out.println("학생 " + (i+1)+"의 평균 : " + avg);
		}
		/* 각 과목의 평균을 구하는 코드를 작성하세요.
		 * 국어 평균 :
		 * 영어 평균 :
		 * 수학 평균 : 
		 * */
		int sum1;
		double avg1;

		sum1 = kor[0] + kor[1] + kor[2];
		avg1 = sum1/(double) kor.length;
		System.out.println("국어의 평균 : " + avg1);

		sum1 = eng[0] + eng[1] + eng[2];
		avg1 = sum1/(double) eng.length;
		System.out.println("영어의 평균 : " + avg1);

		sum1 = math[0] + math[1] + math[2];
		avg1 = sum1/(double) math.length;
		System.out.println("수학의 평균 : " + avg1);

		/* sum1 = kor[0] + kor[1] + kor[2];
		 * sum1 = sum1 + kor[0]
		 * sum1 = sum1 + kor[1]
		 * sum1 = sum1 + kor[2]
		 * */
		sum1 = 0;
		
		//국어 평균
		for(int i = 0; i<kor.length; i++) {
			sum1 = sum1 + kor[i]; //sum1 += kor[i]
		}
		avg1 = sum1 /(double)kor.length;
		System.out.println("국어 평균 : " + avg1);
		
		//영어 평균
		for(int i = 0; i<eng.length; i++) {
			sum1 = sum1 + eng[i]; //sum1 += eng[i]
		}
		avg1 = sum1 /(double)eng.length;
		System.out.println("영어 평균 : " + avg1);
		
		//수학 평균
		for(int i = 0; i<math.length; i++) {
			sum1 = sum1 + math[i]; //sum1 += math[i]
		}
		avg1 = sum1 /(double)math.length;
		System.out.println("수학 평균 : " + avg1);
	}
}

