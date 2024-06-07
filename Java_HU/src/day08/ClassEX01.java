package day08;

public class ClassEX01 {

	public static void main(String[] args) {
		int result;
		int num1 = 1,num2 =2 ;
		int num3 = 3;
		
		result = sum(num1, num2);
		result = sum(num3, result);
		System.out.println(result);
		//이건 재사용이 가능해서 연산이 됨
		
		sum2(num1, num2);
		sum2(num1, num3);
		//이건 재사용을 못해서 연산이 안됨
	}
	/**두 정수의 합을 구해서 알려주는 메서드
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 리턴타입 : 두 정수의 합 => 정수 + 정수 = 정수 => int 혹은 long
	 * 메서드명 : sum
	 * */
	public static int sum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	/**두 정수의 합을 콘솔에 출력하는 메서드
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 리턴타입 : 없음 => viod
	 * 메서드명 : sum2
	 */
	public static void sum2(int num1, int num2) {
		int sum2 = num1 + num2;
		System.out.println(sum2);
		/** 보이드는 저장 할 수 없기 때문에 출력이 불가능하다*/
}
//클래스는 기본적으로 바깥에 만듦, Student1 클래스
class Student1{
	//이름, 학번, 학기, 주소, 전공
	String name, num, address, major;
	int semester;
}
}