package days21;

import java.io.File;
import java.io.FileReader;
import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 * @author love
 * @date 2024. 7. 29. - 오전 10:07:22
 * @subject
 * @content
 *
 */
public class Ex04 {

	public static void main(String[] args) {
		//days21.Ex01.java
		// ㄴ .txt파일 읽을때 -> 문자 스트림 사용
		// 파일		+ 문자 스트림 = FileReader, FileWriter
		
		// [ File 클래스 ]
		// 파일 + 디렉토리(폴더)를 다루는 여러 기능이 있는 클래스
		//							     (생성, 파일 삭제, 파일 정보, 파일명 변경 등등)
		
		//String parent = ".\\src\\days21";
		File parent = new File(".\\src\\days21");
		String child = "Ex01.java";
		File file = new File(parent, child) ;
		System.out.println(file.length() + "(바이트)");
		System.out.println(file.isDirectory() + "/" + file.isFile()); // 파일이니, 디렉토리니?

		
		long ms = file.lastModified();
		// System.out.println(ms); //1722211986249 -> 년월일/시분초로 출력하려면?
		Date date = new Date(ms);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		System.out.println(sdf.format(date));
		
		
		
		
		
		
		
		
		try (FileReader reader = new FileReader(file) ){
			int code;
			while ((code = reader.read()) != -1) {
				System.out.printf("%c", (char)code); // 파일 읽어와서 출력하는 작업. // (char)code); char을 붙여도 안붙여도 결괏값이 똑같은데 왜붙이는지?
			} 
			
		} catch (Exception e) {
			
		} // catch
		
	} // main

} // class
