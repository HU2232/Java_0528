package day23;

import java.io.FileWriter;
import java.io.IOException;

public class EX17 {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("src/day23/ex17.txt", true);
			fw.write('a');
			fw.write('b');
			fw.write('c');
			fw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
