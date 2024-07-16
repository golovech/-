package days06;

import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		// BufferedReader,  Scanner 클래스 "A" -> charAt() -> 'A'
		// System.in
		char one;
		System.out.print("> 한 문자 입력 ? ");
		// int nextByte = System.in.read();
		// System.out.println(nextByte);
		one = (char) System.in.read();
		System.out.println(one);
		
		/*
		System.in.read();  // 13
		System.in.read();  // 10
		*/
		System.in.skip(System.in.available()); 

		// 복사 + 붙이기
		System.out.print("> 한 문자 입력 ? ");
		one = (char) System.in.read();
		System.out.println(one);
		
		System.in.skip(System.in.available());
		
		// 스트림
		// ---------------------------
		// 'A' '\r' '\n'
		// ---------------------------
		
	} // main

} // class
