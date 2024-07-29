package days21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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
public class Ex06 {

	public static void main(String[] args) {
		//
		String sourceFile = "C:\\Users\\User\\Downloads\\KakaoTalk_Setup.exe";
		String copyFile = "C:\\Users\\User\\Documents\\KakaoTalk_Setup_copy.exe";
		
	
		fileCopyBinaryStream( sourceFile, copyFile );
	} // main

	private static void fileCopyBinaryStream(String sourceFile, String copyFile) {

		long start = System.nanoTime();
		try (FileInputStream fis = new FileInputStream(sourceFile);
				FileOutputStream fos = new FileOutputStream(copyFile);  
				
				){
			int code; // 읽어온 갯수
			while ((code = fis.read()) != -1) { // cbuf: 읽어온 데이터
				System.out.printf("%08d\n", Integer.parseInt(Integer.toBinaryString(code))); // 이진수 형태의 문자열이 됨.
				fos.write(code);
				
			} // while
			fos.flush();
			System.out.println("파일 복사 완료!!!");

			long end = System.nanoTime();
			System.out.printf("> 복사 처리 시간 : %d(ns)\n", (end-start));
		} catch (Exception e) {
			e.printStackTrace();
		}



	}

} // class





