package days03;

/**
 * @author dewbuster
 * @date 2024. 7. 3. - 오후 3:32:59
 * @subject 산술연산자 설명
 * @content  +  -  *  /  %
 *
 */
public class Ex05_02 {

	public static void main(String[] args) {
		//int i = 10, j =3;
		// 주의할 점 0 으로 나눌때 에러
		// 1. 정수 / 0 
		// java.lang.ArithmeticException / by zero
		// System.out.println(10 / 0);
		
		// 2. 실수 / 0   -> Infinity
		// System.out.println(10.0 / 0);
		
		// 실수 % 0    -> NaN == Not a Number
		System.out.println(10.0 % 0);
		
		/*
		System.out.println( i + j );
		System.out.println( i - j );
		System.out.println( i * j );
		// 몫 연산자
		System.out.println( i / j );
		// 나머지 연산자
		System.out.println( i % j );
		*/

	} // main

}  // class
