package days12;

public class Re01 {

	public static void main(String[] args) {
int [][] m = new int [5][5];
		
		// 마방진
		//magicSquare(m);
		//fillM6(m);
		//fillM5(m);
		//fillM4(m);
		//fillM3(m);
		//fillM2(m);
		fillM(m);
		dispM(m);

	}


	private static void fillM(int[][] m) {
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = m[i].length* i+j+1;
			}
			System.out.println();
		}
		
	}

	private static void dispM(int[][] m) {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("[%02d]",m[i][j]);
			}
			System.out.println();
		}

	}

}
