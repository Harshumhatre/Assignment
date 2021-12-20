package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class A2 {
	public static void main(String[] args) {
		try {
			FileReader file= new FileReader("C:\\Users\\Dell\\Desktop");
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
	}

}
