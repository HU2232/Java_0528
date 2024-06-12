package day11;

public class OverrideEX01 {

	public static void main(String[] args) {
		child21 c1 = new child21(1, 23);
		c1.print();
		child22 c2 = new child22(34, 5);
		c2.print();

	}

}

class parant2{
	int num;
	public void print() {
		System.out.println(num);
	}
	public parant2(int num) {
		this.num = num;
	}
}

class child21 extends parant2{
	int num2;
	public child21(int num1, int num2) {
		super(num1);
		this.num2 = num2;
	}
	@Override
	public void print() {
		super.print();
		System.out.println("num2 : " + num2);
	}
}
class child22 extends parant2{
	int num2;
	public child22(int num1, int num2) {
		super(num1);
		this.num2 = num2;
	}
	@Override
	public void print() {
		System.out.println("num1 : " + num + "num2 : " + num2);
	}
}