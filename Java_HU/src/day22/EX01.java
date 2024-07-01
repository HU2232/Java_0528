package day22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class EX01 {

	public static void main(String[] args) {
		/* 콘솔에서 한 문장(영어)을 입력하고 한 문장이 몇개의 단어로 구성되어 있는 지
		 * 확인하는 코드를 작성하시오
		 * Hi my name is hong
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문장 : ");
		String sen = scan.nextLine();
		System.out.println(sen);
		
		String [] words =sen.split(" ");
		System.out.println("단어의 갯수 : " + words.length);
		
		StringTokenizer st = new StringTokenizer(sen, " ");
		int count = 0;
		while(st.hasMoreTokens()) {
			st.nextToken();
			count++;
		}
		System.out.println("단어의 갯수 : " + count);		
	}

}
