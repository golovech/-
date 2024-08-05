package days23;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex10 {

	public static void main(String[] args) {
		Stream<String[]> strArrStrm = Stream.of(
				new String[]{"abc", "def", "jkl"},
				new String[]{"ABC", "GHI", "JKL"}
				);
		
		Stream<String> s2 = strArrStrm.flatMap(Arrays::stream); // 2차원배열처럼. String이 2개 있는것과 같은것.
		
		// map() -> flatMap() 차이점?
		// --> flatmap() : 2차원 배열로 바꾼것과 같다. 훨씬 간단하게 표기가능.
		s2.map(String::toLowerCase).distinct().sorted().forEach(System.out::println); // 요소를 전부 소문자로 변환시키겠다.
		
		
		
	} // main

} // class
