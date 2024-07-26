package days20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		//		2. 로또 게임 횟수를 입력받아서 게임 횟수 만큼 로또 번호를 출력하는 전체 코딩을 하세요.
		//		( 조건 : 컬렉션 클래스 선택 후 사용 )
		//		( 조건 : 각 로또번호가 오름차순 정렬 후 출력 )

		int gameNum = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.print(" > 게임 횟수? ");
		gameNum = scanner.nextInt();

		LinkedHashSet lotto = new LinkedHashSet();
		ArrayList lotto2 = new ArrayList();

		for (int i = 1; i <= gameNum; i++) {
			lotto = new LinkedHashSet();
			fillLotto(lotto);
			lotto2.add(lotto);
		}

		Iterator ir = lotto2.iterator();
		while (ir.hasNext()) {
			lotto = (LinkedHashSet) ir.next();
			dispLotto(lotto);
		}


	} // main

	private static void dispLotto(LinkedHashSet lotto) {
		lotto.iterator();
		Iterator ir = lotto.iterator();



		//			
		//		}


		while (ir.hasNext()) {
			int num = (int) ir.next();
			int gameNum = (int) ir.next();
			for (int i = 0; i < gameNum; i++)
				gameNum++;{
					System.out.printf("%d게임 : [%d]",gameNum, num);
				}
		}
		System.out.println();
	}

	private static void fillLotto(LinkedHashSet lotto) {
		Random rnd = new Random();
		int n;
		while (lotto.size() < 6) {
			n = rnd.nextInt(45)+1;
			lotto.add(n);
		}

	}

} // class
