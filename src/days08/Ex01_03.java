package days08;

import java.util.Random;

public class Ex01_03 {

	public static void main(String[] args) {
		// 복습 fillm, isDuplicate, displotto , 람다식으로
		new Random()
		.ints(1, 46)   // 1~45 정수
		.distinct()    // 중복 제거
		.limit(6)	   // 6개
		.forEach(System.out::println);  // 메서드 참조
		// .forEach( lotto -> System.out.println(lotto) )
		
	}

}
