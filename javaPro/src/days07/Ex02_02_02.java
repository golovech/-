package days07;

/**
 * @author dewbuster
 * @date 2024. 7. 9. - 오전 10:36:34
 * @subject
 * @content
 *
 */
public class Ex02_02_02 {

	public static void main(String[] args) {

//      ****   1, 1
//      _***   2, 2
//      __**   3, 3
//      ___*   4, 4

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <=4; j++) {
				System.out.print(i <= j? "*":"_");  // i -j <= 0
			}
			System.out.println();
		}

	}

}
