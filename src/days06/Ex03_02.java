package days06;

import java.util.Scanner;

/**
 * @author dewbuster
 * @date 2024. 7. 8. - 오전 11:04:19
 * @subject
 * @content
 *
 */
public class Ex03_02 {

	public static void main(String[] args) {

		// if ( one == '#' || one == '@' || one == '$' || one == '!' ) {}

		// 정규 표현식(regex) 유효성 검사. regular expression
		// boolean String.matches(String regex);

		String strOne;
		Scanner scanner = new Scanner(System.in);
		System.out.print("한 문자 입력 ? ");
		strOne = scanner.next();

		// String regex = "[#$%@!&]";
		// String regex = "[0-9]";       \d
		// String regex = "[A-Z]";
		// String regex = "[A-Za-z]";
		String regex = "[가-힣]";
		System.out.println( strOne.matches(regex) );
		
		
		scanner.close();
	}

}
