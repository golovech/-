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
public class Ex02_02 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		byte age = 20;
		
		System.out.print("> 이름 입력 : ");
		name = bufferedReader.readLine();

		// Type mismatch: cannot convert from String to byte
		// 타입(형) 변환
		// "20" -> 20
		// String -> byte    Byte.parseByte()
		// String -> int       Integer.parseInt()
		// String -> short  Short.parseShort()
		// String -> long    Long.parseLong()
		
		System.out.print("> 나이 입력 : ");
		
		String strAge = bufferedReader.readLine();
		age = Byte.parseByte(strAge);
		
		// 나이를 잘못 입력하면 ava.lang.NumberFormatException 발생
		
		System.out.printf("이름=\"%s\", 나이=%d\n", name, age);

	}

}
