package days21;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
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
 *           BufferedInputStream BufferedOutputStream
 */
public class Ex06_02 {
	//> 복사 처리 시간 : 336118126500(ns)
	//> 복사 처리 시간 :    245991100(ns) -> 무지 빨라짐. 버퍼드IO!
	public static void main(String[] args) {
		//
		String sourceFile = "C:\\Users\\User\\Downloads\\KakaoTalk_Setup.exe";
		String copyFile = "C:\\Users\\User\\Documents\\KakaoTalk_Setup_copy.exe";
		
	
		fileCopyBinaryStream( sourceFile, copyFile );
	} // main

	private static void fileCopyBinaryStream(String sourceFile, String copyFile) {

		long start = System.nanoTime();
		
		final int BUFFER_SIZE = 1024;
		try (FileInputStream fis = new FileInputStream(sourceFile);
				FileOutputStream fos = new FileOutputStream(copyFile);  
				BufferedInputStream bis = new BufferedInputStream(fis, BUFFER_SIZE);
				BufferedOutputStream bos = new BufferedOutputStream(fos, BUFFER_SIZE);
				
				
				){
			int code ; // 읽어온 갯수
			byte [] b = new byte[BUFFER_SIZE];
			int readByteNumber;
			
			while ((readByteNumber = bis.read(b)) != -1) { // cbuf: 읽어온 데이터
				bos.write(b, 0, readByteNumber);
				
			} // while
			bos.flush();
			System.out.println("파일 복사 완료!!!");

			long end = System.nanoTime();
			System.out.printf("> 복사 처리 시간 : %d(ns)\n", (end-start));
		} catch (Exception e) {
			e.printStackTrace();
		}



	}

} // class





