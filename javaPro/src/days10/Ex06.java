package days10;

public class Ex06 {

	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,5,6,7,8,9,10};
		
		int [] m = new int [3];
		for (int i = 0; i < a.length; i++) {
			m[a[i]]++;
		}
		for (int i = 0; i < m.length; i++) {
			System.out.printf("%d - %d개\n", i, m[i]);
		}

	}

}
