package days07;

import java.util.Arrays;
import java.util.Random;

/**
 * @author dewbuster
 * @date 2024. 7. 9. - 오후 12:07:58
 * @subject 제어문 + 배열 활용
 * @content
 *
 */
public class Ex03 {

	public static void main(String[] args) {
		
		String card = "1657-3246-1986-5422";
		String[] cardArr = card.split("-");
		
		System.out.println(Arrays.toString(cardArr));
		Random rnd = new Random();
		int index = rnd.nextInt(4);
		
		// 복습 지금까지 배운 String 함수
		cardArr[index] = "*".repeat(4);
		String printCard = String.join("-", cardArr);
		System.out.println(printCard);
		
		
	} // main

} // class
