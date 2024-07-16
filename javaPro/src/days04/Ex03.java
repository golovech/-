package days04;

/**
 * @author dewbuster
 * @date 2024. 7. 4. - 오전 10:41:47
 * @subject
 * @content
 *
 */
public class Ex03 {

	public static void main(String[] args) {
		// 대문자 -> 소문자 변환 char일 경우 + 32
		// 소문자 -> 대문자 변환 -32
		
		char lowerCase = 'x', upperCase;
		
		upperCase = (char) (lowerCase - 32);
		
		System.out.println(upperCase);
	}

}
