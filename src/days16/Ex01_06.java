package days16;

/**
 * @author kenik
 * @date 2024. 7. 22. - 오전 10:44:24
 * @subject  [예외 고의로 개발자가 발생시키기]
 * @content   throw 문 사용.
 *
 */
public class Ex01_06 {

	public static void main(String[] args) {

		// 컴파일러가 컴파일할 때
		//   ㄴ 예외 체크  O    checked 예외
		//   ㄴ     "      X    unchecked 예외
	    throw new ArithmeticException();

//		 Unhandled exception type IOException
//		throw new IOException();
//
//	     System.out.println("end");

	} // main

} // class
