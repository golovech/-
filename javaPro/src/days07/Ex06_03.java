package days07;

public class Ex06_03 {

	public static void main(String[] args) {
		
		int[] m = {1,2,3,4,5,6,7,8,9,10};
		int result = hap(m);
		System.out.println( result );
		
	}

	public static int hap(int[] m) {
		int result = 0;
		for (int i = 0; i < m.length; i++) {
			result += m[i];
		}
		return result;
	}

}
