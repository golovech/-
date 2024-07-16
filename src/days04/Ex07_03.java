package days04;

/**
 * @author dewbuster
 * @date 2024. 7. 4. - 오후 2:22:29
 * @subject [제어문]
 * @content	1) 조건문: if 문
 * 				2) 분기문: switch 문
 * 				3) 반복문: for문, foreach문
 * 				4) 조건반복문: while문, do-while문
 * 				5) 기타: break문, continue문
 *
 */
public class Ex07_03 {

	public static void main(String[] args) {
		
		int n = 10;
		String result = null;
		
		switch (n % 2) {
		case 0:
			result = "짝수(even number)";
			break;

		default:
			result = "홀수(odd number)";
			break;
		} // switch

		System.out.println(result);
		
	} // main

}  // class
