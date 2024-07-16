package days06;

import java.util.Scanner;

/**
 * @author dewbuster
 * @date 2024. 7. 8. - 오전 11:23:34
 * @subject
 * @content
 *
 */
public class Ex03_04 {

	public static void main(String[] args) {

		int kor;
		Scanner scanner = new Scanner(System.in);
		String strKor;  // "0" ~ "100"

		//String regex = "\\d{1,3}";
		String regex = "\\d{1,2}|100";
		// [0-9][0-9][0-9]
		// \\d\\d\\d
		// \\d{3}
		// \\d{n,m} - n 부터 m 까지

		// \\d*
		int failCount = 0;
		do {
			if (failCount != 0) {
				System.out.printf("[%d]번 실패!!\n", failCount);
				if (failCount == 3) {
					System.out.println("> 오늘은 그만 하자 <");
					return;
				}
			}
			System.out.print( "국어 점수 입력 ? " );
			strKor = scanner.next();
			failCount++;
		} while (!strKor.matches(regex));
		
		kor = Integer.parseInt(strKor);
		System.out.println(kor);
		
		scanner.close();

	} // main

} // class
