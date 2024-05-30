package day03;

public class SwitchEx01 {
	
	public static void main(String[] args) {
		// switch문을 이용한 야바위 예제
		/* switch(변수)
		 * case 값1: //if(변수 == 값1)
		 * 		실행문1;
		 * 		break;
		 * 
		 * switch(변수)
		 * case 값2: //else if(변수 == 값2)
		 * 		실행문2;
		 * 		break;
		 * 
		 * 	default	//else 
		 * 		실행문3;		 	
		 * */
		int num = 3;
		
		switch(num % 2) {
		case 0: //if(num % 2 == 0)
			System.out.println(num + "는 짝수");
			break;
		default: //else
			System.out.println(num + "는 홀수");
		}
	}

}
