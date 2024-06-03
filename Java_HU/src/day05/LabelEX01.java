package day05;

public class LabelEX01 {

	public static void main(String[] args) {
		
	//라벨 이름 A로 지정한 후 break A;를 이용하면 라벨 이름이 A인 반복문을 빠져나갈 수 있다
		int i,j;
		
		for(i=1; i<=5; i++) {
			for(j=1; j<=5; j++) {
				System.out.print(i*j + " ");
			}
			System.out.println();
		}
		//한줄에 숫자 3개씩으로 변경 break문 활용
		for(i=1; i<=5; i++) {
			for(j=1; j<=5; j++) {
				System.out.print(i*j + " ");
				if(j == 3) {
					break;
				}
			}
			System.out.println();
			
		}
			//라벨 이름 A를 지정한 후 break A;를 이용하면 라벨이름이 A인 반복문을 빠져나갈 수 있다
	A :	for(i=1; i<=5; i++) {
		for(j=1; j<=5; j++) {
			System.out.print(i*j + " ");
			if(j == 3) {
				break A;
				}
			}
		System.out.println();
		}
	}
}




