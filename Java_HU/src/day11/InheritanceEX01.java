package day11;

public class InheritanceEX01 {

	public static void main(String[] args) {
		// 상속 예제
		HighSchoolStudent std = new HighSchoolStudent();
		std.print();
		std.setAge(10);
		std.print();
	}

}

class Student{
	
	//학교명, 이름, 나이, 생일
	private String schoolName;
	protected String name;
	public String birthday;
	int age;
	
	public void print() {
		System.out.println("학교 : " + schoolName);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("생일 : " + birthday);
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}

class HighSchoolStudent extends StudentEX01{
	
	public void test() {
		//System.out.println(schoolName);//접근제어자가 private라서 자식 클래스에 이용할 수 없음
		System.out.println(name);//접근제어자가 protected라서 자식 클래스에서 이용 가능함
		System.out.println(age);//나이는 접근제어자가 기본이라 같은 패키지에서 사용할 수 있음
		System.out.println(birthday);//생일은 접근제어자가 public이라서 자식 클래스에서 이용 가능함
	}
}

class A{
	StudentEX01 s1 = new StudentEX01();
	
	public void print() {
		s1.name = "슬리프";
	}
}