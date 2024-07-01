package day22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EX03 {

	public static void main(String[] args) {
		/* 리스트에 숫자들을 저장하고, 저장된 숫자들을 정렬하는 코드를 작성하시오*/
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(10);
		list.add(51);
		list.add(3);
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		/* 정렬된 숫자들을 역순으로 정렬하는 코드 */
		//Collections.reverse(list);//요소들을 역순으로 배치는 코드로 정렬을 해주지는 않음
		Collections.sort(list,(i1, i2)-> i2 -i1);
		System.out.println(list);
	}

}
