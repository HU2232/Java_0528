package day04;

public class VariableEX01 {
	
	public static void main(String[] args) {
		//실수 소수점 유효범위 확인하는 예제
		float num1 = 0.12345678f;
		double num2 = 0.1234567890123456789;
		
		System.out.printf("%.8f\n", num1);
		System.out.printf("%.18f\n", num2);
		//실수는 항상 오차가 존재한다
	}

}
