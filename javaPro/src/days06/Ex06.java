package days06;

/**
 * @author dewbuster
 * @date 2024. 7. 8. - 오후 3:11:27
 * @subject 이름(Label)이 붙은 반복문
 * @content break 라벨명;
 *          continue 라벨명;
 *
 */
public class Ex06 {

	public static void main(String[] args) {

		EXIT : for (int dan = 2; dan <= 9; dan++) {
			// System.out.printf("[%d단]\n", dan);
			for (int i = 1; i <= 9 ; i++) {
				//if (i == 5) break EXIT;
				if (i == 5) continue EXIT;
				System.out.printf("%d*%d=%d\t", dan, i, dan * i);
			}
			System.out.println();
		}
	}
}
