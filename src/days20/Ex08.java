package days20;

import java.util.ArrayList;

/**
 * @author love
 * @date 2024. 7. 26. - 오후 2:34:09
 * @subject
 * @content
 *
 */
public class Ex08 {

	public static void main(String[] args) {
		/*
		 [제네릭(Generics)] 
		 1. jdk 1.5 - 제네릭
		    jdk 1.8 - 람다식
		 2. 제네릭이란?
		    < 다양한 타입 >의 객체를 다루는 메서드 or 컬렉션 클래스를 < 컴파일 > 할때,
		    타입을 체크해주는 기능
		    ex) ArraysList<  제 네 릭  >
		 3. 왜 사용할까? -> 제네릭의 장점
		    1) 객체의 타입 안전성을 높이기 위해서
		    2) 형 변환의 번거로움을 줄이기 위해서
		 * */
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("최사랑");
		list.add("이게제네릭이다"); // String만 올 수 있게 해줌.
		
		String name = list.get(0);
		

	} // main

} // class
