package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author dewbuster
 * @date 2024. 7. 3. - 오전 10:51:18
 * @subject [S]canner 클래스 == 객체, 개체
 * @content
 *
 */
public class Ex02 {

	public static void main(String[] args) throws IOException {
		// Ctrl + Shift + O 자동 import
		
		// InputStreamReader 문자변환
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Unhandled exception type IOException
		System.out.print("> 이름 입력 : ");
		String name = br.readLine();
		
		System.out.println( name );

	}

}
