package day15;

import java.util.ArrayList;
import java.util.Iterator;

public class ListEX02 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("hi");
		list.add("hello");
		list.add("안녕");
		
		for(String tmp : list) {
			System.out.println(tmp + " ");
		}
		System.out.println();
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.println(tmp + " ");
		}
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			String tmp = list.get(i);
			System.out.println(tmp + " ");
		}
	}

}
