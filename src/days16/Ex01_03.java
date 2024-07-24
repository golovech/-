package days16;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author kenik
 * @date 2024. 7. 22. - 오전 9:33:36
 * @subject
 * @content
 *
 */
public class Ex01_03 {

	public static void main(String[] args) {
		int a = 0, b = 0;
		Scanner scanner = new Scanner(System.in);

		// 다중 catch 문
		try {
			System.out.print("> a, b 두 정수 입력 ? ");
			a = scanner.nextInt();
			b = scanner.nextInt();
			double c = a / b;
			System.out.printf("%d / %d = %.2f\n", a, b, c);
		} catch (InputMismatchException e) {
			System.out.println( e.toString());
		} catch (ArithmeticException e) {
			System.out.println( e.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("end");




	} // main

} // class






