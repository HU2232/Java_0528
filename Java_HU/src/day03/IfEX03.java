package day03;

public class IfEX03 {

	public static void main(String[] args) {
		// else if 예제
		int num = -1;
		//num이 0이면 0이라고 출력하고
		if(num == 0) {
			System.out.println(0);
		//num이 0이 아니고 양수이면 양수라고 쿨력하고
		}else if(num > 0) {
			System.out.println(num + "은 양수");
		//num이 0과 양수가 아니면 음수라고 출력하는 코드를 작성하시오
		}else
			System.out.println(num + "은 음수");
	}

}
