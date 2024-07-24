package days16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author kenik
 * @date 2024. 7. 22. - 오후 4:07:40
 * @subject
 * @content
 *
 */
public class Ex06 {

	public static void main(String[] args) {

		String fileName = ".\\src\\days16\\SS21.txt";
		// System.out.println( System.getProperty("user.dir") );
		String [] nameArr = getFileContent(fileName);

		String content = "<ol><li>" + String.join("</li><li>", nameArr) +"</li></ol>";

		System.out.println(content);


	} // main

	// Ex05_02.java
	private static String [] getFileContent(String fileName) {

		FileReader reader = null;
		BufferedReader bufferedReader = null;

		int one = -1;

		String [] nameArr = new String[10];

		try {
			reader = new FileReader(fileName);
			// 보조스트림( 2차 스트림 )
			bufferedReader = new BufferedReader(reader);
			String line = null;
			int index = 0;
		    while(	( line = bufferedReader.readLine() ) != null) {
		    	nameArr[index++] = line;
		    }


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
					bufferedReader.close();

					reader = null;
					bufferedReader = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		} // try

		return nameArr;
	}


} // class










