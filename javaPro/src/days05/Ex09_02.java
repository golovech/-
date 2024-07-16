package days05;

/**
 * @author dewbuster
 * @date 2024. 7. 5. - 오후 4:51:14
 * @subject
 * @content
 *
 */
public class Ex09_02 {

	public static void main(String[] args) {
		
		String todo = "Auto-generated method stub";
		
		// String -> char [] 변환
		char[] todoCharArr = todo.toCharArray();
		// char[] -> String 변환
		//String target = new String(todoCharArr);
		String target = String.valueOf(todoCharArr);
		
		System.out.println(target);

	}

}
