package days07;

import java.util.stream.IntStream;

public class Ex06_04 {

	public static void main(String[] args) {

		int result = 0;

		result = hap(1,2);
		System.out.println(result);

		result = hap(1,2,3,4,5);
		System.out.println(result);

		result = hap(1,2,3,4,5,6,7,8,9,10);
		System.out.println(result);

		int [] m = {10,20,30};
		result = hap( m );
		System.out.println(result);

	} // main

	// 가변인자
	public static int hap(int...args) {
		// 람다식과 스트림
		// int[] -> stream  sum() 메서드
		return IntStream.of(args).sum();
	}
	
	/*
	public static int hap(int...args) {
		int result = 0;
		
	      for (int i = 0; i < args.length; i++) {
	         result += args[i];
	      }
		 
		for (int n : args) {
			result += n;
		}
		return result;
	}
	*/

}  // class
