package days07;

/**
 * @author dewbuster
 * @date 2024. 7. 9. - 오전 10:36:34
 * @subject
 * @content
 *
 */
public class Ex02_02 {

	public static void main(String[] args) {
		/*
		for (int i = 1; i <= 4; i++) {  // 행 갯수
			// _ 공백 찍는 for
			for (int j = 1; j <= 4-i; j++) {
				System.out.print("_");
			}
			// 별 찍는 for
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		} // for i
		*/
		
	      //                   공    별
		//      ****   i=1      0     4
		//      _***   i=2      1     3
		//      __**   i=3      2     2
		//      ___*   i=4      3     1
        //            i+j=4
        //            j=4-i   j=i

		for (int i = 1; i <= 4; i++) {  // 행 갯수
			// _ 공백 찍는 for
			for (int j = 1; j <= i-1; j++) {
				System.out.print("_");
			}
			// 별 찍는 for
			for (int j = 1; j <= 5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		} // for i

	}

}
