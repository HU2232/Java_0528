package day08;

import java.util.Arrays;

public class ArraySortEX02 {

	public static void main(String[] args) {
		//버블 정렬을 이용하여 문자열을 정렬하는 예제
		String[] arr = new String[] {"apple","a","zoo","banana"};
		
		for(int i=0; i<arr.length -1; i++) {
			for(int j=0; j<arr.length -1; j++) {
				/*문자열.compareTo(문자열2); : 문자열 1과 문자열 2를 알파벳 순으로 배치했을 때
				위치를 정수로 알려줌*/
				if(arr[j].compareTo(arr[j+1])>0) {
					String tmp = arr[j];
					arr[j] = arr [j+1];
					arr[j+1] = tmp;
				//같은 번지에 있는 문자들끼리 순서대로 비교
				//apple과 a를 비교하면
				//apple의 a와 a의 a를 비교 같으니까 다음 문자로 이도
				//apple의 p와 a의 다으밍 없어서 a가 앞으로
				//문자열 1이 앞이면 음수, 문자열1이 뒤이면 양수
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
