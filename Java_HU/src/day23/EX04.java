package day23;

public class EX04 {

	public static void main(String[] args) {
		int score = 90;
		/* A를 판별하는 코드를 작성했는데 A가 아닌 경우에도 A가 출력
		 * 원인 : ||때문에 두 조건식 중에 하나만 맞아도 A가 출력됨 
		 * 해결방안 : ||이 아닌 &&를 사용
		 */
		/*if(score >= 90 || score <= 100) {
			System.out.println("A");*/
		if(score >= 90 && score <= 100) {
			System.out.println("A");
		}
	}
}
