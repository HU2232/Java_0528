package day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class EX03 {

	public static void main(String[] args) {
		/* 1~10 사이의 랜덤한 수를 6개를 중복되지 않게 생성해서
		 * 저장하고 출력하는 코드를 작성하시오
		 * set를 활용
		 * size()도 활용*/
		
		int min = 1, max = 10;
		int ran;
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		while(set.size() != 6) {
			//(int)를 사용하지 않을 시 무한 루프에 빠질 수 있음
			ran = (int)(Math.random() * (max - min +1) + min);
			//Random random = new Random();
			//int ran = random.nextInt(min, max+1);
			//랜덤 코드는 위의 코드와 같다
			set.add(ran);
			}		
			System.out.println(set);
		
		
	
		 for( ; set.size() != 6; ){
			 ran = (int)(Math.random() * (max - min +1) + min);
			 set.add(ran);
				}
		 
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 list.addAll(set);
		 Collections.shuffle(list);
		  System.out.println(list);
	}
}

