package day08;

public class ClassEX02 {
	
	/* 주어진 num3이 소수인지 아닌지 판별하는 코드를 작성하시오
	 * 단, 메소드를 이용해서 구현할 것
	 * */
	public static void main(String[] args) {
		int num = 6;
		
		boolean result = isPrime(num);
		
		if(result) {
			System.out.println(num + "는 소수");
		}
		else {
			System.out.println(num + "는 소수 아님");
		}
		//100 이하의 소수를 판별하는 코드를 작성하시오 isPrime을 이용하여
		for(num=2; num<=1000; num++) {
			if(isPrime(num)) {
				System.out.println(num + "  ");
			}
		}
		/**주어진 정수가 소수인지 아닌지 판별하는 코드
		 * 매개변수 : 정수 => int num
		 * 리턴타입 : 소수인지 아닌지 => 맞다 틀리다 => boolean
		 * 메서드명 : isPrime
		 * */
		

	}


	
	public static boolean isPrime(int num) {
		int count = 0;
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				count++;
			}
		}
		
		return count == 2 ? true : false;
		//위의 코드는 아래 코드와 같은 의미이다
		
		/*
		if(count == 2) {
			return true;
		}
		return false;
		*/
		
		/*
		if(count == 2) {
			return true;
		}
		else {
			return false;
		}
		*/
		
		/*
		boolean result;
		if (count ==2) {
			result = true;
		}
		else {
			result = false;
		}
		return false;
		*/
	}
	public static boolean isPrime2(int num) {
		if(num == 1) {
			return false;
		}
		//1과 자기 자신을 제외한 수 중에서 약수를 반복문을 이용하여 찾음
		for(int i=2; i<num; i++) {
			//1과 자기자신을 제외한 수 중에서 약수가 있으면
			if(num % i == 0) {
				//소수가 아님
				return false;
			}
		}
	
		return true;
	}
}