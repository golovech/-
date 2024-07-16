package days03;

/**
 * @author dewbuster
 * @date 2024. 7. 3. - 오후 3:44:35
 * @subject [비교연산자]
 * @content  크다, 작다, 같거나크다, 같거나작다, 같다, 다르다
 * 					비교연산의 결과는 boolean이다 (true/false)
 *
 */
public class Ex05_03 {

	public static void main(String[] args) {
		int i = 10, j =3;
		System.out.println( i > j );  // true
		System.out.println( i < j );  // false
		System.out.println( i >= j );  // true
		System.out.println( i <= j );  // false
		
		System.out.println( i == j );  // false
		System.out.println( i != j );  // true
		
		// The operator ! is undefined for the argument type(s) int
		// System.out.println(i =! j);
		
	}

}
