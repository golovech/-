package days03;

import java.util.Scanner;

/**
 * @author dewbuster
 * @date 2024. 7. 3. - 오후 3:06:02
 * @subject
 * @content
 *
 */
public class Ex04 {

	public static void main(String[] args) {
		
		// tap = 들여쓰기 ,  shift + tap 내어쓰기,  ctrl + a 전체선택,  ctrl + i 전체 들여쓰기

		String input = "1 fish 2 fish red fish blue fish";
		Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*"); //  \\s: 스페이스 , *: 안와도 좋고 여러개 와도 좋다 
		System.out.println(s.nextInt());
		System.out.println(s.nextInt());
		System.out.println(s.next());
		System.out.println(s.next());
		s.close();

	}

}
