package days03;

/**
 * @author dewbuster
 * @date 2024. 7. 3. - 오후 5:27:57
 * @subject
 * @content
 *
 */
public class Ex05_07 {

	public static void main(String[] args) {

		int x = 10;
		// int y = ++x;   / x = 11, y = 11
		int y = x++;

		System.out.printf("x=%d, y=%d", x, y);

		int m = 100;
		// System.out.println(m++ == 100); // 100 == 100 true
		System.out.println(++m == 100); // 101 == 100 false


		/*
		 * int n = 10;
		 *   //5증가, 10감소
		 * n = n + 5;
		 * n += 5;
		 * 
		 * n = n - 10;
		 * n -= 10;
		 * 
		 */

	}

}
