package day16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import lombok.AllArgsConstructor;
import lombok.Data;

public class EX04 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student(1, 2, 1, "고희동", 60, 70, 80));
		list.add(new Student(1, 1, 1, "홍길동", 80, 20, 30));
		list.add(new Student(1, 1, 2, "고길동", 70, 50, 70));
		
		
		/* 국어 평균, 영어 평균, 수학 평균을 계산해서 출력하는 코드를 작성하시오
		 * 가능하면 함수형 인터페이스와 메소드를 이용해서*/
		int sumkor = sumkor(list);
		System.out.println("국어 평균 : " + sumkor / (double)list.size());
		int sumeng = sumeng(list);
		System.out.println("영어 평균 : " + sumeng / (double)list.size());
		int summath = summath(list);
		System.out.println("수학 평균 : " + summath / (double)list.size());
		
		int sumkor2 = sum(list, s->s.getKor());
		System.out.println("국어 평균 : " + sumkor / (double)list.size());
		int sumeng2 = sum(list, s->s.getEng());
		System.out.println("영어 평균 : " + sumeng / (double)list.size());
		int summath2 = sum(list, s->s.getMath());
		System.out.println("수학 평균 : " + summath / (double)list.size());
				
		/* 각 학생의 국어, 영어, 수학, 성적을 출력하는 코드를 작성하세요
		 * 가능하염 함수형 인터페이스와 메소드를 이용해서*/
		printKor(list);
		printEng(list);
		printMath(list);
		
		print(list, s->System.out.println("이름 : " + s.getName() +  ", 국어 : " + s.getKor()));
		print(list, s->System.out.println("이름 : " + s.getName() +  ", 영어 : " + s.getEng()));
		print(list, s->System.out.println("이름 : " + s.getName() +  ", 수학 : " + s.getMath()));
		
		//국어 성적이 80점 이상인 학생을 출력하는 코드를 작성하세요
		printStudent(list, (s)->s.getKor()>=80);
		System.out.println("------------------");
		//1학년 1반 학생들을 출력하는 코드를 작성하세요
		printStudent(list, (s)->s.getGrade()==1 && s.getClassNum()==1);
		System.out.println("------------------");
		//1학년 1반 1번 학생을 출력하는 코드를 작성하세요
		printStudent(list, (s)->s.getGrade()==1 && s.getClassNum()==1 && s.getNum() == 1);
		//학년 반 번호 순으로 정렬
		Collections.sort(list, (o1, o2) -> {
			if(o1.getGrade() != o2.getGrade())
				return o1.getGrade() - o2.getGrade();
			if(o1.getClassNum() != o2.getClassNum())
				return o1.getClassNum() - o2.getClassNum();
			return o1.getNum() - o2.getNum();
		});
		System.out.println("------------------");
		printStudent(list, s->true);
		//국어 성적 순으로 정렬
		Collections.sort(list, (o1, o2) -> o2.getEng() - o1.getEng());
		printStudent(list, s->true);
	}
	
	public static void printStudent(List<Student> list, Predicate<Student> p) {
		for(Student tmp : list) {
			if(p.test(tmp)) {
				System.out.println(tmp);
			}
		}
	}
	
	public static void print(List<Student> list, Consumer<Student> c) {
		for(Student tmp : list) {
			c.accept(tmp);
		}
	}
	
	private static void printKor(List<Student> list) {
		for(Student tmp : list) {
			System.out.println("이름 : " + tmp.getName() +  ", 국어 : " + tmp.getKor());
		}
	}
	private static void printEng(List<Student> list) {
		for(Student tmp : list) {
			System.out.println("이름 : " + tmp.getName() +  ", 영어 : " + tmp.getEng());
		}
	}
	private static void printMath(List<Student> list) {
		for(Student tmp : list) {
			System.out.println("이름 : " + tmp.getName() +  ", 수학 : " + tmp.getMath());
		}		
	}
	public static int sum(List<Student>list, Function<Student, Integer> f) {
		int sum = 0;
		for(Student tmp : list) {
			sum += f.apply(tmp);
		}
		return sum;
	}
	
	public static int sumkor(List<Student> list) {
		int sum = 0;
		for(Student tmp : list) {
			sum += tmp.getKor();
		}
		return sum;
	}
	public static int sumeng(List<Student> list) {
		int sum = 0;
		for(Student tmp : list) {
			sum += tmp.getEng();
		}
		return sum;
	}
	public static int summath(List<Student> list) {
		int sum = 0;
		for(Student tmp : list) {
			sum += tmp.getMath();
		}
		return sum;
	}

}
@Data
@AllArgsConstructor
class Student{
	 private int grade, classNum, num;
	 private String name;
	 private int kor, eng, math;
	@Override
	public String toString() {
		return grade + " 학년 " + classNum + " 반 " + num + " 번 " + name + " 국어 : " + kor
				+ " 영어 : " + eng + " 수학 : " + math;
	}
	 
}

