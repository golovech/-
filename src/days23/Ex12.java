package days23;

import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex12 {

	public static void main(String[] args) {
		String[] strArr = {
				"Inheritance", "Java", "Lambda", "stream",
				"OptionalDouble", "IntStream", "count", "sum"
		};

		
		// reduce()
		IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
		
		int count = intStream1.reduce(0, (a,b)-> a+1 );
		System.out.println(count); // 8	 요소의 수
		
		IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
		
		int sum = intStream2.reduce(0, (a,b)-> a+b ); // 누적
		System.out.println(sum); // 58	 요소의 합
		
		IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
		OptionalInt max = intStream3.reduce(Integer::max);
		System.out.println(max.getAsInt()); // 제일 긴 문자열길이.
		
		IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);
		OptionalInt min = intStream4.reduce(Integer::min);
		System.out.println(min.getAsInt()); // 문자열길이 제일 짧은것.

		
		
		

		// Array -> Stream 변환
		// Stream.of(strArr).forEach(System.out::println); // 출력.


		// boolean result = Stream.of(strArr).noneMatch( s -> s.length()==0 );
		// System.out.println(result);

		// Optional<String> o1 = Stream.of(strArr).filter( s -> s.charAt(0) == 's').findFirst();
		// System.out.println(o1.get());





	} // main 

} // class
