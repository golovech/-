package days09;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author dewbuster
 * @date 2024. 7. 11. - 오후 2:36:55
 * @subject		정수 -> 2진수 (int)
 * @content			->	8진수
 *					-> 16진수
 */
public class Ex04 {

	public static void main(String[] args) {
		// ex) 2진수: 몫이 0이 될때까지 2로 나눈다.
		// 10 => 00000000 00000000 00000000 00001010
		int n = 10;
		int share, reminder;

		int [] binaryArr = new int[32];




		int index = binaryArr.length-1;
		while (n != 0) {
			share = n / 2; // 몫
			reminder = n%2; // 나머지
			binaryArr[index--] = reminder;
			System.out.printf("%d",reminder);
			n = share;
		}
		for (int i = 0; i < binaryArr.length; i++) {
			System.out.printf("%d", binaryArr[i]);
			if (i%7==0) System.out.print(" ");
		}
		System.out.println();

	}

}
