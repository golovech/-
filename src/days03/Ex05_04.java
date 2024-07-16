package days03;

/**
 * @author dewbuster
 * @date 2024. 7. 3. - 오후 3:54:46
 * @subject 논리연산자
 * @content 참 / 거짓
 * 		1) 일반 논리 연산자
 * 			ㄱ. &&	일반 논리 AND 연산자(논리곱)
 * 			두 피연산자가 모두 참일 때만 참이 된다.
 * 			true && true => true
 * 			true && false => false
 * 			false && true => false
 * 			false && false => false
 * 
 * 			ㄴ. ||		일반 논리 OR 연산자
 * 			true || true => true
 * 			true || false => true
 * 			false || true => true
 * 			false && false => false
 * 			둘 다 거짓이면 거짓
 * 
 * 			ㄷ. !		부정(NOT) 연산자
 * 			!참 => 거짓
 * 			!거짓 => 참
 * 
 * 		2) 비트 논리 연산자
 * 			ㄱ. &	비트논리 AND 연산자
 * 			ㄴ. |	비트논리 OR 연산자
 * 			ㄷ. ^ XOR 연산자  == e[X]clusive 배타적인
 * 			ㄹ. ~	틸드연산자
 *
 */
public class Ex05_04 {

	public static void main(String[] args) {
		System.out.println(10 & 3);  // 2
		//    10       0000  1010
		//     3        0000  0011   &
		//               0000  0010   == 2
		System.out.println(10 | 3);  // 11
		//	    10      0000  1010
		//     3        0000  0011   |
		//               0000  1011   == 11
		System.out.println(10 ^ 3);  // 9
		//	    10      0000  1010
		//     3        0000  0011   |
		//               0000  1001   == 9
		
		System.out.println(~10);  // -11
		// 0000 1010
		// 1111 0101
		// 1111 0100  1빼기
		// 0000 1011   보수   == 11 -> -11
		
		/*
		// The operator ! is undefined for the argument type(s) int
		// > (비교) 보다 !(논리) 가 우선순위가 높다.
		System.out.println(! 3 > 5);
		
		System.out.println( 3 > 5 && 100 > 1);
		System.out.println( 3 < 5 || 100 > 1);
		System.out.println( 3 < 5 && 100 > 1);
		*/
	}

}
