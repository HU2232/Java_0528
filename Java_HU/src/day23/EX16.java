package day23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

public class EX16 {

	public static void main(String[] args) {
		
		//2. 2. 이름이 홍길동, 나이는 21인 객체를 생성하시오
		Person p = new Person("홍길동", 21);
		
		//3. src/day23/ex16.txt에 2번에서 작성한 객체를 저장하시오 
		try(ObjectOutputStream oos = new ObjectOutputStream
				(new FileOutputStream("src/day23/ex16.txt"))){	
			oos.writeObject(p);
			oos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//4. src/day23/ex16.txt에 저장된 객체를 불러온 후 콘솔창에 출력하는 코드를 작성하시오
		try(ObjectInputStream ois
				= new ObjectInputStream(new FileInputStream("src/day23/ex16.txt"))){
			/* (Person)을 생략하면 에러 발생
			 * 원인 : readObject는 리턴이 Object인데 다운캐스팅은 자동으로 이루어지지 않음
			 * 해결방법 : 명시적으로 클래스 형변환을 해야한다
			 */
			Person p2 = (Person)ois.readObject();
			System.out.println(p2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
//1. 이름과 나이를 저장하고 관리하는 클래스를 생성해보시오
@Data
@AllArgsConstructor
class Person implements Serializable{
	
	private static final long serialVersionUID = -3491499071728481932L;
	private String name;
	private int age;
}