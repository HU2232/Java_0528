package day18;

import lombok.AllArgsConstructor;
import lombok.Data;

public class SynchronizedEX01 {

	public static void main(String[] args) {
		//은행 잔고를 통한 동기화 메소드 예제
		BankBook bankBook = new BankBook("유달리", 0);
		CustomerAction1 c1 = new CustomerAction1("유학영", bankBook);
		CustomerAction1 c2 = new CustomerAction1("유도영", bankBook);
		
		c1.start();
		c2.start();
	}

}
@AllArgsConstructor
class CustomerAction1 extends Thread{
	
	private String name;
	private BankBook bankBook;
	
	@Override
	public void run() {
		System.out.println(name + "님이 입금중 입니다......");
		bankBook.deposit(name, 1000000000);
	}
}

@Data
@AllArgsConstructor
class BankBook{
	private String name;
	private int balance;
	//입금 기능
	public synchronized void deposit(String name, int money) {
		this.balance += money;
		
		try {
			//현재 스레드를 2초간 멈춤
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name + " : " + money + "원 " + "잔액 : " + this.balance + "원");
	}
}