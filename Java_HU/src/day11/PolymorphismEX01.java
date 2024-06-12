package day11;

public class PolymorphismEX01 {

	public static void main(String[] args) {
		TV tv = new TV();
		AirConditioner aircon = new AirConditioner();
		
		turnOn(tv);
		turnOn(aircon);
	}
	/*
	* 가전 제품 종류가 20개 이면 trunOn메소드가 20 필요함
	* 거기에 turnOff메소드가 추가되면 메소드가 40개가 필요함
	public static void turnOn(TV tv) {
		tv.power = true;
		System.out.println(tv.name + " 켜졌습니다");
	}
	public static void turnOn(AirConditioner aircon) {
		aircon.power = true;
		System.out.println(aircon.name + " 켜졌습니다");
	}
	*/
	//하지만 매개변수 다형성을 이용하면 가전제품 종류에 상관없이 하나의 메소드로 처리 가능함
	public static void turnOn(Appliances app) {
		app.power = true;
		System.out.println(app.name + " 켜졌습니다.");
	}
	


}	

class Appliances{
	boolean power;
	String name = "가전제품";
}

class TV extends Appliances{
	public TV() {
		name = "TV";
	}
}

class AirConditioner extends TV{
	public AirConditioner() {
		name = "에어컨";
	}
}