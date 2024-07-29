package days21;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex04_03 {

	public static void main(String[] args) {

		String parent = ".\\src\\days21";
		String child ;
		char con = 'y';
		String content ;

		try (Scanner scanner = new Scanner(System.in)){
			System.out.print("1. 저장할 파일명 입력?");
			child = scanner.next();

			File file = new File(parent, child);
			try (FileWriter writer = new FileWriter(file)){
				do {

					System.out.print("2. 저장할 문자열 입력?");
					content = scanner.next();
					writer.write(content);



					System.out.println("계속?");
					con = (char)System.in.read();
					System.in.skip(System.in.available());

				} while (Character.toUpperCase(con)=='Y');
			} catch (Exception e) {
				e.printStackTrace();
			} // try

		} catch (Exception e) {
			e.printStackTrace();
		} // try



	} // main

} // class
