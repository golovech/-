package days06;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex05_02 {

	public static void main(String[] args) {
		//  [람다식과 스트림]
		// 1~100 까지의 임의의 정수      10개 배열 m
		// 합
		// 갯수
		// 평균
		// 최대값
		// 최소값

		/*
		IntStream istream = new Random().ints(1, 101).limit(10);
		long count = istream.count();
		int sum = istream.sum();
		OptionalDouble odAvg = istream.average();
		double avg = odAvg.getAsDouble();
		OptionalInt oiMax =    istream.max();
		int max = oiMax.getAsInt();


		// 두 정수 max, min
		// 세 정수 max, min
		// 10개 정수 max, min
		// IntStream.of(int...args)
		IntStream.of(3,5,2,4,1).max().ifPresent(System.out::println);
		*/
		
		int [] m = new int[10];
		for (int i = 0; i < m.length; i++) {
			m[i] = (int) (Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(m));
		
		int[] n = IntStream.of(m).filter(i -> i > 75).toArray();
		System.out.println( Arrays.toString(n) );
	}
}
