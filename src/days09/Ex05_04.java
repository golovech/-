package days09;

/**
 * @author dewbuster
 * @date 2024. 7. 11. - 오후 4:29:50
 * @subject
 * @content
 *
 */
public class Ex05_04 {

	public static void main(String[] args) {
		// int [][][] m = new int [2][3][4]; 
		int [][][]m = {
				{
					{1,2,3,4},	
					{1,2,3,4},	
					{5,6,7,8}
				},
				{
					{1,2,3,4},	
					{5,6,7,8},
					{9,10,11,12}
				},
				{
					{1,2,3,4},	
					{5,6,7,8}
				}
				
				};
		
		System.out.println(m.length); // 면 갯수
		
		System.out.println(m[0].length); // 행 갯수
		System.out.println(m[1].length); // 행 갯수

		
		System.out.println(m[0][0].length); // 행 갯수
		System.out.println(m[0][1].length); // 행 갯수

		dispM(m);

	}

	private static void dispM(int[][][] m) {
		
		for (int i = 0; i < m.length; i++) {
			System.out.println(i + "면");
			for (int j = 0; j < m[i].length; j++) {
				
				for (int k = 0; k < m[i][j].length; k++) {
					System.out.printf("m[%d][%d][%d]=%d\t",i,j,k,m[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}

}
