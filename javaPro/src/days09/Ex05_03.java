package days09;

import java.util.Arrays;

public class Ex05_03 {

	public static void main(String[] args) {

		//		int [] m = new int [24]; // 열로만 나타내는 1차원배열.
		//		System.out.println(m.length); // 배열크기
		//		for (int i = 0; i < m.length; i++) {
		//			System.out.printf("m[%d]=%d",i,m[i]);
		//		}
		//		System.out.println();

		// 2차원 배열 - 행, 열
		/*
		int [][] m = new int [4][6]; // 24개
//		System.out.println(m.length); // 행 갯수가 나오는구나.
		System.out.println(m[0].length); // 0번째 행의 열 갯수가 나오는구나.
		System.out.println(m[1].length); // 1번째 행의 열 갯수가 나오는구나.
		System.out.println(m[2].length); // 2번째 행의 열 갯수가 나오는구나.
		System.out.println(m[3].length); // 3번째 행의 열 갯수가 나오는구나.
		dispM(m);
		m[0][0] = 100;

		 */
		// 1차원 배열의 초기화
		//		int [][] m = new int [2][4];
		//		m[0][0] = 1 ; m[0][1] = 2;
		//		m[0][2] = 3; m[0][3] = 4;
		//		m[0][4] = 5; m[0][5] = 6;
		//		dispM(m);

		int [][]m = {
						{1,2,3,4},	
						{5,6,7,8}
					};
		dispM(m);
		
		

	}

	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) { // 1차원 배열의 행 갯수
//			for (int j = 0; j < m[i].length; j++) { // 2차원 배열의 행의 열 갯수
//				System.out.printf("m[%d][%d]=%d",i,j,m[i],m[j]);
//			}
		
			System.out.println(Arrays.toString(m[i]));
		
			System.out.println();
		}






	}

}
