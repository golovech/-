package days22;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Ex04_02 {

	public static void main(String[] args) {
		String name = ".\\src\\days22\\child.ser";

		try (	FileInputStream fis = new FileInputStream(name);
				ObjectInputStream ois = new ObjectInputStream(fis);){
				
				Child c = (Child) ois.readObject();
				System.out.println(c.name + "/" + c.age);

				
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
