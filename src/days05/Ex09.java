package days05;

/**
 * @author dewbuster
 * @date 2024. 7. 5. - 오후 4:51:14
 * @subject
 * @content
 *
 */
public class Ex09 {

	public static void main(String[] args) {
		
		String todo = "Auto-generated method stub";
		// System.out.println(todo.length());  // 문자열의 길이 length() 메서드
		int size = todo.length();
		char[] todoCharArr = new char[size];
		
		for (int i = 0; i < todoCharArr.length; i++) {
			todoCharArr[i] = todo.charAt(i);
		}
		
		String target = "";
		for (int i = 0; i < todoCharArr.length; i++) {
			target += todoCharArr[i];
		}
		System.out.println(target);

		
	}

}
