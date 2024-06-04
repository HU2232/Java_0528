package day06;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortEX02 {

	public static void main(String[] args) {
		int[]arr = new int[] {1,3,5,7,9,2,4,6,8,10};
		
		// Dual-Pivot Quick Sort 알고리즘을 이용하여 정렬
		/* Arrays.sort는 int[]에 대해 내림차순을 제공하지 않음
		 * integer []에 대해 내림차순을 제공 함.
		 *  */
		
		Arrays.sort(arr);
		
		/*for(int tmp : arr) {
			System.out.print(tmp + " ");
		}*/
		
		//Arrays.toString(arr)(배열) : 배열 각 값을 []안에 넣고 각 값 사이에는  , 를 이용하여 구분하여 콘솔에 출력
		System.out.println(Arrays.toString(arr));
		
		Integer [] arr2 = {1,3,5,7,9,2,4,6,8,10};
		/* Arrays.sort(배열) : 배열 정령을 위해 */
		Arrays.sort(arr2, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr2));

	}

}
