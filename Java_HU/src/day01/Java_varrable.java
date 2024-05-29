package day01;

public class Java_varrable {

	public static void main(String[] args) {
		
		char ch1;//문자형 Ch1을 선언
		char ch2 = 'A'; //문자형 변수 ch2를 선언하고 A로 초기화
		//문자형 변수 ch3과 ch4를 선언함
		/*
		 char ch3
		 char ch4
		 */
		char ch3, ch4;// 같은 자료형인 경우 , 를 사용해서 선언도 가능함
		char ch5 = '+', ch6 ='\n';
		//문자형 변수 ch5를 선언하고 +로 초기화
		//문자형 변수 ch6을 선언하고 \n으로 초기화
		System.out.println(ch2);
		System.out.println(ch5);
		System.out.println(ch6);
		//정수 리터럴은 기본이 int이고 실수 리터럴은 기본이 double
		long num1 = 9876544512345l;//정수값이 int형으로 표현되지 않는 경우는 접미사 L을 반드시 붙힐 것
		System.out.println(num1);
		float num2 = 3.14F;//3.14는 double형이기 때문에 반드시 접미사를 붙여야 함
		double num3 = 3.14;
		boolean isEven = true;
		int num4 = '1';
		System.out.println(num4);
	

	}

}
