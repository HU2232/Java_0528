package day12;

public class InterfaceIngeritanceEX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceIngeritanceEX01 a = new InterfaceIngeritanceEX01();
		
	}

}

interface InterfaceA{
	void print();
	void test1();
}
interface InterfaceB{
	void print();
	void test2();
}
//print() 메소드가 겹치는데 상속을 받으면 어차피 구현부가 없기에 하나도 합치면 되기 때문에 다중 상속이 가능(인터페이스는)
interface InterfaceC extends InterfaceA, InterfaceB{
	
}
class ClassA{
	void print() {}
	void test1() {}
}
class ClassB{
	void print() {}
	void test1() {}
}
//class ClassC extends ClassA, ClassB{}
//class에서는 다중상속이 불가능하기 때문에 , 에 에러가 발생함