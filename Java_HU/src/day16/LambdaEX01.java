package day16;

public class LambdaEX01 {

	public static void main(String[] args) {
		//기존의 객체 생성법
		A a1 = new A() {
			@Override
			public int sum(int num1, int num2) {
				return num1 + num2;
			}
		};
		//람다식 객체 생성법
		A a2 = (n1, n2)->{
			return n1 + n2;
		};
		//한줄의 코드일 때 중괄호{}를 생략할 수 있고 중괄호를 생략하면
		//return을 생략해야 한다
		A a3 =(n1, n2)-> n1 + n2;
		//매개변수가 1개이면 ()를 생략할 수 있다
		B b1 = n1->System.out.println(n1);
		
		b1.print(10);
		System.out.println(a3.sum(10,20));
	}

}
interface A{
	int sum(int num1, int num2);
	//int sub(int num1, int num2);//추상 메소드가 2개이면 안됨
}
interface B{
	void print(int num1);
}
@FunctionalInterface
interface C{
	void test();
	//int test2(int a);
	//@FunctionalInterface를 추가했기 때문에 추상메소드가 2개가 되면 에러 발생
}

