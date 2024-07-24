package days16;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2024. 7. 22. - 오전 9:33:36
 * @subject
 * @content
 *
 */
public class Ex01_02 {

	public static void main(String[] args) {
		int a = 0, b = 0;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			try {
				System.out.print("> a, b 두 정수 입력 ? ");
				a = scanner.nextInt(); // a 1
				// InputMismatchException   a => nextInt()
				b = scanner.nextInt();
				break;
			} catch (Exception e) {
				// 예외 처리...
				scanner.nextLine() ;
				System.out.println("> 입력값 잘못 실패...");
				//e.printStackTrace();
				//System.out.println( e.getMessage() );
				//System.out.println( e.toString() );
			}
		} // while
//
//		if( b == 0 ) {
//			System.out.println("0으로 나누면 안됩니다.");
//			return ; //
//		}

		// 주의할점 - 자식 catch 블럭을 먼저 코딩한다.
		try {
			double c = a / b;
			System.out.printf("%d / %d = %.2f\n", a, b, c);
		} catch (ArithmeticException e) {
			System.out.println( e.toString());
		} catch (Exception e) {
			//
		}



		System.out.println("end");




	} // main

} // class






