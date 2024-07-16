package days07;

/**
 * @author dewbuster
 * @date 2024. 7. 9. - 오후 4:10:04
 * @subject 메서드(함수) 사용 예제
 * @content 두 정수의 합을 구해서 출력
 * 			함수 선언 - 1) 두 정수의 합 구하는 기능
 * 						2) 매개변수 - 두 정수
 * 						3) 리턴값: 합
 *
 */
public class Ex06_02 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c;
		
		c = hap(a,b);
		
		System.out.printf("%d+%d=%d\n", a, b, c);
		
	} // main

	public static int hap(int a, int b) {
		return a + b;
	}

} // class
