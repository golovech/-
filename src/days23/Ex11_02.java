package days23;

import java.util.Optional;

public class Ex11_02 {

	public static void main(String[] args) {
		/*
		Optional<String> o1 = Optional.of("abcde");
		Optional<Integer> o2 = o1.map(String::length); // 문자열 길이를 숫자로 변환.
		System.out.println(o1.get());
		System.out.println(o2.get());
		*/
		
		/*
		int i =	Optional
				.of("123")
		.filter(x -> x.length()>0)
		.map(Integer::parseInt)
		.get();
		System.out.println(i); // 123
		*/
		
		int i = Optional
		.of("")
		.filter(x->x.length()>0)
		.map(Integer::parseInt)
		.orElse(-1);
		System.out.println(i);
		
		
	} // main

} // class
