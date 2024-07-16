package days06;

import java.util.Random;

public class Ex04_04 {

	public static void main(String[] args) {
		
		// 복습. 아래 한줄 암기
		int[] m = new Random().ints(1, 101).limit(10).toArray();
		//											  OptionalInt
		int max = new Random().ints(1, 101).limit(10).max().getAsInt();
		
		System.out.println(max);
		/*
		Random rnd = new Random();
		int kor = rnd.nextInt(101); // 1~100
		int lotto = rnd.nextInt(45)+1; // 1~45
		// rnd.nextBoolean()  true/false
		// rnd.nextInt();
		// rnd.nextLong();
		*/

	}

}
