package days16;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex02 {

	public static void main(String[] args) {
		// try~catch 연습
		// C:\Windows\comsetup.log 파일을 읽어와서 출력.
		// 텍스트파일을 읽기/쓰기 -> FileReader/FileWriter
		FileReader reader = null;
		String fileName = "C:\\Windows\\comsetup.log";

		int one = -1;

		try {
			reader = new FileReader(fileName);
			//
			// int one =  reader.read();
			// System.out.printf("%c", (char)one);

			while( (one =  reader.read()) != -1) {
				System.out.printf("%c", (char)one);
			};

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
					reader = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		} // try


	} // main

} // class
