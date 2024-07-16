package days08;

public class Ex01 {

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
		boolean isDuplicate = false;
		while (index < lotto.length) {
			isDuplicate = false;
			lottoNumber = (int) (Math.random() * 45) + 1;
			System.out.println(lottoNumber);
			//중복체크 한 후 중복되지 X
			for (int i = 0; i < index; i++) {
				if (lotto[i] == lottoNumber) {
					isDuplicate = true;
					break;
				}
			}
			if ( !isDuplicate) lotto[index++] = lottoNumber;

			
		} // while
		// TODO : while문 중복검사메서드(배열,번호,위치값)
		/*
				for (int i = 0; i < lotto.length; i++) {
					lottoNumber = (int) (Math.random() * 45) + 1;
					lotto[i] = lottoNumber;
				}
				System.out.println();
		 */
	}

	private static void dispLotto(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("[%d]",lotto[i]);
		}
		System.out.println();
	}

}
