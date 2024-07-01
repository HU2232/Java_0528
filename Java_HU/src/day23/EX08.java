package day23;

public class EX08 {

	public static void main(String[] args) {
		/* 좌표 10,20을 이용하여 객체를 생성했는데 0,0으로 출력이 됐다
		 * 원인 : 생성자에서 매개변수(필드)값을 저장하지 않음
		 * 해결방법 : 매개변수값을 필드에 저장(this를 붙힌다)
		 */
		point p1 = new point(10,20);
		
		p1.print();
		/* 기본 생성자를 이용하여 객체를 생성하려고 했는데 에러가 발생
		 * 원인 : 기본 생성자가 없어서, 기본 생성자 대신 point메소드가 있음
		 * 해결방법 : 기본 생성자를 추가
		 */
		point p2 = new point();
		
		p2.print();
	}

}

class point{
	private int x, y;
	
	public point(int x, int y) {
		this.x = x; //x = x;
		this.y = y; //y = y;
	}
	//생성자가 아닌 메소드
	//public void point() {}
	public point() {}
	public void print() {
		System.out.println("(" + x + "," + y + ")" );
	}
}