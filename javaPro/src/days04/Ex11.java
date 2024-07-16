package days04;

/**
 * @author dewbuster
 * @date 2024. 7. 4. - 오후 4:11:42
 * @subject
 * @content
 *
 */
public class Ex11 {

	public static void main(String[] args) {
		/*
		// continue 문
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i == 5) continue;
			System.out.printf("%d+", i);
			sum += i;
		}
		System.out.printf("=%d", sum);
		*/
		
		// while 문
		/*
		int i = 1;
		int sum = 0;
		while (i <= 10) {
			if (i == 5) {
				i++;
				continue;
			}
			System.out.printf("%d+", i);
			sum += i;
			i++;
		} // while
		System.out.printf("=%d", sum);
		*/
		// 3.
		int i = 0;
		int sum = 0;
		while (++i <= 10) {
			if (i == 5) continue;
			System.out.printf("%d+", i);
			sum += i;
		} // while
		System.out.printf("=%d", sum);
		
		
	} // main
	
}  // class
