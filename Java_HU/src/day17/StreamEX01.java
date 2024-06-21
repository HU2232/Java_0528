package day17;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.AllArgsConstructor;
import lombok.Data;

public class StreamEX01 {

	public static void main(String[] args) {
		//asList(매개변수들) : 매개변수들을 리스트로 만들어줌
		List<Person> list = Arrays.asList(
				new Person("김진우", 24, "남"),
				new Person("이민호", 21, "남"),
				new Person("김현진", 19, "여"),
				new Person("최말숙", 77, "여"));
		
		Stream<Person> stream = list.stream();
		//성인(20이상) 남성만 조회
		//filter(Predicate p) : 조건을 만족하는 요소들만 선택
		//forEach(Consummer c) : 요소를 하나씩 꺼내서 처리
		stream.filter(p->p.getAge()>=20)
			.filter(p->p.getGender().equals("여"))
			.forEach(p->System.out.println(p));
		
		/*  map(Function<T,R> f) : T를 가공해서 R로 변환시킴
		 * 		Person 객체에서 이름(String)을 가져와서 반환
		 * */
		stream = list.stream();
		stream.map((p)->p.getName())
			.forEach(name->System.out.println(name));
		//등록된 여성 수를 출력
		stream = list.stream();
		long count = stream.filter(p->p.getGender().equals("여")).count();
		System.out.println("등록된 여성 수 : " + count);
		
		//등록된 성인 수를 출력
		stream = list.stream();
		count = stream.filter(p->p.getAge()>=20).count();
		System.out.println("등록된 성인 수 : " + count);
		
		stream = list.stream();
		//map이 T를 가공해서 R로 만듦, mapToInt는 T를 가공해서 Integer로 만듦
		/* mapToInt는 OptionalDouble로 반환하는데 이유는 객체가 없어서 평균을 구할 수 없으면
		 * 객체를 통해 알 수 있는 메소드를 제공하기 때문에 사용한다*/
		OptionalDouble avg = stream.mapToInt(Person::getAge).average();	
		
		if(avg.isPresent()) {
			System.out.println("평균 나이 : " + avg.getAsDouble());
		}
		else {
			System.out.println("일치하는 사람이 없읍니다");
		}
		stream = list.stream();
		List<Person> list2 = stream.filter(p->p.getAge() < 20).collect(Collectors.toList());
		System.out.println(list2);
		
	}

}
@Data
@AllArgsConstructor
class Person{
	private String name;
	private int age;
	private String gender;
	
}

