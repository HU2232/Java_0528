package day15;

import java.util.ArrayList;

public class ListEX01 {

	public static void main(String[] args) {
		//리스트 기본 사용 예제
		
		ArrayList<String> list = new ArrayList<String>();
		//제네릭 클래스는 <>를 써준다
		
		/* add(객체) : 객체를 리스트에 뒤에 추가, 컬렉션 인터페이스에서 구현
		 * add(번지, 객체) : 번지 위치에 객체를 추가, 리스트 인터페이스에서 구현
		 * */
		list.add("안녕하시오");
		list.add("Hell Yeah");
		list.add(0,"Hi");
		
		System.out.println(list);
		
		/* remove(객체) : 리스트에서 주어진 객체와 일치하는 객체를 제거하는 메소드
		 * 				 컬렉션 인터페이스에서 구현함
		 * remove(번지) : 리스트에서 번지 위치에 있는 객체를 삭제하고 삭제된 객체를 반환
		 * 				 리스트 인터페이스
		 * */
		System.out.println(list.remove("Hell Yeah"));//Hell Yeah와 일치하는 객체가 있어서 성공
		System.out.println(list.remove("h"));//h와 일치하는 객체가 없어서 실패
		System.out.println(list.remove(0));
		
		System.out.println(list);
		
		list.add("제레온");
		
		/* get(번지) : 번지 위치에 있는 객체를 가져옴, 리스트 인터페이스*/
		System.out.println(list.get(0));
		
		System.out.println(list);
		
		/* clear() : 리스트를 비움 컬렉션 인터페이스*/
		//list.clear();
		//System.out.println(list);
		
		/* Contains(객체) : 리스트에 있는 객체가 있는지 없는지를 알려줌, 컬렉션*/
		System.out.println("리스트에 Hi가 있습니까? " + list.contains("Hi"));
		System.out.println("리스트에 제레온이 있습니까? " + list.contains("제레온"));
		
		System.out.println(list);
		
		/* indexOf(객체) : 리스트에 객체가 몇번지에 있는지 알려줌. 리스트*/
		System.out.println("리스트에 Hi가 몇번지에 있습니까? " + list.indexOf("Hi"));
		System.out.println("리스트에 제레온이 몇번지에 있습니까? " + list.indexOf("제레온"));
		
		System.out.println(list);
	}

}
