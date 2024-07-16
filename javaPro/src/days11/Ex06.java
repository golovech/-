package days11;

/**
 * @author kenik
 * @date 2024. 7. 15. - 오후 5:12:04
 * @subject
 * @content
 *
 */
public class Ex06 {

	public static void main(String[] args) {

		int [][] m = new int[5][5];

		// 마방진
		//magicSquare(m);
		//fillM6(m);
		//fillM5(m);
		//fillM4(m);
		//fillM3(m);
		//fillM2(m);
		//fillM(m);

		dispM(m);


	} // main

	/*
	[17][24][01][08][15]
	[23][05][07][14][16]
	[04][06][13][20][22]
	[10][12][19][21][03]
	[11][18][25][02][09]
	*/
	private static void magicSquare(int[][] m) {


	} // magicSquare

	// 대각선
	//	[01][02][04][07][11]
	//	[03][05][08][12][16]
	//	[06][09][13][17][20]
	//	[10][14][18][21][23]
	//	[15][19][22][24][25]
	private static void fillM6(int[][] m) {
		// TODO Auto-generated method stub

	}

	// [골뱅이]
	/*
	  [01][02][03][04][05]
	  [16][17][18][19][06]
	  [15][24][15][20][07]
	  [14][23][22][21][08]
	  [13][12][11][10][09]
	*/
	private static void fillM5(int[][] m) {
		// TODO Auto-generated method stub

	}

	/* 지그재그
	[01][02][03][04][05]
	[10][09][08][07][06]
	[11][12][13][14][15]
	[20][19][18][17][16]
	[21][22][23][24][25]
	*/
	private static void fillM4(int[][] m) {

	}

	/*
	[05][10][15][20][25]
	[04][09][14][19][24]
	[03][08][13][18][23]
	[02][07][12][17][22]
	[01][06][11][16][21]
	*/
	private static void fillM3(int[][] m) {
		// TODO Auto-generated method stub

	}

	/*
	[25][24][23][22][21]
	[20][19][18][17][16]
	[15][14][13][12][11]
	[10][09][08][07][06]
	[05][04][03][02][01]
	*/
	private static void fillM2(int[][] m) {

	}

	private static void fillM(int[][] m) {

		for (int i = 0; i < m.length; i++) { // 행갯수
			for (int j = 0; j < m[i].length; j++) { // 열갯수
				///      열갯수
				m[i][j] = m[i].length * i + j +1;
			} // for j
			System.out.println();
		} // for i
	}

	private static void dispM(int[][] m) {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		for (int i = 0; i < m.length; i++) { // 행갯수
			for (int j = 0; j < m[i].length; j++) { // 열갯수
				System.out.printf("[%02d]", m[i][j]);
			} // for j
			System.out.println();
		} // for i

	}

} // class







