package days18;

import java.security.MessageDigest;
import java.text.MessageFormat;

/**
 * @author love
 * @date 2024. 7. 24. - 오전 11:30:33
 * @subject
 * @content
 *
 */
public class Ex02_04 {

	public static void main(String[] args) {
		// SDF, DF, CF . . .
		// [ MessageFormat 형식화 클래스 ]
		// 특정 데이터 -> 특정 형식으로 출력 할때 쓴다.

		String name = "권맑음";
		int age = 26;
		boolean gender = true;
		double height = 178.67;
		char grade = 'A';
		
		String pattern = "이름: {0}, 나이:{1}살, 성별:{2}, 키:{3}, 등급:{4} 입니다.";

		
		String s = MessageFormat.format(pattern,name, age, gender?"남":"여",height, grade);
		



	}

}
