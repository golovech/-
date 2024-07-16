package days09;

/**
 * @author dewbuster
 * @date 2024. 7. 11. - 오후 2:13:23
 * @subject
 * @content
 *
 */
public class Ex03_04 {

	public static void main(String[] args) {
		// 거듭제곱 = power
		// double result = pow(2,3);
		double result = pow(2,-3);
		System.out.println(result);
		

	} // main

	private static double pow(int i, int j) { // 만들고 복사해서 아래에 recursivePow로 변경
		double result = 1;
		int exp = j <0 ? -j : j ; // 음수면 양수로 만들고, 양수면 양수로 쓰겠다.
		for (int k = 0; k < exp; k++) {
			result *= i;
		}
		return j>0? result: 1 / result;
		
		//		int result = 2;
//		for (int k = i; k >=2; k++) 
//		if (j == 4) break; {
//			System.out.printf("%d^%d\n",i,j);
//			result ^= i;
//		}
//		return result;

//		private static double recursivePow(int i, int j) { // 만들고 복사해서 아래에 recursivePow로 변경
//			
//			return result;
		
		
	}

} // class
