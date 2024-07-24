package days16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author kenik
 * @date 2024. 7. 22. - 오후 2:48:13
 * @subject
 * @content
 *
 */
public class Ex05_02 {

	public static void main(String[] args) {

		// git add .

		// days16.Ex01.java  읽어와서
		// "예외" 문자열있는 위치값을 모두 출력...
//		String fileName = "C:\\E\\Class\\SS21Class\\Workspace\\JavaClass\\javaPro\\src\\days16\\Ex01.java";
		String fileName = ".\\src\\days16\\Ex01.java";
		String content = getFileContent(fileName);
		System.out.println(content);

		/*
		// days11.Ex03.java   m배열에서 n(71) 모든 위치값..
		int index, fromIndex = 0;
		while (  (index = content.indexOf("예외",fromIndex) ) != -1  ) {
			 System.out.println( index );
			 fromIndex = index + 1;
		}
		*/

		// 예외 문자열을 모두 찾아서 삭제.
//	    content = content.replace("예외", "[예외]");
	    //                           regex
	    // 홍길동  홍길남  홍길순
	    // "홍길[가-힣]"
//	    content = content.replaceAll("예외", "[예외]");


//	    content = content.replace("예외", "");
	    System.out.println( content );



	} // main

	private static String getFileContent(String fileName) {

		FileReader reader = null;

		BufferedReader bufferedReader = null;

		int one = -1;
		String content = "";

		try {
			reader = new FileReader(fileName);
			// 보조스트림( 2차 스트림 )
			bufferedReader = new BufferedReader(reader);
			String line = null;
			int lineNumber = 1;
		    while(	( line = bufferedReader.readLine() ) != null) {
		    	// System.out.printf( "%d : %s\n" , lineNumber++,  line );
		    	content += line +"\r\n";
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

		return content;
	}

} // class
