package days04;

/**
 * @author dewbuster
 * @date 2024. 7. 4. - 오후 3:40:24
 * @subject
 * @content
 *
 */
public class Ex10 {

	public static void main(String[] args) {
		/*
		// for문
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d+", i);
			sum += i;  // sum = sum + 1;
		}
		System.out.printf("=%d", sum);
		*/
		
		// while 문
		int i = 1;
		int sum = 0;
		while (i <= 10) {
			System.out.printf("%d+", i);
			sum += i;
			i++;
		}
		System.out.printf("=%d", sum);

	} // main

} // class
