package day05;

public class EnhancedForEX01 {

	public static void main(String[] args) {
		// 배열에 1,2,3,4,5,를 저장한 후 향상된 for문을 이용하여 조회하는 예제
		int [] arr = new int [] {1,2,3,4,5};
		
		for(int tmp : arr) {
			System.out.println(tmp);
		}
		//위의 코드와 아래 코드는 같다 위의 코드가 좀 더 축약된 것
		for(int i = 0; i<arr.length; i++) {
			int tmp = arr[i];
			System.out.println(tmp);
		}

	}

}
