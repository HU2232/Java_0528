package HomeWorks.account;

public class Main {
	/* 가계부를 관리하는 프로그램을 작성하시오
	 * 메인 메뉴
	 * 1.내역 입력
	 * 2.내역 수정
	 * 3.내역 삭제
	 * 4.내역 조회
	 * 5. 종료
	 * 메뉴 선택 : 
	 * 
	 * 1번 프로그램
	 * 날짜 : 
	 * 수입/지출 :
	 *  
	 * 수입 입력 시
	 * 
	 * 분류 목록
	 * 1. 월급
	 * 2. 용돈
	 * 3. 부수입 
	 * 
	 * 월급 작성 시
	 * 분류 월급
	 * 금액 : 
	 * 내용 : ex)6월 임금
	 * 
	 * 2번 프로그램
	 * 
	 * 날짜 : (입력)
	 * 1. 날짜 | 수입 | 분류 목록 | 금액 | 내용
	 * 수정하고 나면
	 * 수정 완료 출력
	 * 
	 * 3번 프로그램
	 * 
	 * 삭제할 내역 : 
	 * 내역이 삭제되었습니다.
	 * 
	 * 4번 프로그램(날짜 순으로 정렬해야함)
	 * 
	 * 1. 날짜 | 수입 | 분류 목록 | 금액 | 내용
	 * 출력
	 */
		
	public static void main(String[] args) {
		AccountManager am = new AccountManager();
		am.run();
		
	}
}
