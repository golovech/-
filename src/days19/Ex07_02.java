package days19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/**
 * @author love
 * @date 2024. 7. 25. - 오후 2:12:19
 * @subject		[ Set 활용 ]
 * @content
 *
 */
public class Ex07_02 {

	public static void main(String[] args) {
		HashSet lotto = new HashSet(); // 중복허용 안하는 해쉬셋으로 로또게임!
		
		
		
		fillLotto(lotto);
		dispLotto(lotto);
		
		
		

	} // main

	private static void dispLotto(HashSet lotto) {
		
		lotto.iterator();
		Iterator ir =lotto.iterator(); 
		while (ir.hasNext()) {
			int num = (int) ir.next();
			System.out.printf("[%d]",num);
		}
		System.out.println();
	}

	private static void fillLotto(HashSet lotto) {
		Random rnd = new Random();
		int n;
		while (lotto.size() < 6) {
			n = rnd.nextInt(45)+1;
			lotto.add(n);
		} // while
		
	}

} // class
