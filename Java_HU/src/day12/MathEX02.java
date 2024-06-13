package day12;

public class MathEX02 {

	public static void main(String[] args) {
		/*
		 *  3.14를 소수점 2번째 자리에서 올림하는 코드를 작성하시오 
		 *  3.14를 31.4로 만들고 올림. 32를 3.2로 만들면*/
		double num = 3.14;
		num = num*10; // num *= 10;
		num = Math.ceil(num);
		num = num/10;// num /= 10;
		System.out.println("3.14을 소수점 두번째 자리에서 올림 : " + Math.ceil(3.14));

	}

}
