package com.util;

public class Draw2D {

	// drawLine() 메서드 선언 부분
	public static void drawLine(){
		System.out.println("---------------");
	}
	// drawLine() 오버로딩(overloading)==중복함수 - 함수명 동일, 매개변수 다름
	public static void drawLine(int length){
		for (int i = 1; i < length; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	// drawLine() 오버로딩(overloading)==중복함수 - 함수명 동일, 매개변수 다름
	public static void drawLine(char style, int length){
		for (int i = 1; i < length; i++) {
			System.out.print(style);
		}
		System.out.println();
	}

}
