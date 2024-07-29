package days21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.text.AbstractDocument.BranchElement;

/**
 * @author kenik
 * @date 2024. 7. 29. - 오전 11:14:37
 * @subject  Ex01.java -> Ex01Copy.java
 * @content  FileReader   FileWriter
 *                  1문자
 */
public class Ex05_02 {

	public static void main(String[] args) {
		//
		String sourceFile = ".\\src\\days21\\Ex01.java";
		String copyFile = "";

		int idx = sourceFile.lastIndexOf("\\");
		System.out.println( idx );

		String parent  = sourceFile.substring(0, idx );
		System.out.println( parent );
		String child = sourceFile.substring(idx+1);
		System.out.println( child );

		idx =  child.indexOf(".");
		String fileName = child.substring(0, idx);
		System.out.println( fileName );
		String ext = child.substring(idx);
		System.out.println( ext );
		fileName += "Copy";

		copyFile = String.format("%s\\%s%s", parent, fileName, ext);
		System.out.println( copyFile );

		// > 복사 처리 시간 : 2533300(ns)
		fileCopyTextStream( sourceFile, copyFile );
	} // main

	private static void fileCopyTextStream(String sourceFile, String copyFile) {

		long start = System.nanoTime();
		
		final int BUFFER_SIZE = 1024;
		

		try (FileReader reader = new FileReader(sourceFile);
				FileWriter writer = new FileWriter(copyFile);  
				BufferedReader br = new BufferedReader(reader, BUFFER_SIZE);
				BufferedWriter bw = new BufferedWriter(writer, BUFFER_SIZE); // 보조스트림을 쓰겠다.
				){
//			String line;
//			while ((line = br.readLine()) != null) {
//				bw.write(line);
//			} // while
			
			// 중요한 코딩. 이해하기
			// > 복사 처리 시간 : 744600(ns)//buff처리속도가 3.5배정도 빠름.
			char [] cbuf = new char [BUFFER_SIZE];
			int readCharNumber; // 읽어온 갯수
			while ((readCharNumber = br.read(cbuf)) != -1) { // cbuf: 읽어온 데이터
				bw.write(cbuf, 0, readCharNumber);
				
			} // while
			
			
			
			System.out.println("파일 복사 완료!!!");

			long end = System.nanoTime();
			System.out.printf("> 복사 처리 시간 : %d(ns)\n", (end-start));
		} catch (Exception e) {
			e.printStackTrace();
		}



	}

} // class





