package days10;

public class Ex05 {

	public static void main(String[] args) {
		
		int [] m = { 8, 3, 3, 0, 1, 7, 0, 1, 1, 4, 2, 0, 1, 7, 1, 9, 3, 9, 5, 0, 5, 0, 0, 9, 1, 4, 7, 8, 3, 2, 1, 7, 1, 1, 7, 3, 8, 3, 4, 0, 4, 3, 2, 3, 6, 1, 3, 1, 8, 8, 0, 4, 1, 8, 9, 9, 2, 2, 2, 5, 2, 7, 6, 1, 2, 0, 6, 6, 2, 6, 4, 9, 7, 8, 0, 6, 7, 6, 6, 0, 7, 3, 9, 2, 5, 6, 7, 8, 7, 7, 7, 5, 1, 3, 2, 7, 9, 8, 0, 4};
		
		int [] cnts = new int [10];
		for (int i = 0; i < m.length; i++) {
			cnts[m[i]] ++;
		}
		
		for (int i = 0; i < cnts.length; i++) {
			System.out.printf("%d - %d개\n", i, cnts[i]);
		}
	}

}



		
		
		
		
//		int max = m[0];
//		for (int i = 1; i < m.length; i++) {
//			if (max < m[i]) max = m[i];
//			
//		}
//		System.out.println ("최댓값 : "+ max);
//		
//		int min = m[0];
//		for (int i = 1; i < m.length-1; i++) {
//			if (min > m[i]) min = m[i];
//			
//		}
//		
//		
//		System.out.println ("최솟값 : "+ min);
		
		

