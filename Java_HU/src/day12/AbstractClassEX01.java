package day12;

public class AbstractClassEX01 {

	public static void main(String[] args) {
		//추상 클래스를 이용하여 객체를 생성할 수는 없음
		//이렇게는 불가능함 -> Animal animal = new Animal();
		
		Cat cat = new Cat();
		cat.bark();
		Dog dog = new Dog();
		dog.bark();
		Tiger tiger = new Tiger();
		tiger.bark();
		
		Animal [] animals = new Animal[3];
		//포함 다형성으로 추상클래스를 활용할 수 있다
		animals[0] = cat;//업캐스팅
		animals[1] = dog;
		animals[2] = tiger;
		for(Animal tmp : animals) {
			tmp.bark();
		}
	}

}

abstract class Animal{
	public String name;
	public String species;//과
	
	public void sleep() {
		System.out.println("잠을 잡니다.");
	}
	public void eat(String food) {
		System.out.println(food + "를 먹습니다.");
	}
	/*public abstract void bark() {
		System.out.println("동물이 짖습니다.");
	}*/
	//bark()메소드는 Animal클래스를 상속받는 모든 클래스들이 bark를 오버라이딩 해야하기 때문에
	//굳이 구현하지 않아도 됨, 그래서 추상 메소드로 만듦 => Animal클래스느느 추상 메소드가 있기 때문에
	//추상클래스로 바꿔줘야 함
	public abstract void bark();
}
class Cat extends Animal{
	public Cat() {
		name = "고양이";
		species = "고양이과";
				
	}
	@Override
	public void bark() {
		System.out.println("어흥");
	}
}
class Dog extends Animal{
	public Dog() {
		name = "개";
		species = "개과";
	}

	@Override
	public void bark() {
		 System.out.println("멍");
	}
}	

class Tiger extends Animal{
	public Tiger() {
		name = "범";
		species ="고양이과";
	}

	@Override
	public void bark() {
		System.out.println("냥");
		
	}
 }
//추상 클래스는 추상 메소드가 반드시 들어가야하는 것은 아님
abstract/*<= 이것만 들어가면됨 */ class Test1{
	
}
