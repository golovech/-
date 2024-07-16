package days10;

public class Ex03 {

	public static void main(String[] args) {
//		
//		double result = pow(2,3);
//		System.out.println(result);
//		result = pow(2,-3);
//		System.out.println(result);
		double result = recursivePow(2,3);
		System.out.println(result);
		result = recursivePow(2,0);
		System.out.println(result);

	}

	private static double recursivePow(int i, int j) {
		if (j <0) return 1/recursivePow(i, -j); 
		else if (j > 1) return i * recursivePow(i, j-1); 
		else if (j == 0) return 1; 
		else return i;}
		
	

	private static double pow(int i, int j) {
		
		double result = 1;
		int exp = Math.abs(j) ; // 절댓값 구하는 함수.
		for (int k = 0; k < exp; k++) {
			result *= i;
		}
		return j>0? result: 1 / result;	}
	
	

}
