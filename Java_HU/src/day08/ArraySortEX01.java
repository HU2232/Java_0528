package day08;

import java.util.Arrays;

public class ArraySortEX01 {

	public static void main(String[] args) {
		/* 정수형 배열을 버블 정렬을 이용하여 정렬하는 예제
		 * 버블정렬 시간 복잡도는 0(n) = n의 2제곱*/
	int [] arr = new int[] {1,6,3,2,9,10,4,5};
	
	for(int i=0; i<arr.length -1; i++) {
		for(int j=0; j<arr.length -1; j++) {
			//-1은 위의 배열에서 5이후를 비교하지 않기 위해 넣음
			if(arr[j] > arr[j+1]) {
			//앞의 숫자가 크면 뒤로 보냄
			//앞의 숫자가 크면 뒤의 숫자와 값을 교환
				int tmp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] =tmp;
			}
		}
	}
	System.out.println(Arrays.toString(arr));
	}

}
