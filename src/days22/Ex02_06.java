package days22;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author love
 * @date 2024. 7. 30. - 오전 11:37:29
 * @subject
 * @content
 *
 */
public class Ex02_06 {

	public static void main(String[] args) {
		// 85.86kb
		String parent = ".\\src\\days22";
		String child = "시간표_(5강의실)(디지털컨버전스)AWS 클라우드와 Kafka를 활용한 Java(자바) Full-Stack 개발자 양성과정(E).xlsx";
		// 10kb 양성과정(E)_1.xlsx . . .
		// 파일컷트하는함수, 확장자 가져오는함수
		File file = new File(parent, child);
		System.out.println("> 파일 크기 : " + file.length() + "(byte)");
		
		final int VOLUME = 10 * 1024; // 10KB // 자르고자 하는 크기
		
		String baseName = getBaseFileName(child); // 파일명 가져오기
		String ext = getExtension(child); // 확장자 가져오기
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		int code = 0; // 한 바이트로 읽어올 변수 선언.
		int index = 0; // 파일명 뒤 _1, _2 를 인덱스라고 잡자.
		int i = 0; // 읽어온 바이트 수
		
		
		try (FileInputStream fis = new FileInputStream(file);
		  	BufferedInputStream bis = new BufferedInputStream(fis);){
			
			while ( (code = bis.read())!= -1) {
				if ( i % VOLUME == 0 ) { 
					if( i !=0 ) bos.close(); // 파일을 저장하겠다.
					
					child = String.format("%s_%d%s", baseName, ++index, ext);
					File temp = new File(parent, child);
					fos = new FileOutputStream(temp);
					bos = new BufferedOutputStream(fos);
				}
				
				bos.write(code);
				
				i++;
				
			}
			bos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	} // main
	
	// 확장자를 반환하는 함수
	public static String getExtension(String fileName) {
		int pos = fileName.indexOf(".");
		return fileName.substring(pos);
		
	}
	// 확장자를 제외한 파일명을 반환하는 함수
	public static String getBaseFileName(String fileName) {
		int pos = fileName.indexOf(".");
		return fileName.substring(0, pos); // 둘이 뭐가 다른걸까..
		
	}
	

} // class
