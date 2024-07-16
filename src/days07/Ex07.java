package days07;

public class Ex07 {

	public static void main(String[] args) {
		// [로또6/45 게임]


		int[] lotto = new int[6];
		
		/*
		for (int i = 1; i <= 6; i++) {
			lottoNumber = (int) (Math.random() * 45) + 1;
			System.out.printf("[%d]",lottoNumber);
		}
		System.out.println();
		*/
		fillLotto(lotto);
		dispLotto(lotto);
		
	} // main

	private static void fillLotto(int[] lotto) {
		//int lottoNumber;
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

} // class
