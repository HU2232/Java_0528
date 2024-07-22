package test;

import java.util.Scanner;

public class iftest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자 입력 :");
		int num = sc.nextInt();
				
		int sum = 0;
		if(num>=1) {
			int i = 1;
			while(i <= num) {
				sum +=i;
				i++;
			}
			System.out.println("1부터" + num + "까지의 합은" + sum + "입니다");
		}
		else {
			System.out.println("숫자가 1이상이 아닙니다");
		}
	}
}
