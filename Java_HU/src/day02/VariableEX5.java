package day02;

public class VariableEX5 {

	public static void main(String[] args) {
		
		String str1 = 1 + "안녕2";//기본형 + 문자형
		String str2 = "1안녕" + 2;//문자형 + 기본형
		
		System.out.println(str1);
		System.out.println(str2);
		
		String str3 = 1 + 2 + "3";//정수 과 2가 더해진 후 문자열3과 더해지기 때문에 3 +"3"이 되어 33이 됨
		String str4 = "1" + 2 + 3 + 4 + 5;//문자열 1과 정수 2가 더해진 후 정수 3이 더해지기 대문에 "12"+3이 되어 123이 됨
		
		System.out.println(str3);
		System.out.println(str4);

	}

}
