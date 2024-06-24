package day18;

import lombok.AllArgsConstructor;
import lombok.Data;

public class SynchronizedEX02 {

	public static void main(String[] args) {
		//은행 잔고를 통한 동기화 블록 예제
		BankBook2 bankBook = new BankBook2("홍길동", 0);
		Coustomer c1 = new Coustomer("홍길동", bankBook);
		Coustomer c2 = new Coustomer("홍아무개", bankBook);
		
		Thread t1 = new Thread(()->c1.deposit(500000000));
		Thread t2 = new Thread(()->c2.deposit(500000000));
		
		t1.start();
		t2.start();
		
	}
}
@AllArgsConstructor
class Coustomer{
	private String name;
	private BankBook2 bankBook;
	
	public void deposit(int money) {
		System.out.println(name + " 입금 중입니다......");
		synchronized (bankBook) {
		int balance = bankBook.getBalance();
		bankBook.setBalance(balance + money);
		
		try {
			//현재 스레드를 2초간 멈춤
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " : " + money + "원 " + "잔액 : " + bankBook.getBalance() + "원");
		}
	}
}


@Data
@AllArgsConstructor
class BankBook2{
	private String name;
	private int balance;
}