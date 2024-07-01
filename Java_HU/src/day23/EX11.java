package day23;

public class EX11 {

	public static void main(String[] args) {
		/* 1+2를 계산하기 위해 sum을 호출했다
		 * 원인 : 클래스 메소드에서 객체 메소드를 호출할 수 없다
		 * 해결방법 : 객체 메소드를 클래스 메소드로 수정하거나
		 * 			객체를 생성한 후 호출
		 */
		//int res = sum(1,2);
		EX11 ex = new EX11();
		int res = ex.sum(1, 2);//1.호출 방식을 바꾸거나
		System.out.println(1 + " + " + 2 + " = " + res);

	}
	//public int sum(int num1, int num2) {
	public static int sum(int num1, int num2) {//2.메소드에 static을 붙히던가
		return num1 + num2;
	}

}
