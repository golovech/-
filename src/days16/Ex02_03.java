package days16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex02_03 {

	public static void main(String[] args) {

		String fileName = "C:\\Windows\\comsetup.log";

		int one = -1;

		// try ~ with ~ resources 문 (자동 자원 반환)
		try (
				FileReader reader = new FileReader(fileName);
				BufferedReader bufferedReader = new BufferedReader(reader);
				) {


			String line = null;
			int lineNumber = 1;

			while(	( line = bufferedReader.readLine() ) != null) {
				System.out.printf( "%d : %s\n" , lineNumber++,  line );
			}


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


	} // main

} // class
