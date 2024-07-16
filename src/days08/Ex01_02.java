package days08;

public class Ex01_02 {

	public static void main(String[] args) {
		// [로또6/45 게임]


		int[] lotto = new int[6];

		fillLotto(lotto);
		dispLotto(lotto);

	} // main

	private static void fillLotto(int[] lotto) {
		int lottoNumber;
		lotto[0] = (int) (Math.random() * 45) + 1;
		System.out.println(lotto[0]);
		int index = 1;
		while (index < lotto.length) {

			lottoNumber = (int) (Math.random() * 45) + 1;
			System.out.println(lottoNumber);
			//중복체크 한 후 중복되지 X
			if ( !isDuplicate(lotto, lottoNumber, index) ) lotto[index++] = lottoNumber;
		} 
	}

	private static boolean isDuplicate(int[] lotto, int lottoNumber, int index) {
		for (int i = 0; i < index; i++) {
			if (lotto[i] == lottoNumber) {
				return true;
			}
		}
		return false;
	}

	private static void dispLotto(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("[%d]",lotto[i]);
		}
		System.out.println();
	}

}
