package day17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectStreamEX01 {

	public static void main(String[] args) {
		
		String fileName ="src/day17/objectStream.txt";
		List<Point> points = Arrays.asList(
				new Point(1,10, 1),
				new Point(3,4, 2),
				new Point(7,5, 9),
				new Point(8,2, 3));				
		try(FileOutputStream fos =new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			for(Point tmp : points) {
				oos.writeObject(tmp);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다");
		} catch (IOException e) {
			System.out.println("입출력 예외 발생");
		}
		
		List<Point> point2 = new ArrayList<Point>();
		try(FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis)){
			Point tmp;
			do {
				tmp = (Point) ois.readObject();
				if(tmp != null) {
					point2.add(tmp);
				}
			}while(tmp != null);
		} catch (IOException e) {
			System.out.println("입출력 예외 발생");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다");
		}
		System.out.println(point2);
	}
}
