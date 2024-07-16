package days04;

/**
 * @author dewbuster
 * @date 2024. 7. 4. - 오후 3:28:44
 * @subject
 * @content
 *
 */
public class Ex09 {

	public static void main(String[] args) {
		
		int i = 1;
		while (i <= 10) {
			
			if (i == 6) break;
			System.out.printf("%d+", i);
			i++;
		}
		/*
		// [break 문]
		for (int i = 1; i <= 10; i++) {
			
			if (i == 6) break;
			System.out.printf("%d+", i);
			
		}
		*/

	}

}
