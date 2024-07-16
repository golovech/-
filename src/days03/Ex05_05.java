package days03;

/**
 * @author dewbuster
 * @date 2024. 7. 3. - 오후 4:30:13
 * @subject 대입연산자 =, 증감연산자
 * @content
 *
 */
public class Ex05_05 {

	public static void main(String[] args) {
		/*
		int x = 100;
		int y = x;
		*/
		
		// [증감연산자]
		
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number * pieceUnit;
		System.out.println("사과 1개에서 남은 양: " + result);
		
		// (암기)
		// 두 문자열을 비교할 때는 == != 비교 연산자 사용X  equals() !equals()
		// String n1, n2     n1.equals(n2)  !n1.equals(n2)

	}

}
