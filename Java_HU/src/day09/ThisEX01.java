package day09;

public class ThisEX01 {

	public static void main(String[] args) {
		student3 std1 = new student3();
		student3 std2 = new student3(1, 2, 2, "둘리");
		System.out.println(std1.schoolName);
		System.out.println(std2.schoolName);
		
		std1.schoolName = "kh중학교";//선언한 후에는 이걸로 고정됨
		
		System.out.println(std1.schoolName);
		System.out.println(std2.schoolName);
		
		System.out.println(student3.schoolName);
		System.out.println(Math.PI);//Math에서 제공하는 static값
	}

}

class student3{
	private int grade, classNum, num;
	private String name;
	public static String schoolName = "kh고등학교";
			
	/* getter 랑 setter*/
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassNum() {
		return classNum;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public student3(int grade, int classNum, int num, String name) {
		super();
		this.grade = grade;
		this.classNum = classNum;
		this.num = num;
		this.name = name;
	}
	public student3() {
		this(1, 1, 1, "장길산");//this생성자를 이용할 때는 첫번째 줄에 작성해야 한다 아니면 에러가 발생함
		
	}
	
	
	
}

	
	