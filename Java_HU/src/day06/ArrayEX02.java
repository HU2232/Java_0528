package day06;

public class ArrayEX02 {

	public static void main(String[] args) {
		// 배열은 생성 시 초기화가 되는지 보여주는 예제
		int num1;
		
		//System.out.println(num1); //에러 발생 : 지역변수는 자동으로 초기화가 안됨.
		num1 =10;//초기화를 한 후에
		System.out.println(num1); //사용가능함
		
		int[] arr = new int[3];
		for(int tmp : arr) {
			System.out.println(tmp); //배열은 배열 생성 시 각 자료형에 맞는 초기값으로 초기화 됨
		}
		//arr[3] = 20;//잘못된 번지에 접근해서 예외가 발생함 위의 번지 수에서 최대 번지는 접근하면 에러가 발생함
	}

}
