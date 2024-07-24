package days16;

/**
 * @author kenik
 * @date 2024. 7. 22. - 오후 3:46:30
 * @subject
 * @content
 *
 */
public class Ex05_04 {

	public static void main(String[] args) {
/*
		String todo = "   홍길동    ";
		System.out.printf("[%s]\n", todo);
		System.out.printf("[%s]\n", todo.trim());
		System.out.printf("[%s]\n", todo.strip());
		System.out.printf("[%s]\n", todo.stripLeading());
		System.out.printf("[%s]\n", todo.stripTrailing());
*/
		// String.join() ***
		String [] names = {"이시훈", "원충희", "김준석"};
		String content = String.join("</li><li>", names);
		System.out.println( "<ol><li>"+ content +"</li></ol>");


	} // main

} // class
